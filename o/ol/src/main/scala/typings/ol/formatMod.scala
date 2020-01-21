package typings.ol

import typings.ol.esriJSONMod.Options
import typings.ol.esriJSONMod.default
import typings.ol.iiifinfoMod.ImageInformationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  @js.native
  class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class GPX ()
    extends typings.ol.gpxMod.default {
    def this(opt_options: typings.ol.gpxMod.Options) = this()
  }
  
  @js.native
  class GeoJSON ()
    extends typings.ol.geoJSONMod.default {
    def this(opt_options: typings.ol.geoJSONMod.Options) = this()
  }
  
  @js.native
  class IGC ()
    extends typings.ol.igcMod.default {
    def this(opt_options: typings.ol.igcMod.Options) = this()
  }
  
  @js.native
  class IIIFInfo protected ()
    extends typings.ol.iiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @js.native
  class KML ()
    extends typings.ol.kmlMod.default {
    def this(opt_options: typings.ol.kmlMod.Options) = this()
  }
  
  @js.native
  class MVT ()
    extends typings.ol.mvtMod.default {
    def this(opt_options: typings.ol.mvtMod.Options) = this()
  }
  
  @js.native
  class OWS ()
    extends typings.ol.owsMod.default
  
  @js.native
  class Polyline ()
    extends typings.ol.polylineMod.default {
    def this(opt_options: typings.ol.polylineMod.Options) = this()
  }
  
  @js.native
  class TopoJSON ()
    extends typings.ol.topoJSONMod.default {
    def this(opt_options: typings.ol.topoJSONMod.Options) = this()
  }
  
  @js.native
  class WFS ()
    extends typings.ol.wfsMod.default {
    def this(opt_options: typings.ol.wfsMod.Options) = this()
  }
  
  @js.native
  class WKT ()
    extends typings.ol.wktMod.default {
    def this(opt_options: typings.ol.wktMod.Options) = this()
  }
  
  @js.native
  class WMSCapabilities ()
    extends typings.ol.wmscapabilitiesMod.default
  
  @js.native
  class WMSGetFeatureInfo ()
    extends typings.ol.wmsgetfeatureinfoMod.default {
    def this(opt_options: typings.ol.wmsgetfeatureinfoMod.Options) = this()
  }
  
  @js.native
  class WMTSCapabilities ()
    extends typings.ol.wmtscapabilitiesMod.default
  
  def GML(): Unit = js.native
  def GML(opt_options: typings.ol.gmlbaseMod.Options): Unit = js.native
}

