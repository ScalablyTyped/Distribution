package typings.ol

import typings.ol.formatEsriJSONMod.Options
import typings.ol.formatEsriJSONMod.default
import typings.ol.formatIIIFInfoMod.ImageInformationResponse
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
    extends typings.ol.formatGPXMod.default {
    def this(opt_options: typings.ol.formatGPXMod.Options) = this()
  }
  
  @js.native
  class GeoJSON ()
    extends typings.ol.formatGeoJSONMod.default {
    def this(opt_options: typings.ol.formatGeoJSONMod.Options) = this()
  }
  
  @js.native
  class IGC ()
    extends typings.ol.formatIGCMod.default {
    def this(opt_options: typings.ol.formatIGCMod.Options) = this()
  }
  
  @js.native
  class IIIFInfo protected ()
    extends typings.ol.formatIIIFInfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @js.native
  class KML ()
    extends typings.ol.formatKMLMod.default {
    def this(opt_options: typings.ol.formatKMLMod.Options) = this()
  }
  
  @js.native
  class MVT ()
    extends typings.ol.formatMVTMod.default {
    def this(opt_options: typings.ol.formatMVTMod.Options) = this()
  }
  
  @js.native
  class OWS ()
    extends typings.ol.formatOWSMod.default
  
  @js.native
  class Polyline ()
    extends typings.ol.formatPolylineMod.default {
    def this(opt_options: typings.ol.formatPolylineMod.Options) = this()
  }
  
  @js.native
  class TopoJSON ()
    extends typings.ol.formatTopoJSONMod.default {
    def this(opt_options: typings.ol.formatTopoJSONMod.Options) = this()
  }
  
  @js.native
  class WFS ()
    extends typings.ol.formatWFSMod.default {
    def this(opt_options: typings.ol.formatWFSMod.Options) = this()
  }
  
  @js.native
  class WKT ()
    extends typings.ol.formatWKTMod.default {
    def this(opt_options: typings.ol.formatWKTMod.Options) = this()
  }
  
  @js.native
  class WMSCapabilities ()
    extends typings.ol.formatWMSCapabilitiesMod.default
  
  @js.native
  class WMSGetFeatureInfo ()
    extends typings.ol.formatWMSGetFeatureInfoMod.default {
    def this(opt_options: typings.ol.formatWMSGetFeatureInfoMod.Options) = this()
  }
  
  @js.native
  class WMTSCapabilities ()
    extends typings.ol.formatWMTSCapabilitiesMod.default
  
  def GML(): Unit = js.native
  def GML(opt_options: typings.ol.formatGMLBaseMod.Options): Unit = js.native
}

