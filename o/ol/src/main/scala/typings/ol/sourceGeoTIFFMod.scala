package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.olBooleans.`false`
import typings.ol.olBooleans.`true`
import typings.ol.olStrings.auto
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceGeoTIFFMod {
  
  /**
    * @typedef {Object} GeoTIFFSourceOptions
    * @property {boolean} [forceXHR=false] Whether to force the usage of the browsers XMLHttpRequest API.
    * @property {Object<string, string>} [headers] additional key-value pairs of headers to be passed with each request. Key is the header name, value the header value.
    * @property {string} [credentials] How credentials shall be handled. See
    * https://developer.mozilla.org/en-US/docs/Web/API/fetch for reference and possible values
    * @property {number} [maxRanges] The maximum amount of ranges to request in a single multi-range request.
    * By default only a single range is used.
    * @property {boolean} [allowFullFile=false] Whether or not a full file is accepted when only a portion is
    * requested. Only use this when you know the source image to be small enough to fit in memory.
    * @property {number} [blockSize=65536] The block size to use.
    * @property {number} [cacheSize=100] The number of blocks that shall be held in a LRU cache.
    */
  /**
    * @typedef {Object} Options
    * @property {Array<SourceInfo>} sources List of information about GeoTIFF sources.
    * Multiple sources can be combined when their resolution sets are equal after applying a scale.
    * The list of sources defines a mapping between input bands as they are read from each GeoTIFF and
    * the output bands that are provided by data tiles. To control which bands to read from each GeoTIFF,
    * use the {@link import("./GeoTIFF.js").SourceInfo bands} property. If, for example, you specify two
    * sources, one with 3 bands and {@link import("./GeoTIFF.js").SourceInfo nodata} configured, and
    * another with 1 band, the resulting data tiles will have 5 bands: 3 from the first source, 1 alpha
    * band from the first source, and 1 band from the second source.
    * @property {GeoTIFFSourceOptions} [sourceOptions] Additional options to be passed to [geotiff.js](https://geotiffjs.github.io/geotiff.js/module-geotiff.html)'s `fromUrl` or `fromUrls` methods.
    * @property {true|false|'auto'} [convertToRGB=false] By default, bands from the sources are read as-is. When
    * reading GeoTIFFs with the purpose of displaying them as RGB images, setting this to `true` will
    * convert other color spaces (YCbCr, CMYK) to RGB.  Setting the option to `'auto'` will make it so CMYK, YCbCr,
    * CIELab, and ICCLab images will automatically be converted to RGB.
    * @property {boolean} [normalize=true] By default, the source data is normalized to values between
    * 0 and 1 with scaling factors based on the raster statistics or `min` and `max` properties of each source.
    * If instead you want to work with the raw values in a style expression, set this to `false`.  Setting this option
    * to `false` will make it so any `min` and `max` properties on sources are ignored.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {boolean} [wrapX=false] Render tiles beyond the tile grid extent.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * the linear interpolation is used to resample the data.  If false, nearest neighbor is used.
    */
  /**
    * @classdesc
    * A source for working with GeoTIFF data.
    * **Note for users of the full build**: The `GeoTIFF` source requires the
    * [geotiff.js](https://github.com/geotiffjs/geotiff.js) library to be loaded as well.
    *
    * @api
    */
  @JSImport("ol/source/GeoTIFF", JSImport.Default)
  @js.native
  open class default protected () extends GeoTIFFSource {
    /**
      * @param {Options} options Data tile options.
      */
    def this(options: Options) = this()
  }
  
  trait GDALMetadata extends StObject {
    
    /**
      * The maximum value (as a string).
      */
    var STATISTICS_MAXIMUM: String
    
    /**
      * The minimum value (as a string).
      */
    var STATISTICS_MINIMUM: String
  }
  object GDALMetadata {
    
    inline def apply(STATISTICS_MAXIMUM: String, STATISTICS_MINIMUM: String): GDALMetadata = {
      val __obj = js.Dynamic.literal(STATISTICS_MAXIMUM = STATISTICS_MAXIMUM.asInstanceOf[js.Any], STATISTICS_MINIMUM = STATISTICS_MINIMUM.asInstanceOf[js.Any])
      __obj.asInstanceOf[GDALMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GDALMetadata] (val x: Self) extends AnyVal {
      
      inline def setSTATISTICS_MAXIMUM(value: String): Self = StObject.set(x, "STATISTICS_MAXIMUM", value.asInstanceOf[js.Any])
      
      inline def setSTATISTICS_MINIMUM(value: String): Self = StObject.set(x, "STATISTICS_MINIMUM", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeoKeys extends StObject {
    
    /**
      * Model type.
      */
    var GTModelTypeGeoKey: Double
    
    /**
      * Raster type.
      */
    var GTRasterTypeGeoKey: Double
    
    /**
      * Angular units.
      */
    var GeogAngularUnitsGeoKey: Double
    
    /**
      * Inverse flattening.
      */
    var GeogInvFlatteningGeoKey: Double
    
    /**
      * Semi-major axis.
      */
    var GeogSemiMajorAxisGeoKey: Double
    
    /**
      * Geographic coordinate system code.
      */
    var GeographicTypeGeoKey: Double
    
    /**
      * Projected linear unit code.
      */
    var ProjLinearUnitsGeoKey: Double
    
    /**
      * Projected coordinate system code.
      */
    var ProjectedCSTypeGeoKey: Double
  }
  object GeoKeys {
    
    inline def apply(
      GTModelTypeGeoKey: Double,
      GTRasterTypeGeoKey: Double,
      GeogAngularUnitsGeoKey: Double,
      GeogInvFlatteningGeoKey: Double,
      GeogSemiMajorAxisGeoKey: Double,
      GeographicTypeGeoKey: Double,
      ProjLinearUnitsGeoKey: Double,
      ProjectedCSTypeGeoKey: Double
    ): GeoKeys = {
      val __obj = js.Dynamic.literal(GTModelTypeGeoKey = GTModelTypeGeoKey.asInstanceOf[js.Any], GTRasterTypeGeoKey = GTRasterTypeGeoKey.asInstanceOf[js.Any], GeogAngularUnitsGeoKey = GeogAngularUnitsGeoKey.asInstanceOf[js.Any], GeogInvFlatteningGeoKey = GeogInvFlatteningGeoKey.asInstanceOf[js.Any], GeogSemiMajorAxisGeoKey = GeogSemiMajorAxisGeoKey.asInstanceOf[js.Any], GeographicTypeGeoKey = GeographicTypeGeoKey.asInstanceOf[js.Any], ProjLinearUnitsGeoKey = ProjLinearUnitsGeoKey.asInstanceOf[js.Any], ProjectedCSTypeGeoKey = ProjectedCSTypeGeoKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoKeys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoKeys] (val x: Self) extends AnyVal {
      
      inline def setGTModelTypeGeoKey(value: Double): Self = StObject.set(x, "GTModelTypeGeoKey", value.asInstanceOf[js.Any])
      
      inline def setGTRasterTypeGeoKey(value: Double): Self = StObject.set(x, "GTRasterTypeGeoKey", value.asInstanceOf[js.Any])
      
      inline def setGeogAngularUnitsGeoKey(value: Double): Self = StObject.set(x, "GeogAngularUnitsGeoKey", value.asInstanceOf[js.Any])
      
      inline def setGeogInvFlatteningGeoKey(value: Double): Self = StObject.set(x, "GeogInvFlatteningGeoKey", value.asInstanceOf[js.Any])
      
      inline def setGeogSemiMajorAxisGeoKey(value: Double): Self = StObject.set(x, "GeogSemiMajorAxisGeoKey", value.asInstanceOf[js.Any])
      
      inline def setGeographicTypeGeoKey(value: Double): Self = StObject.set(x, "GeographicTypeGeoKey", value.asInstanceOf[js.Any])
      
      inline def setProjLinearUnitsGeoKey(value: Double): Self = StObject.set(x, "ProjLinearUnitsGeoKey", value.asInstanceOf[js.Any])
      
      inline def setProjectedCSTypeGeoKey(value: Double): Self = StObject.set(x, "ProjectedCSTypeGeoKey", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoTIFF = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_geotiff.GeoTIFF */ Any
  
  type GeoTIFFImage = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_geotiff.GeoTIFFImage */ Any
  
  /**
    * @typedef {Object} GeoTIFFSourceOptions
    * @property {boolean} [forceXHR=false] Whether to force the usage of the browsers XMLHttpRequest API.
    * @property {Object<string, string>} [headers] additional key-value pairs of headers to be passed with each request. Key is the header name, value the header value.
    * @property {string} [credentials] How credentials shall be handled. See
    * https://developer.mozilla.org/en-US/docs/Web/API/fetch for reference and possible values
    * @property {number} [maxRanges] The maximum amount of ranges to request in a single multi-range request.
    * By default only a single range is used.
    * @property {boolean} [allowFullFile=false] Whether or not a full file is accepted when only a portion is
    * requested. Only use this when you know the source image to be small enough to fit in memory.
    * @property {number} [blockSize=65536] The block size to use.
    * @property {number} [cacheSize=100] The number of blocks that shall be held in a LRU cache.
    */
  /**
    * @typedef {Object} Options
    * @property {Array<SourceInfo>} sources List of information about GeoTIFF sources.
    * Multiple sources can be combined when their resolution sets are equal after applying a scale.
    * The list of sources defines a mapping between input bands as they are read from each GeoTIFF and
    * the output bands that are provided by data tiles. To control which bands to read from each GeoTIFF,
    * use the {@link import("./GeoTIFF.js").SourceInfo bands} property. If, for example, you specify two
    * sources, one with 3 bands and {@link import("./GeoTIFF.js").SourceInfo nodata} configured, and
    * another with 1 band, the resulting data tiles will have 5 bands: 3 from the first source, 1 alpha
    * band from the first source, and 1 band from the second source.
    * @property {GeoTIFFSourceOptions} [sourceOptions] Additional options to be passed to [geotiff.js](https://geotiffjs.github.io/geotiff.js/module-geotiff.html)'s `fromUrl` or `fromUrls` methods.
    * @property {true|false|'auto'} [convertToRGB=false] By default, bands from the sources are read as-is. When
    * reading GeoTIFFs with the purpose of displaying them as RGB images, setting this to `true` will
    * convert other color spaces (YCbCr, CMYK) to RGB.  Setting the option to `'auto'` will make it so CMYK, YCbCr,
    * CIELab, and ICCLab images will automatically be converted to RGB.
    * @property {boolean} [normalize=true] By default, the source data is normalized to values between
    * 0 and 1 with scaling factors based on the raster statistics or `min` and `max` properties of each source.
    * If instead you want to work with the raw values in a style expression, set this to `false`.  Setting this option
    * to `false` will make it so any `min` and `max` properties on sources are ignored.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {boolean} [wrapX=false] Render tiles beyond the tile grid extent.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * the linear interpolation is used to resample the data.  If false, nearest neighbor is used.
    */
  /**
    * @classdesc
    * A source for working with GeoTIFF data.
    * **Note for users of the full build**: The `GeoTIFF` source requires the
    * [geotiff.js](https://github.com/geotiffjs/geotiff.js) library to be loaded as well.
    *
    * @api
    */
  @js.native
  trait GeoTIFFSource
    extends typings.ol.sourceDataTileMod.default {
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var addAlpha_ : Any = js.native
    
    /**
      * @param {import("../size.js").Size} sourceTileSize The source tile size.
      * @param {Array} sourceSamples The source samples.
      * @return {import("../DataTile.js").Data} The composed tile data.
      * @private
      */
    /* private */ var composeTile_ : Any = js.native
    
    /**
      * Configure the tile grid based on images within the source GeoTIFFs.  Each GeoTIFF
      * must have the same internal tiled structure.
      * @param {Array<Array<GeoTIFFImage>>} sources Each source is a list of images
      * from a single GeoTIFF.
      * @private
      */
    /* private */ var configure_ : Any = js.native
    
    /**
      * @type {true|false|'auto'}
      */
    var convertToRGB_ : `true` | `false` | auto = js.native
    
    /**
      * Determine the projection of the images in this GeoTIFF.
      * The default implementation looks at the ProjectedCSTypeGeoKey and the GeographicTypeGeoKey
      * of each image in turn.
      * You can override this method in a subclass to support more projections.
      *
      * @param {Array<Array<GeoTIFFImage>>} sources Each source is a list of images
      * from a single GeoTIFF.
      */
    def determineProjection(sources: js.Array[js.Array[GeoTIFFImage]]): Unit = js.native
    
    /**
      * @type {Error}
      * @private
      */
    /* private */ var error_ : Any = js.native
    
    /**
      * @return {Error} A source loading error. When the source state is `error`, use this function
      * to get more information about the error. To debug a faulty configuration, you may want to use
      * a listener like
      * ```js
      * geotiffSource.on('change', () => {
      *   if (geotiffSource.getState() === 'error') {
      *     console.error(geotiffSource.getError());
      *   }
      * });
      * ```
      */
    def getError(): js.Error = js.native
    
    /**
      * @param {number} z The z tile index.
      * @param {number} x The x tile index.
      * @param {number} y The y tile index.
      * @return {Promise} The composed tile data.
      * @private
      */
    /* private */ var loadTile_ : Any = js.native
    
    /**
      * @type {Array<Array<GDALMetadata>>}
      * @private
      */
    /* private */ var metadata_ : Any = js.native
    
    /**
      * @type {Array<Array<number>>}
      * @private
      */
    /* private */ var nodataValues_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var normalize_ : Any = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var resolutionFactors_ : Any = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var samplesPerPixel_ : Any = js.native
    
    /**
      * @type {Array<Array<GeoTIFFImage>>}
      * @private
      */
    /* private */ var sourceImagery_ : Any = js.native
    
    /**
      * @type {Array<SourceInfo>}
      * @private
      */
    /* private */ var sourceInfo_ : Any = js.native
    
    /**
      * @type {Array<Array<GeoTIFFImage>>}
      * @private
      */
    /* private */ var sourceMasks_ : Any = js.native
    
    /**
      * @type {Object}
      * @private
      */
    /* private */ var sourceOptions_ : Any = js.native
  }
  
  trait GeoTIFFSourceOptions extends StObject {
    
    /**
      * Whether or not a full file is accepted when only a portion is
      * requested. Only use this when you know the source image to be small enough to fit in memory.
      */
    var allowFullFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The block size to use.
      */
    var blockSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of blocks that shall be held in a LRU cache.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * How credentials shall be handled. See
      * https://developer.mozilla.org/en-US/docs/Web/API/fetch for reference and possible values
      */
    var credentials: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to force the usage of the browsers XMLHttpRequest API.
      */
    var forceXHR: js.UndefOr[Boolean] = js.undefined
    
    /**
      * additional key-value pairs of headers to be passed with each request. Key is the header name, value the header value.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The maximum amount of ranges to request in a single multi-range request.
      * By default only a single range is used.
      */
    var maxRanges: js.UndefOr[Double] = js.undefined
  }
  object GeoTIFFSourceOptions {
    
    inline def apply(): GeoTIFFSourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoTIFFSourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoTIFFSourceOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowFullFile(value: Boolean): Self = StObject.set(x, "allowFullFile", value.asInstanceOf[js.Any])
      
      inline def setAllowFullFileUndefined: Self = StObject.set(x, "allowFullFile", js.undefined)
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setForceXHR(value: Boolean): Self = StObject.set(x, "forceXHR", value.asInstanceOf[js.Any])
      
      inline def setForceXHRUndefined: Self = StObject.set(x, "forceXHR", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxRanges(value: Double): Self = StObject.set(x, "maxRanges", value.asInstanceOf[js.Any])
      
      inline def setMaxRangesUndefined: Self = StObject.set(x, "maxRanges", js.undefined)
    }
  }
  
  type MultiGeoTIFF = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_geotiff.MultiGeoTIFF */ Any
  
  trait Options extends StObject {
    
    /**
      * By default, bands from the sources are read as-is. When
      * reading GeoTIFFs with the purpose of displaying them as RGB images, setting this to `true` will
      * convert other color spaces (YCbCr, CMYK) to RGB.  Setting the option to `'auto'` will make it so CMYK, YCbCr,
      * CIELab, and ICCLab images will automatically be converted to RGB.
      */
    var convertToRGB: js.UndefOr[Boolean | auto] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * the linear interpolation is used to resample the data.  If false, nearest neighbor is used.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the source data is normalized to values between
      * 0 and 1 with scaling factors based on the raster statistics or `min` and `max` properties of each source.
      * If instead you want to work with the raw values in a style expression, set this to `false`.  Setting this option
      * to `false` will make it so any `min` and `max` properties on sources are ignored.
      */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the layer is opaque.
      */
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional options to be passed to [geotiff.js](https://geotiffjs.github.io/geotiff.js/module-geotiff.html)'s `fromUrl` or `fromUrls` methods.
      */
    var sourceOptions: js.UndefOr[GeoTIFFSourceOptions] = js.undefined
    
    /**
      * List of information about GeoTIFF sources.
      * Multiple sources can be combined when their resolution sets are equal after applying a scale.
      * The list of sources defines a mapping between input bands as they are read from each GeoTIFF and
      * the output bands that are provided by data tiles. To control which bands to read from each GeoTIFF,
      * use the {@link import ("./GeoTIFF.js").SourceInfo bands} property. If, for example, you specify two
      * sources, one with 3 bands and {@link import ("./GeoTIFF.js").SourceInfo nodata} configured, and
      * another with 1 band, the resulting data tiles will have 5 bands: 3 from the first source, 1 alpha
      * band from the first source, and 1 band from the second source.
      */
    var sources: js.Array[SourceInfo]
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * Render tiles beyond the tile grid extent.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(sources: js.Array[SourceInfo]): Options = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConvertToRGB(value: Boolean | auto): Self = StObject.set(x, "convertToRGB", value.asInstanceOf[js.Any])
      
      inline def setConvertToRGBUndefined: Self = StObject.set(x, "convertToRGB", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setSourceOptions(value: GeoTIFFSourceOptions): Self = StObject.set(x, "sourceOptions", value.asInstanceOf[js.Any])
      
      inline def setSourceOptionsUndefined: Self = StObject.set(x, "sourceOptions", js.undefined)
      
      inline def setSources(value: js.Array[SourceInfo]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: SourceInfo*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  trait SourceInfo extends StObject {
    
    /**
      * Band numbers to be read from (where the first band is `1`). If not provided, all bands will
      * be read. For example, if a GeoTIFF has blue (1), green (2), red (3), and near-infrared (4) bands, and you only need the
      * near-infrared band, configure `bands: [4]`.
      */
    var bands: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Blob containing the source GeoTIFF. `blob` and `url` are mutually exclusive.
      */
    var blob: js.UndefOr[Blob] = js.undefined
    
    /**
      * The maximum source data value.  Rendered values are scaled from 0 to 1 based on
      * the configured min and max.  If not provided and raster statistics are available, those will be used instead.
      * If neither are available, the maximum for the data type will be used.  To disable this behavior, set
      * the `normalize` option to `false` in the constructor.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum source data value.  Rendered values are scaled from 0 to 1 based on
      * the configured min and max.  If not provided and raster statistics are available, those will be used instead.
      * If neither are available, the minimum for the data type will be used.  To disable this behavior, set
      * the `normalize` option to `false` in the constructor.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Values to discard (overriding any nodata values in the metadata).
      * When provided, an additional alpha band will be added to the data.  Often the GeoTIFF metadata
      * will include information about nodata values, so you should only need to set this property if
      * you find that it is not already extracted from the metadata.
      */
    var nodata: js.UndefOr[Double] = js.undefined
    
    /**
      * List of any overview URLs, only applies if the url parameter is given.
      */
    var overviews: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * URL for the source GeoTIFF.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object SourceInfo {
    
    inline def apply(): SourceInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceInfo] (val x: Self) extends AnyVal {
      
      inline def setBands(value: js.Array[Double]): Self = StObject.set(x, "bands", value.asInstanceOf[js.Any])
      
      inline def setBandsUndefined: Self = StObject.set(x, "bands", js.undefined)
      
      inline def setBandsVarargs(value: Double*): Self = StObject.set(x, "bands", js.Array(value*))
      
      inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setNodata(value: Double): Self = StObject.set(x, "nodata", value.asInstanceOf[js.Any])
      
      inline def setNodataUndefined: Self = StObject.set(x, "nodata", js.undefined)
      
      inline def setOverviews(value: js.Array[String]): Self = StObject.set(x, "overviews", value.asInstanceOf[js.Any])
      
      inline def setOverviewsUndefined: Self = StObject.set(x, "overviews", js.undefined)
      
      inline def setOverviewsVarargs(value: String*): Self = StObject.set(x, "overviews", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
