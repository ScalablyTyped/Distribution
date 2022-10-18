package typings.next

import typings.next.anon.AppDirPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFindPagesDirMod {
  
  @JSImport("next/dist/lib/find-pages-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def existsSync(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def findPagesDir(dir: String): AppDirPages = ^.asInstanceOf[js.Dynamic].applyDynamic("findPagesDir")(dir.asInstanceOf[js.Any]).asInstanceOf[AppDirPages]
  inline def findPagesDir(dir: String, appDirEnabled: Boolean): AppDirPages = (^.asInstanceOf[js.Dynamic].applyDynamic("findPagesDir")(dir.asInstanceOf[js.Any], appDirEnabled.asInstanceOf[js.Any])).asInstanceOf[AppDirPages]
}
