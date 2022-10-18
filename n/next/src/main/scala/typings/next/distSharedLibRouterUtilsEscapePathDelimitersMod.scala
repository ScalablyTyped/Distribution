package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsEscapePathDelimitersMod {
  
  @JSImport("next/dist/shared/lib/router/utils/escape-path-delimiters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(segment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(segment.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(segment: String, escapeEncoded: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(segment.asInstanceOf[js.Any], escapeEncoded.asInstanceOf[js.Any])).asInstanceOf[String]
}
