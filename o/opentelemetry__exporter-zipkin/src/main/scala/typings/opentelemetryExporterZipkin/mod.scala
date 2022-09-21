package typings.opentelemetryExporterZipkin

import typings.opentelemetryExporterZipkin.typesMod.ExporterConfig
import typings.opentelemetryExporterZipkin.typesMod.SendFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/exporter-zipkin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/exporter-zipkin", "ZipkinExporter")
  @js.native
  open class ZipkinExporter ()
    extends typings.opentelemetryExporterZipkin.zipkinMod.ZipkinExporter {
    def this(config: ExporterConfig) = this()
  }
  
  inline def prepareSend(urlStr: String): SendFn = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSend")(urlStr.asInstanceOf[js.Any]).asInstanceOf[SendFn]
  inline def prepareSend(urlStr: String, headers: Record[String, String]): SendFn = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSend")(urlStr.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[SendFn]
}
