package typings.ol

import typings.ol.sourceBingMapsMod.Options
import typings.ol.sourceBingMapsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  @JSImport("ol/source", "BingMaps")
  @js.native
  open class BingMaps protected () extends default {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source", "CartoDB")
  @js.native
  open class CartoDB protected ()
    extends typings.ol.sourceCartoDBMod.default {
    def this(options: typings.ol.sourceCartoDBMod.Options) = this()
  }
  
  @JSImport("ol/source", "Cluster")
  @js.native
  open class Cluster protected ()
    extends typings.ol.sourceClusterMod.default {
    def this(options: typings.ol.sourceClusterMod.Options) = this()
  }
  
  @JSImport("ol/source", "IIIF")
  @js.native
  open class IIIF ()
    extends typings.ol.sourceIiifMod.default {
    def this(opt_options: typings.ol.sourceIiifMod.Options) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/source", "Image")
  @js.native
  open class Image protected ()
    extends typings.ol.sourceImageMod.default {
    def this(options: typings.ol.sourceImageMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageArcGISRest")
  @js.native
  open class ImageArcGISRest ()
    extends typings.ol.sourceImageArcGISRestMod.default {
    def this(opt_options: typings.ol.sourceImageArcGISRestMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageCanvas")
  @js.native
  open class ImageCanvas ()
    extends typings.ol.sourceImageCanvasMod.default {
    def this(opt_options: typings.ol.sourceImageCanvasMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageMapGuide")
  @js.native
  open class ImageMapGuide protected ()
    extends typings.ol.sourceImageMapGuideMod.default {
    def this(options: typings.ol.sourceImageMapGuideMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageStatic")
  @js.native
  open class ImageStatic protected ()
    extends typings.ol.sourceImageStaticMod.default {
    def this(options: typings.ol.sourceImageStaticMod.Options) = this()
  }
  
  @JSImport("ol/source", "ImageWMS")
  @js.native
  open class ImageWMS ()
    extends typings.ol.sourceImageWMSMod.default {
    def this(opt_options: typings.ol.sourceImageWMSMod.Options) = this()
  }
  
  @JSImport("ol/source", "OSM")
  @js.native
  open class OSM ()
    extends typings.ol.sourceOsmMod.default {
    def this(opt_options: typings.ol.sourceOsmMod.Options) = this()
  }
  
  @JSImport("ol/source", "Raster")
  @js.native
  open class Raster protected ()
    extends typings.ol.sourceRasterMod.default {
    def this(options: typings.ol.sourceRasterMod.Options) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/source", "Source")
  @js.native
  open class Source protected ()
    extends typings.ol.sourceSourceMod.default {
    def this(options: typings.ol.sourceSourceMod.Options) = this()
  }
  
  @JSImport("ol/source", "Stamen")
  @js.native
  open class Stamen protected ()
    extends typings.ol.sourceStamenMod.default {
    def this(options: typings.ol.sourceStamenMod.Options) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/source", "Tile")
  @js.native
  open class Tile protected ()
    extends typings.ol.sourceTileMod.default {
    def this(options: typings.ol.sourceTileMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileArcGISRest")
  @js.native
  open class TileArcGISRest ()
    extends typings.ol.sourceTileArcGISRestMod.default {
    def this(opt_options: typings.ol.sourceTileArcGISRestMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileDebug")
  @js.native
  open class TileDebug ()
    extends typings.ol.sourceTileDebugMod.default {
    def this(opt_options: typings.ol.sourceTileDebugMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileImage")
  @js.native
  open class TileImage protected ()
    extends typings.ol.sourceTileImageMod.default {
    def this(options: typings.ol.sourceTileImageMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileJSON")
  @js.native
  open class TileJSON protected ()
    extends typings.ol.sourceTileJSONMod.default {
    def this(options: typings.ol.sourceTileJSONMod.Options) = this()
  }
  
  @JSImport("ol/source", "TileWMS")
  @js.native
  open class TileWMS ()
    extends typings.ol.sourceTileWMSMod.default {
    def this(opt_options: typings.ol.sourceTileWMSMod.Options) = this()
  }
  
  @JSImport("ol/source", "UTFGrid")
  @js.native
  open class UTFGrid protected ()
    extends typings.ol.sourceUtfgridMod.default {
    def this(options: typings.ol.sourceUtfgridMod.Options) = this()
  }
  
  @JSImport("ol/source", "UrlTile")
  @js.native
  open class UrlTile protected ()
    extends typings.ol.sourceUrlTileMod.default {
    def this(options: typings.ol.sourceUrlTileMod.Options) = this()
  }
  
  @JSImport("ol/source", "Vector")
  @js.native
  open class Vector[GeomType /* <: typings.ol.geomGeometryMod.default */] ()
    extends typings.ol.sourceVectorMod.default[GeomType] {
    def this(opt_options: typings.ol.sourceVectorMod.Options) = this()
  }
  
  @JSImport("ol/source", "VectorTile")
  @js.native
  open class VectorTile protected ()
    extends typings.ol.sourceVectorTileMod.default {
    def this(options: typings.ol.sourceVectorTileMod.Options) = this()
  }
  
  @JSImport("ol/source", "WMTS")
  @js.native
  open class WMTS protected ()
    extends typings.ol.sourceWmtsMod.default {
    def this(options: typings.ol.sourceWmtsMod.Options) = this()
  }
  
  @JSImport("ol/source", "XYZ")
  @js.native
  open class XYZ ()
    extends typings.ol.sourceXyzMod.default {
    def this(opt_options: typings.ol.sourceXyzMod.Options) = this()
  }
  
  @JSImport("ol/source", "Zoomify")
  @js.native
  open class Zoomify protected ()
    extends typings.ol.sourceZoomifyMod.default {
    def this(opt_options: typings.ol.sourceZoomifyMod.Options) = this()
  }
}
