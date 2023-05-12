package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceBingMapsMod {
  
  @JSImport("ol/source/BingMaps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {boolean} [hidpi=false] If `true` hidpi tiles will be requested.
    * @property {string} [culture='en-us'] Culture code.
    * @property {string} key Bing Maps API key. Get yours at https://www.bingmapsportal.com/.
    * @property {string} imagerySet Type of imagery.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {number} [maxZoom=21] Max zoom. Default is what's advertized by the BingMaps service.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @typedef {Object} BingMapsImageryMetadataResponse
    * @property {number} statusCode The response status code
    * @property {string} statusDescription The response status description
    * @property {string} authenticationResultCode The authentication result code
    * @property {Array<ResourceSet>} resourceSets The array of resource sets
    */
  /**
    * @typedef {Object} ResourceSet
    * @property {Array<Resource>} resources Resources.
    */
  /**
    * @typedef {Object} Resource
    * @property {number} imageHeight The image height
    * @property {number} imageWidth The image width
    * @property {number} zoomMin The minimum zoom level
    * @property {number} zoomMax The maximum zoom level
    * @property {string} imageUrl The image URL
    * @property {Array<string>} imageUrlSubdomains The image URL subdomains for rotation
    * @property {Array<ImageryProvider>} [imageryProviders] The array of ImageryProviders
    */
  /**
    * @typedef {Object} ImageryProvider
    * @property {Array<CoverageArea>} coverageAreas The coverage areas
    * @property {string} [attribution] The attribution
    */
  /**
    * @typedef {Object} CoverageArea
    * @property {number} zoomMin The minimum zoom
    * @property {number} zoomMax The maximum zoom
    * @property {Array<number>} bbox The coverage bounding box
    */
  /**
    * @classdesc
    * Layer source for Bing Maps tile data.
    * @api
    */
  @JSImport("ol/source/BingMaps", JSImport.Default)
  @js.native
  open class default protected () extends BingMaps {
    /**
      * @param {Options} options Bing Maps options.
      */
    def this(options: Options) = this()
  }
  
  inline def quadKey(tileCoord: TileCoord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKey")(tileCoord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @typedef {Object} Options
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {boolean} [hidpi=false] If `true` hidpi tiles will be requested.
    * @property {string} [culture='en-us'] Culture code.
    * @property {string} key Bing Maps API key. Get yours at https://www.bingmapsportal.com/.
    * @property {string} imagerySet Type of imagery.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {number} [maxZoom=21] Max zoom. Default is what's advertized by the BingMaps service.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @typedef {Object} BingMapsImageryMetadataResponse
    * @property {number} statusCode The response status code
    * @property {string} statusDescription The response status description
    * @property {string} authenticationResultCode The authentication result code
    * @property {Array<ResourceSet>} resourceSets The array of resource sets
    */
  /**
    * @typedef {Object} ResourceSet
    * @property {Array<Resource>} resources Resources.
    */
  /**
    * @typedef {Object} Resource
    * @property {number} imageHeight The image height
    * @property {number} imageWidth The image width
    * @property {number} zoomMin The minimum zoom level
    * @property {number} zoomMax The maximum zoom level
    * @property {string} imageUrl The image URL
    * @property {Array<string>} imageUrlSubdomains The image URL subdomains for rotation
    * @property {Array<ImageryProvider>} [imageryProviders] The array of ImageryProviders
    */
  /**
    * @typedef {Object} ImageryProvider
    * @property {Array<CoverageArea>} coverageAreas The coverage areas
    * @property {string} [attribution] The attribution
    */
  /**
    * @typedef {Object} CoverageArea
    * @property {number} zoomMin The minimum zoom
    * @property {number} zoomMax The maximum zoom
    * @property {Array<number>} bbox The coverage bounding box
    */
  /**
    * @classdesc
    * Layer source for Bing Maps tile data.
    * @api
    */
  @js.native
  trait BingMaps
    extends typings.ol.sourceTileImageMod.default {
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var apiKey_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var culture_ : Any = js.native
    
    /**
      * Get the api key used for this source.
      *
      * @return {string} The api key.
      * @api
      */
    def getApiKey(): String = js.native
    
    /**
      * Get the imagery set associated with this source.
      *
      * @return {string} The imagery set.
      * @api
      */
    def getImagerySet(): String = js.native
    
    /**
      * @param {BingMapsImageryMetadataResponse} response Response.
      */
    def handleImageryMetadataResponse(response: BingMapsImageryMetadataResponse): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var hidpi_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var imagerySet_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxZoom_ : Any = js.native
  }
  
  trait BingMapsImageryMetadataResponse extends StObject {
    
    /**
      * The authentication result code
      */
    var authenticationResultCode: String
    
    /**
      * The array of resource sets
      */
    var resourceSets: js.Array[ResourceSet]
    
    /**
      * The response status code
      */
    var statusCode: Double
    
    /**
      * The response status description
      */
    var statusDescription: String
  }
  object BingMapsImageryMetadataResponse {
    
    inline def apply(
      authenticationResultCode: String,
      resourceSets: js.Array[ResourceSet],
      statusCode: Double,
      statusDescription: String
    ): BingMapsImageryMetadataResponse = {
      val __obj = js.Dynamic.literal(authenticationResultCode = authenticationResultCode.asInstanceOf[js.Any], resourceSets = resourceSets.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[BingMapsImageryMetadataResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BingMapsImageryMetadataResponse] (val x: Self) extends AnyVal {
      
      inline def setAuthenticationResultCode(value: String): Self = StObject.set(x, "authenticationResultCode", value.asInstanceOf[js.Any])
      
      inline def setResourceSets(value: js.Array[ResourceSet]): Self = StObject.set(x, "resourceSets", value.asInstanceOf[js.Any])
      
      inline def setResourceSetsVarargs(value: ResourceSet*): Self = StObject.set(x, "resourceSets", js.Array(value*))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoverageArea extends StObject {
    
    /**
      * The coverage bounding box
      */
    var bbox: js.Array[Double]
    
    /**
      * The maximum zoom
      */
    var zoomMax: Double
    
    /**
      * The minimum zoom
      */
    var zoomMin: Double
  }
  object CoverageArea {
    
    inline def apply(bbox: js.Array[Double], zoomMax: Double, zoomMin: Double): CoverageArea = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoverageArea] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
      
      inline def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
      
      inline def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageryProvider extends StObject {
    
    /**
      * The attribution
      */
    var attribution: js.UndefOr[String] = js.undefined
    
    /**
      * The coverage areas
      */
    var coverageAreas: js.Array[CoverageArea]
  }
  object ImageryProvider {
    
    inline def apply(coverageAreas: js.Array[CoverageArea]): ImageryProvider = {
      val __obj = js.Dynamic.literal(coverageAreas = coverageAreas.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageryProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageryProvider] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setCoverageAreas(value: js.Array[CoverageArea]): Self = StObject.set(x, "coverageAreas", value.asInstanceOf[js.Any])
      
      inline def setCoverageAreasVarargs(value: CoverageArea*): Self = StObject.set(x, "coverageAreas", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Culture code.
      */
    var culture: js.UndefOr[String] = js.undefined
    
    /**
      * If `true` hidpi tiles will be requested.
      */
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of imagery.
      */
    var imagerySet: String
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Bing Maps API key. Get yours at https://www.bingmapsportal.com/.
      */
    var key: String
    
    /**
      * Max zoom. Default is what's advertized by the BingMaps service.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum allowed reprojection error (in pixels).
      * Higher values can increase reprojection performance, but decrease precision.
      */
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional function to load a tile given a URL. The default is
      * ```js
      * function(imageTile, src) {
      * imageTile.getImage().src = src;
      * };
      * ```
      */
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(imagerySet: String, key: String): Options = {
      val __obj = js.Dynamic.literal(imagerySet = imagerySet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      inline def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  trait Resource extends StObject {
    
    /**
      * The image height
      */
    var imageHeight: Double
    
    /**
      * The image URL
      */
    var imageUrl: String
    
    /**
      * The image URL subdomains for rotation
      */
    var imageUrlSubdomains: js.Array[String]
    
    /**
      * The image width
      */
    var imageWidth: Double
    
    /**
      * The array of ImageryProviders
      */
    var imageryProviders: js.UndefOr[js.Array[ImageryProvider]] = js.undefined
    
    /**
      * The maximum zoom level
      */
    var zoomMax: Double
    
    /**
      * The minimum zoom level
      */
    var zoomMin: Double
  }
  object Resource {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlSubdomains(value: js.Array[String]): Self = StObject.set(x, "imageUrlSubdomains", value.asInstanceOf[js.Any])
      
      inline def setImageUrlSubdomainsVarargs(value: String*): Self = StObject.set(x, "imageUrlSubdomains", js.Array(value*))
      
      inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setImageryProviders(value: js.Array[ImageryProvider]): Self = StObject.set(x, "imageryProviders", value.asInstanceOf[js.Any])
      
      inline def setImageryProvidersUndefined: Self = StObject.set(x, "imageryProviders", js.undefined)
      
      inline def setImageryProvidersVarargs(value: ImageryProvider*): Self = StObject.set(x, "imageryProviders", js.Array(value*))
      
      inline def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
      
      inline def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceSet extends StObject {
    
    /**
      * Resources.
      */
    var resources: js.Array[Resource]
  }
  object ResourceSet {
    
    inline def apply(resources: js.Array[Resource]): ResourceSet = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceSet] (val x: Self) extends AnyVal {
      
      inline def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
    }
  }
}
