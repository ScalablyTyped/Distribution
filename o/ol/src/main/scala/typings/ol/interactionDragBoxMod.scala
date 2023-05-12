package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.boxcancel
import typings.ol.olStrings.boxdrag
import typings.ol.olStrings.boxend
import typings.ol.olStrings.boxstart
import typings.ol.olStrings.changeColonactive
import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragBoxMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'boxcancel'|'boxdrag'|'boxend'|'boxstart', DragBoxEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'boxcancel'|'boxdrag'|'boxend', Return>} DragBoxOnSignature
    */
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link module:ol/interaction/DragZoom~DragZoom} and
    * {@link module:ol/interaction/DragRotateAndZoom~DragRotateAndZoom}).
    *
    * @fires DragBoxEvent
    * @api
    */
  @JSImport("ol/interaction/DragBox", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends DragBox {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/DragBox", "DragBoxEvent")
  @js.native
  open class DragBoxEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {string} type The event type.
      * @param {import("../coordinate.js").Coordinate} coordinate The event coordinate.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Originating event.
      */
    def this(
      `type`: String,
      coordinate: Coordinate,
      mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]
    ) = this()
    
    /**
      * The coordinate of the drag event.
      * @const
      * @type {import("../coordinate.js").Coordinate}
      * @api
      */
    var coordinate: Coordinate = js.native
    
    /**
      * @const
      * @type {import("../MapBrowserEvent.js").default}
      * @api
      */
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any] = js.native
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'boxcancel'|'boxdrag'|'boxend'|'boxstart', DragBoxEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'boxcancel'|'boxdrag'|'boxend', Return>} DragBoxOnSignature
    */
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link module:ol/interaction/DragZoom~DragZoom} and
    * {@link module:ol/interaction/DragRotateAndZoom~DragRotateAndZoom}).
    *
    * @fires DragBoxEvent
    * @api
    */
  @js.native
  trait DragBox
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @private
      * @type {EndCondition}
      */
    /* private */ var boxEndCondition_ : Any = js.native
    
    /**
      * @type {import("../render/Box.js").default}
      * @private
      */
    /* private */ var box_ : Any = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * The default condition for determining whether the boxend event
      * should fire.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent The originating MapBrowserEvent
      *     leading to the box end.
      * @param {import("../pixel.js").Pixel} startPixel The starting pixel of the box.
      * @param {import("../pixel.js").Pixel} endPixel The end pixel of the box.
      * @return {boolean} Whether or not the boxend condition should be fired.
      */
    def defaultBoxEndCondition(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any], startPixel: Pixel, endPixel: Pixel): Boolean = js.native
    
    /**
      * Returns geometry of last drawn box.
      * @return {import("../geom/Polygon.js").default} Geometry.
      * @api
      */
    def getGeometry(): typings.ol.geomPolygonMod.default = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var minArea_ : Any = js.native
    
    /**
      * Function to execute just before `onboxend` is fired
      * @param {import("../MapBrowserEvent.js").default} event Event.
      */
    def onBoxEnd(event: typings.ol.mapBrowserEventMod.default[Any]): Unit = js.native
    
    /***
      * @type {DragBoxOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_DragBox: DragBoxOnSignature[EventsKey] = js.native
    
    /***
      * @type {DragBoxOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_DragBox: DragBoxOnSignature[EventsKey] = js.native
    
    /**
      * @type {import("../pixel.js").Pixel}
      * @private
      */
    /* private */ var startPixel_ : Any = js.native
    
    /***
      * @type {DragBoxOnSignature<void>}
      */
    @JSName("un")
    var un_DragBox: DragBoxOnSignature[Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait DragBoxOnSignature[Return]
    extends OnSignature[
          changeColonactive | boxcancel | boxdrag | boxend | boxstart | EventTypes | Types, 
          DragBoxEvent | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  type EndCondition = js.ThisFunction3[
    /* this */ Any, 
    /* arg1 */ typings.ol.mapBrowserEventMod.default[Any], 
    /* arg2 */ Pixel, 
    /* arg3 */ Pixel, 
    Boolean
  ]
  
  trait Options extends StObject {
    
    /**
      * A function that takes a {@link module :ol/MapBrowserEvent~MapBrowserEvent} and two
      * {@link module :ol/pixel~Pixel}s to indicate whether a `boxend` event should be fired.
      * Default is `true` if the area of the box is bigger than the `minArea` option.
      */
    var boxEndCondition: js.UndefOr[EndCondition] = js.undefined
    
    /**
      * CSS class name for styling the box.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * A function that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
      * to indicate whether that event should be handled.
      * Default is {@link ol /events/condition~mouseActionButton}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * The minimum area of the box in pixel, this value is used by the default
      * `boxEndCondition` function.
      */
    var minArea: js.UndefOr[Double] = js.undefined
    
    /**
      * Code to execute just
      * before `boxend` is fired.
      */
    var onBoxEnd: js.UndefOr[
        js.ThisFunction1[/* this */ DragBox, /* arg1 */ typings.ol.mapBrowserEventMod.default[Any], Unit]
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
        value: js.ThisFunction1[/* this */ DragBox, /* arg1 */ typings.ol.mapBrowserEventMod.default[Any], Unit]
      ): Self = StObject.set(x, "onBoxEnd", value.asInstanceOf[js.Any])
      
      inline def setOnBoxEndUndefined: Self = StObject.set(x, "onBoxEnd", js.undefined)
    }
  }
}
