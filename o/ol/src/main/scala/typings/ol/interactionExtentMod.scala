package typings.ol

import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonactive
import typings.ol.olStrings.extentchanged
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionExtentMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'extentchanged', ExtentEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'extentchanged', Return>} ExtentOnSignature
    */
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map.
    * Once drawn, the vector box can be modified by dragging its vertices or edges.
    * This interaction is only supported for mouse devices.
    *
    * @fires ExtentEvent
    * @api
    */
  @JSImport("ol/interaction/Extent", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Extent {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Extent", "ExtentEvent")
  @js.native
  open class ExtentEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {import("../extent.js").Extent} extent the new extent
      */
    def this(extent: typings.ol.extentMod.Extent) = this()
    
    /**
      * The current extent.
      * @type {import("../extent.js").Extent}
      * @api
      */
    var extent: typings.ol.extentMod.Extent = js.native
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'extentchanged', ExtentEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'extentchanged', Return>} ExtentOnSignature
    */
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map.
    * Once drawn, the vector box can be modified by dragging its vertices or edges.
    * This interaction is only supported for mouse devices.
    *
    * @fires ExtentEvent
    * @api
    */
  @js.native
  trait Extent
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * Condition
      * @type {import("../events/condition.js").Condition}
      * @private
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @param {import("../extent.js").Extent} extent extent
      * @return {Feature} extent as featrue
      * @private
      */
    /* private */ var createOrUpdateExtentFeature_ : Any = js.native
    
    /**
      * @param {import("../coordinate.js").Coordinate} vertex location of feature
      * @return {Feature} vertex as feature
      * @private
      */
    /* private */ var createOrUpdatePointerFeature_ : Any = js.native
    
    /**
      * Feature for displaying the visible extent
      * @type {Feature}
      * @private
      */
    /* private */ var extentFeature_ : Any = js.native
    
    /**
      * Layer for the extentFeature
      * @type {VectorLayer}
      * @private
      */
    /* private */ var extentOverlay_ : Any = js.native
    
    /**
      * Extent of the drawn box
      * @type {import("../extent.js").Extent}
      * @private
      */
    /* private */ var extent_ : Any = js.native
    
    /**
      * Returns the current drawn extent in the view projection (or user projection if set)
      *
      * @return {import("../extent.js").Extent} Drawn extent in the view projection.
      * @api
      */
    def getExtent(): typings.ol.extentMod.Extent = js.native
    
    /**
      * Returns the current drawn extent in the view projection
      *
      * @return {import("../extent.js").Extent} Drawn extent in the view projection.
      * @api
      */
    def getExtentInternal(): typings.ol.extentMod.Extent = js.native
    
    /**
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent pointer move event
      * @private
      */
    /* private */ var handlePointerMove_ : Any = js.native
    
    /***
      * @type {ExtentOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Extent: ExtentOnSignature[EventsKey] = js.native
    
    /***
      * @type {ExtentOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Extent: ExtentOnSignature[EventsKey] = js.native
    
    /**
      * Pixel threshold to snap to extent
      * @type {number}
      * @private
      */
    /* private */ var pixelTolerance_ : Any = js.native
    
    /**
      * Handler for pointer move events
      * @type {function (import("../coordinate.js").Coordinate): import("../extent.js").Extent|null}
      * @private
      */
    /* private */ var pointerHandler_ : Any = js.native
    
    /**
      * Manually sets the drawn extent, using the view projection.
      *
      * @param {import("../extent.js").Extent} extent Extent
      * @api
      */
    def setExtent(extent: typings.ol.extentMod.Extent): Unit = js.native
    
    /**
      * @param {import("../pixel.js").Pixel} pixel cursor location
      * @param {import("../Map.js").default} map map
      * @return {import("../coordinate.js").Coordinate|null} snapped vertex on extent
      * @private
      */
    /* private */ var snapToVertex_ : Any = js.native
    
    /**
      * Is the pointer snapped to an extent vertex
      * @type {boolean}
      * @private
      */
    /* private */ var snappedToVertex_ : Any = js.native
    
    /***
      * @type {ExtentOnSignature<void>}
      */
    @JSName("un")
    var un_Extent: ExtentOnSignature[Unit] = js.native
    
    /**
      * Feature for displaying the visible pointer
      * @type {Feature<Point>}
      * @private
      */
    /* private */ var vertexFeature_ : Any = js.native
    
    /**
      * Layer for the vertexFeature
      * @type {VectorLayer}
      * @private
      */
    /* private */ var vertexOverlay_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ExtentOnSignature[Return]
    extends OnSignature[
          changeColonactive | extentchanged | EventTypes | Types, 
          ExtentEvent | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * Style for the drawn extent box. Defaults to the `Polygon` editing style
      * documented in {@link module :ol/style/Style~Style}
      */
    var boxStyle: js.UndefOr[StyleLike] = js.undefined
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * Default is {@link module :ol/events/condition.always}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Initial extent. Defaults to no
      * initial extent.
      */
    var extent: js.UndefOr[typings.ol.extentMod.Extent] = js.undefined
    
    /**
      * Pixel tolerance for considering the
      * pointer close enough to a segment or vertex for editing.
      */
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Style for the cursor used to draw the extent. Defaults to the `Point` editing style
      * documented in {@link module :ol/style/Style~Style}
      */
    var pointerStyle: js.UndefOr[StyleLike] = js.undefined
    
    /**
      * Wrap the drawn extent across multiple maps
      * in the X direction? Only affects visuals, not functionality.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBoxStyle(value: StyleLike): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
      
      inline def setBoxStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "boxStyle", js.Any.fromFunction2(value))
      
      inline def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
      
      inline def setBoxStyleVarargs(value: Style*): Self = StObject.set(x, "boxStyle", js.Array(value*))
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setExtent(value: typings.ol.extentMod.Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      inline def setPointerStyle(value: StyleLike): Self = StObject.set(x, "pointerStyle", value.asInstanceOf[js.Any])
      
      inline def setPointerStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "pointerStyle", js.Any.fromFunction2(value))
      
      inline def setPointerStyleUndefined: Self = StObject.set(x, "pointerStyle", js.undefined)
      
      inline def setPointerStyleVarargs(value: Style*): Self = StObject.set(x, "pointerStyle", js.Array(value*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
