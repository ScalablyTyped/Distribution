package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.vectorTileRenderTypeMod.VectorTileRenderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapboxVectorMod {
  
  @JSImport("ol/layer/MapboxVector", JSImport.Default)
  @js.native
  open class default protected () extends MapboxVectorLayer {
    def this(options: Options) = this()
  }
  
  @js.native
  sealed trait SourceType extends StObject
  /**
    * The Mapbox source type.
    */
  @JSImport("ol/layer/MapboxVector", "SourceType")
  @js.native
  object SourceType extends StObject {
    
    @js.native
    sealed trait VECTOR
      extends StObject
         with SourceType
  }
  
  trait LayerObject extends StObject {
    
    var id: String
    
    var source: String
  }
  object LayerObject {
    
    inline def apply(id: String, source: String): LayerObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerObject]
    }
    
    extension [Self <: LayerObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapboxVectorLayer
    extends typings.ol.vectorTileMod.default {
    
    /**
      * Fetch the style object.
      */
    /* protected */ def fetchStyle(styleUrl: String): Unit = js.native
    
    /**
      * Handle configuration or loading error.
      */
    /* protected */ def handleError(error: js.Error): Unit = js.native
    
    /**
      * Handle the loaded style object.
      */
    /* protected */ def onStyleLoad(style: StyleObject): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var accessToken: String
    
    var className: js.UndefOr[String] = js.undefined
    
    var declutter: js.UndefOr[Boolean] = js.undefined
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
    
    var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Double] = js.undefined
    
    var renderBuffer: js.UndefOr[Double] = js.undefined
    
    var renderMode: js.UndefOr[VectorTileRenderType | String] = js.undefined
    
    var renderOrder: js.UndefOr[OrderFunction] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var styleUrl: String
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
    
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(accessToken: String, styleUrl: String): Options = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      inline def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
      
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
      
      inline def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      inline def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      inline def setRenderMode(value: VectorTileRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      inline def setRenderOrder(value: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      inline def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
      inline def setUseInterimTilesOnError(value: Boolean): Self = StObject.set(x, "useInterimTilesOnError", value.asInstanceOf[js.Any])
      
      inline def setUseInterimTilesOnErrorUndefined: Self = StObject.set(x, "useInterimTilesOnError", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait SourceObject extends StObject {
    
    var `type`: SourceType
    
    var url: String
  }
  object SourceObject {
    
    inline def apply(`type`: SourceType, url: String): SourceObject = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceObject]
    }
    
    extension [Self <: SourceObject](x: Self) {
      
      inline def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleObject extends StObject {
    
    var glyphs: String
    
    var layers: js.Array[LayerObject]
    
    var sources: StringDictionary[SourceObject]
    
    var sprite: String
  }
  object StyleObject {
    
    inline def apply(
      glyphs: String,
      layers: js.Array[LayerObject],
      sources: StringDictionary[SourceObject],
      sprite: String
    ): StyleObject = {
      val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleObject]
    }
    
    extension [Self <: StyleObject](x: Self) {
      
      inline def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[LayerObject]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: LayerObject*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setSources(value: StringDictionary[SourceObject]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    }
  }
}
