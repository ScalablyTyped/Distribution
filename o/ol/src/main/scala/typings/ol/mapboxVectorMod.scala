package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.vectorTileRenderTypeMod.VectorTileRenderType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapboxVectorMod {
  
  @JSImport("ol/layer/MapboxVector", JSImport.Default)
  @js.native
  class default protected () extends MapboxVectorLayer {
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
    sealed trait VECTOR extends SourceType
  }
  
  @js.native
  trait LayerObject extends StObject {
    
    var id: String = js.native
    
    var source: String = js.native
  }
  object LayerObject {
    
    @scala.inline
    def apply(id: String, source: String): LayerObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerObject]
    }
    
    @scala.inline
    implicit class LayerObjectMutableBuilder[Self <: LayerObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
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
    /* protected */ def handleError(error: Error): Unit = js.native
    
    /**
      * Handle the loaded style object.
      */
    /* protected */ def onStyleLoad(style: StyleObject): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var accessToken: String = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var declutter: js.UndefOr[Boolean] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var layers: js.UndefOr[js.Array[String]] = js.native
    
    var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var preload: js.UndefOr[Double] = js.native
    
    var renderBuffer: js.UndefOr[Double] = js.native
    
    var renderMode: js.UndefOr[VectorTileRenderType | String] = js.native
    
    var renderOrder: js.UndefOr[OrderFunction] = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var styleUrl: String = js.native
    
    var updateWhileAnimating: js.UndefOr[Boolean] = js.native
    
    var updateWhileInteracting: js.UndefOr[Boolean] = js.native
    
    var useInterimTilesOnError: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(accessToken: String, styleUrl: String): Options = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDeclutter(value: Boolean): Self = StObject.set(x, "declutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclutterUndefined: Self = StObject.set(x, "declutter", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
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
      def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setRenderBuffer(value: Double): Self = StObject.set(x, "renderBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderBufferUndefined: Self = StObject.set(x, "renderBuffer", js.undefined)
      
      @scala.inline
      def setRenderMode(value: VectorTileRenderType | String): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
      
      @scala.inline
      def setRenderOrder(value: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double): Self = StObject.set(x, "renderOrder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileAnimating(value: Boolean): Self = StObject.set(x, "updateWhileAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileAnimatingUndefined: Self = StObject.set(x, "updateWhileAnimating", js.undefined)
      
      @scala.inline
      def setUpdateWhileInteracting(value: Boolean): Self = StObject.set(x, "updateWhileInteracting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateWhileInteractingUndefined: Self = StObject.set(x, "updateWhileInteracting", js.undefined)
      
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
  trait SourceObject extends StObject {
    
    var `type`: SourceType = js.native
    
    var url: String = js.native
  }
  object SourceObject {
    
    @scala.inline
    def apply(`type`: SourceType, url: String): SourceObject = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceObject]
    }
    
    @scala.inline
    implicit class SourceObjectMutableBuilder[Self <: SourceObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyleObject extends StObject {
    
    var glyphs: String = js.native
    
    var layers: js.Array[LayerObject] = js.native
    
    var sources: StringDictionary[SourceObject] = js.native
    
    var sprite: String = js.native
  }
  object StyleObject {
    
    @scala.inline
    def apply(
      glyphs: String,
      layers: js.Array[LayerObject],
      sources: StringDictionary[SourceObject],
      sprite: String
    ): StyleObject = {
      val __obj = js.Dynamic.literal(glyphs = glyphs.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleObject]
    }
    
    @scala.inline
    implicit class StyleObjectMutableBuilder[Self <: StyleObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayers(value: js.Array[LayerObject]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersVarargs(value: LayerObject*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: StringDictionary[SourceObject]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    }
  }
}
