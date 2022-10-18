package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonsource
import typings.ol.olStrings.postrender
import typings.ol.olStrings.prerender
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerLayerMod {
  
  @JSImport("ol/layer/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/layer/Layer", JSImport.Default)
  @js.native
  open class default[SourceType /* <: typings.ol.sourceSourceMod.default */] protected () extends Layer[SourceType] {
    def this(options: Options) = this()
  }
  
  inline def inView(layerState: State, viewState: typings.ol.viewMod.State): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inView")(layerState.asInstanceOf[js.Any], viewState.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait Layer[SourceType /* <: typings.ol.sourceSourceMod.default */]
    extends typings.ol.layerBaseMod.default {
    
    /**
      * Create a renderer for this layer.
      */
    /* protected */ def createRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
    
    def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]] = js.native
    
    /**
      * Get the renderer for this layer.
      */
    def getRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
    
    /**
      * Get the layer source.
      */
    def getSource(): SourceType = js.native
    
    def hasRenderer(): Boolean = js.native
    
    @JSName("on")
    def on_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): EventsKey = js.native
    
    /**
      * In charge to manage the rendering of the layer. One layer type is
      * bounded with one layer renderer.
      */
    def render(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    
    /**
      * Sets the layer to be rendered on top of other layers on a map. The map will
      * not manage this layer in its layers collection, and the callback in
      * {@link module:ol/Map#forEachLayerAtPixel} will receive null as layer. This
      * is useful for temporary layers. To remove an unmanaged layer from the map,
      * use #setMap(null).
      * To add the layer to a map and have it managed by the map, use
      * {@link module:ol/Map#addLayer} instead.
      */
    def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
    
    /**
      * Set the layer source.
      */
    def setSource(source: SourceType): Unit = js.native
    
    @JSName("un")
    def un_changesource(`type`: changeColonsource, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_postrender(`type`: postrender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_prerender(`type`: prerender, listener: js.Function1[/* evt */ typings.ol.renderEventMod.default, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var render: js.UndefOr[RenderFunction] = js.undefined
    
    var source: js.UndefOr[typings.ol.sourceSourceMod.default] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMap(value: typings.ol.pluggableMapMod.default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
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
      
      inline def setRender(value: /* p0 */ FrameState => HTMLElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSource(value: typings.ol.sourceSourceMod.default): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function1[/* p0 */ FrameState, HTMLElement]
  
  trait State extends StObject {
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var layer: Layer[typings.ol.sourceSourceMod.default]
    
    var managed: Boolean
    
    var maxResolution: Double
    
    var maxZoom: Double
    
    var minResolution: Double
    
    var minZoom: Double
    
    var opacity: Double
    
    var sourceState: typings.ol.sourceStateMod.State
    
    var visible: Boolean
    
    var zIndex: Double
  }
  object State {
    
    inline def apply(
      layer: Layer[typings.ol.sourceSourceMod.default],
      managed: Boolean,
      maxResolution: Double,
      maxZoom: Double,
      minResolution: Double,
      minZoom: Double,
      opacity: Double,
      sourceState: typings.ol.sourceStateMod.State,
      visible: Boolean,
      zIndex: Double
    ): State = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sourceState = sourceState.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setLayer(value: Layer[typings.ol.sourceSourceMod.default]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setSourceState(value: typings.ol.sourceStateMod.State): Self = StObject.set(x, "sourceState", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
