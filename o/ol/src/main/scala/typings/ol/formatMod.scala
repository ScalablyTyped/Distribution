package typings.ol

import typings.ol.formatEsriJSONMod.Options
import typings.ol.formatEsriJSONMod.default
import typings.ol.formatIiifinfoMod.ImageInformationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("ol/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format", "EsriJSON")
  @js.native
  open class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  inline def GML(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GML")().asInstanceOf[Unit]
  inline def GML(opt_options: typings.ol.formatGmlbaseMod.Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GML")(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("ol/format", "GPX")
  @js.native
  open class GPX ()
    extends typings.ol.formatGpxMod.default {
    def this(opt_options: typings.ol.formatGpxMod.Options) = this()
  }
  
  @JSImport("ol/format", "GeoJSON")
  @js.native
  open class GeoJSON ()
    extends typings.ol.formatGeoJSONMod.default {
    def this(opt_options: typings.ol.formatGeoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "IGC")
  @js.native
  open class IGC ()
    extends typings.ol.formatIgcMod.default {
    def this(opt_options: typings.ol.formatIgcMod.Options) = this()
  }
  
  @JSImport("ol/format", "IIIFInfo")
  @js.native
  open class IIIFInfo protected ()
    extends typings.ol.formatIiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @JSImport("ol/format", "KML")
  @js.native
  open class KML ()
    extends typings.ol.formatKmlMod.default {
    def this(opt_options: typings.ol.formatKmlMod.Options) = this()
  }
  
  @JSImport("ol/format", "MVT")
  @js.native
  open class MVT ()
    extends typings.ol.formatMvtMod.default {
    def this(opt_options: typings.ol.formatMvtMod.Options) = this()
  }
  
  @JSImport("ol/format", "OWS")
  @js.native
  open class OWS ()
    extends typings.ol.formatOwsMod.default
  
  @JSImport("ol/format", "Polyline")
  @js.native
  open class Polyline ()
    extends typings.ol.formatPolylineMod.default {
    def this(opt_options: typings.ol.formatPolylineMod.Options) = this()
  }
  
  @JSImport("ol/format", "TopoJSON")
  @js.native
  open class TopoJSON ()
    extends typings.ol.formatTopoJSONMod.default {
    def this(opt_options: typings.ol.formatTopoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "WFS")
  @js.native
  open class WFS ()
    extends typings.ol.formatWfsMod.default {
    def this(opt_options: typings.ol.formatWfsMod.Options) = this()
  }
  
  @JSImport("ol/format", "WKT")
  @js.native
  open class WKT ()
    extends typings.ol.formatWktMod.default {
    def this(opt_options: typings.ol.formatWktMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMSCapabilities")
  @js.native
  open class WMSCapabilities ()
    extends typings.ol.formatWmscapabilitiesMod.default
  
  @JSImport("ol/format", "WMSGetFeatureInfo")
  @js.native
  open class WMSGetFeatureInfo ()
    extends typings.ol.formatWmsgetfeatureinfoMod.default {
    def this(opt_options: typings.ol.formatWmsgetfeatureinfoMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMTSCapabilities")
  @js.native
  open class WMTSCapabilities ()
    extends typings.ol.formatWmtscapabilitiesMod.default
}
