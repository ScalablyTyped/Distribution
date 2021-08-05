package typings.ol

import typings.ol.esriJSONMod.Options
import typings.ol.esriJSONMod.default
import typings.ol.iiifinfoMod.ImageInformationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("ol/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format", "EsriJSON")
  @js.native
  class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  inline def GML(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GML")().asInstanceOf[Unit]
  inline def GML(opt_options: typings.ol.gmlbaseMod.Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GML")(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("ol/format", "GPX")
  @js.native
  class GPX ()
    extends typings.ol.gpxMod.default {
    def this(opt_options: typings.ol.gpxMod.Options) = this()
  }
  
  @JSImport("ol/format", "GeoJSON")
  @js.native
  class GeoJSON ()
    extends typings.ol.geoJSONMod.default {
    def this(opt_options: typings.ol.geoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "IGC")
  @js.native
  class IGC ()
    extends typings.ol.igcMod.default {
    def this(opt_options: typings.ol.igcMod.Options) = this()
  }
  
  @JSImport("ol/format", "IIIFInfo")
  @js.native
  class IIIFInfo protected ()
    extends typings.ol.iiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @JSImport("ol/format", "KML")
  @js.native
  class KML ()
    extends typings.ol.kmlMod.default {
    def this(opt_options: typings.ol.kmlMod.Options) = this()
  }
  
  @JSImport("ol/format", "MVT")
  @js.native
  class MVT ()
    extends typings.ol.mvtMod.default {
    def this(opt_options: typings.ol.mvtMod.Options) = this()
  }
  
  @JSImport("ol/format", "OWS")
  @js.native
  class OWS ()
    extends typings.ol.owsMod.default
  
  @JSImport("ol/format", "Polyline")
  @js.native
  class Polyline ()
    extends typings.ol.polylineMod.default {
    def this(opt_options: typings.ol.polylineMod.Options) = this()
  }
  
  @JSImport("ol/format", "TopoJSON")
  @js.native
  class TopoJSON ()
    extends typings.ol.topoJSONMod.default {
    def this(opt_options: typings.ol.topoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "WFS")
  @js.native
  class WFS ()
    extends typings.ol.wfsMod.default {
    def this(opt_options: typings.ol.wfsMod.Options) = this()
  }
  
  @JSImport("ol/format", "WKT")
  @js.native
  class WKT ()
    extends typings.ol.wktMod.default {
    def this(opt_options: typings.ol.wktMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMSCapabilities")
  @js.native
  class WMSCapabilities ()
    extends typings.ol.wmscapabilitiesMod.default
  
  @JSImport("ol/format", "WMSGetFeatureInfo")
  @js.native
  class WMSGetFeatureInfo ()
    extends typings.ol.wmsgetfeatureinfoMod.default {
    def this(opt_options: typings.ol.wmsgetfeatureinfoMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMTSCapabilities")
  @js.native
  class WMTSCapabilities ()
    extends typings.ol.wmtscapabilitiesMod.default
}
