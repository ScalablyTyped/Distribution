package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibRecursiveReaddirSyncMod {
  
  @JSImport("next-server/dist/server/lib/recursive-readdir-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recursiveReadDirSync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDirSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def recursiveReadDirSync(dir: String, arr: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDirSync")(dir.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def recursiveReadDirSync(dir: String, arr: js.Array[String], rootDir: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDirSync")(dir.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def recursiveReadDirSync(dir: String, arr: Unit, rootDir: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDirSync")(dir.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
