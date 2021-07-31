package typings.ol

import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.olTileMod.UrlFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.wmtsrequestencodingMod.WMTSRequestEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wmtsMod {
  
  @JSImport("ol/source/WMTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/source/WMTS", JSImport.Default)
  @js.native
  class default protected () extends WMTS {
    def this(options: Options) = this()
  }
  
  @scala.inline
  def optionsFromCapabilities(wmtsCap: js.Any, config: js.Any): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsFromCapabilities")(wmtsCap.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Options]
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var dimensions: js.UndefOr[js.Any] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var layer: String
    
    var matrixSet: String
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.undefined
    
    var style: String
    
    var tileClass: js.UndefOr[typings.ol.imageTileMod.default] = js.undefined
    
    var tileGrid: typings.ol.tilegridWmtsMod.default
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(layer: String, matrixSet: String, style: String, tileGrid: typings.ol.tilegridWmtsMod.default): Options = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDimensions(value: js.Any): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixSet(value: String): Self = StObject.set(x, "matrixSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      @scala.inline
      def setRequestEncoding(value: WMTSRequestEncoding | String): Self = StObject.set(x, "requestEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestEncodingUndefined: Self = StObject.set(x, "requestEncoding", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileClass(value: typings.ol.imageTileMod.default): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      @scala.inline
      def setTileGrid(value: typings.ol.tilegridWmtsMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      @scala.inline
      def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      @scala.inline
      def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  @js.native
  trait WMTS
    extends typings.ol.tileImageMod.default {
    
    def createFromWMTSTemplate(template: String): UrlFunction = js.native
    
    /**
      * Get the dimensions, i.e. those passed to the constructor through the
      * "dimensions" option, and possibly updated using the updateDimensions
      * method.
      */
    def getDimensions(): js.Any = js.native
    
    /**
      * Return the image format of the WMTS source.
      */
    def getFormat(): String = js.native
    
    /**
      * Return the layer of the WMTS source.
      */
    def getLayer(): String = js.native
    
    /**
      * Return the matrix set of the WMTS source.
      */
    def getMatrixSet(): String = js.native
    
    /**
      * Return the request encoding, either "KVP" or "REST".
      */
    def getRequestEncoding(): WMTSRequestEncoding = js.native
    
    /**
      * Return the style of the WMTS source.
      */
    def getStyle(): String = js.native
    
    /**
      * Return the version of the WMTS source.
      */
    def getVersion(): String = js.native
    
    /**
      * Update the dimensions.
      */
    def updateDimensions(dimensions: js.Any): Unit = js.native
  }
}
