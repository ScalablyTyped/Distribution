package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("openfin/_v2/launcher/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def first[T](arr: js.Array[T], func: js.Function3[/* x */ T, /* i */ Double, /* r */ js.Array[T], Boolean]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def resolveDir(base: String, paths: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDir")(base.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def resolveRuntimeVersion(versionOrChannel: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRuntimeVersion")(versionOrChannel.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def rmDir(dirPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmDir")(dirPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def rmDir(dirPath: String, removeSelf: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmDir")(dirPath.asInstanceOf[js.Any], removeSelf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def unzip(file: String, dest: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(file.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
