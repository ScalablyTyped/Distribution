package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonactive
import typings.ol.olStrings.translateend
import typings.ol.olStrings.translatestart
import typings.ol.olStrings.translating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionTranslateMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'translateend'|'translatestart'|'translating', TranslateEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'translateend'|'translatestart'|'translating', Return>} TranslateOnSignature
    */
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    * If you want to translate multiple features in a single action (for example,
    * the collection used by a select interaction), construct the interaction with
    * the `features` option.
    *
    * @fires TranslateEvent
    * @api
    */
  @JSImport("ol/interaction/Translate", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Translate {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Translate", "TranslateEvent")
  @js.native
  open class TranslateEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {TranslateEventType} type Type.
      * @param {Collection<Feature>} features The features translated.
      * @param {import("../coordinate.js").Coordinate} coordinate The event coordinate.
      * @param {import("../coordinate.js").Coordinate} startCoordinate The original coordinates before.translation started
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Map browser event.
      */
    def this(
      `type`: TranslateEventType,
      features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      coordinate: Coordinate,
      startCoordinate: Coordinate,
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
      * The features being translated.
      * @type {Collection<Feature>}
      * @api
      */
    var features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      * @type {import("../MapBrowserEvent.js").default}
      * @api
      */
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any] = js.native
    
    /**
      * The coordinate of the start position before translation started.
      * @const
      * @type {import("../coordinate.js").Coordinate}
      * @api
      */
    var startCoordinate: Coordinate = js.native
  }
  
  type FilterFunction = js.Function2[
    /* arg0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], 
    /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
    Boolean
  ]
  
  trait Options extends StObject {
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * Default is {@link module :ol/events/condition.always}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Features contained in this collection will be able to be translated together.
      */
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ] = js.undefined
    
    /**
      * A function
      * that takes an {@link module :ol/Feature~Feature} and an
      * {@link module :ol/layer/Layer~Layer} and returns `true` if the feature may be
      * translated or `false` otherwise. Not used if `features` is provided.
      */
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      */
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * A list of layers from which features should be
      * translated. Alternatively, a filter function can be provided. The
      * function will be called for each layer in the map and should return
      * `true` for layers that you want to be translatable. If the option is
      * absent, all visible layers will be considered translatable.
      * Not used if `features` is provided.
      */
    var layers: js.UndefOr[
        (js.Array[
          typings.ol.layerLayerMod.default[
            typings.ol.sourceSourceMod.default, 
            typings.ol.layerLayerMod.default[Any, /* ol.ol/layer/Layer.default<any> */ Any]
          ]
        ]) | (js.Function1[
          /* arg0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
          Boolean
        ])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFilter(
        value: (/* arg0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      inline def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      inline def setLayers(
        value: (js.Array[
              typings.ol.layerLayerMod.default[
                typings.ol.sourceSourceMod.default, 
                typings.ol.layerLayerMod.default[Any, /* ol.ol/layer/Layer.default<any> */ Any]
              ]
            ]) | (js.Function1[
              /* arg0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
              Boolean
            ])
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersFunction1(
        value: /* arg0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any] => Boolean
      ): Self = StObject.set(x, "layers", js.Any.fromFunction1(value))
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(
        value: (typings.ol.layerLayerMod.default[
              typings.ol.sourceSourceMod.default, 
              typings.ol.layerLayerMod.default[Any, /* ol.ol/layer/Layer.default<any> */ Any]
            ])*
      ): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'translateend'|'translatestart'|'translating', TranslateEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'translateend'|'translatestart'|'translating', Return>} TranslateOnSignature
    */
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    * If you want to translate multiple features in a single action (for example,
    * the collection used by a select interaction), construct the interaction with
    * the `features` option.
    *
    * @fires TranslateEvent
    * @api
    */
  @js.native
  trait Translate
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * Tests to see if the given coordinates intersects any of our selected
      * features.
      * @param {import("../pixel.js").Pixel} pixel Pixel coordinate to test for intersection.
      * @param {import("../Map.js").default} map Map to test the intersection on.
      * @return {Feature} Returns the feature found at the specified pixel
      * coordinates.
      * @private
      */
    /* private */ var featuresAtPixel_ : Any = js.native
    
    /**
      * @type {Collection<Feature>|null}
      * @private
      */
    /* private */ var features_ : Any = js.native
    
    /**
      * @private
      * @type {FilterFunction}
      */
    /* private */ var filter_ : Any = js.native
    
    /**
      * Returns the Hit-detection tolerance.
      * @return {number} Hit tolerance in pixels.
      * @api
      */
    def getHitTolerance(): Double = js.native
    
    /**
      * @private
      */
    /* private */ var handleActiveChanged_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var hitTolerance_ : Any = js.native
    
    /**
      * The last position we translated to.
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var lastCoordinate_ : Any = js.native
    
    /**
      * @type {Feature}
      * @private
      */
    /* private */ var lastFeature_ : Any = js.native
    
    /**
      * @private
      * @type {function(import("../layer/Layer.js").default<import("../source/Source").default>): boolean}
      */
    /* private */ var layerFilter_ : Any = js.native
    
    /***
      * @type {TranslateOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Translate: TranslateOnSignature[EventsKey] = js.native
    
    /***
      * @type {TranslateOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Translate: TranslateOnSignature[EventsKey] = js.native
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      * @param {number} hitTolerance Hit tolerance in pixels.
      * @api
      */
    def setHitTolerance(hitTolerance: Double): Unit = js.native
    
    /**
      * The start position before translation started.
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var startCoordinate_ : Any = js.native
    
    /***
      * @type {TranslateOnSignature<void>}
      */
    @JSName("un")
    var un_Translate: TranslateOnSignature[Unit] = js.native
    
    /**
      * @param {import("../Map.js").default} oldMap Old map.
      * @private
      */
    /* private */ var updateState_ : Any = js.native
  }
  
  type TranslateEventType = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait TranslateOnSignature[Return]
    extends OnSignature[
          changeColonactive | translateend | translatestart | translating | EventTypes | Types, 
          ObjectEvent | TranslateEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
}
