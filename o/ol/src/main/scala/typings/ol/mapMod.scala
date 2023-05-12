package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.anon.ClientX
import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.layerLayerMod.State
import typings.ol.mapBrowserEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.pixelMod.Pixel
import typings.ol.renderEventTypeMod.MapRenderEventTypes
import typings.ol.sizeMod.Size
import typings.ol.transformMod.Transform
import typings.ol.viewMod.ViewOptions
import typings.std.Document
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.ResizeObserver
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  /**
    * @classdesc
    * The map is the core component of OpenLayers. For a map to render, a view,
    * one or more layers, and a target container are needed:
    *
    *     import Map from 'ol/Map.js';
    *     import View from 'ol/View.js';
    *     import TileLayer from 'ol/layer/Tile.js';
    *     import OSM from 'ol/source/OSM.js';
    *
    *     const map = new Map({
    *       view: new View({
    *         center: [0, 0],
    *         zoom: 1,
    *       }),
    *       layers: [
    *         new TileLayer({
    *           source: new OSM(),
    *         }),
    *       ],
    *       target: 'map',
    *     });
    *
    * The above snippet creates a map using a {@link module:ol/layer/Tile~TileLayer} to
    * display {@link module:ol/source/OSM~OSM} OSM data and render it to a DOM
    * element with the id `map`.
    *
    * The constructor places a viewport container (with CSS class name
    * `ol-viewport`) in the target element (see `getViewport()`), and then two
    * further elements within the viewport: one with CSS class name
    * `ol-overlaycontainer-stopevent` for controls and some overlays, and one with
    * CSS class name `ol-overlaycontainer` for other overlays (see the `stopEvent`
    * option of {@link module:ol/Overlay~Overlay} for the difference). The map
    * itself is placed in a further element within the viewport.
    *
    * Layers are stored as a {@link module:ol/Collection~Collection} in
    * layerGroups. A top-level group is provided by the library. This is what is
    * accessed by `getLayerGroup` and `setLayerGroup`. Layers entered in the
    * options are added to this group, and `addLayer` and `removeLayer` change the
    * layer collection in the group. `getLayers` is a convenience function for
    * `getLayerGroup().getLayers()`. Note that {@link module:ol/layer/Group~LayerGroup}
    * is a subclass of {@link module:ol/layer/Base~BaseLayer}, so layers entered in the
    * options or added with `addLayer` can be groups, which can contain further
    * groups, and so on.
    *
    * @fires import("./MapBrowserEvent.js").MapBrowserEvent
    * @fires import("./MapEvent.js").MapEvent
    * @fires import("./render/Event.js").default#precompose
    * @fires import("./render/Event.js").default#postcompose
    * @fires import("./render/Event.js").default#rendercomplete
    * @api
    */
  @JSImport("ol/Map", JSImport.Default)
  @js.native
  /**
    * @param {MapOptions} [options] Map options.
    */
  open class default () extends Map {
    def this(options: MapOptions) = this()
  }
  
  trait AtPixelOptions extends StObject {
    
    /**
      * Check-Wrapped Will check for wrapped geometries inside the range of
      * +/- 1 world width. Works only if a projection is used that can be wrapped.
      */
    var checkWrapped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hit-detection tolerance in css pixels. Pixels
      * inside the radius around the given position will be checked for features.
      */
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Layer filter
      * function. The filter function will receive one argument, the
      * {@link module :ol/layer/Layer~Layer layer-candidate} and it should return a boolean value.
      * Only layers which are visible and for which this function returns `true`
      * will be tested for features. By default, all visible layers will be tested.
      */
    var layerFilter: js.UndefOr[
        js.Function1[
          /* arg0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
          Boolean
        ]
      ] = js.undefined
  }
  object AtPixelOptions {
    
    inline def apply(): AtPixelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtPixelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AtPixelOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckWrapped(value: Boolean): Self = StObject.set(x, "checkWrapped", value.asInstanceOf[js.Any])
      
      inline def setCheckWrappedUndefined: Self = StObject.set(x, "checkWrapped", js.undefined)
      
      inline def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      inline def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      inline def setLayerFilter(
        value: /* arg0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any] => Boolean
      ): Self = StObject.set(x, "layerFilter", js.Any.fromFunction1(value))
      
      inline def setLayerFilterUndefined: Self = StObject.set(x, "layerFilter", js.undefined)
    }
  }
  
  trait FrameState extends StObject {
    
    /**
      * Animate.
      */
    var animate: Boolean
    
    /**
      * CoordinateToPixelTransform.
      */
    var coordinateToPixelTransform: Transform
    
    /**
      * DeclutterTree.
      */
    var declutterTree: Any
    
    /**
      * Extent.
      */
    var extent: Null | Extent
    
    /**
      * Index.
      */
    var index: Double
    
    /**
      * LayerIndex.
      */
    var layerIndex: Double
    
    /**
      * LayerStatesArray.
      */
    var layerStatesArray: js.Array[State]
    
    /**
      * The id of the map.
      */
    var mapId: String
    
    /**
      * Next extent during an animation series.
      */
    var nextExtent: js.UndefOr[Extent] = js.undefined
    
    /**
      * The pixel ratio of the frame.
      */
    var pixelRatio: Double
    
    /**
      * PixelToCoordinateTransform.
      */
    var pixelToCoordinateTransform: Transform
    
    /**
      * PostRenderFunctions.
      */
    var postRenderFunctions: js.Array[PostRenderFunction]
    
    /**
      * Identifiers of previously rendered elements.
      */
    var renderTargets: StringDictionary[Boolean]
    
    /**
      * Size.
      */
    var size: Size
    
    /**
      * TileQueue.
      */
    var tileQueue: typings.ol.tileQueueMod.default
    
    /**
      * The time when rendering of the frame was requested.
      */
    var time: Double
    
    /**
      * UsedTiles.
      */
    var usedTiles: StringDictionary[StringDictionary[Boolean]]
    
    /**
      * ViewHints.
      */
    var viewHints: js.Array[Double]
    
    /**
      * The state of the current view.
      */
    var viewState: typings.ol.viewMod.State
    
    /**
      * WantedTiles.
      */
    var wantedTiles: StringDictionary[StringDictionary[Boolean]]
  }
  object FrameState {
    
    inline def apply(
      animate: Boolean,
      coordinateToPixelTransform: Transform,
      declutterTree: Any,
      index: Double,
      layerIndex: Double,
      layerStatesArray: js.Array[State],
      mapId: String,
      pixelRatio: Double,
      pixelToCoordinateTransform: Transform,
      postRenderFunctions: js.Array[PostRenderFunction],
      renderTargets: StringDictionary[Boolean],
      size: Size,
      tileQueue: typings.ol.tileQueueMod.default,
      time: Double,
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      viewHints: js.Array[Double],
      viewState: typings.ol.viewMod.State,
      wantedTiles: StringDictionary[StringDictionary[Boolean]]
    ): FrameState = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], declutterTree = declutterTree.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerIndex = layerIndex.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], renderTargets = renderTargets.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any], extent = null)
      __obj.asInstanceOf[FrameState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameState] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateToPixelTransform(value: Transform): Self = StObject.set(x, "coordinateToPixelTransform", value.asInstanceOf[js.Any])
      
      inline def setCoordinateToPixelTransformVarargs(value: Double*): Self = StObject.set(x, "coordinateToPixelTransform", js.Array(value*))
      
      inline def setDeclutterTree(value: Any): Self = StObject.set(x, "declutterTree", value.asInstanceOf[js.Any])
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentNull: Self = StObject.set(x, "extent", null)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLayerIndex(value: Double): Self = StObject.set(x, "layerIndex", value.asInstanceOf[js.Any])
      
      inline def setLayerStatesArray(value: js.Array[State]): Self = StObject.set(x, "layerStatesArray", value.asInstanceOf[js.Any])
      
      inline def setLayerStatesArrayVarargs(value: State*): Self = StObject.set(x, "layerStatesArray", js.Array(value*))
      
      inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
      
      inline def setNextExtent(value: Extent): Self = StObject.set(x, "nextExtent", value.asInstanceOf[js.Any])
      
      inline def setNextExtentUndefined: Self = StObject.set(x, "nextExtent", js.undefined)
      
      inline def setNextExtentVarargs(value: Double*): Self = StObject.set(x, "nextExtent", js.Array(value*))
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelToCoordinateTransform(value: Transform): Self = StObject.set(x, "pixelToCoordinateTransform", value.asInstanceOf[js.Any])
      
      inline def setPixelToCoordinateTransformVarargs(value: Double*): Self = StObject.set(x, "pixelToCoordinateTransform", js.Array(value*))
      
      inline def setPostRenderFunctions(value: js.Array[PostRenderFunction]): Self = StObject.set(x, "postRenderFunctions", value.asInstanceOf[js.Any])
      
      inline def setPostRenderFunctionsVarargs(value: PostRenderFunction*): Self = StObject.set(x, "postRenderFunctions", js.Array(value*))
      
      inline def setRenderTargets(value: StringDictionary[Boolean]): Self = StObject.set(x, "renderTargets", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setTileQueue(value: typings.ol.tileQueueMod.default): Self = StObject.set(x, "tileQueue", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUsedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "usedTiles", value.asInstanceOf[js.Any])
      
      inline def setViewHints(value: js.Array[Double]): Self = StObject.set(x, "viewHints", value.asInstanceOf[js.Any])
      
      inline def setViewHintsVarargs(value: Double*): Self = StObject.set(x, "viewHints", js.Array(value*))
      
      inline def setViewState(value: typings.ol.viewMod.State): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
      
      inline def setWantedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "wantedTiles", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @classdesc
    * The map is the core component of OpenLayers. For a map to render, a view,
    * one or more layers, and a target container are needed:
    *
    *     import Map from 'ol/Map.js';
    *     import View from 'ol/View.js';
    *     import TileLayer from 'ol/layer/Tile.js';
    *     import OSM from 'ol/source/OSM.js';
    *
    *     const map = new Map({
    *       view: new View({
    *         center: [0, 0],
    *         zoom: 1,
    *       }),
    *       layers: [
    *         new TileLayer({
    *           source: new OSM(),
    *         }),
    *       ],
    *       target: 'map',
    *     });
    *
    * The above snippet creates a map using a {@link module:ol/layer/Tile~TileLayer} to
    * display {@link module:ol/source/OSM~OSM} OSM data and render it to a DOM
    * element with the id `map`.
    *
    * The constructor places a viewport container (with CSS class name
    * `ol-viewport`) in the target element (see `getViewport()`), and then two
    * further elements within the viewport: one with CSS class name
    * `ol-overlaycontainer-stopevent` for controls and some overlays, and one with
    * CSS class name `ol-overlaycontainer` for other overlays (see the `stopEvent`
    * option of {@link module:ol/Overlay~Overlay} for the difference). The map
    * itself is placed in a further element within the viewport.
    *
    * Layers are stored as a {@link module:ol/Collection~Collection} in
    * layerGroups. A top-level group is provided by the library. This is what is
    * accessed by `getLayerGroup` and `setLayerGroup`. Layers entered in the
    * options are added to this group, and `addLayer` and `removeLayer` change the
    * layer collection in the group. `getLayers` is a convenience function for
    * `getLayerGroup().getLayers()`. Note that {@link module:ol/layer/Group~LayerGroup}
    * is a subclass of {@link module:ol/layer/Base~BaseLayer}, so layers entered in the
    * options or added with `addLayer` can be groups, which can contain further
    * groups, and so on.
    *
    * @fires import("./MapBrowserEvent.js").MapBrowserEvent
    * @fires import("./MapEvent.js").MapEvent
    * @fires import("./render/Event.js").default#precompose
    * @fires import("./render/Event.js").default#postcompose
    * @fires import("./render/Event.js").default#rendercomplete
    * @api
    */
  @js.native
  trait Map
    extends typings.ol.objectMod.default {
    
    /**
      * Add the given control to the map.
      * @param {import("./control/Control.js").default} control Control.
      * @api
      */
    def addControl(control: typings.ol.controlControlMod.default): Unit = js.native
    
    /**
      * Add the given interaction to the map. If you want to add an interaction
      * at another point of the collection use `getInteractions()` and the methods
      * available on {@link module:ol/Collection~Collection}. This can be used to
      * stop the event propagation from the handleEvent function. The interactions
      * get to handle the events in the reverse order of this collection.
      * @param {import("./interaction/Interaction.js").default} interaction Interaction to add.
      * @api
      */
    def addInteraction(interaction: typings.ol.interactionInteractionMod.default): Unit = js.native
    
    /**
      * Adds the given layer to the top of this map. If you want to add a layer
      * elsewhere in the stack, use `getLayers()` and the methods available on
      * {@link module:ol/Collection~Collection}.
      * @param {import("./layer/Base.js").default} layer Layer.
      * @api
      */
    def addLayer(layer: typings.ol.layerBaseMod.default): Unit = js.native
    
    /**
      * Add the given overlay to the map.
      * @param {import("./Overlay.js").default} overlay Overlay.
      * @api
      */
    def addOverlay(overlay: typings.ol.overlayMod.default): Unit = js.native
    
    /**
      * This deals with map's overlay collection changes.
      * @param {import("./Overlay.js").default} overlay Overlay.
      * @private
      */
    /* private */ var addOverlayInternal_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var animationDelayKey_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var animationDelay_ : Any = js.native
    
    /** @private */
    /* private */ var boundHandleBrowserEvent_ : Any = js.native
    
    /**
      * @type {Collection<import("./control/Control.js").default>}
      * @protected
      */
    /* protected */ var controls: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
    
    /**
      * @private
      * @type {import("./transform.js").Transform}
      */
    /* private */ var coordinateToPixelTransform_ : Any = js.native
    
    /**
      * Detect features that intersect a pixel on the viewport, and execute a
      * callback with each intersecting feature. Layers included in the detection can
      * be configured through the `layerFilter` option in `options`.
      * @param {import("./pixel.js").Pixel} pixel Pixel.
      * @param {function(import("./Feature.js").FeatureLike, import("./layer/Layer.js").default<import("./source/Source").default>, import("./geom/SimpleGeometry.js").default): T} callback Feature callback. The callback will be
      *     called with two arguments. The first argument is one
      *     {@link module:ol/Feature~Feature feature} or
      *     {@link module:ol/render/Feature~RenderFeature render feature} at the pixel, the second is
      *     the {@link module:ol/layer/Layer~Layer layer} of the feature and will be null for
      *     unmanaged layers. To stop detection, callback functions can return a
      *     truthy value.
      * @param {AtPixelOptions} [options] Optional options.
      * @return {T|undefined} Callback result, i.e. the return value of last
      * callback execution, or the first truthy callback return value.
      * @template T
      * @api
      */
    def forEachFeatureAtPixel[T](
      pixel: Pixel,
      callback: js.Function3[
          /* arg0 */ FeatureLike, 
          /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
          /* arg2 */ typings.ol.geomSimpleGeometryMod.default, 
          T
        ]
    ): js.UndefOr[T] = js.native
    def forEachFeatureAtPixel[T](
      pixel: Pixel,
      callback: js.Function3[
          /* arg0 */ FeatureLike, 
          /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
          /* arg2 */ typings.ol.geomSimpleGeometryMod.default, 
          T
        ],
      options: AtPixelOptions
    ): js.UndefOr[T] = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var frameIndex_ : Any = js.native
    
    /**
      * @private
      * @type {?FrameState}
      */
    /* private */ var frameState_ : Any = js.native
    
    /**
      * Get all layers from all layer groups.
      * @return {Array<import("./layer/Layer.js").default>} Layers.
      * @api
      */
    def getAllLayers(): js.Array[
        typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
      ] = js.native
    
    /**
      * Get the map controls. Modifying this collection changes the controls
      * associated with the map.
      * @return {Collection<import("./control/Control.js").default>} Controls.
      * @api
      */
    def getControls(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
    
    /**
      * Get the coordinate for a given pixel.  This returns a coordinate in the
      * user projection.
      * @param {import("./pixel.js").Pixel} pixel Pixel position in the map viewport.
      * @return {import("./coordinate.js").Coordinate} The coordinate for the pixel position.
      * @api
      */
    def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
    
    /**
      * Get the coordinate for a given pixel.  This returns a coordinate in the
      * map view projection.
      * @param {import("./pixel.js").Pixel} pixel Pixel position in the map viewport.
      * @return {import("./coordinate.js").Coordinate} The coordinate for the pixel position.
      */
    def getCoordinateFromPixelInternal(pixel: Pixel): Coordinate = js.native
    
    /**
      * Returns the coordinate in user projection for a browser event.
      * @param {MouseEvent} event Event.
      * @return {import("./coordinate.js").Coordinate} Coordinate.
      * @api
      */
    def getEventCoordinate(event: MouseEvent): Coordinate = js.native
    
    /**
      * Returns the coordinate in view projection for a browser event.
      * @param {MouseEvent} event Event.
      * @return {import("./coordinate.js").Coordinate} Coordinate.
      */
    def getEventCoordinateInternal(event: MouseEvent): Coordinate = js.native
    
    def getEventPixel(event: ClientX): Pixel = js.native
    /**
      * Returns the map pixel position for a browser event relative to the viewport.
      * @param {UIEvent|{clientX: number, clientY: number}} event Event.
      * @return {import("./pixel.js").Pixel} Pixel.
      * @api
      */
    def getEventPixel(event: UIEvent): Pixel = js.native
    
    /**
      * Get all features that intersect a pixel on the viewport.
      * @param {import("./pixel.js").Pixel} pixel Pixel.
      * @param {AtPixelOptions} [options] Optional options.
      * @return {Array<import("./Feature.js").FeatureLike>} The detected features or
      * an empty array if none were found.
      * @api
      */
    def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
    def getFeaturesAtPixel(pixel: Pixel, options: AtPixelOptions): js.Array[FeatureLike] = js.native
    
    /**
      * Get the map interactions. Modifying this collection changes the interactions
      * associated with the map.
      *
      * Interactions are used for e.g. pan, zoom and rotate.
      * @return {Collection<import("./interaction/Interaction.js").default>} Interactions.
      * @api
      */
    def getInteractions(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
    
    /**
      * Get the layergroup associated with this map.
      * @return {LayerGroup} A layer group containing the layers in this map.
      * @observable
      * @api
      */
    def getLayerGroup(): typings.ol.layerGroupMod.default = js.native
    
    /**
      * Get the collection of layers associated with this map.
      * @return {!Collection<import("./layer/Base.js").default>} Layers.
      * @api
      */
    def getLayers(): typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] = js.native
    
    /**
      * @return {boolean} Layers have sources that are still loading.
      */
    def getLoadingOrNotReady(): Boolean = js.native
    
    /**
      * Get an overlay by its identifier (the value returned by overlay.getId()).
      * Note that the index treats string and numeric identifiers as the same. So
      * `map.getOverlayById(2)` will return an overlay with id `'2'` or `2`.
      * @param {string|number} id Overlay identifier.
      * @return {import("./Overlay.js").default} Overlay.
      * @api
      */
    def getOverlayById(id: String): typings.ol.overlayMod.default = js.native
    def getOverlayById(id: Double): typings.ol.overlayMod.default = js.native
    
    /**
      * Get the element that serves as the container for overlays.  Elements added to
      * this container will let mousedown and touchstart events through to the map,
      * so clicks and gestures on an overlay will trigger {@link module:ol/MapBrowserEvent~MapBrowserEvent}
      * events.
      * @return {!HTMLElement} The map's overlay container.
      */
    def getOverlayContainer(): HTMLElement = js.native
    
    /**
      * Get the element that serves as a container for overlays that don't allow
      * event propagation. Elements added to this container won't let mousedown and
      * touchstart events through to the map, so clicks and gestures on an overlay
      * don't trigger any {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      * @return {!HTMLElement} The map's overlay container that stops events.
      */
    def getOverlayContainerStopEvent(): HTMLElement = js.native
    
    /**
      * Get the map overlays. Modifying this collection changes the overlays
      * associated with the map.
      * @return {Collection<import("./Overlay.js").default>} Overlays.
      * @api
      */
    def getOverlays(): typings.ol.collectionMod.default[typings.ol.overlayMod.default] = js.native
    
    /**
      * @return {!Document} The document where the map is displayed.
      */
    def getOwnerDocument(): Document = js.native
    
    /**
      * Get the pixel for a coordinate.  This takes a coordinate in the user
      * projection and returns the corresponding pixel.
      * @param {import("./coordinate.js").Coordinate} coordinate A map coordinate.
      * @return {import("./pixel.js").Pixel} A pixel position in the map viewport.
      * @api
      */
    def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
    
    /**
      * Get the pixel for a coordinate.  This takes a coordinate in the map view
      * projection and returns the corresponding pixel.
      * @param {import("./coordinate.js").Coordinate} coordinate A map coordinate.
      * @return {import("./pixel.js").Pixel} A pixel position in the map viewport.
      */
    def getPixelFromCoordinateInternal(coordinate: Coordinate): Pixel = js.native
    
    /**
      * Get the map renderer.
      * @return {import("./renderer/Map.js").default|null} Renderer
      */
    def getRenderer(): typings.ol.rendererMapMod.default | Null = js.native
    
    /**
      * Get the size of this map.
      * @return {import("./size.js").Size|undefined} The size in pixels of the map in the DOM.
      * @observable
      * @api
      */
    def getSize(): js.UndefOr[Size] = js.native
    
    /**
      * Get the target in which this map is rendered.
      * Note that this returns what is entered as an option or in setTarget:
      * if that was an element, it returns an element; if a string, it returns that.
      * @return {HTMLElement|string|undefined} The Element or id of the Element that the
      *     map is rendered in.
      * @observable
      * @api
      */
    def getTarget(): js.UndefOr[HTMLElement | String] = js.native
    
    /**
      * Get the DOM element into which this map is rendered. In contrast to
      * `getTarget` this method always return an `Element`, or `null` if the
      * map has no target.
      * @return {HTMLElement} The element that the map is rendered in.
      * @api
      */
    def getTargetElement(): HTMLElement = js.native
    
    /**
      * @param {import("./Tile.js").default} tile Tile.
      * @param {string} tileSourceKey Tile source key.
      * @param {import("./coordinate.js").Coordinate} tileCenter Tile center.
      * @param {number} tileResolution Tile resolution.
      * @return {number} Tile priority.
      */
    def getTilePriority(
      tile: typings.ol.tileMod.default,
      tileSourceKey: String,
      tileCenter: Coordinate,
      tileResolution: Double
    ): Double = js.native
    
    /**
      * Get the view associated with this map. A view manages properties such as
      * center and resolution.
      * @return {View} The view that controls this map.
      * @observable
      * @api
      */
    def getView(): typings.ol.viewMod.default = js.native
    
    /**
      * Get the element that serves as the map viewport.
      * @return {HTMLElement} Viewport.
      * @api
      */
    def getViewport(): HTMLElement = js.native
    
    /**
      * @param {UIEvent} browserEvent Browser event.
      * @param {string} [type] Type.
      */
    def handleBrowserEvent(browserEvent: UIEvent): Unit = js.native
    def handleBrowserEvent(browserEvent: UIEvent, `type`: String): Unit = js.native
    
    /**
      * @param {import("./layer/Group.js").GroupEvent} event The layer add event.
      * @private
      */
    /* private */ var handleLayerAdd_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleLayerGroupChanged_ : Any = js.native
    
    /**
      * @param {import("./layer/Group.js").GroupEvent} event The layer remove event.
      * @private
      */
    /* private */ var handleLayerRemove_ : Any = js.native
    
    /**
      * @param {MapBrowserEvent} mapBrowserEvent The event to handle.
      */
    def handleMapBrowserEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def handlePostRender(): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var handleSizeChanged_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleTargetChanged_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleTileChange_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleViewChanged_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleViewPropertyChanged_ : Any = js.native
    
    /**
      * Detect if features intersect a pixel on the viewport. Layers included in the
      * detection can be configured through the `layerFilter` option.
      * @param {import("./pixel.js").Pixel} pixel Pixel.
      * @param {AtPixelOptions} [options] Optional options.
      * @return {boolean} Is there a feature at the given pixel?
      * @api
      */
    def hasFeatureAtPixel(pixel: Pixel): Boolean = js.native
    def hasFeatureAtPixel(pixel: Pixel, options: AtPixelOptions): Boolean = js.native
    
    /**
      * @type {Collection<import("./interaction/Interaction.js").default>}
      * @protected
      */
    /* protected */ var interactions: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
    
    /**
      * @return {boolean} Is rendered.
      */
    def isRendered(): Boolean = js.native
    
    /**
      * @private
      * @type {HTMLElement|Document}
      */
    /* private */ var keyboardEventTarget_ : Any = js.native
    
    /**
      * @private
      * @type {?Array<import("./events.js").EventsKey>}
      */
    /* private */ var layerGroupPropertyListenerKeys_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var loaded_ : Any = js.native
    
    /**
      * @private
      * @type {MapBrowserEventHandler}
      */
    /* private */ var mapBrowserEventHandler_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxTilesLoading_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var moveTolerance_ : Any = js.native
    
    /***
      * @type {MapEventHandler<import("./events").EventsKey>}
      */
    @JSName("on")
    var on_Map: MapEventHandler[EventsKey] = js.native
    
    /***
      * @type {MapEventHandler<import("./events").EventsKey>}
      */
    @JSName("once")
    var once_Map: MapEventHandler[EventsKey] = js.native
    
    /**
      * @private
      * @type {!HTMLElement}
      */
    /* private */ var overlayContainerStopEvent_ : Any = js.native
    
    /**
      * @private
      * @type {!HTMLElement}
      */
    /* private */ var overlayContainer_ : Any = js.native
    
    /**
      * A lookup of overlays by id.
      * @private
      * @type {Object<string, import("./Overlay.js").default>}
      */
    /* private */ var overlayIdIndex_ : Any = js.native
    
    /**
      * @type {Collection<import("./Overlay.js").default>}
      * @private
      */
    /* private */ var overlays_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelRatio_ : Any = js.native
    
    /**
      * @private
      * @type {import("./transform.js").Transform}
      */
    /* private */ var pixelToCoordinateTransform_ : Any = js.native
    
    /**
      * @private
      * @type {!Array<PostRenderFunction>}
      */
    /* private */ var postRenderFunctions_ : Any = js.native
    
    /**
      * @private
      * @type {*}
      */
    /* private */ var postRenderTimeoutHandle_ : Any = js.native
    
    /**
      * The extent at the previous 'moveend' event.
      * @private
      * @type {import("./extent.js").Extent}
      */
    /* private */ var previousExtent_ : Any = js.native
    
    /**
      * Redraws all text after new fonts have loaded
      */
    def redrawText(): Unit = js.native
    
    /**
      * Remove the given control from the map.
      * @param {import("./control/Control.js").default} control Control.
      * @return {import("./control/Control.js").default|undefined} The removed control (or undefined
      *     if the control was not found).
      * @api
      */
    def removeControl(control: typings.ol.controlControlMod.default): js.UndefOr[typings.ol.controlControlMod.default] = js.native
    
    /**
      * Remove the given interaction from the map.
      * @param {import("./interaction/Interaction.js").default} interaction Interaction to remove.
      * @return {import("./interaction/Interaction.js").default|undefined} The removed interaction (or
      *     undefined if the interaction was not found).
      * @api
      */
    def removeInteraction(interaction: typings.ol.interactionInteractionMod.default): js.UndefOr[typings.ol.interactionInteractionMod.default] = js.native
    
    /**
      * Removes the given layer from the map.
      * @param {import("./layer/Base.js").default} layer Layer.
      * @return {import("./layer/Base.js").default|undefined} The removed layer (or undefined if the
      *     layer was not found).
      * @api
      */
    def removeLayer(layer: typings.ol.layerBaseMod.default): js.UndefOr[typings.ol.layerBaseMod.default] = js.native
    
    /**
      * Remove the given overlay from the map.
      * @param {import("./Overlay.js").default} overlay Overlay.
      * @return {import("./Overlay.js").default|undefined} The removed overlay (or undefined
      *     if the overlay was not found).
      * @api
      */
    def removeOverlay(overlay: typings.ol.overlayMod.default): js.UndefOr[typings.ol.overlayMod.default] = js.native
    
    /**
      * Request a map rendering (at the next animation frame).
      * @api
      */
    def render(): Unit = js.native
    
    /**
      * @private
      * @type {boolean|undefined}
      */
    /* private */ var renderComplete_ : Any = js.native
    
    /**
      * @param {number} time Time.
      * @private
      */
    /* private */ var renderFrame_ : Any = js.native
    
    /**
      * Requests an immediate render in a synchronous manner.
      * @api
      */
    def renderSync(): Unit = js.native
    
    /**
      * @type {import("./renderer/Map.js").default|null}
      * @private
      */
    /* private */ var renderer_ : Any = js.native
    
    /**
      * @type {ResizeObserver}
      */
    var resizeObserver_ : ResizeObserver = js.native
    
    /**
      * Sets the layergroup of this map.
      * @param {LayerGroup} layerGroup A layer group containing the layers in this map.
      * @observable
      * @api
      */
    def setLayerGroup(layerGroup: typings.ol.layerGroupMod.default): Unit = js.native
    
    /**
      * Clear any existing layers and add layers to the map.
      * @param {Array<import("./layer/Base.js").default>|Collection<import("./layer/Base.js").default>} layers The layers to be added to the map.
      * @api
      */
    def setLayers(layers: js.Array[typings.ol.layerBaseMod.default]): Unit = js.native
    def setLayers(layers: typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]): Unit = js.native
    
    /**
      * Set the size of this map.
      * @param {import("./size.js").Size|undefined} size The size in pixels of the map in the DOM.
      * @observable
      * @api
      */
    def setSize(): Unit = js.native
    def setSize(size: Size): Unit = js.native
    
    /**
      * Set the target element to render this map into.
      * @param {HTMLElement|string} [target] The Element or id of the Element
      *     that the map is rendered in.
      * @observable
      * @api
      */
    def setTarget(): Unit = js.native
    def setTarget(target: String): Unit = js.native
    def setTarget(target: HTMLElement): Unit = js.native
    
    def setView(view: js.Promise[ViewOptions]): Unit = js.native
    /**
      * Set the view for this map.
      * @param {View|Promise<import("./View.js").ViewOptions>} view The view that controls this map.
      * It is also possible to pass a promise that resolves to options for constructing a view.  This
      * alternative allows view properties to be resolved by sources or other components that load
      * view-related metadata.
      * @observable
      * @api
      */
    def setView(view: typings.ol.viewMod.default): Unit = js.native
    
    /**
      * @private
      * @type {?Array<import("./events.js").EventsKey>}
      */
    /* private */ var targetChangeHandlerKeys_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement|null}
      */
    /* private */ var targetElement_ : Any = js.native
    
    /**
      * @private
      * @type {TileQueue}
      */
    /* private */ var tileQueue_ : Any = js.native
    
    /***
      * @type {MapEventHandler<void>}
      */
    @JSName("un")
    var un_Map: MapEventHandler[Unit] = js.native
    
    /**
      * Force a recalculation of the map viewport size.  This should be called when
      * third-party code changes the size of the map viewport.
      * @api
      */
    def updateSize(): Unit = js.native
    
    /**
      * Recomputes the viewport size and save it on the view object (if any)
      * @private
      */
    /* private */ var updateViewportSize_ : Any = js.native
    
    /**
      * @private
      * @type {?import("./events.js").EventsKey}
      */
    /* private */ var viewChangeListenerKey_ : Any = js.native
    
    /**
      * @private
      * @type {?import("./events.js").EventsKey}
      */
    /* private */ var viewPropertyListenerKey_ : Any = js.native
    
    /**
      * @private
      * @type {!HTMLElement}
      */
    /* private */ var viewport_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait MapEventHandler[Return]
    extends OnSignature[
          EventTypes | MapObjectEventTypes | MapRenderEventTypes | Types | typings.ol.mapEventTypeMod.Types, 
          ObjectEvent | typings.ol.eventsEventMod.default | typings.ol.mapBrowserEventMod.default[Any] | typings.ol.mapEventMod.default, 
          Return
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.objectEventTypeMod.Types
    - typings.ol.olStrings.changeColonlayergroup
    - typings.ol.olStrings.changeColonsize
    - typings.ol.olStrings.changeColontarget
    - typings.ol.olStrings.changeColonview
  */
  type MapObjectEventTypes = _MapObjectEventTypes | typings.ol.objectEventTypeMod.Types
  
  trait MapOptions extends StObject {
    
    /**
      * Controls initially added to the map. If not specified,
      * {@link module :ol/control/defaults.defaults} is used.
      */
    var controls: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
      ] = js.undefined
    
    /**
      * Interactions that are initially added to the map. If not specified,
      * {@link module :ol/interaction/defaults.defaults} is used.
      */
    var interactions: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
      ] = js.undefined
    
    /**
      * The element to
      * listen to keyboard events on. This determines when the `KeyboardPan` and
      * `KeyboardZoom` interactions trigger. For example, if this option is set to
      * `document` the keyboard interactions will always trigger. If this option is
      * not specified, the element the library listens to keyboard events on is the
      * map target (i.e. the user-provided div for the map). If this is not
      * `document`, the target element needs to be focused for key events to be
      * emitted, requiring that the target element has a `tabindex` attribute.
      */
    var keyboardEventTarget: js.UndefOr[String | Document | HTMLElement] = js.undefined
    
    /**
      * Layers. If this is not defined, a map with no layers will be rendered. Note
      * that layers are rendered in the order supplied, so if you want, for example,
      * a vector layer to appear on top of a tile layer, it must come after the tile
      * layer.
      */
    var layers: js.UndefOr[
        js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] | typings.ol.layerGroupMod.default
      ] = js.undefined
    
    /**
      * Maximum number tiles to load
      * simultaneously.
      */
    var maxTilesLoading: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum distance in pixels the
      * cursor must move to be detected as a map move event instead of a click.
      * Increasing this value can make it easier to click on the map.
      */
    var moveTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Overlays initially added to the map. By default, no overlays are added.
      */
    var overlays: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
      ] = js.undefined
    
    /**
      * The ratio between
      * physical pixels and device-independent pixels (dips) on the device.
      */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * The container for the map, either the
      * element itself or the `id` of the element. If not specified at construction
      * time, {@link module :ol/Map~Map#setTarget} must be called for the map to be
      * rendered. If passed by element, the container can be in a secondary document.
      * **Note:** CSS `transform` support for the target element is limited to `scale`.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * The map's view.  No layer sources will be
      * fetched unless this is specified at construction time or through
      * {@link module :ol/Map~Map#setView}.
      */
    var view: js.UndefOr[typings.ol.viewMod.default | js.Promise[ViewOptions]] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      inline def setControls(
        value: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
      ): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: typings.ol.controlControlMod.default*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setInteractions(
        value: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
      ): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: typings.ol.interactionInteractionMod.default*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setKeyboardEventTarget(value: String | Document | HTMLElement): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setKeyboardEventTargetUndefined: Self = StObject.set(x, "keyboardEventTarget", js.undefined)
      
      inline def setLayers(
        value: js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default] | typings.ol.layerGroupMod.default
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: typings.ol.layerBaseMod.default*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMaxTilesLoading(value: Double): Self = StObject.set(x, "maxTilesLoading", value.asInstanceOf[js.Any])
      
      inline def setMaxTilesLoadingUndefined: Self = StObject.set(x, "maxTilesLoading", js.undefined)
      
      inline def setMoveTolerance(value: Double): Self = StObject.set(x, "moveTolerance", value.asInstanceOf[js.Any])
      
      inline def setMoveToleranceUndefined: Self = StObject.set(x, "moveTolerance", js.undefined)
      
      inline def setOverlays(
        value: typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
      ): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      inline def setOverlaysVarargs(value: typings.ol.overlayMod.default*): Self = StObject.set(x, "overlays", js.Array(value*))
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setView(value: typings.ol.viewMod.default | js.Promise[ViewOptions]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait MapOptionsInternal extends StObject {
    
    /**
      * Controls.
      */
    var controls: js.UndefOr[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]] = js.undefined
    
    /**
      * Interactions.
      */
    var interactions: js.UndefOr[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]] = js.undefined
    
    /**
      * KeyboardEventTarget.
      */
    var keyboardEventTarget: HTMLElement | Document
    
    /**
      * Overlays.
      */
    var overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default]
    
    /**
      * Values.
      */
    var values: StringDictionary[Any]
  }
  object MapOptionsInternal {
    
    inline def apply(
      keyboardEventTarget: HTMLElement | Document,
      overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default],
      values: StringDictionary[Any]
    ): MapOptionsInternal = {
      val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptionsInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptionsInternal] (val x: Self) extends AnyVal {
      
      inline def setControls(value: typings.ol.collectionMod.default[typings.ol.controlControlMod.default]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setInteractions(value: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setKeyboardEventTarget(value: HTMLElement | Document): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      inline def setOverlays(value: typings.ol.collectionMod.default[typings.ol.overlayMod.default]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setValues(value: StringDictionary[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type PostRenderFunction = js.Function2[/* arg0 */ Map, /* arg1 */ FrameState | Null, Any]
  
  trait _MapObjectEventTypes extends StObject
}
