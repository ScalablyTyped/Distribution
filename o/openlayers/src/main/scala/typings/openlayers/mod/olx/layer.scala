package typings.openlayers.mod.olx

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.Map
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.layer.Base
import typings.openlayers.mod.layer.VectorTileRenderType
import typings.openlayers.mod.source.Image
import typings.openlayers.mod.source.Source
import typings.openlayers.mod.source.Tile
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.source.VectorTile
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
  @js.native
  trait BaseOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
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
  
  @js.native
  trait GroupOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object GroupOptions {
    
    @scala.inline
    def apply(): GroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOptions]
    }
    
    @scala.inline
    implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[Base] | Collection[Base]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Base*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
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
  
  @js.native
  trait HeatmapOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.native
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var gradient: js.UndefOr[js.Array[String]] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var shadow: js.UndefOr[Double] = js.native
    
    var source: Vector = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var weight: String | (js.Function1[/* feature */ Feature, Double]) = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object HeatmapOptions {
    
    @scala.inline
    def apply(source: Vector, weight: String | (js.Function1[/* feature */ Feature, Double])): HeatmapOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapOptions]
    }
    
    @scala.inline
    implicit class HeatmapOptionsMutableBuilder[Self <: HeatmapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value :_*))
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShadow(value: Double): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWeight(value: String | (js.Function1[/* feature */ Feature, Double])): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightFunction1(value: /* feature */ Feature => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ImageOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var map: js.UndefOr[Map] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var source: Image = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ImageOptions {
    
    @scala.inline
    def apply(source: Image): ImageOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOptions]
    }
    
    @scala.inline
    implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSource(value: Image): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait LayerOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var source: js.UndefOr[Source] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object LayerOptions {
    
    @scala.inline
    def apply(): LayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerOptions]
    }
    
    @scala.inline
    implicit class LayerOptionsMutableBuilder[Self <: LayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait TileOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var map: js.UndefOr[Map] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var preload: js.UndefOr[Double] = js.native
    
    var source: Tile = js.native
    
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object TileOptions {
    
    @scala.inline
    def apply(source: Tile): TileOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileOptions]
    }
    
    @scala.inline
    implicit class TileOptionsMutableBuilder[Self <: TileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setSource(value: Tile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseInterimTilesOnError(value: Boolean): Self = StObject.set(x, "useInterimTilesOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseInterimTilesOnErrorUndefined: Self = StObject.set(x, "useInterimTilesOnError", js.undefined)
      
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
  
  @js.native
  trait VectorOptions extends StObject {
    
    var declutter: js.UndefOr[Boolean] = js.native
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var map: js.UndefOr[Map] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var renderBuffer: js.UndefOr[Double] = js.native
    
    var renderMode: js.UndefOr[VectorRenderType | String] = js.native
    
    var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.native
    
    var source: Vector = js.native
    
    var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.native
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object VectorOptions {
    
    @scala.inline
    def apply(source: Vector): VectorOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VectorOptions]
    }
    
    @scala.inline
    implicit class VectorOptionsMutableBuilder[Self <: VectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      @scala.inline
      def setRenderMode(value: VectorRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setRenderOrder(value: (/* feature1 */ Feature, /* feature2 */ Feature) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      @scala.inline
      def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction2(
        value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
      ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      @scala.inline
      def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
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
  
  /**
    * Render mode for vector layers:
    *  * `'image'`: Vector layers are rendered as images. Great performance, but
    *    point symbols and texts are always rotated with the view and pixels are
    *    scaled during zoom animations.
    *  * `'vector'`: Vector layers are rendered as vectors. Most accurate rendering
    *    even during animations, but slower performance.
    * Default is `vector`.
    * @api
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.image
    - typings.openlayers.openlayersStrings.vector
  */
  trait VectorRenderType extends StObject
  object VectorRenderType {
    
    @scala.inline
    def image: typings.openlayers.openlayersStrings.image = "image".asInstanceOf[typings.openlayers.openlayersStrings.image]
    
    @scala.inline
    def vector: typings.openlayers.openlayersStrings.vector = "vector".asInstanceOf[typings.openlayers.openlayersStrings.vector]
  }
  
  @js.native
  trait VectorTileOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.native
    
    var map: js.UndefOr[Map] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var renderBuffer: js.UndefOr[Double] = js.native
    
    var renderMode: js.UndefOr[VectorTileRenderType | String] = js.native
    
    var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.native
    
    var source: js.UndefOr[VectorTile] = js.native
    
    var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.native
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object VectorTileOptions {
    
    @scala.inline
    def apply(): VectorTileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VectorTileOptions]
    }
    
    @scala.inline
    implicit class VectorTileOptionsMutableBuilder[Self <: VectorTileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      @scala.inline
      def setRenderMode(value: VectorTileRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setRenderOrder(value: (/* feature1 */ Feature, /* feature2 */ Feature) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      @scala.inline
      def setSource(value: VectorTile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction2(
        value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
      ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      @scala.inline
      def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
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
}
