package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.layerBaseMod.BaseLayerObjectEventTypes
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonlayers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerGroupMod {
  
  /**
    * @classdesc
    * A {@link module:ol/Collection~Collection} of layers that are handled together.
    *
    * A generic `change` event is triggered when the group/Collection changes.
    *
    * @api
    */
  @JSImport("ol/layer/Group", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Layer options.
    */
  open class default () extends LayerGroup {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/layer/Group", "GroupEvent")
  @js.native
  open class GroupEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {EventType} type The event type.
      * @param {BaseLayer} layer The layer.
      */
    def this(`type`: EventType, layer: typings.ol.layerBaseMod.default) = this()
    
    /**
      * The added or removed layer.
      * @type {BaseLayer}
      * @api
      */
    var layer: typings.ol.layerBaseMod.default = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.addlayer
    - typings.ol.olStrings.removelayer
  */
  trait EventType extends StObject
  object EventType {
    
    inline def addlayer: typings.ol.olStrings.addlayer = "addlayer".asInstanceOf[typings.ol.olStrings.addlayer]
    
    inline def removelayer: typings.ol.olStrings.removelayer = "removelayer".asInstanceOf[typings.ol.olStrings.removelayer]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait GroupOnSignature[Return]
    extends OnSignature[
          changeColonlayers | BaseLayerObjectEventTypes | EventTypes, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  /**
    * @classdesc
    * A {@link module:ol/Collection~Collection} of layers that are handled together.
    *
    * A generic `change` event is triggered when the group/Collection changes.
    *
    * @api
    */
  @js.native
  trait LayerGroup
    extends typings.ol.layerBaseMod.default {
    
    /**
      * Returns the {@link module:ol/Collection~Collection collection} of {@link module:ol/layer/Layer~Layer layers}
      * in this group.
      * @return {!Collection<import("./Base.js").default>} Collection of
      *   {@link module:ol/layer/Base~BaseLayer layers} that are part of this group.
      * @observable
      * @api
      */
    def getLayers(): typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] = js.native
    
    /**
      * @private
      */
    /* private */ var handleLayerChange_ : Any = js.native
    
    /**
      * @param {GroupEvent} event The layer group event.
      */
    def handleLayerGroupAdd_(event: GroupEvent): Unit = js.native
    
    /**
      * @param {GroupEvent} event The layer group event.
      */
    def handleLayerGroupRemove_(event: GroupEvent): Unit = js.native
    
    /**
      * @param {import("../Collection.js").CollectionEvent<import("./Base.js").default>} collectionEvent CollectionEvent.
      * @private
      */
    /* private */ var handleLayersAdd_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleLayersChanged_ : Any = js.native
    
    /**
      * @param {import("../Collection.js").CollectionEvent<import("./Base.js").default>} collectionEvent CollectionEvent.
      * @private
      */
    /* private */ var handleLayersRemove_ : Any = js.native
    
    /**
      * @private
      * @type {Array<import("../events.js").EventsKey>}
      */
    /* private */ var layersListenerKeys_ : Any = js.native
    
    /**
      * @private
      * @type {Object<string, Array<import("../events.js").EventsKey>>}
      */
    /* private */ var listenerKeys_ : Any = js.native
    
    /***
      * @type {GroupOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_LayerGroup: GroupOnSignature[EventsKey] = js.native
    
    /***
      * @type {GroupOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_LayerGroup: GroupOnSignature[EventsKey] = js.native
    
    /**
      * @param {BaseLayer} layer The layer.
      */
    def registerLayerListeners_(layer: typings.ol.layerBaseMod.default): Unit = js.native
    
    /**
      * Set the {@link module:ol/Collection~Collection collection} of {@link module:ol/layer/Layer~Layer layers}
      * in this group.
      * @param {!Collection<import("./Base.js").default>} layers Collection of
      *   {@link module:ol/layer/Base~BaseLayer layers} that are part of this group.
      * @observable
      * @api
      */
    def setLayers(layers: typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]): Unit = js.native
    
    /***
      * @type {GroupOnSignature<void>}
      */
    @JSName("un")
    var un_LayerGroup: GroupOnSignature[Unit] = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The bounding extent for layer rendering.  The layer will not be
      * rendered outside of this extent.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Child layers.
      */
    var layers: js.UndefOr[
        js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]
      ] = js.undefined
    
    /**
      * The maximum resolution (exclusive) below which this layer will
      * be visible.
      */
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum view zoom level (inclusive) at which this layer will
      * be visible.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum resolution (inclusive) at which this layer will be
      * visible.
      */
    var minResolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum view zoom level (exclusive) above which this layer will be
      * visible.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Opacity (0, 1).
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Arbitrary observable properties. Can be accessed with `#get()` and `#set()`.
      */
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Visibility.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The z-index for layer rendering.  At rendering time, the layers
      * will be ordered, first by Z-index and then by position. When `undefined`, a `zIndex` of 0 is assumed
      * for layers that are added to the map's `layers` collection, or `Infinity` when the layer's `setMap()`
      * method was used.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setLayers(
        value: js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: typings.ol.layerBaseMod.default*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
