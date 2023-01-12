package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olBooleans.`false`
import typings.ol.olStrings.changeColonelement
import typings.ol.olStrings.changeColonmap
import typings.ol.olStrings.changeColonoffset
import typings.ol.olStrings.changeColonposition
import typings.ol.olStrings.changeColonpositioning
import typings.ol.overlayPositioningMod.OverlayPositioning
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("ol/Overlay", JSImport.Default)
  @js.native
  open class default protected () extends Overlay {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var autoPan: js.UndefOr[PanIntoViewOptions | Boolean] = js.undefined
    
    var autoPanAnimation: js.UndefOr[PanOptions] = js.undefined
    
    var autoPanMargin: js.UndefOr[Double] = js.undefined
    
    var autoPanOptions: js.UndefOr[PanIntoViewOptions] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var insertFirst: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var position: js.UndefOr[Coordinate] = js.undefined
    
    var positioning: js.UndefOr[OverlayPositioning] = js.undefined
    
    var stopEvent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutoPan(value: PanIntoViewOptions | Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
      
      inline def setAutoPanAnimation(value: PanOptions): Self = StObject.set(x, "autoPanAnimation", value.asInstanceOf[js.Any])
      
      inline def setAutoPanAnimationUndefined: Self = StObject.set(x, "autoPanAnimation", js.undefined)
      
      inline def setAutoPanMargin(value: Double): Self = StObject.set(x, "autoPanMargin", value.asInstanceOf[js.Any])
      
      inline def setAutoPanMarginUndefined: Self = StObject.set(x, "autoPanMargin", js.undefined)
      
      inline def setAutoPanOptions(value: PanIntoViewOptions): Self = StObject.set(x, "autoPanOptions", value.asInstanceOf[js.Any])
      
      inline def setAutoPanOptionsUndefined: Self = StObject.set(x, "autoPanOptions", js.undefined)
      
      inline def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
      
      inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setPosition(value: Coordinate): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setPositioning(value: OverlayPositioning): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
      
      inline def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
      
      inline def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
      
      inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    }
  }
  
  @js.native
  trait Overlay
    extends typings.ol.objectMod.default {
    
    /* protected */ var autoPan: PanIntoViewOptions | `false` = js.native
    
    /* protected */ var element: HTMLElement = js.native
    
    /**
      * Get the DOM element of this overlay.
      */
    def getElement(): js.UndefOr[HTMLElement] = js.native
    
    /**
      * Get the overlay identifier which is set on constructor.
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * Get the map associated with this overlay.
      */
    def getMap(): js.UndefOr[typings.ol.pluggableMapMod.default] = js.native
    
    /**
      * Get the offset of this overlay.
      */
    def getOffset(): js.Array[Double] = js.native
    
    /**
      * returns the options this Overlay has been created with
      */
    def getOptions(): Options = js.native
    
    /**
      * Get the current position of this overlay.
      */
    def getPosition(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the current positioning of this overlay.
      */
    def getPositioning(): OverlayPositioning = js.native
    
    /**
      * Get the extent of an element relative to the document
      */
    /* protected */ def getRect(element: HTMLElement, size: Size): Extent = js.native
    
    /* protected */ def handleElementChanged(): Unit = js.native
    
    /* protected */ def handleMapChanged(): Unit = js.native
    
    /* protected */ def handleOffsetChanged(): Unit = js.native
    
    /* protected */ def handlePositionChanged(): Unit = js.native
    
    /* protected */ def handlePositioningChanged(): Unit = js.native
    
    /* protected */ var id: Double | String = js.native
    
    /* protected */ var insertFirst: Boolean = js.native
    
    /* protected */ var mapPostrenderListenerKey: EventsKey = js.native
    
    @JSName("on")
    def on_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /* protected */ var options: Options = js.native
    
    /**
      * Pan the map so that the overlay is entirely visible in the current viewport
      * (if necessary).
      */
    def panIntoView(): Unit = js.native
    def panIntoView(opt_panIntoViewOptions: PanIntoViewOptions): Unit = js.native
    
    /**
      * Pan the map so that the overlay is entirely visisble in the current viewport
      * (if necessary) using the configured autoPan parameters
      */
    /* protected */ def performAutoPan(): Unit = js.native
    
    /* protected */ def render(): Unit = js.native
    
    /* protected */ var rendered: Any = js.native
    
    /**
      * Set the DOM element to be associated with this overlay.
      */
    def setElement(): Unit = js.native
    def setElement(element: HTMLElement): Unit = js.native
    
    /**
      * Set the map to be associated with this overlay.
      */
    def setMap(): Unit = js.native
    def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
    
    /**
      * Set the offset for this overlay.
      */
    def setOffset(offset: js.Array[Double]): Unit = js.native
    
    /**
      * Set the position for this overlay. If the position is undefined the
      * overlay is hidden.
      */
    def setPosition(): Unit = js.native
    def setPosition(position: Coordinate): Unit = js.native
    
    /**
      * Set the positioning for this overlay.
      */
    def setPositioning(positioning: OverlayPositioning): Unit = js.native
    
    /**
      * Modify the visibility of the element.
      */
    /* protected */ def setVisible(visible: Boolean): Unit = js.native
    
    /* protected */ var stopEvent: Boolean = js.native
    
    @JSName("un")
    def un_changeelement(`type`: changeColonelement, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changemap(`type`: changeColonmap, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeoffset(`type`: changeColonoffset, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changepositioning(`type`: changeColonpositioning, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    
    /**
      * Update pixel position.
      */
    /* protected */ def updatePixelPosition(): Unit = js.native
    
    /* protected */ def updateRenderedPosition(pixel: Pixel): Unit = js.native
    /* protected */ def updateRenderedPosition(pixel: Pixel, mapSize: Size): Unit = js.native
  }
  
  trait PanIntoViewOptions extends StObject {
    
    var animation: js.UndefOr[PanOptions] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
  }
  object PanIntoViewOptions {
    
    inline def apply(): PanIntoViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanIntoViewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanIntoViewOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: PanOptions): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
  
  trait PanOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* p0 */ Double, Double]] = js.undefined
  }
  object PanOptions {
    
    inline def apply(): PanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanOptions] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* p0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
