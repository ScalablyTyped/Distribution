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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
  trait BaseOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait GroupOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var layers: js.UndefOr[js.Array[Base] | Collection[Base]] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object GroupOptions {
    
    inline def apply(): GroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOptions]
    }
    
    extension [Self <: GroupOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setLayers(value: js.Array[Base] | Collection[Base]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: Base*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait HeatmapOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var gradient: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var shadow: js.UndefOr[Double] = js.undefined
    
    var source: Vector
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var weight: String | (js.Function1[/* feature */ Feature, Double])
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object HeatmapOptions {
    
    inline def apply(source: Vector, weight: String | (js.Function1[/* feature */ Feature, Double])): HeatmapOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapOptions]
    }
    
    extension [Self <: HeatmapOptions](x: Self) {
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value :_*))
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShadow(value: Double): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWeight(value: String | (js.Function1[/* feature */ Feature, Double])): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightFunction1(value: /* feature */ Feature => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait ImageOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var source: Image
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ImageOptions {
    
    inline def apply(source: Image): ImageOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOptions]
    }
    
    extension [Self <: ImageOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSource(value: Image): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait LayerOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[Source] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object LayerOptions {
    
    inline def apply(): LayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerOptions]
    }
    
    extension [Self <: LayerOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait TileOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Double] = js.undefined
    
    var source: Tile
    
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TileOptions {
    
    inline def apply(source: Tile): TileOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileOptions]
    }
    
    extension [Self <: TileOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSource(value: Tile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUseInterimTilesOnError(value: Boolean): Self = StObject.set(x, "useInterimTilesOnError", value.asInstanceOf[js.Any])
      
      inline def setUseInterimTilesOnErrorUndefined: Self = StObject.set(x, "useInterimTilesOnError", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait VectorOptions extends StObject {
    
    var declutter: js.UndefOr[Boolean] = js.undefined
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var renderBuffer: js.UndefOr[Double] = js.undefined
    
    var renderMode: js.UndefOr[VectorRenderType | String] = js.undefined
    
    var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.undefined
    
    var source: Vector
    
    var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object VectorOptions {
    
    inline def apply(source: Vector): VectorOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VectorOptions]
    }
    
    extension [Self <: VectorOptions](x: Self) {
      
      inline def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      inline def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      inline def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      inline def setRenderMode(value: VectorRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRenderOrder(value: (/* feature1 */ Feature, /* feature2 */ Feature) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(
        value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
      ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      inline def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
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
    
    inline def image: typings.openlayers.openlayersStrings.image = "image".asInstanceOf[typings.openlayers.openlayersStrings.image]
    
    inline def vector: typings.openlayers.openlayersStrings.vector = "vector".asInstanceOf[typings.openlayers.openlayersStrings.vector]
  }
  
  trait VectorTileOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var map: js.UndefOr[Map] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var renderBuffer: js.UndefOr[Double] = js.undefined
    
    var renderMode: js.UndefOr[VectorTileRenderType | String] = js.undefined
    
    var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.undefined
    
    var source: js.UndefOr[VectorTile] = js.undefined
    
    var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object VectorTileOptions {
    
    inline def apply(): VectorTileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VectorTileOptions]
    }
    
    extension [Self <: VectorTileOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      inline def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      inline def setRenderMode(value: VectorTileRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRenderOrder(value: (/* feature1 */ Feature, /* feature2 */ Feature) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      inline def setSource(value: VectorTile): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(
        value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
      ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      inline def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
