package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.boxcancel
import typings.ol.olStrings.boxdrag
import typings.ol.olStrings.boxend
import typings.ol.olStrings.boxstart
import typings.ol.pixelMod.Pixel
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragBoxMod {
  
  @JSImport("ol/interaction/DragBox", JSImport.Default)
  @js.native
  open class default () extends DragBox {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction/DragBox", "DragBoxEvent")
  @js.native
  open class DragBoxEvent protected ()
    extends typings.ol.eventsEventMod.default {
    def this(
      `type`: String,
      coordinate: Coordinate,
      mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]
    ) = this()
    
    /**
      * The coordinate of the drag event.
      */
    var coordinate: Coordinate = js.native
    
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
  }
  
  @js.native
  trait DragBox
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * The default condition for determining whether the boxend event
      * should fire.
      */
    def defaultBoxEndCondition(
      mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent],
      startPixel: Pixel,
      endPixel: Pixel
    ): Boolean = js.native
    
    /**
      * Returns geometry of last drawn box.
      */
    def getGeometry(): typings.ol.geomPolygonMod.default = js.native
    
    /**
      * Function to execute just before onboxend is fired
      */
    def onBoxEnd(event: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    @JSName("on")
    def on_boxcancel(`type`: boxcancel, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_boxcancel(`type`: boxcancel, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_boxcancel(`type`: boxcancel, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_boxdrag(`type`: boxdrag, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_boxend(`type`: boxend, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_boxstart(`type`: boxstart, listener: js.Function1[/* evt */ DragBoxEvent, Unit]): Unit = js.native
  }
  
  type EndCondition = js.ThisFunction3[
    /* this */ Any, 
    /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], 
    /* p1 */ Pixel, 
    /* p2 */ Pixel, 
    Boolean
  ]
  
  trait Options extends StObject {
    
    var boxEndCondition: js.UndefOr[EndCondition] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var minArea: js.UndefOr[Double] = js.undefined
    
    var onBoxEnd: js.UndefOr[
        js.ThisFunction1[/* this */ DragBox, /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBoxEndCondition(value: EndCondition): Self = StObject.set(x, "boxEndCondition", value.asInstanceOf[js.Any])
      
      inline def setBoxEndConditionUndefined: Self = StObject.set(x, "boxEndCondition", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
      
      inline def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
      
      inline def setOnBoxEnd(
        value: js.ThisFunction1[/* this */ DragBox, /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
      ): Self = StObject.set(x, "onBoxEnd", value.asInstanceOf[js.Any])
      
      inline def setOnBoxEndUndefined: Self = StObject.set(x, "onBoxEnd", js.undefined)
    }
  }
}
