package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.eventsNs.Event
import typings.openlayers.openlayersMod.olxNs.FrameState
import typings.openlayers.openlayersMod.olxNs.LogoOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.BingMapsOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.CartoDBOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ClusterOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ImageArcGISRestOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ImageCanvasOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ImageMapGuideOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ImageStaticOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ImageVectorOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ImageWMSOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.OSMOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.RasterOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.StamenOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.TileArcGISRestOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.TileDebugOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.TileImageOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.TileJSONOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.TileUTFGridOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.TileWMSOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.VectorOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.VectorTileOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.WMTSOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.XYZOptions
import typings.openlayers.openlayersMod.olxNs.sourceNs.ZoomifyOptions
import typings.openlayers.openlayersMod.projNs.Projection
import typings.openlayers.openlayersMod.sourceNs.ImageCanvas
import typings.openlayers.openlayersMod.sourceNs.Source
import typings.openlayers.openlayersMod.sourceNs.State
import typings.openlayers.openlayersMod.sourceNs.TileImage
import typings.openlayers.openlayersMod.sourceNs.TileJSON
import typings.openlayers.openlayersMod.sourceNs.UrlTile
import typings.openlayers.openlayersMod.sourceNs.Vector
import typings.openlayers.openlayersMod.sourceNs.WMTSRequestEncoding
import typings.openlayers.openlayersMod.sourceNs.XYZ
import typings.openlayers.openlayersMod.styleNs.Style
import typings.openlayers.openlayersMod.tilegridNs.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "source")
@js.native
object sourceNs extends js.Object {
  /**
    * @classdesc
    * Layer source for Bing Maps tile data.
    *
    * @param options Bing Maps options.
    * @api stable
    */
  @js.native
  class BingMaps protected () extends TileImage {
    /**
      * @classdesc
      * Layer source for Bing Maps tile data.
      *
      * @param options Bing Maps options.
      * @api stable
      */
    def this(options: BingMapsOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for the CartoDB tiles.
    *
    * @param options CartoDB options.
    * @api
    */
  @js.native
  class CartoDB protected () extends XYZ {
    /**
      * @classdesc
      * Layer source for the CartoDB tiles.
      *
      * @param options CartoDB options.
      * @api
      */
    def this(options: CartoDBOptions) = this()
    /**
      * Returns the current config.
      * @return The current configuration.
      * @api
      */
    def getConfig(): GlobalObject = js.native
    /**
      * Sets the CartoDB config
      * @param config In the case of anonymous maps, a CartoDB configuration
      *     object.
      * If using named maps, a key-value lookup with the template parameters.
      * @api
      */
    def setConfig(config: GlobalObject): Unit = js.native
    /**
      * Updates the carto db config.
      * @param config a key-value lookup. Values will replace current values
      *     in the config.
      * @api
      */
    def updateConfig(config: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * Layer source to cluster vector data. Works out of the box with point
    * geometries. For other geometry types, or if not all geometries should be
    * considered for clustering, a custom `geometryFunction` can be defined.
    *
    * @param options Constructor options.
    * @api
    */
  @js.native
  class Cluster protected () extends Vector {
    /**
      * @classdesc
      * Layer source to cluster vector data. Works out of the box with point
      * geometries. For other geometry types, or if not all geometries should be
      * considered for clustering, a custom `geometryFunction` can be defined.
      *
      * @param options Constructor options.
      * @api
      */
    def this(options: ClusterOptions) = this()
    /**
      * Get the distance in pixels between clusters.
      * @return The distance in pixels.
      * @api
      */
    def getDistance(): Double = js.native
    /**
      * Get a reference to the wrapped source.
      * @return Source.
      * @api
      */
    def getSource(): Vector = js.native
    /**
      * Set the distance in pixels between clusters.
      * @param distance The distance in pixels.
      * @api
      */
    def setDistance(distance: Double): Unit = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing a single image.
    *
    * @param options Single image source options.
    * @api
    */
  @js.native
  class Image protected () extends Source {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for sources providing a single image.
      *
      * @param options Single image source options.
      * @api
      */
    def this(options: SourceImageOptions) = this()
  }
  
  /**
    * @classdesc
    * Source for data from ArcGIS Rest services providing single, untiled images.
    * Useful when underlying map service has labels.
    *
    * If underlying map service is not using labels,
    * take advantage of ol image caching and use
    * {@link ol.source.TileArcGISRest} data source.
    *
    * @fires ol.source.ImageEvent
    * @param opt_options Image ArcGIS Rest Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Source for data from ArcGIS Rest services providing single, untiled images.
    * Useful when underlying map service has labels.
    *
    * If underlying map service is not using labels,
    * take advantage of ol image caching and use
    * {@link ol.source.TileArcGISRest} data source.
    *
    * @fires ol.source.ImageEvent
    * @param opt_options Image ArcGIS Rest Options.
    * @api
    */
  class ImageArcGISRest ()
    extends typings.openlayers.openlayersMod.sourceNs.Image {
    def this(opt_options: ImageArcGISRestOptions) = this()
    /**
      * Return the image load function of the source.
      * @return The image load function.
      * @api
      */
    def getImageLoadFunction(): ImageLoadFunctionType = js.native
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return Params.
      * @api stable
      */
    def getParams(): GlobalObject = js.native
    /**
      * Return the URL used for this ArcGIS source.
      * @return URL.
      * @api stable
      */
    def getUrl(): String = js.native
    /**
      * Set the image load function of the source.
      * @param imageLoadFunction Image load function.
      * @api
      */
    def setImageLoadFunction(imageLoadFunction: ImageLoadFunctionType): Unit = js.native
    /**
      * Set the URL to use for requests.
      * @param url URL.
      * @api stable
      */
    def setUrl(url: String): Unit = js.native
    /**
      * Update the user-provided params.
      * @param params Params.
      * @api stable
      */
    def updateParams(params: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    *
    * @param options Constructor options.
    * @api
    */
  @js.native
  class ImageCanvas protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Image {
    /**
      * @classdesc
      * Base class for image sources where a canvas element is the image.
      *
      * @param options Constructor options.
      * @api
      */
    def this(options: ImageCanvasOptions) = this()
  }
  
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Image} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param image The image.
    */
  @js.native
  class ImageEvent protected () extends Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Image} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param image The image.
      */
    def this(`type`: String, image: typings.openlayers.openlayersMod.Image) = this()
    /**
      * The image related to the event.
      * @api
      */
    var image: typings.openlayers.openlayersMod.Image = js.native
  }
  
  /**
    * @classdesc
    * Source for images from Mapguide servers
    *
    * @fires ol.source.ImageEvent
    * @param options Options.
    * @api stable
    */
  @js.native
  class ImageMapGuide protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Image {
    /**
      * @classdesc
      * Source for images from Mapguide servers
      *
      * @fires ol.source.ImageEvent
      * @param options Options.
      * @api stable
      */
    def this(options: ImageMapGuideOptions) = this()
    /**
      * Return the image load function of the source.
      * @return The image load function.
      * @api
      */
    def getImageLoadFunction(): ImageLoadFunctionType = js.native
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return Params.
      * @api stable
      */
    def getParams(): GlobalObject = js.native
    /**
      * Set the image load function of the MapGuide source.
      * @param imageLoadFunction Image load function.
      * @api
      */
    def setImageLoadFunction(imageLoadFunction: ImageLoadFunctionType): Unit = js.native
    /**
      * Update the user-provided params.
      * @param params Params.
      * @api stable
      */
    def updateParams(params: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * A layer source for displaying a single, static image.
    *
    * @param options Options.
    * @api stable
    */
  @js.native
  class ImageStatic protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Image {
    /**
      * @classdesc
      * A layer source for displaying a single, static image.
      *
      * @param options Options.
      * @api stable
      */
    def this(options: ImageStaticOptions) = this()
  }
  
  /**
    * @classdesc
    * An image source whose images are canvas elements into which vector features
    * read from a vector source (`ol.source.Vector`) are drawn. An
    * `ol.source.ImageVector` object is to be used as the `source` of an image
    * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
    * as opposed to being re-rendered, during animations and interactions. So, like
    * any other image layer, an image layer configured with an
    * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
    * vector layer, where vector features are re-drawn during animations and
    * interactions.
    *
    * @param options Options.
    * @api
    */
  @js.native
  class ImageVector protected () extends ImageCanvas {
    /**
      * @classdesc
      * An image source whose images are canvas elements into which vector features
      * read from a vector source (`ol.source.Vector`) are drawn. An
      * `ol.source.ImageVector` object is to be used as the `source` of an image
      * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
      * as opposed to being re-rendered, during animations and interactions. So, like
      * any other image layer, an image layer configured with an
      * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
      * vector layer, where vector features are re-drawn during animations and
      * interactions.
      *
      * @param options Options.
      * @api
      */
    def this(options: ImageVectorOptions) = this()
    /**
      * Get a reference to the wrapped source.
      * @return Source.
      * @api
      */
    def getSource(): Vector = js.native
    /**
      * Get the style for features.  This returns whatever was passed to the `style`
      * option at construction or to the `setStyle` method.
      * @return Layer style.
      * @api stable
      */
    def getStyle(): Style | js.Array[Style] | StyleFunction = js.native
    /**
      * Get the style function.
      * @return Layer style function.
      * @api stable
      */
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    def setStyle(): Unit = js.native
    def setStyle(style: js.Array[Style]): Unit = js.native
    def setStyle(style: StyleFunction): Unit = js.native
    /**
      * Set the style for features.  This can be a single style object, an array
      * of styles, or a function that takes a feature and resolution and returns
      * an array of styles. If it is `undefined` the default style is used. If
      * it is `null` the layer has no style (a `null` style), so only features
      * that have their own styles will be rendered in the layer. See
      * {@link ol.style} for information on the default style.
      * @param style Layer style.
      * @api stable
      */
    def setStyle(style: Style): Unit = js.native
  }
  
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires ol.source.ImageEvent
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires ol.source.ImageEvent
    * @param opt_options Options.
    * @api stable
    */
  class ImageWMS ()
    extends typings.openlayers.openlayersMod.sourceNs.Image {
    def this(opt_options: ImageWMSOptions) = this()
    /**
      * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
      * projection. Return `undefined` if the GetFeatureInfo URL cannot be
      * constructed.
      * @param coordinate Coordinate.
      * @param resolution Resolution.
      * @param projection Projection.
      * @param params GetFeatureInfo params. `INFO_FORMAT` at least should
      *     be provided. If `QUERY_LAYERS` is not provided then the layers specified
      *     in the `LAYERS` parameter will be used. `VERSION` should not be
      *     specified here.
      * @return GetFeatureInfo URL.
      * @api stable
      */
    def getGetFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: GlobalObject): String = js.native
    /**
      * Return the image load function of the source.
      * @return The image load function.
      * @api
      */
    def getImageLoadFunction(): ImageLoadFunctionType = js.native
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return Params.
      * @api stable
      */
    def getParams(): GlobalObject = js.native
    /**
      * Return the URL used for this WMS source.
      * @return URL.
      * @api stable
      */
    def getUrl(): String = js.native
    /**
      * Set the image load function of the source.
      * @param imageLoadFunction Image load function.
      * @api
      */
    def setImageLoadFunction(imageLoadFunction: ImageLoadFunctionType): Unit = js.native
    /**
      * Set the URL to use for requests.
      * @param url URL.
      * @api stable
      */
    def setUrl(url: String): Unit = js.native
    /**
      * Update the user-provided params.
      * @param params Params.
      * @api stable
      */
    def updateParams(params: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * Layer source for the OpenStreetMap tile server.
    *
    * @param opt_options Open Street Map options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Layer source for the OpenStreetMap tile server.
    *
    * @param opt_options Open Street Map options.
    * @api stable
    */
  class OSM () extends XYZ {
    def this(opt_options: OSMOptions) = this()
  }
  
  /**
    * @classdesc
    * A source that transforms data from any number of input sources using an array
    * of {@link ol.RasterOperation} functions to transform input pixel values into
    * output pixel values.
    *
    * @fires ol.source.RasterEvent
    * @param options Options.
    * @api
    */
  @js.native
  class Raster protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Image {
    /**
      * @classdesc
      * A source that transforms data from any number of input sources using an array
      * of {@link ol.RasterOperation} functions to transform input pixel values into
      * output pixel values.
      *
      * @fires ol.source.RasterEvent
      * @param options Options.
      * @api
      */
    def this(options: RasterOptions) = this()
    /**
      * Set the operation.
      * @param operation New operation.
      * @param opt_lib Functions that will be available to operations run
      *     in a worker.
      * @api
      */
    def setOperation(operation: RasterOperation): Unit = js.native
    def setOperation(operation: RasterOperation, opt_lib: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Raster} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param frameState The frame state.
    * @param data An object made available to operations.
    */
  @js.native
  class RasterEvent protected () extends Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Raster} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param frameState The frame state.
      * @param data An object made available to operations.
      */
    def this(`type`: String, frameState: FrameState, data: GlobalObject) = this()
    /**
      * An object made available to all operations.  This can be used by operations
      * as a storage object (e.g. for calculating statistics).
      * @api
      */
    var data: GlobalObject = js.native
    /**
      * The raster extent.
      * @api
      */
    var extent: Extent = js.native
    /**
      * The pixel resolution (map units per pixel).
      * @api
      */
    var resolution: Double = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for {@link ol.layer.Layer} sources.
    *
    * A generic `change` event is triggered when the state of the source changes.
    *
    * @param options Source options.
    * @api stable
    */
  @js.native
  class Source protected () extends Object {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for {@link ol.layer.Layer} sources.
      *
      * A generic `change` event is triggered when the state of the source changes.
      *
      * @param options Source options.
      * @api stable
      */
    def this(options: SourceSourceOptions) = this()
    /**
      * Get the attributions of the source.
      * @return Attributions.
      * @api stable
      */
    def getAttributions(): js.Array[Attribution] = js.native
    /**
      * Get the logo of the source.
      * @return Logo.
      * @api stable
      */
    def getLogo(): String | LogoOptions = js.native
    /**
      * Get the projection of the source.
      * @return Projection.
      * @api
      */
    def getProjection(): Projection = js.native
    /**
      * Get the state of the source, see {@link ol.source.State} for possible states.
      * @return State.
      * @api
      */
    def getState(): State = js.native
    /**
      * Refreshes the source and finally dispatches a 'change' event.
      * @api
      */
    def refresh(): Unit = js.native
    /**
      * Set the attributions of the source.
      * @param attributions Attributions.
      *     Can be passed as `string`, `Array<string>`, `{@link ol.Attribution}`,
      *     `Array<{@link ol.Attribution}>` or `undefined`.
      * @api
      */
    def setAttributions(attributions: AttributionLike): Unit = js.native
  }
  
  /**
    * @classdesc
    * Layer source for the Stamen tile server.
    *
    * @param options Stamen options.
    * @api stable
    */
  @js.native
  class Stamen protected () extends XYZ {
    /**
      * @classdesc
      * Layer source for the Stamen tile server.
      *
      * @param options Stamen options.
      * @api stable
      */
    def this(options: StamenOptions) = this()
  }
  
  /**
    * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.undefined
    - typings.openlayers.openlayersStrings.loading
    - typings.openlayers.openlayersStrings.ready
    - typings.openlayers.openlayersStrings.error
  */
  trait State extends js.Object
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing images divided into a tile grid.
    *
    * @param options Tile source options.
    * @api
    */
  @js.native
  class Tile protected () extends Source {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for sources providing images divided into a tile grid.
      *
      * @param options Tile source options.
      * @api
      */
    def this(options: SourceTileOptions) = this()
    /**
      * Return the tile grid of the tile source.
      * @return Tile grid.
      * @api stable
      */
    def getTileGrid(): TileGrid = js.native
  }
  
  /**
    * @classdesc
    * Layer source for tile data from ArcGIS Rest services. Map and Image
    * Services are supported.
    *
    * For cached ArcGIS services, better performance is available using the
    * {@link ol.source.XYZ} data source.
    *
    * @param opt_options Tile ArcGIS Rest
    *     options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Layer source for tile data from ArcGIS Rest services. Map and Image
    * Services are supported.
    *
    * For cached ArcGIS services, better performance is available using the
    * {@link ol.source.XYZ} data source.
    *
    * @param opt_options Tile ArcGIS Rest
    *     options.
    * @api
    */
  class TileArcGISRest () extends TileImage {
    def this(opt_options: TileArcGISRestOptions) = this()
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return Params.
      * @api
      */
    def getParams(): GlobalObject = js.native
    /**
      * Update the user-provided params.
      * @param params Params.
      * @api stable
      */
    def updateParams(params: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * A pseudo tile source, which does not fetch tiles from a server, but renders
    * a grid outline for the tile grid/projection along with the coordinates for
    * each tile. See examples/canvas-tiles for an example.
    *
    * Uses Canvas context2d, so requires Canvas support.
    *
    * @param options Debug tile options.
    * @api
    */
  @js.native
  class TileDebug protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Tile {
    /**
      * @classdesc
      * A pseudo tile source, which does not fetch tiles from a server, but renders
      * a grid outline for the tile grid/projection along with the coordinates for
      * each tile. See examples/canvas-tiles for an example.
      *
      * Uses Canvas context2d, so requires Canvas support.
      *
      * @param options Debug tile options.
      * @api
      */
    def this(options: TileDebugOptions) = this()
  }
  
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Tile} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param tile The tile.
    */
  @js.native
  class TileEvent protected () extends Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Tile} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param tile The tile.
      */
    def this(`type`: String, tile: typings.openlayers.openlayersMod.Tile) = this()
    /**
      * The tile related to the event.
      * @api
      */
    var tile: typings.openlayers.openlayersMod.Tile = js.native
  }
  
  /**
    * @classdesc
    * Base class for sources providing images divided into a tile grid.
    *
    * @fires ol.source.TileEvent
    * @param options Image tile options.
    * @api
    */
  @js.native
  class TileImage protected () extends UrlTile {
    /**
      * @classdesc
      * Base class for sources providing images divided into a tile grid.
      *
      * @fires ol.source.TileEvent
      * @param options Image tile options.
      * @api
      */
    def this(options: TileImageOptions) = this()
    /**
      * Sets whether to render reprojection edges or not (usually for debugging).
      * @param render Render the edges.
      * @api
      */
    def setRenderReprojectionEdges(render: Boolean): Unit = js.native
    /**
      * Sets the tile grid to use when reprojecting the tiles to the given
      * projection instead of the default tile grid for the projection.
      *
      * This can be useful when the default tile grid cannot be created
      * (e.g. projection has no extent defined) or
      * for optimization reasons (custom tile size, resolutions, ...).
      *
      * @param projection Projection.
      * @param tilegrid Tile grid to use for the projection.
      * @api
      */
    def setTileGridForProjection(projection: ProjectionLike, tilegrid: TileGrid): Unit = js.native
  }
  
  /**
    * @classdesc
    * Layer source for tile data in TileJSON format.
    *
    * @param options TileJSON options.
    * @api stable
    */
  @js.native
  class TileJSON protected () extends TileImage {
    /**
      * @classdesc
      * Layer source for tile data in TileJSON format.
      *
      * @param options TileJSON options.
      * @api stable
      */
    def this(options: TileJSONOptions) = this()
    /**
      * @return The tilejson object.
      * @api
      */
    def getTileJSON(): TileJSON = js.native
  }
  
  /**
    * @classdesc
    * Layer source for UTFGrid interaction data loaded from TileJSON format.
    *
    * @param options Source options.
    * @api
    */
  @js.native
  class TileUTFGrid protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Tile {
    /**
      * @classdesc
      * Layer source for UTFGrid interaction data loaded from TileJSON format.
      *
      * @param options Source options.
      * @api
      */
    def this(options: TileUTFGridOptions) = this()
    /**
      * Calls the callback (synchronously by default) with the available data
      * for given coordinate and resolution (or `null` if not yet loaded or
      * in case of an error).
      * @param coordinate Coordinate.
      * @param resolution Resolution.
      * @param callback Callback.
      * @param opt_this The object to use as `this` in the callback.
      * @param opt_request If `true` the callback is always async.
      *                               The tile data is requested if not yet loaded.
      * @template T
      * @api
      */
    def forDataAtCoordinateAndResolution(coordinate: Coordinate, resolution: Double, callback: js.Function1[/* d */ js.Any, _]): Unit = js.native
    def forDataAtCoordinateAndResolution(
      coordinate: Coordinate,
      resolution: Double,
      callback: js.Function1[/* d */ js.Any, _],
      opt_this: js.Any
    ): Unit = js.native
    def forDataAtCoordinateAndResolution(
      coordinate: Coordinate,
      resolution: Double,
      callback: js.Function1[/* d */ js.Any, _],
      opt_this: js.Any,
      opt_request: Boolean
    ): Unit = js.native
    /**
      * Return the template from TileJSON.
      * @return The template from TileJSON.
      * @api
      */
    def getTemplate(): String = js.native
  }
  
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    *
    * @param opt_options Tile WMS options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    *
    * @param opt_options Tile WMS options.
    * @api stable
    */
  class TileWMS () extends TileImage {
    def this(opt_options: TileWMSOptions) = this()
    /**
      * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
      * projection. Return `undefined` if the GetFeatureInfo URL cannot be
      * constructed.
      * @param coordinate Coordinate.
      * @param resolution Resolution.
      * @param projection Projection.
      * @param params GetFeatureInfo params. `INFO_FORMAT` at least should
      *     be provided. If `QUERY_LAYERS` is not provided then the layers specified
      *     in the `LAYERS` parameter will be used. `VERSION` should not be
      *     specified here.
      * @return GetFeatureInfo URL.
      * @api stable
      */
    def getGetFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: GlobalObject): String = js.native
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      * @return Params.
      * @api stable
      */
    def getParams(): GlobalObject = js.native
    /**
      * Update the user-provided params.
      * @param params Params.
      * @api stable
      */
    def updateParams(params: GlobalObject): Unit = js.native
  }
  
  /**
    * @classdesc
    * Base class for sources providing tiles divided into a tile grid over http.
    *
    * @fires ol.source.TileEvent
    * @param options Image tile options.
    */
  @js.native
  class UrlTile protected ()
    extends typings.openlayers.openlayersMod.sourceNs.Tile {
    /**
      * @classdesc
      * Base class for sources providing tiles divided into a tile grid over http.
      *
      * @fires ol.source.TileEvent
      * @param options Image tile options.
      */
    def this(options: SourceUrlTileOptions) = this()
    /**
      * Return the tile load function of the source.
      * @return TileLoadFunction
      * @api
      */
    def getTileLoadFunction(): TileLoadFunctionType = js.native
    /**
      * Return the tile URL function of the source.
      * @return TileUrlFunction
      * @api
      */
    def getTileUrlFunction(): TileUrlFunctionType = js.native
    /**
      * Return the URLs used for this source.
      * When a tileUrlFunction is used instead of url or urls,
      * null will be returned.
      * @return URLs.
      * @api
      */
    def getUrls(): js.Array[String] = js.native
    /**
      * Set the tile load function of the source.
      * @param tileLoadFunction Tile load function.
      * @api
      */
    def setTileLoadFunction(tileLoadFunction: TileLoadFunctionType): Unit = js.native
    /**
      * Set the tile URL function of the source.
      * @param tileUrlFunction Tile URL function.
      * @param opt_key Optional new tile key for the source.
      * @api
      */
    def setTileUrlFunction(tileUrlFunction: TileUrlFunctionType): Unit = js.native
    def setTileUrlFunction(tileUrlFunction: TileUrlFunctionType, opt_key: String): Unit = js.native
    /**
      * Set the URL to use for requests.
      * @param url URL.
      * @api stable
      */
    def setUrl(url: String): Unit = js.native
    /**
      * Set the URLs to use for requests.
      * @param urls URLs.
      * @api stable
      */
    def setUrls(urls: js.Array[String]): Unit = js.native
  }
  
  /**
    * @classdesc
    * Provides a source of features for vector layers. Vector features provided
    * by this source are suitable for editing. See {@link ol.source.VectorTile} for
    * vector data that is optimized for rendering.
    *
    * @fires ol.source.VectorEvent
    * @param opt_options Vector source options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Provides a source of features for vector layers. Vector features provided
    * by this source are suitable for editing. See {@link ol.source.VectorTile} for
    * vector data that is optimized for rendering.
    *
    * @fires ol.source.VectorEvent
    * @param opt_options Vector source options.
    * @api stable
    */
  class Vector () extends Source {
    def this(opt_options: VectorOptions) = this()
    /**
      * Add a single feature to the source.  If you want to add a batch of features
      * at once, call {@link ol.source.Vector#addFeatures source.addFeatures()}
      * instead.
      * @param feature Feature to add.
      * @api stable
      */
    def addFeature(feature: Feature): Unit = js.native
    /**
      * Add a batch of features to the source.
      * @param features Features to add.
      * @api stable
      */
    def addFeatures(features: js.Array[Feature]): Unit = js.native
    /**
      * Remove all features from the source.
      * @param events.
      * @api stable
      */
    def clear(): Unit = js.native
    def clear(opt_fast: Boolean): Unit = js.native
    /**
      * Iterate through all features on the source, calling the provided callback
      * with each one.  If the callback returns any "truthy" value, iteration will
      * stop and the function will return the same value.
      *
      * @param callback Called with each feature
      *     on the source.  Return a truthy value to stop iteration.
      * @param opt_this The object to use as `this` in the callback.
      * @return The return value from the last call to the callback.
      * @template T,S
      * @api stable
      */
    def forEachFeature[S](callback: js.Function1[/* feature */ Feature, S]): S = js.native
    def forEachFeature[S](callback: js.Function1[/* feature */ Feature, S], opt_this: js.Any): S = js.native
    /**
      * Iterate through all features whose bounding box intersects the provided
      * extent (note that the feature's geometry may not intersect the extent),
      * calling the callback with each feature.  If the callback returns a "truthy"
      * value, iteration will stop and the function will return the same value.
      *
      * If you are interested in features whose geometry intersects an extent, call
      * the {@link ol.source.Vector#forEachFeatureIntersectingExtent
      * source.forEachFeatureIntersectingExtent()} method instead.
      *
      * When `useSpatialIndex` is set to false, this method will loop through all
      * features, equivalent to {@link ol.source.Vector#forEachFeature}.
      *
      * @param extent Extent.
      * @param callback Called with each feature
      *     whose bounding box intersects the provided extent.
      * @param opt_this The object to use as `this` in the callback.
      * @return The return value from the last call to the callback.
      * @template T,S
      * @api
      */
    def forEachFeatureInExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S]): S = js.native
    def forEachFeatureInExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S], opt_this: js.Any): S = js.native
    /**
      * Iterate through all features whose geometry intersects the provided extent,
      * calling the callback with each feature.  If the callback returns a "truthy"
      * value, iteration will stop and the function will return the same value.
      *
      * If you only want to test for bounding box intersection, call the
      * {@link ol.source.Vector#forEachFeatureInExtent
      * source.forEachFeatureInExtent()} method instead.
      *
      * @param extent Extent.
      * @param callback Called with each feature
      *     whose geometry intersects the provided extent.
      * @param opt_this The object to use as `this` in the callback.
      * @return The return value from the last call to the callback.
      * @template T,S
      * @api
      */
    def forEachFeatureIntersectingExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S]): S = js.native
    def forEachFeatureIntersectingExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S], opt_this: js.Any): S = js.native
    /**
      * Get the closest feature to the provided coordinate.
      *
      * This method is not available when the source is configured with
      * `useSpatialIndex` set to `false`.
      * @param coordinate Coordinate.
      * @param opt_filter Feature filter function.
      *     The filter function will receive one argument, the {@link ol.Feature feature}
      *     and it should return a boolean value. By default, no filtering is made.
      * @return Closest feature.
      * @api stable
      */
    def getClosestFeatureToCoordinate(coordinate: Coordinate): Feature = js.native
    def getClosestFeatureToCoordinate(coordinate: Coordinate, opt_filter: js.Function1[/* feature */ Feature, Boolean]): Feature = js.native
    /**
      * Get the extent of the features currently in the source.
      *
      * This method is not available when the source is configured with
      * `useSpatialIndex` set to `false`.
      * @return Extent.
      * @api stable
      */
    def getExtent(): Extent = js.native
    /**
      * Get a feature by its identifier (the value returned by feature.getId()).
      * Note that the index treats string and numeric identifiers as the same.  So
      * `source.getFeatureById(2)` will return a feature with id `'2'` or `2`.
      *
      * @param id Feature identifier.
      * @return The feature (or `null` if not found).
      * @api stable
      */
    def getFeatureById(id: String): Feature = js.native
    def getFeatureById(id: Double): Feature = js.native
    /**
      * Get all features on the source.
      * @return Features.
      * @api stable
      */
    def getFeatures(): js.Array[Feature] = js.native
    /**
      * Get all features whose geometry intersects the provided coordinate.
      * @param coordinate Coordinate.
      * @return Features.
      * @api stable
      */
    def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[Feature] = js.native
    /**
      * Get the features collection associated with this source. Will be `null`
      * unless the source was configured with `useSpatialIndex` set to `false`, or
      * with an {@link ol.Collection} as `features`.
      * @return The collection of features.
      * @api
      */
    def getFeaturesCollection(): Collection[Feature] = js.native
    /**
      * Get all features in the provided extent.  Note that this returns all features
      * whose bounding boxes intersect the given extent (so it may include features
      * whose geometries do not intersect the extent).
      *
      * This method is not available when the source is configured with
      * `useSpatialIndex` set to `false`.
      * @param extent Extent.
      * @return Features.
      * @api
      */
    def getFeaturesInExtent(extent: Extent): js.Array[Feature] = js.native
    /**
      * Get the format associated with this source.
      *
      * @return The feature format.
      * @api
      */
    def getFormat(): typings.openlayers.openlayersMod.formatNs.Feature = js.native
    /**
      * Get the url associated with this source.
      *
      * @return The url.
      * @api
      */
    def getUrl(): String | FeatureUrlFunction = js.native
    /**
      * Remove a single feature from the source.  If you want to remove all features
      * at once, use the {@link ol.source.Vector#clear source.clear()} method
      * instead.
      * @param feature Feature to remove.
      * @api stable
      */
    def removeFeature(feature: Feature): Unit = js.native
  }
  
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Vector} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param opt_feature Feature.
    */
  @js.native
  class VectorEvent protected () extends Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Vector} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_feature Feature.
      */
    def this(`type`: String) = this()
    def this(`type`: String, opt_feature: Feature) = this()
    /**
      * The feature being added or removed.
      * @api stable
      */
    var feature: Feature = js.native
  }
  
  /**
    * @classdesc
    * Class for layer sources providing vector data divided into a tile grid, to be
    * used with {@link ol.layer.VectorTile}. Although this source receives tiles
    * with vector features from the server, it is not meant for feature editing.
    * Features are optimized for rendering, their geometries are clipped at or near
    * tile boundaries and simplified for a view resolution. See
    * {@link ol.source.Vector} for vector sources that are suitable for feature
    * editing.
    *
    * @fires ol.source.TileEvent
    * @param options Vector tile options.
    * @api
    */
  @js.native
  class VectorTile protected () extends UrlTile {
    /**
      * @classdesc
      * Class for layer sources providing vector data divided into a tile grid, to be
      * used with {@link ol.layer.VectorTile}. Although this source receives tiles
      * with vector features from the server, it is not meant for feature editing.
      * Features are optimized for rendering, their geometries are clipped at or near
      * tile boundaries and simplified for a view resolution. See
      * {@link ol.source.Vector} for vector sources that are suitable for feature
      * editing.
      *
      * @fires ol.source.TileEvent
      * @param options Vector tile options.
      * @api
      */
    def this(options: VectorTileOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for tile data from WMTS servers.
    *
    * @param options WMTS options.
    * @api stable
    */
  @js.native
  class WMTS protected () extends TileImage {
    /**
      * @classdesc
      * Layer source for tile data from WMTS servers.
      *
      * @param options WMTS options.
      * @api stable
      */
    def this(options: WMTSOptions) = this()
    /**
      * Get the dimensions, i.e. those passed to the constructor through the
      * "dimensions" option, and possibly updated using the updateDimensions
      * method.
      * @return Dimensions.
      * @api
      */
    def getDimensions(): GlobalObject = js.native
    /**
      * Return the image format of the WMTS source.
      * @return Format.
      * @api
      */
    def getFormat(): String = js.native
    /**
      * Return the layer of the WMTS source.
      * @return Layer.
      * @api
      */
    def getLayer(): String = js.native
    /**
      * Return the matrix set of the WMTS source.
      * @return MatrixSet.
      * @api
      */
    def getMatrixSet(): String = js.native
    /**
      * Return the request encoding, either "KVP" or "REST".
      * @return Request encoding.
      * @api
      */
    def getRequestEncoding(): WMTSRequestEncoding = js.native
    /**
      * Return the style of the WMTS source.
      * @return Style.
      * @api
      */
    def getStyle(): String = js.native
    /**
      * Return the version of the WMTS source.
      * @return Version.
      * @api
      */
    def getVersion(): String = js.native
    /**
      * Update the dimensions.
      * @param dimensions Dimensions.
      * @api
      */
    def updateDimensions(dimensions: GlobalObject): Unit = js.native
  }
  
  /**
    * Request encoding. One of 'KVP', 'REST'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.KVP
    - typings.openlayers.openlayersStrings.REST
  */
  trait WMTSRequestEncoding extends js.Object
  
  /**
    * @classdesc
    * Layer source for tile data with URLs in a set XYZ format that are
    * defined in a URL template. By default, this follows the widely-used
    * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
    * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
    * using the `{-y}` placeholder in the URL template, so long as the
    * source does not have a custom tile grid. In this case,
    * {@link ol.source.TileImage} can be used with a `tileUrlFunction`
    * such as:
    *
    *  tileUrlFunction: function(coordinate) {
    *    return 'http://mapserver.com/' + coordinate[0] + '/' +
    *        coordinate[1] + '/' + coordinate[2] + '.png';
    *    }
    *
    *
    * @param opt_options XYZ options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Layer source for tile data with URLs in a set XYZ format that are
    * defined in a URL template. By default, this follows the widely-used
    * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
    * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
    * using the `{-y}` placeholder in the URL template, so long as the
    * source does not have a custom tile grid. In this case,
    * {@link ol.source.TileImage} can be used with a `tileUrlFunction`
    * such as:
    *
    *  tileUrlFunction: function(coordinate) {
    *    return 'http://mapserver.com/' + coordinate[0] + '/' +
    *        coordinate[1] + '/' + coordinate[2] + '.png';
    *    }
    *
    *
    * @param opt_options XYZ options.
    * @api stable
    */
  class XYZ () extends TileImage {
    def this(opt_options: XYZOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format.
    *
    * @param opt_options Options.
    * @api stable
    */
  class Zoomify () extends TileImage {
    def this(opt_options: ZoomifyOptions) = this()
  }
  
  /* static members */
  @js.native
  object BingMaps extends js.Object {
    /**
      * The attribution containing a link to the Microsoft® Bing™ Maps Platform APIs’
      * Terms Of Use.
      * @const
      * @api
      */
    var TOS_ATTRIBUTION: Attribution = js.native
  }
  
  /* static members */
  @js.native
  object OSM extends js.Object {
    /**
      * The attribution containing a link to the OpenStreetMap Copyright and License
      * page.
      * @const
      * @api
      */
    var ATTRIBUTION: Attribution = js.native
  }
  
  /* static members */
  @js.native
  object WMTS extends js.Object {
    /**
      * Generate source options from a capabilities object.
      * @param wmtsCap An object representing the capabilities document.
      * @param config Configuration properties for the layer.  Defaults for
      *                  the layer will apply if not provided.
      *
      * Required config properties:
      *  - layer - {string} The layer identifier.
      *
      * Optional config properties:
      *  - matrixSet - {string} The matrix set identifier, required if there is
      *       more than one matrix set in the layer capabilities.
      *  - projection - {string} The desired CRS when no matrixSet is specified.
      *       eg: "EPSG:3857". If the desired projection is not available,
      *       an error is thrown.
      *  - requestEncoding - {string} url encoding format for the layer. Default is
      *       the first tile url format found in the GetCapabilities response.
      *  - style - {string} The name of the style
      *  - format - {string} Image format for the layer. Default is the first
      *       format returned in the GetCapabilities response.
      * @return WMTS source options object.
      * @api
      */
    def optionsFromCapabilities(wmtsCap: GlobalObject, config: GlobalObject): WMTSOptions = js.native
  }
  
  @JSName("wms")
  @js.native
  object wmsNs extends js.Object {
    /**
      * Available server types: `'carmentaserver'`, `'geoserver'`, `'mapserver'`,
      *     `'qgis'`. These are servers that have vendor parameters beyond the WMS
      *     specification that OpenLayers can make use of.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.openlayers.openlayersStrings.carmentaserver
      - typings.openlayers.openlayersStrings.geoserver
      - typings.openlayers.openlayersStrings.mapserver
      - typings.openlayers.openlayersStrings.qgis
    */
    trait ServerType extends js.Object
    
  }
  
}

