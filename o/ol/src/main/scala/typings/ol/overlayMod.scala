package typings.ol

import typings.ol.anon.Transform
import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  /**
    * @typedef {import("./ObjectEventType").Types|'change:element'|'change:map'|'change:offset'|'change:position'|
    *   'change:positioning'} OverlayObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<OverlayObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|OverlayObjectEventTypes, Return>} OverlayOnSignature
    */
  /**
    * @classdesc
    * An element to be displayed over the map and attached to a single map
    * location.  Like {@link module:ol/control/Control~Control}, Overlays are
    * visible widgets. Unlike Controls, they are not in a fixed position on the
    * screen, but are tied to a geographical coordinate, so panning the map will
    * move an Overlay but not a Control.
    *
    * Example:
    *
    *     import Overlay from 'ol/Overlay.js';
    *
    *     // ...
    *     const popup = new Overlay({
    *       element: document.getElementById('popup'),
    *     });
    *     popup.setPosition(coordinate);
    *     map.addOverlay(popup);
    *
    * @api
    */
  @JSImport("ol/Overlay", JSImport.Default)
  @js.native
  open class default protected () extends Overlay {
    /**
      * @param {Options} options Overlay options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Pan the map when calling
      * `setPosition`, so that the overlay is entirely visible in the current viewport.
      */
    var autoPan: js.UndefOr[Boolean | PanIntoViewOptions] = js.undefined
    
    /**
      * CSS class
      * name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The overlay element.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Set the overlay id. The overlay id can be used
      * with the {@link module :ol/Map~Map#getOverlayById} method.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Whether the overlay is inserted first
      * in the overlay container, or appended. If the overlay is placed in the same
      * container as that of the controls (see the `stopEvent` option) you will
      * probably set `insertFirst` to `true` so the overlay is displayed below the
      * controls.
      */
    var insertFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Offsets in pixels used when positioning
      * the overlay. The first element in the
      * array is the horizontal offset. A positive value shifts the overlay right.
      * The second element in the array is the vertical offset. A positive value
      * shifts the overlay down.
      */
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The overlay position
      * in map projection.
      */
    var position: js.UndefOr[Coordinate] = js.undefined
    
    /**
      * Defines how
      * the overlay is actually positioned with respect to its `position` property.
      * Possible values are `'bottom-left'`, `'bottom-center'`, `'bottom-right'`,
      * `'center-left'`, `'center-center'`, `'center-right'`, `'top-left'`,
      * `'top-center'`, and `'top-right'`.
      */
    var positioning: js.UndefOr[Positioning] = js.undefined
    
    /**
      * Whether event propagation to the map
      * viewport should be stopped. If `true` the overlay is placed in the same
      * container as that of the controls (CSS class name
      * `ol-overlaycontainer-stopevent`); if `false` it is placed in the container
      * with CSS class name specified by the `className` property.
      */
    var stopEvent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutoPan(value: Boolean | PanIntoViewOptions): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
      
      inline def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
      
      inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setPosition(value: Coordinate): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setPositioning(value: Positioning): Self = StObject.set(x, "positioning", value.asInstanceOf[js.Any])
      
      inline def setPositioningUndefined: Self = StObject.set(x, "positioning", js.undefined)
      
      inline def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
      
      inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    }
  }
  
  /**
    * @typedef {import("./ObjectEventType").Types|'change:element'|'change:map'|'change:offset'|'change:position'|
    *   'change:positioning'} OverlayObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<OverlayObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|OverlayObjectEventTypes, Return>} OverlayOnSignature
    */
  /**
    * @classdesc
    * An element to be displayed over the map and attached to a single map
    * location.  Like {@link module:ol/control/Control~Control}, Overlays are
    * visible widgets. Unlike Controls, they are not in a fixed position on the
    * screen, but are tied to a geographical coordinate, so panning the map will
    * move an Overlay but not a Control.
    *
    * Example:
    *
    *     import Overlay from 'ol/Overlay.js';
    *
    *     // ...
    *     const popup = new Overlay({
    *       element: document.getElementById('popup'),
    *     });
    *     popup.setPosition(coordinate);
    *     map.addOverlay(popup);
    *
    * @api
    */
  @js.native
  trait Overlay
    extends typings.ol.objectMod.default {
    
    /**
      * @protected
      * @type {PanIntoViewOptions|undefined}
      */
    /* protected */ var autoPan: js.UndefOr[PanIntoViewOptions] = js.native
    
    /**
      * @protected
      * @type {HTMLElement}
      */
    /* protected */ var element: HTMLElement = js.native
    
    /**
      * Get the DOM element of this overlay.
      * @return {HTMLElement|undefined} The Element containing the overlay.
      * @observable
      * @api
      */
    def getElement(): js.UndefOr[HTMLElement] = js.native
    
    /**
      * Get the overlay identifier which is set on constructor.
      * @return {number|string|undefined} Id.
      * @api
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * Get the map associated with this overlay.
      * @return {import("./Map.js").default|null} The map that the
      * overlay is part of.
      * @observable
      * @api
      */
    def getMap(): typings.ol.rendererMapMod.default | Null = js.native
    
    /**
      * Get the offset of this overlay.
      * @return {Array<number>} The offset.
      * @observable
      * @api
      */
    def getOffset(): js.Array[Double] = js.native
    
    /**
      * returns the options this Overlay has been created with
      * @return {Options} overlay options
      */
    def getOptions(): Options = js.native
    
    /**
      * Get the current position of this overlay.
      * @return {import("./coordinate.js").Coordinate|undefined} The spatial point that the overlay is
      *     anchored at.
      * @observable
      * @api
      */
    def getPosition(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the current positioning of this overlay.
      * @return {Positioning} How the overlay is positioned
      *     relative to its point on the map.
      * @observable
      * @api
      */
    def getPositioning(): Positioning = js.native
    
    /**
      * Get the extent of an element relative to the document
      * @param {HTMLElement} element The element.
      * @param {import("./size.js").Size} size The size of the element.
      * @return {import("./extent.js").Extent} The extent.
      * @protected
      */
    /* protected */ def getRect(element: HTMLElement, size: Size): Extent = js.native
    
    /**
      * @protected
      */
    /* protected */ def handleElementChanged(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def handleMapChanged(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def handleOffsetChanged(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def handlePositionChanged(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def handlePositioningChanged(): Unit = js.native
    
    /**
      * @protected
      * @type {number|string|undefined}
      */
    /* protected */ var id: js.UndefOr[Double | String] = js.native
    
    /**
      * @protected
      * @type {boolean}
      */
    /* protected */ var insertFirst: Boolean = js.native
    
    /**
      * @protected
      * @type {?import("./events.js").EventsKey}
      */
    /* protected */ var mapPostrenderListenerKey: EventsKey | Null = js.native
    
    /***
      * @type {OverlayOnSignature<import("./events").EventsKey>}
      */
    @JSName("on")
    var on_Overlay: OverlayOnSignature[EventsKey] = js.native
    
    /***
      * @type {OverlayOnSignature<import("./events").EventsKey>}
      */
    @JSName("once")
    var once_Overlay: OverlayOnSignature[EventsKey] = js.native
    
    /**
      * @protected
      * @type {Options}
      */
    /* protected */ var options: Options = js.native
    
    /**
      * Pan the map so that the overlay is entirely visible in the current viewport
      * (if necessary).
      * @param {PanIntoViewOptions} [panIntoViewOptions] Options for the pan action
      * @api
      */
    def panIntoView(): Unit = js.native
    def panIntoView(panIntoViewOptions: PanIntoViewOptions): Unit = js.native
    
    /**
      * Pan the map so that the overlay is entirely visible in the current viewport
      * (if necessary) using the configured autoPan parameters
      * @protected
      */
    /* protected */ def performAutoPan(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def render(): Unit = js.native
    
    /**
      * @protected
      * @type {{transform_: string,
      *         visible: boolean}}
      */
    /* protected */ var rendered: Transform = js.native
    
    /**
      * Set the DOM element to be associated with this overlay.
      * @param {HTMLElement|undefined} element The Element containing the overlay.
      * @observable
      * @api
      */
    def setElement(): Unit = js.native
    def setElement(element: HTMLElement): Unit = js.native
    
    /**
      * Set the map to be associated with this overlay.
      * @param {import("./Map.js").default|null} map The map that the
      * overlay is part of. Pass `null` to just remove the overlay from the current map.
      * @observable
      * @api
      */
    def setMap(): Unit = js.native
    def setMap(map: typings.ol.rendererMapMod.default): Unit = js.native
    
    /**
      * Set the offset for this overlay.
      * @param {Array<number>} offset Offset.
      * @observable
      * @api
      */
    def setOffset(offset: js.Array[Double]): Unit = js.native
    
    /**
      * Set the position for this overlay. If the position is `undefined` the
      * overlay is hidden.
      * @param {import("./coordinate.js").Coordinate|undefined} position The spatial point that the overlay
      *     is anchored at.
      * @observable
      * @api
      */
    def setPosition(): Unit = js.native
    def setPosition(position: Coordinate): Unit = js.native
    
    /**
      * Set the positioning for this overlay.
      * @param {Positioning} positioning how the overlay is
      *     positioned relative to its point on the map.
      * @observable
      * @api
      */
    def setPositioning(positioning: Positioning): Unit = js.native
    
    /**
      * Modify the visibility of the element.
      * @param {boolean} visible Element visibility.
      * @protected
      */
    /* protected */ def setVisible(visible: Boolean): Unit = js.native
    
    /**
      * @protected
      * @type {boolean}
      */
    /* protected */ var stopEvent: Boolean = js.native
    
    /***
      * @type {OverlayOnSignature<void>}
      */
    @JSName("un")
    var un_Overlay: OverlayOnSignature[Unit] = js.native
    
    /**
      * Update pixel position.
      * @protected
      */
    /* protected */ def updatePixelPosition(): Unit = js.native
    
    /**
      * @param {import("./pixel.js").Pixel} pixel The pixel location.
      * @param {import("./size.js").Size|undefined} mapSize The map size.
      * @protected
      */
    /* protected */ def updateRenderedPosition(pixel: Pixel): Unit = js.native
    /* protected */ def updateRenderedPosition(pixel: Pixel, mapSize: Size): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.objectEventTypeMod.Types
    - typings.ol.olStrings.changeColonelement
    - typings.ol.olStrings.changeColonmap
    - typings.ol.olStrings.changeColonoffset
    - typings.ol.olStrings.changeColonposition
    - typings.ol.olStrings.changeColonpositioning
  */
  type OverlayObjectEventTypes = _OverlayObjectEventTypes | Types
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait OverlayOnSignature[Return]
    extends OnSignature[
          EventTypes | OverlayObjectEventTypes, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait PanIntoViewOptions extends StObject {
    
    /**
      * The animation parameters for the pan
      */
    var animation: js.UndefOr[PanOptions] = js.undefined
    
    /**
      * The margin (in pixels) between the
      * overlay and the borders of the map when panning into view.
      */
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
    
    /**
      * The duration of the animation in
      * milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The easing function to use. Can
      * be one from {@link module :ol/easing} or a custom function.
      * Default is {@link module :ol/easing.inAndOut}.
      */
    var easing: js.UndefOr[js.Function1[/* arg0 */ Double, Double]] = js.undefined
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
      
      inline def setEasing(value: /* arg0 */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.`bottom-left`
    - typings.ol.olStrings.`bottom-center`
    - typings.ol.olStrings.`bottom-right`
    - typings.ol.olStrings.`center-left`
    - typings.ol.olStrings.`center-center`
    - typings.ol.olStrings.`center-right`
    - typings.ol.olStrings.`top-left`
    - typings.ol.olStrings.`top-center`
    - typings.ol.olStrings.`top-right`
  */
  trait Positioning extends StObject
  object Positioning {
    
    inline def `bottom-center`: typings.ol.olStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.ol.olStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.ol.olStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.ol.olStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.ol.olStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.ol.olStrings.`bottom-right`]
    
    inline def `center-center`: typings.ol.olStrings.`center-center` = "center-center".asInstanceOf[typings.ol.olStrings.`center-center`]
    
    inline def `center-left`: typings.ol.olStrings.`center-left` = "center-left".asInstanceOf[typings.ol.olStrings.`center-left`]
    
    inline def `center-right`: typings.ol.olStrings.`center-right` = "center-right".asInstanceOf[typings.ol.olStrings.`center-right`]
    
    inline def `top-center`: typings.ol.olStrings.`top-center` = "top-center".asInstanceOf[typings.ol.olStrings.`top-center`]
    
    inline def `top-left`: typings.ol.olStrings.`top-left` = "top-left".asInstanceOf[typings.ol.olStrings.`top-left`]
    
    inline def `top-right`: typings.ol.olStrings.`top-right` = "top-right".asInstanceOf[typings.ol.olStrings.`top-right`]
  }
  
  trait _OverlayObjectEventTypes extends StObject
}
