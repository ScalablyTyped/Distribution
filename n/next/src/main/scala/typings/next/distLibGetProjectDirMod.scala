package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibGetProjectDirMod {
  
  @JSImport("next/dist/lib/get-project-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProjectDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectDir")().asInstanceOf[String]
  inline def getProjectDir(dir: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectDir")(dir.asInstanceOf[js.Any]).asInstanceOf[String]
}
