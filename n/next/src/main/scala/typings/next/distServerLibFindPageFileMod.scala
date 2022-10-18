package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibFindPageFileMod {
  
  @JSImport("next/dist/server/lib/find-page-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPageFile(pagesDir: String, normalizedPagePath: String, pageExtensions: js.Array[String], isAppDir: Boolean): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPageFile")(pagesDir.asInstanceOf[js.Any], normalizedPagePath.asInstanceOf[js.Any], pageExtensions.asInstanceOf[js.Any], isAppDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  inline def isLayoutsLeafPage(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayoutsLeafPage")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
