package typings.ol

import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonactive
import typings.ol.olStrings.select
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionSelectMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'select', SelectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'select', Return>} SelectOnSignature
    */
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * @fires SelectEvent
    * @api
    */
  @JSImport("ol/interaction/Select", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Select {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Select", "SelectEvent")
  @js.native
  open class SelectEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {SelectEventType} type The event type.
      * @param {Array<import("../Feature.js").default>} selected Selected features.
      * @param {Array<import("../Feature.js").default>} deselected Deselected features.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Associated
      *     {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      */
    def this(
      `type`: SelectEventType,
      selected: js.Array[typings.ol.renderFeatureMod.default],
      deselected: js.Array[typings.ol.renderFeatureMod.default],
      mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]
    ) = this()
    
    /**
      * Deselected features array.
      * @type {Array<import("../Feature.js").default>}
      * @api
      */
    var deselected: js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      * @type {import("../MapBrowserEvent.js").default}
      * @api
      */
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any] = js.native
    
    /**
      * Selected features array.
      * @type {Array<import("../Feature.js").default>}
      * @api
      */
    var selected: js.Array[typings.ol.renderFeatureMod.default] = js.native
  }
  
  type FilterFunction = js.Function2[
    /* arg0 */ typings.ol.renderFeatureMod.default, 
    /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
    Boolean
  ]
  
  trait Options extends StObject {
    
    /**
      * A function
      * that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * By default, this is {@link module :ol/events/condition.never}. Use this if you
      * want to use different events for add and remove instead of `toggle`.
      */
    var addCondition: js.UndefOr[Condition] = js.undefined
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled. This is the event
      * for the selected features as a whole. By default, this is
      * {@link module :ol/events/condition.singleClick}. Clicking on a feature selects that
      * feature and removes any that were in the selection. Clicking outside any
      * feature removes all from the selection.
      * See `toggle`, `add`, `remove` options for adding/removing extra features to/
      * from the selection.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Collection where the interaction will place selected features. Optional. If
      * not set the interaction will create a collection. In any case the collection
      * used by the interaction is returned by
      * {@link module :ol/interaction/Select~Select#getFeatures}.
      */
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ] = js.undefined
    
    /**
      * A function
      * that takes an {@link module :ol/Feature~Feature} and an
      * {@link module :ol/layer/Layer~Layer} and returns `true` if the feature may be
      * selected or `false` otherwise.
      */
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    /**
      * Hit-detection tolerance. Pixels inside
      * the radius around the given position will be checked for features.
      */
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * A list of layers from which features should be selected. Alternatively, a
      * filter function can be provided. The function will be called for each layer
      * in the map and should return `true` for layers that you want to be
      * selectable. If the option is absent, all visible layers will be considered
      * selectable.
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
    
    /**
      * A boolean that determines if the default
      * behaviour should select only single features or all (overlapping) features at
      * the clicked map position. The default of `false` means single select.
      */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function
      * that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * By default, this is {@link module :ol/events/condition.never}. Use this if you
      * want to use different events for add and remove instead of `toggle`.
      */
    var removeCondition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Style for the selected features. By default the default edit style is used
      * (see {@link module :ol/style/Style~Style}). Set to `null` if this interaction should not apply
      * any style changes for selected features.
      * If set to a falsey value, the selected feature's style will not change.
      */
    var style: js.UndefOr[StyleLike | Null] = js.undefined
    
    /**
      * A function
      * that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled. This is in addition
      * to the `condition` event. By default,
      * {@link module :ol/events/condition.shiftKeyOnly}, i.e. pressing `shift` as
      * well as the `condition` event, adds that feature to the current selection if
      * it is not currently selected, and removes it if it is. See `add` and `remove`
      * if you want to use different events instead of a toggle.
      */
    var toggleCondition: js.UndefOr[Condition] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAddCondition(value: Condition): Self = StObject.set(x, "addCondition", value.asInstanceOf[js.Any])
      
      inline def setAddConditionUndefined: Self = StObject.set(x, "addCondition", js.undefined)
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFilter(
        value: (/* arg0 */ typings.ol.renderFeatureMod.default, /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]) => Boolean
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
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setRemoveCondition(value: Condition): Self = StObject.set(x, "removeCondition", value.asInstanceOf[js.Any])
      
      inline def setRemoveConditionUndefined: Self = StObject.set(x, "removeCondition", js.undefined)
      
      inline def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setToggleCondition(value: Condition): Self = StObject.set(x, "toggleCondition", value.asInstanceOf[js.Any])
      
      inline def setToggleConditionUndefined: Self = StObject.set(x, "toggleCondition", js.undefined)
    }
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'select', SelectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'select', Return>} SelectOnSignature
    */
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * @fires SelectEvent
    * @api
    */
  @js.native
  trait Select
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var addCondition_ : Any = js.native
    
    /**
      * @param {import("../Feature.js").default} feature Feature.
      * @param {import("../layer/Layer.js").default} layer Layer.
      * @private
      */
    /* private */ var addFeatureLayerAssociation_ : Any = js.native
    
    /**
      * @param {import("../Collection.js").CollectionEvent<Feature>} evt Event.
      * @private
      */
    /* private */ var addFeature_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @private
      */
    /* private */ var applySelectedStyle_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var boundAddFeature_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var boundRemoveFeature_ : Any = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * An association between selected feature (key)
      * and layer (value)
      * @private
      * @type {Object<string, import("../layer/Layer.js").default>}
      */
    /* private */ var featureLayerAssociation_ : Any = js.native
    
    /**
      * @private
      * @type {Collection<Feature>}
      */
    /* private */ var features_ : Any = js.native
    
    /**
      * @private
      * @type {FilterFunction}
      */
    /* private */ var filter_ : Any = js.native
    
    /**
      * Get the selected features.
      * @return {Collection<Feature>} Features collection.
      * @api
      */
    def getFeatures(): typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /**
      * Returns the Hit-detection tolerance.
      * @return {number} Hit tolerance in pixels.
      * @api
      */
    def getHitTolerance(): Double = js.native
    
    /**
      * Returns the associated {@link module:ol/layer/Vector~VectorLayer vector layer} of
      * a selected feature.
      * @param {import("../Feature.js").default} feature Feature
      * @return {import('../layer/Vector.js').default} Layer.
      * @api
      */
    def getLayer(feature: typings.ol.renderFeatureMod.default): typings.ol.layerVectorMod.default[Any] = js.native
    
    /**
      * @return {import("../style/Style.js").StyleLike|null} Select style.
      */
    def getStyle(): StyleLike | Null = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var hitTolerance_ : Any = js.native
    
    /**
      * @private
      * @type {function(import("../layer/Layer.js").default<import("../source/Source").default>): boolean}
      */
    /* private */ var layerFilter_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var multi_ : Any = js.native
    
    /***
      * @type {SelectOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Select: SelectOnSignature[EventsKey] = js.native
    
    /***
      * @type {SelectOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Select: SelectOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var removeCondition_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature.
      * @private
      */
    /* private */ var removeFeatureLayerAssociation_ : Any = js.native
    
    /**
      * @param {import("../Collection.js").CollectionEvent<Feature>} evt Event.
      * @private
      */
    /* private */ var removeFeature_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @private
      */
    /* private */ var restorePreviousStyle_ : Any = js.native
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      * @param {number} hitTolerance Hit tolerance in pixels.
      * @api
      */
    def setHitTolerance(hitTolerance: Double): Unit = js.native
    
    /**
      * @private
      * @type {import("../style/Style.js").default|Array<import("../style/Style.js").default>|import("../style/Style.js").StyleFunction|null}
      */
    /* private */ var style_ : Any = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var toggleCondition_ : Any = js.native
    
    /***
      * @type {SelectOnSignature<void>}
      */
    @JSName("un")
    var un_Select: SelectOnSignature[Unit] = js.native
  }
  
  type SelectEventType = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait SelectOnSignature[Return]
    extends OnSignature[
          changeColonactive | select | EventTypes | Types, 
          ObjectEvent | SelectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
}
