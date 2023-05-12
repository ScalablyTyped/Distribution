package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.sourceBingMapsMod.Options
import typings.ol.sourceBingMapsMod.default
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  @JSImport("ol/source", JSImport.Namespace)
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
  @JSImport("ol/source", "BingMaps")
  @js.native
  open class BingMaps protected () extends default {
    /**
      * @param {Options} options Bing Maps options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection.
    * @property {number} [maxZoom=18] Max zoom.
    * @property {number} [minZoom] Minimum zoom.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {Object} [config] If using anonymous maps, the CartoDB config to use. See
    * https://carto.com/developers/maps-api/guides/anonymous-maps/
    * for more detail.
    * If using named maps, a key-value lookup with the template parameters.
    * See https://carto.com/developers/maps-api/guides/named-maps/
    * for more detail.
    * @property {string} [map] If using named maps, this will be the name of the template to load.
    * See https://carto.com/developers/maps-api/guides/named-maps/
    * for more detail.
    * @property {string} [account] Username as used to access public Carto dashboard at https://{username}.carto.com/.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @typedef {Object} CartoDBLayerInfo
    * @property {string} layergroupid The layer group ID
    * @property {{https: string}} cdn_url The CDN URL
    */
  /**
    * @classdesc
    * Layer source for the CartoDB Maps API.
    * @api
    */
  @JSImport("ol/source", "CartoDB")
  @js.native
  open class CartoDB protected ()
    extends typings.ol.sourceCartoDBMod.default {
    /**
      * @param {Options} options CartoDB options.
      */
    def this(options: typings.ol.sourceCartoDBMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [distance=20] Distance in pixels within which features will
    * be clustered together.
    * @property {number} [minDistance=0] Minimum distance in pixels between clusters.
    * Will be capped at the configured distance.
    * By default no minimum distance is guaranteed. This config can be used to avoid
    * overlapping icons. As a tradoff, the cluster feature's position will no longer be
    * the center of all its features.
    * @property {function(Feature):Point} [geometryFunction]
    * Function that takes an {@link module:ol/Feature~Feature} as argument and returns an
    * {@link module:ol/geom/Point~Point} as cluster calculation point for the feature. When a
    * feature should not be considered for clustering, the function should return
    * `null`. The default, which works when the underlying source contains point
    * features only, is
    * ```js
    * function(feature) {
    *   return feature.getGeometry();
    * }
    * ```
    * See {@link module:ol/geom/Polygon~Polygon#getInteriorPoint} for a way to get a cluster
    * calculation point for polygons.
    * @property {function(Point, Array<Feature>):Feature} [createCluster]
    * Function that takes the cluster's center {@link module:ol/geom/Point~Point} and an array
    * of {@link module:ol/Feature~Feature} included in this cluster. Must return a
    * {@link module:ol/Feature~Feature} that will be used to render. Default implementation is:
    * ```js
    * function(point, features) {
    *   return new Feature({
    *     geometry: point,
    *     features: features
    *   });
    * }
    * ```
    * @property {VectorSource} [source=null] Source.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    */
  /**
    * @classdesc
    * Layer source to cluster vector data. Works out of the box with point
    * geometries. For other geometry types, or if not all geometries should be
    * considered for clustering, a custom `geometryFunction` can be defined.
    *
    * If the instance is disposed without also disposing the underlying
    * source `setSource(null)` has to be called to remove the listener reference
    * from the wrapped source.
    * @api
    */
  @JSImport("ol/source", "Cluster")
  @js.native
  open class Cluster protected ()
    extends typings.ol.sourceClusterMod.default {
    /**
      * @param {Options} options Cluster options.
      */
    def this(options: typings.ol.sourceClusterMod.Options) = this()
  }
  
  /**
    * Data tile loading function.  The function is called with z, x, and y tile coordinates and
    * returns {@link import("../DataTile.js").Data data} for a tile or a promise for the same.
    * @typedef {function(number, number, number) : (import("../DataTile.js").Data|Promise<import("../DataTile.js").Data>)} Loader
    */
  /**
    * @typedef {Object} Options
    * @property {Loader} [loader] Data loader.  Called with z, x, and y tile coordinates.
    * Returns {@link import("../DataTile.js").Data data} for a tile or a promise for the same.
    * For loaders that generate images, the promise should not resolve until the image is loaded.
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [maxZoom=42] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom=0] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The pixel width and height of the source tiles.
    * This may be different than the rendered pixel size if a `tileGrid` is provided.
    * @property {number} [gutter=0] The size in pixels of the gutter around data tiles to ignore.
    * This allows artifacts of rendering at tile edges to be ignored.
    * Supported data should be wider and taller than the tile size by a value of `2 x gutter`.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Tile projection.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("./Source.js").State} [state] The source state.
    * @property {boolean} [wrapX=false] Render tiles beyond the antimeridian.
    * @property {number} [transition] Transition time when fading in new tiles (in miliseconds).
    * @property {number} [bandCount=4] Number of bands represented in the data.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * A source for typed array data tiles.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @JSImport("ol/source", "DataTile")
  @js.native
  open class DataTile protected ()
    extends typings.ol.sourceDataTileMod.default {
    /**
      * @param {Options} options DataTile source options.
      */
    def this(options: typings.ol.sourceDataTileMod.Options) = this()
  }
  
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
  @JSImport("ol/source", "GeoTIFF")
  @js.native
  open class GeoTIFF protected ()
    extends typings.ol.sourceGeoTIFFMod.default {
    /**
      * @param {Options} options Data tile options.
      */
    def this(options: typings.ol.sourceGeoTIFFMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Layer source for IIIF Image API services.
    * @api
    */
  @JSImport("ol/source", "IIIF")
  @js.native
  /**
    * @param {Options} [options] Tile source options. Use {@link import("../format/IIIFInfo.js").IIIFInfo}
    * to parse Image API service information responses into constructor options.
    * @api
    */
  open class IIIF ()
    extends typings.ol.sourceIiifMod.default {
    def this(options: typings.ol.sourceIiifMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<ImageSourceEventTypes, ImageSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |ImageSourceEventTypes, Return>} ImageSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {Array<number>} [resolutions] Resolutions.
    * @property {import("./Source.js").State} [state] State.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing a single image.
    * @abstract
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source", "Image")
  @js.native
  open class Image protected ()
    extends typings.ol.sourceImageMod.default {
    /**
      * @param {Options} options Single image source options.
      */
    def this(options: typings.ol.sourceImageMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting the image from
    * the remote server.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given
    * a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] ArcGIS Rest parameters. This field is optional. Service
    * defaults will be used for any fields not specified. `FORMAT` is `PNG32` by default. `F` is
    * `IMAGE` by default. `TRANSPARENT` is `true` by default.  `BBOX`, `SIZE`, `BBOXSR`, and `IMAGESR`
    * will be set dynamically. Set `LAYERS` to override the default service layer visibility. See
    * https://developers.arcgis.com/rest/services-reference/export-map.htm
    * for further reference.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * The projection code must contain a numeric end portion separated by :
    * or the entire code must form a valid ArcGIS SpatialReference definition.
    * @property {number} [ratio=1.5] Ratio. `1` means image requests are the size of the map viewport,
    * `2` means twice the size of the map viewport, and so on.
    * @property {Array<number>} [resolutions] Resolutions. If specified, requests will be made for
    * these resolutions only.
    * @property {string} [url] ArcGIS Rest service URL for a Map Service or Image Service. The url
    * should include /MapServer or /ImageServer.
    */
  /**
    * @classdesc
    * Source for data from ArcGIS Rest services providing single, untiled images.
    * Useful when underlying map service has labels.
    *
    * If underlying map service is not using labels,
    * take advantage of ol image caching and use
    * {@link module:ol/source/TileArcGISRest~TileArcGISRest} data source.
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source", "ImageArcGISRest")
  @js.native
  /**
    * @param {Options} [options] Image ArcGIS Rest Options.
    */
  open class ImageArcGISRest ()
    extends typings.ol.sourceImageArcGISRestMod.default {
    def this(options: typings.ol.sourceImageArcGISRestMod.Options) = this()
  }
  
  /**
    * A function returning the canvas element (`{HTMLCanvasElement}`)
    * used by the source as an image. The arguments passed to the function are:
    * {@link module:ol/extent~Extent} the image extent, `{number}` the image resolution,
    * `{number}` the pixel ratio of the map, {@link module:ol/size~Size} the image size,
    * and {@link module:ol/proj/Projection~Projection} the image projection. The canvas returned by
    * this function is cached by the source. The this keyword inside the function
    * references the {@link module:ol/source/ImageCanvas~ImageCanvasSource}.
    *
    * @typedef {function(this:import("../ImageCanvas.js").default, import("../extent.js").Extent, number,
    *     number, import("../size.js").Size, import("../proj/Projection.js").default): HTMLCanvasElement} FunctionType
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {FunctionType} [canvasFunction] Canvas function.
    * The function returning the canvas element used by the source
    * as an image. The arguments passed to the function are: {@link import("../extent.js").Extent} the
    * image extent, `{number}` the image resolution, `{number}` the pixel ratio of the map,
    * {@link import("../size.js").Size} the image size, and {@link import("../proj/Projection.js").default} the image
    * projection. The canvas returned by this function is cached by the source. If
    * the value returned by the function is later changed then
    * `changed` should be called on the source for the source to
    * invalidate the current cached image. See: {@link module:ol/Observable~Observable#changed}
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1.5] Ratio. 1 means canvases are the size of the map viewport, 2 means twice the
    * width and height of the map viewport, and so on. Must be `1` or higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, new canvases will be created for these resolutions
    * @property {import("./Source.js").State} [state] Source state.
    */
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    * @api
    */
  @JSImport("ol/source", "ImageCanvas")
  @js.native
  /**
    * @param {Options} [options] ImageCanvas options.
    */
  open class ImageCanvas ()
    extends typings.ol.sourceImageCanvasMod.default {
    def this(options: typings.ol.sourceImageCanvasMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [url] The mapagent url.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {number} [displayDpi=96] The display resolution.
    * @property {number} [metersPerUnit=1] The meters-per-unit value.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {boolean} [useOverlay] If `true`, will use `GETDYNAMICMAPOVERLAYIMAGE`.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1] Ratio. `1` means image requests are the size of the map viewport, `2` means
    * twice the width and height of the map viewport, and so on. Must be `1` or higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, requests will be made for these resolutions only.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object} [params] Additional parameters.
    */
  /**
    * @classdesc
    * Source for images from Mapguide servers
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source", "ImageMapGuide")
  @js.native
  open class ImageMapGuide protected ()
    extends typings.ol.sourceImageMapGuideMod.default {
    /**
      * @param {Options} options ImageMapGuide options.
      */
    def this(options: typings.ol.sourceImageMapGuideMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {import("../extent.js").Extent} [imageExtent] Extent of the image in map coordinates.
    * This is the [left, bottom, right, top] map coordinates of your image.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {import("../size.js").Size} [imageSize] Size of the image in pixels. Usually the image size is auto-detected, so this
    * only needs to be set if auto-detection fails for some reason.
    * @property {string} url Image URL.
    */
  /**
    * @classdesc
    * A layer source for displaying a single, static image.
    * @api
    */
  @JSImport("ol/source", "ImageStatic")
  @js.native
  open class ImageStatic protected ()
    extends typings.ol.sourceImageStaticMod.default {
    /**
      * @param {Options} options ImageStatic options.
      */
    def this(options: typings.ol.sourceImageStaticMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("./wms.js").ServerType} [serverType] The type of
    * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
    * Only needed if `hidpi` is `true`.
    * @property {import("../Image.js").LoadFunction} [imageLoadFunction] Optional function to load an image given a URL.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] WMS request parameters.
    * At least a `LAYERS` param is required. `STYLES` is
    * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
    * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [ratio=1.5] Ratio. `1` means image requests are the size of the map viewport, `2` means
    * twice the width and height of the map viewport, and so on. Must be `1` or
    * higher.
    * @property {Array<number>} [resolutions] Resolutions.
    * If specified, requests will be made for these resolutions only.
    * @property {string} [url] WMS service URL.
    */
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source", "ImageWMS")
  @js.native
  /**
    * @param {Options} [options] ImageWMS options.
    */
  open class ImageWMS ()
    extends typings.ol.sourceImageWMSMod.default {
    def this(options: typings.ol.sourceImageWMSMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin='anonymous'] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {number} [maxZoom=19] Max zoom.
    * @property {boolean} [opaque=true] Whether the layer is opaque.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {string} [url='https://tile.openstreetmap.org/{z}/{x}/{y}.png'] URL template.
    * Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for the OpenStreetMap tile server.
    * @api
    */
  @JSImport("ol/source", "OSM")
  @js.native
  /**
    * @param {Options} [options] Open Street Map options.
    */
  open class OSM ()
    extends typings.ol.sourceOsmMod.default {
    def this(options: typings.ol.sourceOsmMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {Array<import("./Source.js").default|import("../layer/Layer.js").default>} sources Input
    * sources or layers.  For vector data, use an VectorImage layer.
    * @property {Operation} [operation] Raster operation.
    * The operation will be called with data from input sources
    * and the output will be assigned to the raster source.
    * @property {Object} [lib] Functions that will be made available to operations run in a worker.
    * @property {number} [threads] By default, operations will be run in a single worker thread.
    * To avoid using workers altogether, set `threads: 0`.  For pixel operations, operations can
    * be run in multiple worker threads.  Note that there is additional overhead in
    * transferring data to multiple workers, and that depending on the user's
    * system, it may not be possible to parallelize the work.
    * @property {RasterOperationType} [operationType='pixel'] Operation type.
    * Supported values are `'pixel'` and `'image'`.  By default,
    * `'pixel'` operations are assumed, and operations will be called with an
    * array of pixels from input sources.  If set to `'image'`, operations will
    * be called with an array of ImageData objects from input sources.
    * @property {Array<number>|null} [resolutions] Resolutions. If specified, raster operations will only
    * be run at the given resolutions.  By default, the resolutions of the first source with resolutions
    * specified will be used, if any. Set to `null` to use any view resolution instead.
    */
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./Image.js").ImageSourceEventTypes, import("./Image.js").ImageSourceEvent, Return> &
    *   import("../Observable").OnSignature<RasterSourceEventTypes, RasterSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |RasterSourceEventTypes, Return>} RasterSourceOnSignature
    */
  /**
    * @classdesc
    * A source that transforms data from any number of input sources using an
    * {@link module:ol/source/Raster~Operation} function to transform input pixel values into
    * output pixel values.
    *
    * @fires module:ol/source/Raster.RasterSourceEvent
    * @api
    */
  @JSImport("ol/source", "Raster")
  @js.native
  open class Raster protected ()
    extends typings.ol.sourceRasterMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: typings.ol.sourceRasterMod.Options) = this()
  }
  
  /**
    * @typedef {'undefined' | 'loading' | 'ready' | 'error'} State
    * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
    */
  /**
    * A function that takes a {@link import("../View.js").ViewStateAndExtent} and returns a string or
    * an array of strings representing source attributions.
    *
    * @typedef {function(import("../View.js").ViewStateAndExtent): (string|Array<string>)} Attribution
    */
  /**
    * A type that can be used to provide attribution information for data sources.
    *
    * It represents either
    * * a simple string (e.g. `'© Acme Inc.'`)
    * * an array of simple strings (e.g. `['© Acme Inc.', '© Bacme Inc.']`)
    * * a function that returns a string or array of strings ({@link module:ol/source/Source~Attribution})
    *
    * @typedef {string|Array<string>|Attribution} AttributionLike
    */
  /**
    * @typedef {Object} Options
    * @property {AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {import("./Source.js").State} [state='ready'] State.
    * @property {boolean} [wrapX=false] WrapX.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for {@link module:ol/layer/Layer~Layer} sources.
    *
    * A generic `change` event is triggered when the state of the source changes.
    * @abstract
    * @api
    */
  @JSImport("ol/source", "Source")
  @js.native
  open class Source protected ()
    extends typings.ol.sourceSourceMod.default {
    /**
      * @param {Options} options Source options.
      */
    def this(options: typings.ol.sourceSourceMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {string} layer Layer name.
    * @property {number} [minZoom] Minimum zoom.
    * @property {number} [maxZoom] Maximum zoom.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction]
    * Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for the Stamen tile server.
    * @api
    */
  @JSImport("ol/source", "Stamen")
  @js.native
  open class Stamen protected ()
    extends typings.ol.sourceStamenMod.default {
    /**
      * @param {Options} options Stamen options.
      */
    def this(options: typings.ol.sourceStamenMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./TileEventType").TileSourceEventTypes, TileSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     import("./TileEventType").TileSourceEventTypes, Return>} TileSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] CacheSize.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {number} [tilePixelRatio] TilePixelRatio.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {import("./Source.js").State} [state] State.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] TileGrid.
    * @property {boolean} [wrapX=false] WrapX.
    * @property {number} [transition] Transition.
    * @property {string} [key] Key.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0] ZDirection.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing images divided into a tile grid.
    * @abstract
    * @api
    */
  @JSImport("ol/source", "Tile")
  @js.native
  open class Tile protected ()
    extends typings.ol.sourceTileMod.default {
    /**
      * @param {Options} options SourceTile source options.
      */
    def this(options: typings.ol.sourceTileMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} [params] ArcGIS Rest parameters. This field is optional. Service defaults will be
    * used for any fields not specified. `FORMAT` is `PNG32` by default. `F` is `IMAGE` by
    * default. `TRANSPARENT` is `true` by default.  `BBOX`, `SIZE`, `BBOXSR`,
    * and `IMAGESR` will be set dynamically. Set `LAYERS` to
    * override the default service layer visibility. See
    * https://developers.arcgis.com/rest/services-reference/export-map.htm
    * for further reference.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid. Base this on the resolutions,
    * tilesize and extent supported by the server.
    * If this is not defined, a default grid will be used: if there is a projection
    * extent, the grid will be based on that; if not, a grid based on a global
    * extent with origin at 0,0 will be used.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * The projection code must contain a numeric end portion separated by :
    * or the entire code must form a valid ArcGIS SpatialReference definition.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL.
    * The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {string} [url] ArcGIS Rest service URL for a Map Service or Image Service. The
    * url should include /MapServer or /ImageServer.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.  To disable the opacity
    * transition, pass `transition: 0`.
    * @property {Array<string>} [urls] ArcGIS Rest service urls. Use this instead of `url` when the ArcGIS
    * Service supports multiple urls for export requests.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from ArcGIS Rest services. Map and Image
    * Services are supported.
    *
    * For cached ArcGIS services, better performance is available using the
    * {@link module:ol/source/XYZ~XYZ} data source.
    * @api
    */
  @JSImport("ol/source", "TileArcGISRest")
  @js.native
  /**
    * @param {Options} [options] Tile ArcGIS Rest options.
    */
  open class TileArcGISRest ()
    extends typings.ol.sourceTileArcGISRestMod.default {
    def this(options: typings.ol.sourceTileArcGISRestMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Optional projection.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Set to `1` when debugging `VectorTile` sources with a default configuration.
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    * @property {string} [template='z:{z} x:{x} y:{y}'] Template for labeling the tiles.
    * Should include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    */
  /**
    * @classdesc
    * A pseudo tile source, which does not fetch tiles from a server, but renders
    * a grid outline for the tile grid/projection along with the coordinates for
    * each tile. See examples/canvas-tiles for an example.
    * @api
    */
  @JSImport("ol/source", "TileDebug")
  @js.native
  /**
    * @param {Options} [options] Debug tile options.
    */
  open class TileDebug ()
    extends typings.ol.sourceTileDebugMod.default {
    def this(options: typings.ol.sourceTileDebugMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {import("./Source.js").State} [state] Source state.
    * @property {typeof import("../ImageTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service. For example, if the tile
    * service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get tile URL given a tile coordinate and the projection.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX] Whether to wrap the world horizontally. The default, is to
    * request out-of-bounds tiles from the server. When set to `false`, only one
    * world will be rendered. When set to `true`, tiles will be requested for one
    * world only, but they will be wrapped horizontally to render multiple worlds.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {string} [key] Optional tile key for proper cache fetching
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Base class for sources providing images divided into a tile grid.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @JSImport("ol/source", "TileImage")
  @js.native
  open class TileImage protected ()
    extends typings.ol.sourceTileImageMod.default {
    /**
      * @param {!Options} options Image tile options.
      */
    def this(options: typings.ol.sourceTileImageMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Config
    * @property {string} [name] The name.
    * @property {string} [description] The description.
    * @property {string} [version] The version.
    * @property {string} [attribution] The attribution.
    * @property {string} [template] The template.
    * @property {string} [legend] The legend.
    * @property {string} [scheme] The scheme.
    * @property {Array<string>} tiles The tile URL templates.
    * @property {Array<string>} [grids] Optional grids.
    * @property {number} [minzoom] Minimum zoom level.
    * @property {number} [maxzoom] Maximum zoom level.
    * @property {Array<number>} [bounds] Optional bounds.
    * @property {Array<number>} [center] Optional center.
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {boolean} [jsonp=false] Use JSONP with callback to load the TileJSON.
    * Useful when the server does not support CORS..
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {Config} [tileJSON] TileJSON configuration for this source.
    * If not provided, `url` must be configured.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The tile size used by the tile service.
    * Note: `tileSize` and other non-standard TileJSON properties are currently ignored.
    * @property {string} [url] URL to the TileJSON file. If not provided, `tileJSON` must be configured.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data in TileJSON format.
    * @api
    */
  @JSImport("ol/source", "TileJSON")
  @js.native
  open class TileJSON protected ()
    extends typings.ol.sourceTileJSONMod.default {
    /**
      * @param {Options} options TileJSON options.
      */
    def this(options: typings.ol.sourceTileJSONMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {Object<string,*>} params WMS request parameters.
    * At least a `LAYERS` param is required. `STYLES` is
    * `''` by default. `VERSION` is `1.3.0` by default. `WIDTH`, `HEIGHT`, `BBOX`
    * and `CRS` (`SRS` for WMS version < 1.3.0) will be set dynamically.
    * @property {number} [gutter=0]
    * The size in pixels of the gutter around image tiles to ignore. By setting
    * this property to a non-zero value, images will be requested that are wider
    * and taller than the tile size by a value of `2 x gutter`.
    * Using a non-zero value allows artifacts of rendering at tile edges to be
    * ignored. If you control the WMS service it is recommended to address
    * "artifacts at tile edges" issues by properly configuring the WMS service. For
    * example, MapServer has a `tile_map_edge_buffer` configuration parameter for
    * this. See https://mapserver.org/output/tile_mode.html.
    * @property {boolean} [hidpi=true] Use the `ol/Map#pixelRatio` value when requesting
    * the image from the remote server.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {typeof import("../ImageTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid. Base this on the resolutions,
    * tilesize and extent supported by the server.
    * If this is not defined, a default grid will be used: if there is a projection
    * extent, the grid will be based on that; if not, a grid based on a global
    * extent with origin at 0,0 will be used.
    * @property {import("./wms.js").ServerType} [serverType] The type of
    * the remote WMS server: `mapserver`, `geoserver`, `carmentaserver`, or `qgis`.
    * Only needed if `hidpi` is `true`.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {string} [url] WMS service URL.
    * @property {Array<string>} [urls] WMS service urls.
    * Use this instead of `url` when the WMS supports multiple urls for GetMap requests.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * When set to `false`, only one world
    * will be rendered. When `true`, tiles will be requested for one world only,
    * but they will be wrapped horizontally to render multiple worlds.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    * @api
    */
  @JSImport("ol/source", "TileWMS")
  @js.native
  /**
    * @param {Options} [options] Tile WMS options.
    */
  open class TileWMS ()
    extends typings.ol.sourceTileWMSMod.default {
    def this(options: typings.ol.sourceTileWMSMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [preemptive=true]
    * If `true` the UTFGrid source loads the tiles based on their "visibility".
    * This improves the speed of response, but increases traffic.
    * Note that if set to `false` (lazy loading), you need to pass `true` as
    * `request` to the `forDataAtCoordinateAndResolution` method otherwise no
    * data will ever be loaded.
    * @property {boolean} [jsonp=false] Use JSONP with callback to load the TileJSON.
    * Useful when the server does not support CORS..
    * @property {import("./TileJSON.js").Config} [tileJSON] TileJSON configuration for this source.
    * If not provided, `url` must be configured.
    * @property {string} [url] TileJSON endpoint that provides the configuration for this source.
    * Request will be made through JSONP. If not provided, `tileJSON` must be configured.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for UTFGrid interaction data loaded from TileJSON format.
    * @api
    */
  @JSImport("ol/source", "UTFGrid")
  @js.native
  open class UTFGrid protected ()
    extends typings.ol.sourceUtfgridMod.default {
    /**
      * @param {Options} options Source options.
      */
    def this(options: typings.ol.sourceUtfgridMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Cache size.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {import("./Source.js").State} [state] State.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] TileGrid.
    * @property {import("../Tile.js").LoadFunction} tileLoadFunction TileLoadFunction.
    * @property {number} [tilePixelRatio] TilePixelRatio.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] TileUrlFunction.
    * @property {string} [url] Url.
    * @property {Array<string>} [urls] Urls.
    * @property {boolean} [wrapX=true] WrapX.
    * @property {number} [transition] Transition.
    * @property {string} [key] Key.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0] ZDirection.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Base class for sources providing tiles divided into a tile grid over http.
    *
    * @fires import("./Tile.js").TileSourceEvent
    */
  @JSImport("ol/source", "UrlTile")
  @js.native
  open class UrlTile protected ()
    extends typings.ol.sourceUrlTileMod.default {
    /**
      * @param {Options} options Image tile options.
      */
    def this(options: typings.ol.sourceUrlTileMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./VectorEventType").VectorSourceEventTypes, VectorSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     import("./VectorEventType").VectorSourceEventTypes, Return>} VectorSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {Array<import("../Feature.js").default<Geometry>>|Collection<import("../Feature.js").default<Geometry>>} [features]
    * Features. If provided as {@link module:ol/Collection~Collection}, the features in the source
    * and the collection will stay in sync.
    * @property {import("../format/Feature.js").default} [format] The feature format used by the XHR
    * feature loader when `url` is set. Required if `url` is set, otherwise ignored.
    * @property {import("../featureloader.js").FeatureLoader} [loader]
    * The loader function used to load features, from a remote source for example.
    * If this is not set and `url` is set, the source will create and use an XHR
    * feature loader. The `'featuresloadend'` and `'featuresloaderror'` events
    * will only fire if the `success` and `failure` callbacks are used.
    *
    * Example:
    *
    * ```js
    * import Vector from 'ol/source/Vector.js';
    * import GeoJSON from 'ol/format/GeoJSON.js';
    * import {bbox} from 'ol/loadingstrategy.js';
    *
    * const vectorSource = new Vector({
    *   format: new GeoJSON(),
    *   loader: function(extent, resolution, projection, success, failure) {
    *      const proj = projection.getCode();
    *      const url = 'https://ahocevar.com/geoserver/wfs?service=WFS&' +
    *          'version=1.1.0&request=GetFeature&typename=osm:water_areas&' +
    *          'outputFormat=application/json&srsname=' + proj + '&' +
    *          'bbox=' + extent.join(',') + ',' + proj;
    *      const xhr = new XMLHttpRequest();
    *      xhr.open('GET', url);
    *      const onError = function() {
    *        vectorSource.removeLoadedExtent(extent);
    *        failure();
    *      }
    *      xhr.onerror = onError;
    *      xhr.onload = function() {
    *        if (xhr.status == 200) {
    *          const features = vectorSource.getFormat().readFeatures(xhr.responseText);
    *          vectorSource.addFeatures(features);
    *          success(features);
    *        } else {
    *          onError();
    *        }
    *      }
    *      xhr.send();
    *    },
    *    strategy: bbox,
    *  });
    * ```
    * @property {boolean} [overlaps=true] This source may have overlapping geometries.
    * Setting this to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {LoadingStrategy} [strategy] The loading strategy to use.
    * By default an {@link module:ol/loadingstrategy.all}
    * strategy is used, a one-off strategy which loads all features at once.
    * @property {string|import("../featureloader.js").FeatureUrlFunction} [url]
    * Setting this option instructs the source to load features using an XHR loader
    * (see {@link module:ol/featureloader.xhr}). Use a `string` and an
    * {@link module:ol/loadingstrategy.all} for a one-off download of all features from
    * the given URL. Use a {@link module:ol/featureloader~FeatureUrlFunction} to generate the url with
    * other loading strategies.
    * Requires `format` to be set as well.
    * When default XHR feature loader is provided, the features will
    * be transformed from the data projection to the view projection
    * during parsing. If your remote data source does not advertise its projection
    * properly, this transformation will be incorrect. For some formats, the
    * default projection (usually EPSG:4326) can be overridden by setting the
    * dataProjection constructor option on the format.
    * Note that if a source contains non-feature data, such as a GeoJSON geometry
    * or a KML NetworkLink, these will be ignored. Use a custom loader to load these.
    * @property {boolean} [useSpatialIndex=true]
    * By default, an RTree is used as spatial index. When features are removed and
    * added frequently, and the total number of features is low, setting this to
    * `false` may improve performance.
    *
    * Note that
    * {@link module:ol/source/Vector~VectorSource#getFeaturesInExtent},
    * {@link module:ol/source/Vector~VectorSource#getClosestFeatureToCoordinate} and
    * {@link module:ol/source/Vector~VectorSource#getExtent} cannot be used when `useSpatialIndex` is
    * set to `false`, and {@link module:ol/source/Vector~VectorSource#forEachFeatureInExtent} will loop
    * through all features.
    *
    * When set to `false`, the features will be maintained in an
    * {@link module:ol/Collection~Collection}, which can be retrieved through
    * {@link module:ol/source/Vector~VectorSource#getFeaturesCollection}.
    * @property {boolean} [wrapX=true] Wrap the world horizontally. For vector editing across the
    * -180° and 180° meridians to work properly, this should be set to `false`. The
    * resulting geometry coordinates will then exceed the world bounds.
    * @template {import("../geom/Geometry.js").default} [Geometry=import("../geom/Geometry.js").default]
    */
  /**
    * @classdesc
    * Provides a source of features for vector layers. Vector features provided
    * by this source are suitable for editing. See {@link module:ol/source/VectorTile~VectorTile} for
    * vector data that is optimized for rendering.
    *
    * @fires VectorSourceEvent
    * @api
    * @template {import("../geom/Geometry.js").default} [Geometry=import("../geom/Geometry.js").default]
    */
  @JSImport("ol/source", "Vector")
  @js.native
  /**
    * @param {Options<Geometry>} [options] Vector source options.
    */
  open class Vector[Geometry /* <: typings.ol.geomGeometryMod.default */] ()
    extends typings.ol.sourceVectorMod.default[Geometry] {
    def this(options: typings.ol.sourceVectorMod.Options[Geometry]) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least twice the number of tiles in the viewport.
    * @property {import("../extent.js").Extent} [extent] Extent.
    * @property {import("../format/Feature.js").default} [format] Feature format for tiles. Used and required by the default.
    * @property {boolean} [overlaps=true] This source may have overlapping geometries. Setting this
    * to `false` (e.g. for sources with polygons that represent administrative
    * boundaries or TopoJSON sources) allows the renderer to optimise fill and
    * stroke operations.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection of the tile grid.
    * @property {import("./Source.js").State} [state] Source state.
    * @property {typeof import("../VectorTile.js").default} [tileClass] Class used to instantiate image tiles.
    * Default is {@link module:ol/VectorTile~VectorTile}.
    * @property {number} [maxZoom=22] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number|import("../size.js").Size} [tileSize=512] Optional tile size. Not used if `tileGrid` is provided.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction]
    * Optional function to load a tile given a URL. Could look like this for pbf tiles:
    * ```js
    * function(tile, url) {
    *   tile.setLoader(function(extent, resolution, projection) {
    *     fetch(url).then(function(response) {
    *       response.arrayBuffer().then(function(data) {
    *         const format = tile.getFormat() // ol/format/MVT configured as source format
    *         const features = format.readFeatures(data, {
    *           extent: extent,
    *           featureProjection: projection
    *         });
    *         tile.setFeatures(features);
    *       });
    *     });
    *   });
    * }
    * ```
    * If you do not need extent, resolution and projection to get the features for a tile (e.g.
    * for GeoJSON tiles), your `tileLoadFunction` does not need a `setLoader()` call. Only make sure
    * to call `setFeatures()` on the tile:
    * ```js
    * const format = new GeoJSON({featureProjection: map.getView().getProjection()});
    * async function tileLoadFunction(tile, url) {
    *   const response = await fetch(url);
    *   const data = await response.json();
    *   tile.setFeatures(format.readFeatures(data));
    * }
    * ```
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get tile URL given a tile coordinate and the projection.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`, and `{z}` placeholders.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {number} [transition] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * When set to `false`, only one world
    * will be rendered. When set to `true`, tiles will be wrapped horizontally to
    * render multiple worlds.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=1]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Class for layer sources providing vector data divided into a tile grid, to be
    * used with {@link module:ol/layer/VectorTile~VectorTileLayer}. Although this source receives tiles
    * with vector features from the server, it is not meant for feature editing.
    * Features are optimized for rendering, their geometries are clipped at or near
    * tile boundaries and simplified for a view resolution. See
    * {@link module:ol/source/Vector~VectorSource} for vector sources that are suitable for feature
    * editing.
    *
    * @fires import("./Tile.js").TileSourceEvent
    * @api
    */
  @JSImport("ol/source", "VectorTile")
  @js.native
  open class VectorTile protected ()
    extends typings.ol.sourceVectorTileMod.default {
    /**
      * @param {!Options} options Vector tile options.
      */
    def this(options: typings.ol.sourceVectorTileMod.Options) = this()
  }
  
  /**
    * Request encoding. One of 'KVP', 'REST'.
    * @typedef {'KVP' | 'REST'} RequestEncoding
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../tilegrid/WMTS.js").default} tileGrid Tile grid.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {RequestEncoding} [requestEncoding='KVP'] Request encoding.
    * @property {string} layer Layer name as advertised in the WMTS capabilities.
    * @property {string} style Style name as advertised in the WMTS capabilities.
    * @property {typeof import("../ImageTile.js").default} [tileClass]  Class used to instantiate image tiles. Default is {@link module:ol/ImageTile~ImageTile}.
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service.
    * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {string} [format='image/jpeg'] Image format. Only used when `requestEncoding` is `'KVP'`.
    * @property {string} [version='1.0.0'] WMTS version.
    * @property {string} matrixSet Matrix set.
    * @property {!Object} [dimensions] Additional "dimensions" for tile requests.
    * This is an object with properties named like the advertised WMTS dimensions.
    * @property {string} [url]  A URL for the service.
    * For the RESTful request encoding, this is a URL
    * template.  For KVP encoding, it is normal URL. A `{?-?}` template pattern,
    * for example `subdomain{a-f}.domain.com`, may be used instead of defining
    * each one separately in the `urls` option.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {Array<string>} [urls] An array of URLs.
    * Requests will be distributed among the URLs in this array.
    * @property {boolean} [wrapX=false] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data from WMTS servers.
    * @api
    */
  @JSImport("ol/source", "WMTS")
  @js.native
  open class WMTS protected ()
    extends typings.ol.sourceWmtsMod.default {
    /**
      * @param {Options} options WMTS options.
      */
    def this(options: typings.ol.sourceWmtsMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection.
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {number} [maxZoom=42] Optional max zoom level. Not used if `tileGrid` is provided.
    * @property {number} [minZoom=0] Optional min zoom level. Not used if `tileGrid` is provided.
    * @property {number} [maxResolution] Optional tile grid resolution at level zero. Not used if `tileGrid` is provided.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] Tile grid.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number} [tilePixelRatio=1] The pixel ratio used by the tile service.
    * For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px
    * by 512px images (for retina/hidpi devices) then `tilePixelRatio`
    * should be set to `2`.
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The tile size used by the tile service.
    * Not used if `tileGrid` is provided.
    * @property {number} [gutter=0] The size in pixels of the gutter around image tiles to ignore.
    * This allows artifacts of rendering at tile edges to be ignored.
    * Supported images should be wider and taller than the tile size by a value of `2 x gutter`.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] Optional function to get
    * tile URL given a tile coordinate and the projection.
    * Required if `url` or `urls` are not provided.
    * @property {string} [url] URL template. Must include `{x}`, `{y}` or `{-y}`,
    * and `{z}` placeholders. A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`,
    * may be used instead of defining each one separately in the `urls` option.
    * @property {Array<string>} [urls] An array of URL templates.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data with URLs in a set XYZ format that are
    * defined in a URL template. By default, this follows the widely-used
    * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
    * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
    * using the `{-y}` placeholder in the URL template, so long as the
    * source does not have a custom tile grid. In this case
    * a `tileUrlFunction` can be used, such as:
    * ```js
    *  tileUrlFunction: function(coordinate) {
    *    return 'http://mapserver.com/' + coordinate[0] + '/' +
    *      coordinate[1] + '/' + (-coordinate[2] - 1) + '.png';
    *  }
    * ```
    * @api
    */
  @JSImport("ol/source", "XYZ")
  @js.native
  /**
    * @param {Options} [options] XYZ options.
    */
  open class XYZ ()
    extends typings.ol.sourceXyzMod.default {
    def this(options: typings.ol.sourceXyzMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value  you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {number} [tilePixelRatio] The pixel ratio used by the tile service. For example, if the tile service advertizes 256px by 256px tiles but actually sends 512px by 512px images (for retina/hidpi devices) then `tilePixelRatio` should be set to `2`
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {string} url URL template or base URL of the Zoomify service.
    * A base URL is the fixed part
    * of the URL, excluding the tile group, z, x, and y folder structure, e.g.
    * `http://my.zoomify.info/IMAGE.TIF/`. A URL template must include
    * `{TileGroup}`, `{x}`, `{y}`, and `{z}` placeholders, e.g.
    * `http://my.zoomify.info/IMAGE.TIF/{TileGroup}/{z}-{x}-{y}.jpg`.
    * Internet Imaging Protocol (IIP) with JTL extension can be also used with
    * `{tileIndex}` and `{z}` placeholders, e.g.
    * `http://my.zoomify.info?FIF=IMAGE.TIF&JTL={z},{tileIndex}`.
    * A `{?-?}` template pattern, for example `subdomain{a-f}.domain.com`, may be
    * used instead of defining each one separately in the `urls` option.
    * @property {TierSizeCalculation} [tierSizeCalculation] Tier size calculation method: `default` or `truncated`.
    * @property {import("../size.js").Size} size Size.
    * @property {import("../extent.js").Extent} [extent] Extent for the TileGrid that is created.
    * Default sets the TileGrid in the
    * fourth quadrant, meaning extent is `[0, -height, width, 0]`. To change the
    * extent to the first quadrant (the default for OpenLayers 2) set the extent
    * as `[0, 0, width, height]`.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number} [tileSize=256] Tile size. Same tile size is used for all zoom levels.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format (both Zoomify and Internet
    * Imaging Protocol are supported).
    * @api
    */
  @JSImport("ol/source", "Zoomify")
  @js.native
  open class Zoomify protected ()
    extends typings.ol.sourceZoomifyMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: typings.ol.sourceZoomifyMod.Options) = this()
  }
  
  inline def sourcesFromTileGrid(
    tileGrid: typings.ol.tilegridTileGridMod.default,
    factory: js.Function1[/* arg0 */ TileCoord, typings.ol.sourceSourceMod.default]
  ): js.Function2[/* arg0 */ Extent, /* arg1 */ Double, js.Array[typings.ol.sourceSourceMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sourcesFromTileGrid")(tileGrid.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg0 */ Extent, /* arg1 */ Double, js.Array[typings.ol.sourceSourceMod.default]]]
}
