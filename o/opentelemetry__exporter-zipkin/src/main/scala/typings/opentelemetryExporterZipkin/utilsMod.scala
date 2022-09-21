package typings.opentelemetryExporterZipkin

import typings.opentelemetryExporterZipkin.typesMod.GetHeaders
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareGetHeaders(getExportRequestHeaders: GetHeaders): js.Function0[js.UndefOr[Record[String, String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareGetHeaders")(getExportRequestHeaders.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.UndefOr[Record[String, String]]]]
}
