package typings.ol

import typings.ol.bingMapsMod.Options
import typings.ol.bingMapsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  @JSImport("ol/source", "BingMaps")
  @js.native
  class BingMaps protected () extends default {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source", "CartoDB")
  @js.native
  class CartoDB protected ()
    extends typings.ol.cartoDBMod.default {
    def this(options: typings.ol.cartoDBMod.Options) = this()
  }
  
  @JSImport("ol/source", "Cluster")
  @js.native
  class Cluster protected ()
    extends typings.ol.clusterMod.default {
    def this(options: typings.ol.clusterMod.Options) = this()
  }
  
  @JSImport("ol/source", "IIIF")
  @js.native
  class IIIF ()
    extends typings.ol.iiifMod.default {
    def this(opt_options: typings.ol.iiifMod.Options) = this()
  }
  
  @JSImport("ol/source", "Image")
  @js.native
  abstract class Image protected ()
    extends typings.ol.sourceImageMod.default {
    def this(options: typings.ol.sourceImageMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageArcGISRest")
  @js.native
  class ImageArcGISRest ()
    extends typings.ol.imageArcGISRestMod.default {
    def this(opt_options: typings.ol.imageArcGISRestMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageCanvas")
  @js.native
  class ImageCanvas ()
    extends typings.ol.imageCanvasMod.default {
    def this(opt_options: typings.ol.imageCanvasMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageMapGuide")
  @js.native
  class ImageMapGuide protected ()
    extends typings.ol.imageMapGuideMod.default {
    def this(options: typings.ol.imageMapGuideMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageStatic")
  @js.native
  class ImageStatic protected ()
    extends typings.ol.imageStaticMod.default {
    def this(options: typings.ol.imageStaticMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageWMS")
  @js.native
  class ImageWMS ()
    extends typings.ol.imageWMSMod.default {
    def this(opt_options: typings.ol.imageWMSMod.Options) = this()
  }
  
  @JSImport("ol/source", "OSM")
  @js.native
  class OSM ()
    extends typings.ol.osmMod.default {
    def this(opt_options: typings.ol.osmMod.Options) = this()
  }
  
  @JSImport("ol/source", "Raster")
  @js.native
  class Raster protected ()
    extends typings.ol.rasterMod.default {
    def this(options: typings.ol.rasterMod.Options) = this()
  }
  
  @JSImport("ol/source", "Source")
  @js.native
  abstract class Source protected ()
    extends typings.ol.sourceSourceMod.default {
    def this(options: typings.ol.sourceSourceMod.Options) = this()
  }
  
  @JSImport("ol/source", "Stamen")
  @js.native
  class Stamen protected ()
    extends typings.ol.stamenMod.default {
    def this(options: typings.ol.stamenMod.Options) = this()
  }
  
  @JSImport("ol/source", "Tile")
  @js.native
  abstract class Tile protected ()
    extends typings.ol.sourceTileMod.default {
    def this(options: typings.ol.sourceTileMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileArcGISRest")
  @js.native
  class TileArcGISRest ()
    extends typings.ol.tileArcGISRestMod.default {
    def this(opt_options: typings.ol.tileArcGISRestMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileDebug")
  @js.native
  class TileDebug ()
    extends typings.ol.tileDebugMod.default {
    def this(opt_options: typings.ol.tileDebugMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileImage")
  @js.native
  class TileImage protected ()
    extends typings.ol.tileImageMod.default {
    def this(options: typings.ol.tileImageMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileJSON")
  @js.native
  class TileJSON protected ()
    extends typings.ol.tileJSONMod.default {
    def this(options: typings.ol.tileJSONMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileWMS")
  @js.native
  class TileWMS ()
    extends typings.ol.tileWMSMod.default {
    def this(opt_options: typings.ol.tileWMSMod.Options) = this()
  }
  
  @JSImport("ol/source", "UTFGrid")
  @js.native
  class UTFGrid protected ()
    extends typings.ol.utfgridMod.default {
    def this(options: typings.ol.utfgridMod.Options) = this()
  }
  
  @JSImport("ol/source", "UrlTile")
  @js.native
  class UrlTile protected ()
    extends typings.ol.urlTileMod.default {
    def this(options: typings.ol.urlTileMod.Options) = this()
  }
  
  @JSImport("ol/source", "Vector")
  @js.native
  class Vector[GeomType /* <: typings.ol.geometryMod.default */] ()
    extends typings.ol.sourceVectorMod.default[GeomType] {
    def this(opt_options: typings.ol.sourceVectorMod.Options) = this()
  }
  
  @JSImport("ol/source", "VectorTile")
  @js.native
  class VectorTile protected ()
    extends typings.ol.sourceVectorTileMod.default {
    def this(options: typings.ol.sourceVectorTileMod.Options) = this()
  }
  
  @JSImport("ol/source", "WMTS")
  @js.native
  class WMTS protected ()
    extends typings.ol.wmtsMod.default {
    def this(options: typings.ol.wmtsMod.Options) = this()
  }
  
  @JSImport("ol/source", "XYZ")
  @js.native
  class XYZ ()
    extends typings.ol.xyzMod.default {
    def this(opt_options: typings.ol.xyzMod.Options) = this()
  }
  
  @JSImport("ol/source", "Zoomify")
  @js.native
  class Zoomify protected ()
    extends typings.ol.zoomifyMod.default {
    def this(opt_options: typings.ol.zoomifyMod.Options) = this()
  }
}
