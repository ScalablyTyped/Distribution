package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRecursiveReaddirMod {
  
  @JSImport("next/dist/lib/recursive-readdir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recursiveReadDir(dir: String, filter: js.RegExp): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: js.RegExp): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: js.RegExp, arr: js.Array[String]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: js.RegExp, arr: js.Array[String], rootDir: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: js.RegExp, arr: Unit, rootDir: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: Unit, arr: js.Array[String]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: Unit, arr: js.Array[String], rootDir: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def recursiveReadDir(dir: String, filter: js.RegExp, ignore: Unit, arr: Unit, rootDir: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveReadDir")(dir.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
