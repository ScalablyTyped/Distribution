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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerLayerMod {
  
  @JSImport("ol/layer/Layer", JSImport.Default)
  @js.native
  class default[SourceType /* <: typings.ol.sourceSourceMod.default */] protected () extends Layer[SourceType] {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/layer/Layer", "inView")
  @js.native
  def inView(layerState: State, viewState: typings.ol.viewMod.State): Boolean = js.native
  
  @js.native
  trait Layer[SourceType /* <: typings.ol.sourceSourceMod.default */]
    extends typings.ol.baseMod.default {
    
    /**
      * Create a renderer for this layer.
      */
    /* protected */ def createRenderer(): typings.ol.rendererLayerMod.default[Layer[typings.ol.sourceSourceMod.default]] = js.native
    
    def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]] = js.native
    
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
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var render: js.UndefOr[RenderFunction] = js.native
    
    var source: js.UndefOr[typings.ol.sourceSourceMod.default] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMap(value: typings.ol.pluggableMapMod.default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRender(value: /* p0 */ FrameState => HTMLElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSource(value: typings.ol.sourceSourceMod.default): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function1[/* p0 */ FrameState, HTMLElement]
  
  @js.native
  trait State extends StObject {
    
    var extent: js.UndefOr[Extent] = js.native
    
    var layer: Layer[typings.ol.sourceSourceMod.default] = js.native
    
    var managed: Boolean = js.native
    
    var maxResolution: Double = js.native
    
    var maxZoom: Double = js.native
    
    var minResolution: Double = js.native
    
    var minZoom: Double = js.native
    
    var opacity: Double = js.native
    
    var sourceState: typings.ol.stateMod.State = js.native
    
    var visible: Boolean = js.native
    
    var zIndex: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      layer: Layer[typings.ol.sourceSourceMod.default],
      managed: Boolean,
      maxResolution: Double,
      maxZoom: Double,
      minResolution: Double,
      minZoom: Double,
      opacity: Double,
      sourceState: typings.ol.stateMod.State,
      visible: Boolean,
      zIndex: Double
    ): State = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sourceState = sourceState.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setLayer(value: Layer[typings.ol.sourceSourceMod.default]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManaged(value: Boolean): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceState(value: typings.ol.stateMod.State): Self = StObject.set(x, "sourceState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
}
