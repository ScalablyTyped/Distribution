package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rewriteUrlForExportMod {
  
  @JSImport("next-server/dist/lib/router/rewrite-url-for-export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def rewriteUrlForNextExport(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriteUrlForNextExport")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
