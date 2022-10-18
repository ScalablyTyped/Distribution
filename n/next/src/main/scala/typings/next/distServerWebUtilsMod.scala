package typings.next

import typings.next.distServerWebTypesMod.NodeHeaders
import typings.std.Headers
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebUtilsMod {
  
  @JSImport("next/dist/server/web/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromNodeHeaders(`object`: NodeHeaders): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeHeaders")(`object`.asInstanceOf[js.Any]).asInstanceOf[Headers]
  
  inline def splitCookiesString(cookiesString: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCookiesString")(cookiesString.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toNodeHeaders(): NodeHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("toNodeHeaders")().asInstanceOf[NodeHeaders]
  inline def toNodeHeaders(headers: Headers): NodeHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("toNodeHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[NodeHeaders]
  
  inline def validateURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def validateURL(url: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
