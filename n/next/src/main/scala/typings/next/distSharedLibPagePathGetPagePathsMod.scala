package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibPagePathGetPagePathsMod {
  
  @JSImport("next/dist/shared/lib/page-path/get-page-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPagePaths(normalizedPagePath: String, extensions: js.Array[String], isAppDir: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPagePaths")(normalizedPagePath.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], isAppDir.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
