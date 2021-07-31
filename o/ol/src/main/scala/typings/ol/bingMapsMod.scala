package typings.ol

import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingMapsMod {
  
  @JSImport("ol/source/BingMaps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/source/BingMaps", JSImport.Default)
  @js.native
  class default protected () extends BingMaps {
    def this(options: Options) = this()
  }
  
  @scala.inline
  def quadKey(tileCoord: TileCoord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKey")(tileCoord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait BingMaps
    extends typings.ol.tileImageMod.default {
    
    /**
      * Get the api key used for this source.
      */
    def getApiKey(): String = js.native
    
    /**
      * Get the imagery set associated with this source.
      */
    def getImagerySet(): String = js.native
    
    def handleImageryMetadataResponse(response: BingMapsImageryMetadataResponse): Unit = js.native
  }
  
  trait BingMapsImageryMetadataResponse extends StObject {
    
    var authenticationResultCode: String
    
    var resourceSets: js.Array[ResourceSet]
    
    var statusCode: Double
    
    var statusDescription: String
  }
  object BingMapsImageryMetadataResponse {
    
    @scala.inline
    def apply(
      authenticationResultCode: String,
      resourceSets: js.Array[ResourceSet],
      statusCode: Double,
      statusDescription: String
    ): BingMapsImageryMetadataResponse = {
      val __obj = js.Dynamic.literal(authenticationResultCode = authenticationResultCode.asInstanceOf[js.Any], resourceSets = resourceSets.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[BingMapsImageryMetadataResponse]
    }
    
    @scala.inline
    implicit class BingMapsImageryMetadataResponseMutableBuilder[Self <: BingMapsImageryMetadataResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticationResultCode(value: String): Self = StObject.set(x, "authenticationResultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceSets(value: js.Array[ResourceSet]): Self = StObject.set(x, "resourceSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceSetsVarargs(value: ResourceSet*): Self = StObject.set(x, "resourceSets", js.Array(value :_*))
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoverageArea extends StObject {
    
    var bbox: js.Array[Double]
    
    var zoomMax: Double
    
    var zoomMin: Double
  }
  object CoverageArea {
    
    @scala.inline
    def apply(bbox: js.Array[Double], zoomMax: Double, zoomMin: Double): CoverageArea = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageArea]
    }
    
    @scala.inline
    implicit class CoverageAreaMutableBuilder[Self <: CoverageArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value :_*))
      
      @scala.inline
      def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageryProvider extends StObject {
    
    var attribution: js.UndefOr[String] = js.undefined
    
    var coverageAreas: js.Array[CoverageArea]
  }
  object ImageryProvider {
    
    @scala.inline
    def apply(coverageAreas: js.Array[CoverageArea]): ImageryProvider = {
      val __obj = js.Dynamic.literal(coverageAreas = coverageAreas.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageryProvider]
    }
    
    @scala.inline
    implicit class ImageryProviderMutableBuilder[Self <: ImageryProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      @scala.inline
      def setCoverageAreas(value: js.Array[CoverageArea]): Self = StObject.set(x, "coverageAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageAreasVarargs(value: CoverageArea*): Self = StObject.set(x, "coverageAreas", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var culture: js.UndefOr[String] = js.undefined
    
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var imagerySet: String
    
    var key: String
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(imagerySet: String, key: String): Options = {
      val __obj = js.Dynamic.literal(imagerySet = imagerySet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      @scala.inline
      def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      @scala.inline
      def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      @scala.inline
      def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  trait Resource extends StObject {
    
    var imageHeight: Double
    
    var imageUrl: String
    
    var imageUrlSubdomains: js.Array[String]
    
    var imageWidth: Double
    
    var imageryProviders: js.UndefOr[js.Array[ImageryProvider]] = js.undefined
    
    var zoomMax: Double
    
    var zoomMin: Double
  }
  object Resource {
    
    @scala.inline
    def apply(
      imageHeight: Double,
      imageUrl: String,
      imageUrlSubdomains: js.Array[String],
      imageWidth: Double,
      zoomMax: Double,
      zoomMin: Double
    ): Resource = {
      val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], imageUrlSubdomains = imageUrlSubdomains.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlSubdomains(value: js.Array[String]): Self = StObject.set(x, "imageUrlSubdomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlSubdomainsVarargs(value: String*): Self = StObject.set(x, "imageUrlSubdomains", js.Array(value :_*))
      
      @scala.inline
      def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageryProviders(value: js.Array[ImageryProvider]): Self = StObject.set(x, "imageryProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageryProvidersUndefined: Self = StObject.set(x, "imageryProviders", js.undefined)
      
      @scala.inline
      def setImageryProvidersVarargs(value: ImageryProvider*): Self = StObject.set(x, "imageryProviders", js.Array(value :_*))
      
      @scala.inline
      def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceSet extends StObject {
    
    var resources: js.Array[Resource]
  }
  object ResourceSet {
    
    @scala.inline
    def apply(resources: js.Array[Resource]): ResourceSet = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceSet]
    }
    
    @scala.inline
    implicit class ResourceSetMutableBuilder[Self <: ResourceSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    }
  }
}
