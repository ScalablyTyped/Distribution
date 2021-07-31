package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.objectMod.ObjectEvent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olMod.Transform
import typings.ol.olStrings.changeColonlayerGroup
import typings.ol.olStrings.changeColonsize
import typings.ol.olStrings.changeColontarget
import typings.ol.olStrings.changeColonview
import typings.ol.olStrings.click
import typings.ol.olStrings.dblclick
import typings.ol.olStrings.moveend
import typings.ol.olStrings.movestart
import typings.ol.olStrings.pointerdrag
import typings.ol.olStrings.pointermove
import typings.ol.olStrings.postcompose
import typings.ol.olStrings.postrender
import typings.ol.olStrings.precompose
import typings.ol.olStrings.rendercomplete
import typings.ol.olStrings.singleclick
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.std.Document
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.UIEvent
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluggableMapMod {
  
  @JSImport("ol/PluggableMap", JSImport.Default)
  @js.native
  class default protected () extends PluggableMap {
    def this(options: MapOptions) = this()
  }
  
  trait AtPixelOptions extends StObject {
    
    var checkWrapped: js.UndefOr[Boolean] = js.undefined
    
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    var layerFilter: js.UndefOr[
        js.Function1[
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ]
      ] = js.undefined
  }
  object AtPixelOptions {
    
    @scala.inline
    def apply(): AtPixelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtPixelOptions]
    }
    
    @scala.inline
    implicit class AtPixelOptionsMutableBuilder[Self <: AtPixelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckWrapped(value: Boolean): Self = StObject.set(x, "checkWrapped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckWrappedUndefined: Self = StObject.set(x, "checkWrapped", js.undefined)
      
      @scala.inline
      def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      @scala.inline
      def setLayerFilter(value: /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] => Boolean): Self = StObject.set(x, "layerFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayerFilterUndefined: Self = StObject.set(x, "layerFilter", js.undefined)
    }
  }
  
  trait DeclutterItems extends StObject {
    
    var items: js.Array[js.Any]
    
    var opacity: Double
  }
  object DeclutterItems {
    
    @scala.inline
    def apply(items: js.Array[js.Any], opacity: Double): DeclutterItems = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclutterItems]
    }
    
    @scala.inline
    implicit class DeclutterItemsMutableBuilder[Self <: DeclutterItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameState extends StObject {
    
    var animate: Boolean
    
    var coordinateToPixelTransform: Transform
    
    var declutterItems: js.Array[DeclutterItems]
    
    var extent: Extent
    
    var index: Double
    
    var layerIndex: Double
    
    var layerStatesArray: js.Array[State]
    
    var pixelRatio: Double
    
    var pixelToCoordinateTransform: Transform
    
    var postRenderFunctions: js.Array[PostRenderFunction]
    
    var size: Size
    
    var tileQueue: typings.ol.tileQueueMod.default
    
    var time: Double
    
    var usedTiles: StringDictionary[StringDictionary[Boolean]]
    
    var viewHints: js.Array[Double]
    
    var viewState: typings.ol.viewMod.State
    
    var wantedTiles: StringDictionary[StringDictionary[Boolean]]
  }
  object FrameState {
    
    @scala.inline
    def apply(
      animate: Boolean,
      coordinateToPixelTransform: Transform,
      declutterItems: js.Array[DeclutterItems],
      extent: Extent,
      index: Double,
      layerIndex: Double,
      layerStatesArray: js.Array[State],
      pixelRatio: Double,
      pixelToCoordinateTransform: Transform,
      postRenderFunctions: js.Array[PostRenderFunction],
      size: Size,
      tileQueue: typings.ol.tileQueueMod.default,
      time: Double,
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      viewHints: js.Array[Double],
      viewState: typings.ol.viewMod.State,
      wantedTiles: StringDictionary[StringDictionary[Boolean]]
    ): FrameState = {
      val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], coordinateToPixelTransform = coordinateToPixelTransform.asInstanceOf[js.Any], declutterItems = declutterItems.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layerIndex = layerIndex.asInstanceOf[js.Any], layerStatesArray = layerStatesArray.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], pixelToCoordinateTransform = pixelToCoordinateTransform.asInstanceOf[js.Any], postRenderFunctions = postRenderFunctions.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tileQueue = tileQueue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], usedTiles = usedTiles.asInstanceOf[js.Any], viewHints = viewHints.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any], wantedTiles = wantedTiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameState]
    }
    
    @scala.inline
    implicit class FrameStateMutableBuilder[Self <: FrameState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinateToPixelTransform(value: Transform): Self = StObject.set(x, "coordinateToPixelTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinateToPixelTransformVarargs(value: Double*): Self = StObject.set(x, "coordinateToPixelTransform", js.Array(value :_*))
      
      @scala.inline
      def setDeclutterItems(value: js.Array[DeclutterItems]): Self = StObject.set(x, "declutterItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclutterItemsVarargs(value: DeclutterItems*): Self = StObject.set(x, "declutterItems", js.Array(value :_*))
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerIndex(value: Double): Self = StObject.set(x, "layerIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerStatesArray(value: js.Array[State]): Self = StObject.set(x, "layerStatesArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerStatesArrayVarargs(value: State*): Self = StObject.set(x, "layerStatesArray", js.Array(value :_*))
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelToCoordinateTransform(value: Transform): Self = StObject.set(x, "pixelToCoordinateTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelToCoordinateTransformVarargs(value: Double*): Self = StObject.set(x, "pixelToCoordinateTransform", js.Array(value :_*))
      
      @scala.inline
      def setPostRenderFunctions(value: js.Array[PostRenderFunction]): Self = StObject.set(x, "postRenderFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostRenderFunctionsVarargs(value: PostRenderFunction*): Self = StObject.set(x, "postRenderFunctions", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileQueue(value: typings.ol.tileQueueMod.default): Self = StObject.set(x, "tileQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "usedTiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewHints(value: js.Array[Double]): Self = StObject.set(x, "viewHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewHintsVarargs(value: Double*): Self = StObject.set(x, "viewHints", js.Array(value :_*))
      
      @scala.inline
      def setViewState(value: typings.ol.viewMod.State): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWantedTiles(value: StringDictionary[StringDictionary[Boolean]]): Self = StObject.set(x, "wantedTiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapOptions extends StObject {
    
    var controls: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
      ] = js.undefined
    
    var interactions: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
      ] = js.undefined
    
    var keyboardEventTarget: js.UndefOr[HTMLElement | Document | String] = js.undefined
    
    var layers: js.UndefOr[
        js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default] | typings.ol.groupMod.default
      ] = js.undefined
    
    var maxTilesLoading: js.UndefOr[Double] = js.undefined
    
    var moveTolerance: js.UndefOr[Double] = js.undefined
    
    var overlays: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
      ] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var view: js.UndefOr[typings.ol.viewMod.default] = js.undefined
  }
  object MapOptions {
    
    @scala.inline
    def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(
        value: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] | js.Array[typings.ol.controlControlMod.default]
      ): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setControlsVarargs(value: typings.ol.controlControlMod.default*): Self = StObject.set(x, "controls", js.Array(value :_*))
      
      @scala.inline
      def setInteractions(
        value: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] | js.Array[typings.ol.interactionInteractionMod.default]
      ): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      @scala.inline
      def setInteractionsVarargs(value: typings.ol.interactionInteractionMod.default*): Self = StObject.set(x, "interactions", js.Array(value :_*))
      
      @scala.inline
      def setKeyboardEventTarget(value: HTMLElement | Document | String): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardEventTargetUndefined: Self = StObject.set(x, "keyboardEventTarget", js.undefined)
      
      @scala.inline
      def setLayers(
        value: js.Array[typings.ol.baseMod.default] | typings.ol.collectionMod.default[typings.ol.baseMod.default] | typings.ol.groupMod.default
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: typings.ol.baseMod.default*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMaxTilesLoading(value: Double): Self = StObject.set(x, "maxTilesLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTilesLoadingUndefined: Self = StObject.set(x, "maxTilesLoading", js.undefined)
      
      @scala.inline
      def setMoveTolerance(value: Double): Self = StObject.set(x, "moveTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveToleranceUndefined: Self = StObject.set(x, "moveTolerance", js.undefined)
      
      @scala.inline
      def setOverlays(
        value: typings.ol.collectionMod.default[typings.ol.overlayMod.default] | js.Array[typings.ol.overlayMod.default]
      ): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      @scala.inline
      def setOverlaysVarargs(value: typings.ol.overlayMod.default*): Self = StObject.set(x, "overlays", js.Array(value :_*))
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setView(value: typings.ol.viewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait MapOptionsInternal extends StObject {
    
    var controls: js.UndefOr[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]] = js.undefined
    
    var interactions: js.UndefOr[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]] = js.undefined
    
    var keyboardEventTarget: HTMLElement | Document
    
    var overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default]
    
    var values: StringDictionary[js.Any]
  }
  object MapOptionsInternal {
    
    @scala.inline
    def apply(
      keyboardEventTarget: HTMLElement | Document,
      overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default],
      values: StringDictionary[js.Any]
    ): MapOptionsInternal = {
      val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptionsInternal]
    }
    
    @scala.inline
    implicit class MapOptionsInternalMutableBuilder[Self <: MapOptionsInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControls(value: typings.ol.collectionMod.default[typings.ol.controlControlMod.default]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setInteractions(value: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      @scala.inline
      def setKeyboardEventTarget(value: HTMLElement | Document): Self = StObject.set(x, "keyboardEventTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlays(value: typings.ol.collectionMod.default[typings.ol.overlayMod.default]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PluggableMap
    extends typings.ol.objectMod.default {
    
    /**
      * Add the given control to the map.
      */
    def addControl(control: typings.ol.controlControlMod.default): Unit = js.native
    
    /**
      * Add the given interaction to the map. If you want to add an interaction
      * at another point of the collection use getInteraction() and the methods
      * available on {@link module:ol/Collection~Collection}. This can be used to
      * stop the event propagation from the handleEvent function. The interactions
      * get to handle the events in the reverse order of this collection.
      */
    def addInteraction(interaction: typings.ol.interactionInteractionMod.default): Unit = js.native
    
    /**
      * Adds the given layer to the top of this map. If you want to add a layer
      * elsewhere in the stack, use getLayers() and the methods available on
      * {@link module:ol/Collection~Collection}.
      */
    def addLayer(layer: typings.ol.baseMod.default): Unit = js.native
    
    /**
      * Add the given overlay to the map.
      */
    def addOverlay(overlay: typings.ol.overlayMod.default): Unit = js.native
    
    var controls: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
    
    def createRenderer(): typings.ol.mapMod.default = js.native
    
    /**
      * Detect features that intersect a pixel on the viewport, and execute a
      * callback with each intersecting feature. Layers included in the detection can
      * be configured through the layerFilter option in opt_options.
      */
    def forEachFeatureAtPixel[S, T](
      pixel: Pixel,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ FeatureLike, 
          /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          T
        ]
    ): js.UndefOr[T] = js.native
    def forEachFeatureAtPixel[S, T](
      pixel: Pixel,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ FeatureLike, 
          /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          T
        ],
      opt_options: AtPixelOptions
    ): js.UndefOr[T] = js.native
    
    /**
      * Detect layers that have a color value at a pixel on the viewport, and
      * execute a callback with each matching layer. Layers included in the
      * detection can be configured through opt_layerFilter.
      * Note: this may give false positives unless the map layers have had different className
      * properties assigned to them.
      */
    def forEachLayerAtPixel[S, T](
      pixel: Pixel,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          /* p1 */ Uint8ClampedArray | Uint8Array, 
          T
        ]
    ): js.UndefOr[T] = js.native
    def forEachLayerAtPixel[S, T](
      pixel: Pixel,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          /* p1 */ Uint8ClampedArray | Uint8Array, 
          T
        ],
      opt_options: AtPixelOptions
    ): js.UndefOr[T] = js.native
    
    /**
      * Get the map controls. Modifying this collection changes the controls
      * associated with the map.
      */
    def getControls(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
    
    /**
      * Get the coordinate for a given pixel.  This returns a coordinate in the
      * user projection.
      */
    def getCoordinateFromPixel(pixel: Pixel): Coordinate = js.native
    
    /**
      * Get the coordinate for a given pixel.  This returns a coordinate in the
      * map view projection.
      */
    def getCoordinateFromPixelInternal(pixel: Pixel): Coordinate = js.native
    
    /**
      * Returns the coordinate in user projection for a browser event.
      */
    def getEventCoordinate(event: MouseEvent): Coordinate = js.native
    
    /**
      * Returns the coordinate in view projection for a browser event.
      */
    def getEventCoordinateInternal(event: MouseEvent): Coordinate = js.native
    
    /**
      * Returns the map pixel position for a browser event relative to the viewport.
      */
    def getEventPixel(event: UIEvent): Pixel = js.native
    
    /**
      * Get all features that intersect a pixel on the viewport.
      */
    def getFeaturesAtPixel(pixel: Pixel): js.Array[FeatureLike] = js.native
    def getFeaturesAtPixel(pixel: Pixel, opt_options: AtPixelOptions): js.Array[FeatureLike] = js.native
    
    /**
      * Get the map interactions. Modifying this collection changes the interactions
      * associated with the map.
      * Interactions are used for e.g. pan, zoom and rotate.
      */
    def getInteractions(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
    
    /**
      * Get the layergroup associated with this map.
      */
    def getLayerGroup(): typings.ol.groupMod.default = js.native
    
    /**
      * Get the collection of layers associated with this map.
      */
    def getLayers(): typings.ol.collectionMod.default[typings.ol.baseMod.default] = js.native
    
    def getLoading(): Boolean = js.native
    
    /**
      * Get an overlay by its identifier (the value returned by overlay.getId()).
      * Note that the index treats string and numeric identifiers as the same. So
      * map.getOverlayById(2) will return an overlay with id '2' or 2.
      */
    def getOverlayById(id: String): typings.ol.overlayMod.default = js.native
    def getOverlayById(id: Double): typings.ol.overlayMod.default = js.native
    
    /**
      * Get the element that serves as the container for overlays.  Elements added to
      * this container will let mousedown and touchstart events through to the map,
      * so clicks and gestures on an overlay will trigger {@link module:ol/MapBrowserEvent~MapBrowserEvent}
      * events.
      */
    def getOverlayContainer(): HTMLElement = js.native
    
    /**
      * Get the element that serves as a container for overlays that don't allow
      * event propagation. Elements added to this container won't let mousedown and
      * touchstart events through to the map, so clicks and gestures on an overlay
      * don't trigger any {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      */
    def getOverlayContainerStopEvent(): HTMLElement = js.native
    
    /**
      * Get the map overlays. Modifying this collection changes the overlays
      * associated with the map.
      */
    def getOverlays(): typings.ol.collectionMod.default[typings.ol.overlayMod.default] = js.native
    
    /**
      * Get the pixel for a coordinate.  This takes a coordinate in the user
      * projection and returns the corresponding pixel.
      */
    def getPixelFromCoordinate(coordinate: Coordinate): Pixel = js.native
    
    /**
      * Get the pixel for a coordinate.  This takes a coordinate in the map view
      * projection and returns the corresponding pixel.
      */
    def getPixelFromCoordinateInternal(coordinate: Coordinate): Pixel = js.native
    
    /**
      * Get the map renderer.
      */
    def getRenderer(): typings.ol.mapMod.default = js.native
    
    /**
      * Get the size of this map.
      */
    def getSize(): js.UndefOr[Size] = js.native
    
    /**
      * Get the target in which this map is rendered.
      * Note that this returns what is entered as an option or in setTarget:
      * if that was an element, it returns an element; if a string, it returns that.
      */
    def getTarget(): js.UndefOr[HTMLElement | String] = js.native
    
    /**
      * Get the DOM element into which this map is rendered. In contrast to
      * getTarget this method always return an Element, or null if the
      * map has no target.
      */
    def getTargetElement(): HTMLElement = js.native
    
    def getTilePriority(
      tile: typings.ol.olTileMod.default,
      tileSourceKey: String,
      tileCenter: Coordinate,
      tileResolution: Double
    ): Double = js.native
    
    /**
      * Get the view associated with this map. A view manages properties such as
      * center and resolution.
      */
    def getView(): typings.ol.viewMod.default = js.native
    
    /**
      * Get the element that serves as the map viewport.
      */
    def getViewport(): HTMLElement = js.native
    
    def handleBrowserEvent(browserEvent: UIEvent): Unit = js.native
    def handleBrowserEvent(browserEvent: UIEvent, opt_type: String): Unit = js.native
    
    def handleMapBrowserEvent(mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
    
    /* protected */ def handlePostRender(): Unit = js.native
    
    /**
      * Detect if features intersect a pixel on the viewport. Layers included in the
      * detection can be configured through opt_layerFilter.
      */
    def hasFeatureAtPixel(pixel: Pixel): Boolean = js.native
    def hasFeatureAtPixel(pixel: Pixel, opt_options: AtPixelOptions): Boolean = js.native
    
    var interactions: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = js.native
    
    def isRendered(): Boolean = js.native
    
    @JSName("on")
    def on_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_click(
      `type`: click,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_dblclick(
      `type`: dblclick,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_pointerdrag(
      `type`: pointerdrag,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_singleclick(
      `type`: singleclick,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    
    @JSName("once")
    def once_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_click(
      `type`: click,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_dblclick(
      `type`: dblclick,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_pointerdrag(
      `type`: pointerdrag,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_singleclick(
      `type`: singleclick,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): EventsKey = js.native
    
    /**
      * Redraws all text after new fonts have loaded
      */
    def redrawText(): Unit = js.native
    
    /**
      * Remove the given control from the map.
      */
    def removeControl(control: typings.ol.controlControlMod.default): js.UndefOr[typings.ol.controlControlMod.default] = js.native
    
    /**
      * Remove the given interaction from the map.
      */
    def removeInteraction(interaction: typings.ol.interactionInteractionMod.default): js.UndefOr[typings.ol.interactionInteractionMod.default] = js.native
    
    /**
      * Removes the given layer from the map.
      */
    def removeLayer(layer: typings.ol.baseMod.default): js.UndefOr[typings.ol.baseMod.default] = js.native
    
    /**
      * Remove the given overlay from the map.
      */
    def removeOverlay(overlay: typings.ol.overlayMod.default): js.UndefOr[typings.ol.overlayMod.default] = js.native
    
    /**
      * Request a map rendering (at the next animation frame).
      */
    def render(): Unit = js.native
    
    /**
      * Requests an immediate render in a synchronous manner.
      */
    def renderSync(): Unit = js.native
    
    /**
      * Sets the layergroup of this map.
      */
    def setLayerGroup(layerGroup: typings.ol.groupMod.default): Unit = js.native
    
    /**
      * Set the size of this map.
      */
    def setSize(): Unit = js.native
    def setSize(size: Size): Unit = js.native
    
    /**
      * Set the target element to render this map into.
      */
    def setTarget(): Unit = js.native
    def setTarget(target: String): Unit = js.native
    def setTarget(target: HTMLElement): Unit = js.native
    
    /**
      * Set the view for this map.
      */
    def setView(view: typings.ol.viewMod.default): Unit = js.native
    
    @JSName("un")
    def un_changelayerGroup(`type`: changeColonlayerGroup, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changesize(`type`: changeColonsize, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changetarget(`type`: changeColontarget, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeview(`type`: changeColonview, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_click(
      `type`: click,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_dblclick(
      `type`: dblclick,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_moveend(`type`: moveend, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_movestart(`type`: movestart, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_pointerdrag(
      `type`: pointerdrag,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_pointermove(
      `type`: pointermove,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    @JSName("un")
    def un_postcompose(`type`: postcompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.mapEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_precompose(`type`: precompose, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_rendercomplete(`type`: rendercomplete, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_singleclick(
      `type`: singleclick,
      listener: js.Function1[/* evt */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Unit = js.native
    
    /**
      * Force a recalculation of the map viewport size.  This should be called when
      * third-party code changes the size of the map viewport.
      */
    def updateSize(): Unit = js.native
  }
  
  type PostRenderFunction = js.Function2[/* p0 */ PluggableMap, /* p1 */ FrameState, js.Any]
}
