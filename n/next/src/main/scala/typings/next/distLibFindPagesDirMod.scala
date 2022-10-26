package typings.next

import typings.next.anon.AppDirPagesDir
import typings.next.nextStrings.app
import typings.next.nextStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFindPagesDirMod {
  
  @JSImport("next/dist/lib/find-pages-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def existsSync(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def findDir(dir: String, name: pages | app): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(dir.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def findPagesDir(dir: String, isAppDirEnabled: Boolean): AppDirPagesDir = (^.asInstanceOf[js.Dynamic].applyDynamic("findPagesDir")(dir.asInstanceOf[js.Any], isAppDirEnabled.asInstanceOf[js.Any])).asInstanceOf[AppDirPagesDir]
}
