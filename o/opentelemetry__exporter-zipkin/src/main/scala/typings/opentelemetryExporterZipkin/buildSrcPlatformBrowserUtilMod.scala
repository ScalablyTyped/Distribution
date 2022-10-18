package typings.opentelemetryExporterZipkin

import typings.opentelemetryExporterZipkin.buildSrcTypesMod.SendFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserUtilMod {
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/platform/browser/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareSend(urlStr: String): SendFn = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSend")(urlStr.asInstanceOf[js.Any]).asInstanceOf[SendFn]
  inline def prepareSend(urlStr: String, headers: Record[String, String]): SendFn = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSend")(urlStr.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[SendFn]
}
