package typings.openlayers.global.ol

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.SourceImageOptions
import typings.openlayers.mod.SourceSourceOptions
import typings.openlayers.mod.SourceTileOptions
import typings.openlayers.mod.SourceUrlTileOptions
import typings.openlayers.mod.olx.FrameState
import typings.openlayers.mod.olx.source.BingMapsOptions
import typings.openlayers.mod.olx.source.CartoDBOptions
import typings.openlayers.mod.olx.source.ClusterOptions
import typings.openlayers.mod.olx.source.ImageArcGISRestOptions
import typings.openlayers.mod.olx.source.ImageCanvasOptions
import typings.openlayers.mod.olx.source.ImageMapGuideOptions
import typings.openlayers.mod.olx.source.ImageStaticOptions
import typings.openlayers.mod.olx.source.ImageVectorOptions
import typings.openlayers.mod.olx.source.ImageWMSOptions
import typings.openlayers.mod.olx.source.OSMOptions
import typings.openlayers.mod.olx.source.RasterOptions
import typings.openlayers.mod.olx.source.StamenOptions
import typings.openlayers.mod.olx.source.TileArcGISRestOptions
import typings.openlayers.mod.olx.source.TileDebugOptions
import typings.openlayers.mod.olx.source.TileImageOptions
import typings.openlayers.mod.olx.source.TileJSONOptions
import typings.openlayers.mod.olx.source.TileUTFGridOptions
import typings.openlayers.mod.olx.source.TileWMSOptions
import typings.openlayers.mod.olx.source.VectorOptions
import typings.openlayers.mod.olx.source.VectorTileOptions
import typings.openlayers.mod.olx.source.WMTSOptions
import typings.openlayers.mod.olx.source.XYZOptions
import typings.openlayers.mod.olx.source.ZoomifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object source {
  
  /**
    * @classdesc
    * Layer source for Bing Maps tile data.
    *
    * @param options Bing Maps options.
    * @api stable
    */
  @JSGlobal("ol.source.BingMaps")
  @js.native
  open class BingMaps protected ()
    extends typings.openlayers.mod.source.BingMaps {
    /**
      * @classdesc
      * Layer source for Bing Maps tile data.
      *
      * @param options Bing Maps options.
      * @api stable
      */
    def this(options: BingMapsOptions) = this()
  }
  object BingMaps {
    
    @JSGlobal("ol.source.BingMaps")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The attribution containing a link to the Microsoft® Bing™ Maps Platform APIs’
      * Terms Of Use.
      * @api
      */
    /* static member */
    @JSGlobal("ol.source.BingMaps.TOS_ATTRIBUTION")
    @js.native
    def TOS_ATTRIBUTION: typings.openlayers.mod.Attribution = js.native
    inline def TOS_ATTRIBUTION_=(x: typings.openlayers.mod.Attribution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOS_ATTRIBUTION")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @classdesc
    * Layer source for the CartoDB tiles.
    *
    * @param options CartoDB options.
    * @api
    */
  @JSGlobal("ol.source.CartoDB")
  @js.native
  open class CartoDB protected ()
    extends typings.openlayers.mod.source.CartoDB {
    /**
      * @classdesc
      * Layer source for the CartoDB tiles.
      *
      * @param options CartoDB options.
      * @api
      */
    def this(options: CartoDBOptions) = this()
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
  @JSGlobal("ol.source.Cluster")
  @js.native
  open class Cluster protected ()
    extends typings.openlayers.mod.source.Cluster {
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
  @JSGlobal("ol.source.Image")
  @js.native
  open class Image protected ()
    extends typings.openlayers.mod.source.Image {
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
  @JSGlobal("ol.source.ImageArcGISRest")
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
  open class ImageArcGISRest ()
    extends typings.openlayers.mod.source.ImageArcGISRest {
    def this(opt_options: ImageArcGISRestOptions) = this()
  }
  
  /**
    * @classdesc
    * Base class for image sources where a canvas element is the image.
    *
    * @param options Constructor options.
    * @api
    */
  @JSGlobal("ol.source.ImageCanvas")
  @js.native
  open class ImageCanvas protected ()
    extends typings.openlayers.mod.source.ImageCanvas {
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
  @JSGlobal("ol.source.ImageEvent")
  @js.native
  open class ImageEvent protected ()
    extends typings.openlayers.mod.source.ImageEvent {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Image} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param image The image.
      */
    def this(`type`: String, image: typings.openlayers.mod.Image) = this()
  }
  
  /**
    * @classdesc
    * Source for images from Mapguide servers
    *
    * @fires ol.source.ImageEvent
    * @param options Options.
    * @api stable
    */
  @JSGlobal("ol.source.ImageMapGuide")
  @js.native
  open class ImageMapGuide protected ()
    extends typings.openlayers.mod.source.ImageMapGuide {
    /**
      * @classdesc
      * Source for images from Mapguide servers
      *
      * @fires ol.source.ImageEvent
      * @param options Options.
      * @api stable
      */
    def this(options: ImageMapGuideOptions) = this()
  }
  
  /**
    * @classdesc
    * A layer source for displaying a single, static image.
    *
    * @param options Options.
    * @api stable
    */
  @JSGlobal("ol.source.ImageStatic")
  @js.native
  open class ImageStatic protected ()
    extends typings.openlayers.mod.source.ImageStatic {
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
  @JSGlobal("ol.source.ImageVector")
  @js.native
  open class ImageVector protected ()
    extends typings.openlayers.mod.source.ImageVector {
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
  }
  
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires ol.source.ImageEvent
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.source.ImageWMS")
  @js.native
  /**
    * @classdesc
    * Source for WMS servers providing single, untiled images.
    *
    * @fires ol.source.ImageEvent
    * @param opt_options Options.
    * @api stable
    */
  open class ImageWMS ()
    extends typings.openlayers.mod.source.ImageWMS {
    def this(opt_options: ImageWMSOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for the OpenStreetMap tile server.
    *
    * @param opt_options Open Street Map options.
    * @api stable
    */
  @JSGlobal("ol.source.OSM")
  @js.native
  /**
    * @classdesc
    * Layer source for the OpenStreetMap tile server.
    *
    * @param opt_options Open Street Map options.
    * @api stable
    */
  open class OSM ()
    extends typings.openlayers.mod.source.OSM {
    def this(opt_options: OSMOptions) = this()
  }
  object OSM {
    
    @JSGlobal("ol.source.OSM")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The attribution containing a link to the OpenStreetMap Copyright and License
      * page.
      * @api
      */
    /* static member */
    @JSGlobal("ol.source.OSM.ATTRIBUTION")
    @js.native
    def ATTRIBUTION: typings.openlayers.mod.Attribution = js.native
    inline def ATTRIBUTION_=(x: typings.openlayers.mod.Attribution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTION")(x.asInstanceOf[js.Any])
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
  @JSGlobal("ol.source.Raster")
  @js.native
  open class Raster protected ()
    extends typings.openlayers.mod.source.Raster {
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
  @JSGlobal("ol.source.RasterEvent")
  @js.native
  open class RasterEvent protected ()
    extends typings.openlayers.mod.source.RasterEvent {
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
  @JSGlobal("ol.source.Source")
  @js.native
  open class Source protected ()
    extends typings.openlayers.mod.source.Source {
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
  }
  
  /**
    * @classdesc
    * Layer source for the Stamen tile server.
    *
    * @param options Stamen options.
    * @api stable
    */
  @JSGlobal("ol.source.Stamen")
  @js.native
  open class Stamen protected ()
    extends typings.openlayers.mod.source.Stamen {
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
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing images divided into a tile grid.
    *
    * @param options Tile source options.
    * @api
    */
  @JSGlobal("ol.source.Tile")
  @js.native
  open class Tile protected ()
    extends typings.openlayers.mod.source.Tile {
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
  @JSGlobal("ol.source.TileArcGISRest")
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
  open class TileArcGISRest ()
    extends typings.openlayers.mod.source.TileArcGISRest {
    def this(opt_options: TileArcGISRestOptions) = this()
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
  @JSGlobal("ol.source.TileDebug")
  @js.native
  open class TileDebug protected ()
    extends typings.openlayers.mod.source.TileDebug {
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
  @JSGlobal("ol.source.TileEvent")
  @js.native
  open class TileEvent protected ()
    extends typings.openlayers.mod.source.TileEvent {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Tile} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param tile The tile.
      */
    def this(`type`: String, tile: typings.openlayers.mod.Tile) = this()
  }
  
  /**
    * @classdesc
    * Base class for sources providing images divided into a tile grid.
    *
    * @fires ol.source.TileEvent
    * @param options Image tile options.
    * @api
    */
  @JSGlobal("ol.source.TileImage")
  @js.native
  open class TileImage protected ()
    extends typings.openlayers.mod.source.TileImage {
    /**
      * @classdesc
      * Base class for sources providing images divided into a tile grid.
      *
      * @fires ol.source.TileEvent
      * @param options Image tile options.
      * @api
      */
    def this(options: TileImageOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for tile data in TileJSON format.
    *
    * @param options TileJSON options.
    * @api stable
    */
  @JSGlobal("ol.source.TileJSON")
  @js.native
  open class TileJSON protected ()
    extends typings.openlayers.mod.source.TileJSON {
    /**
      * @classdesc
      * Layer source for tile data in TileJSON format.
      *
      * @param options TileJSON options.
      * @api stable
      */
    def this(options: TileJSONOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for UTFGrid interaction data loaded from TileJSON format.
    *
    * @param options Source options.
    * @api
    */
  @JSGlobal("ol.source.TileUTFGrid")
  @js.native
  open class TileUTFGrid protected ()
    extends typings.openlayers.mod.source.TileUTFGrid {
    /**
      * @classdesc
      * Layer source for UTFGrid interaction data loaded from TileJSON format.
      *
      * @param options Source options.
      * @api
      */
    def this(options: TileUTFGridOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    *
    * @param opt_options Tile WMS options.
    * @api stable
    */
  @JSGlobal("ol.source.TileWMS")
  @js.native
  /**
    * @classdesc
    * Layer source for tile data from WMS servers.
    *
    * @param opt_options Tile WMS options.
    * @api stable
    */
  open class TileWMS ()
    extends typings.openlayers.mod.source.TileWMS {
    def this(opt_options: TileWMSOptions) = this()
  }
  
  /**
    * @classdesc
    * Base class for sources providing tiles divided into a tile grid over http.
    *
    * @fires ol.source.TileEvent
    * @param options Image tile options.
    */
  @JSGlobal("ol.source.UrlTile")
  @js.native
  open class UrlTile protected ()
    extends typings.openlayers.mod.source.UrlTile {
    /**
      * @classdesc
      * Base class for sources providing tiles divided into a tile grid over http.
      *
      * @fires ol.source.TileEvent
      * @param options Image tile options.
      */
    def this(options: SourceUrlTileOptions) = this()
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
  @JSGlobal("ol.source.Vector")
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
  open class Vector ()
    extends typings.openlayers.mod.source.Vector {
    def this(opt_options: VectorOptions) = this()
  }
  
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Vector} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param opt_feature Feature.
    */
  @JSGlobal("ol.source.VectorEvent")
  @js.native
  open class VectorEvent protected ()
    extends typings.openlayers.mod.source.VectorEvent {
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Vector} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_feature Feature.
      */
    def this(`type`: String) = this()
    def this(`type`: String, opt_feature: typings.openlayers.mod.Feature) = this()
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
  @JSGlobal("ol.source.VectorTile")
  @js.native
  open class VectorTile protected ()
    extends typings.openlayers.mod.source.VectorTile {
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
  @JSGlobal("ol.source.WMTS")
  @js.native
  open class WMTS protected ()
    extends typings.openlayers.mod.source.WMTS {
    /**
      * @classdesc
      * Layer source for tile data from WMTS servers.
      *
      * @param options WMTS options.
      * @api stable
      */
    def this(options: WMTSOptions) = this()
  }
  object WMTS {
    
    @JSGlobal("ol.source.WMTS")
    @js.native
    val ^ : js.Any = js.native
    
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
    /* static member */
    inline def optionsFromCapabilities(wmtsCap: GlobalObject, config: GlobalObject): WMTSOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsFromCapabilities")(wmtsCap.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[WMTSOptions]
  }
  
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
  @JSGlobal("ol.source.XYZ")
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
  open class XYZ ()
    extends typings.openlayers.mod.source.XYZ {
    def this(opt_options: XYZOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.source.Zoomify")
  @js.native
  /**
    * @classdesc
    * Layer source for tile data in Zoomify format.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class Zoomify ()
    extends typings.openlayers.mod.source.Zoomify {
    def this(opt_options: ZoomifyOptions) = this()
  }
}
