package typings.micromarkUtilSanitizeUri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-sanitize-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanitizeUri(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeUri")().asInstanceOf[String]
  inline def sanitizeUri(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeUri")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeUri(url: String, protocol: js.RegExp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeUri")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sanitizeUri(url: Unit, protocol: js.RegExp): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeUri")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
}
