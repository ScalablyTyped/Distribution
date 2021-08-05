package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexToBase64Mod {
  
  @JSImport("@opentelemetry/core/build/src/platform/browser/hex-to-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
}
