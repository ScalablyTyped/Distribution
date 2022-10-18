package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerHtmlescapeMod {
  
  @JSImport("next/dist/server/htmlescape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/htmlescape", "ESCAPE_REGEX")
  @js.native
  val ESCAPE_REGEX: js.RegExp = js.native
  
  inline def htmlEscapeJsonString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEscapeJsonString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
