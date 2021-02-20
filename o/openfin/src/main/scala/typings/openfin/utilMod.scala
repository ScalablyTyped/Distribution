package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("openfin/_v2/launcher/util", "exists")
  @js.native
  def exists(path: String): js.Promise[Boolean] = js.native
  
  @JSImport("openfin/_v2/launcher/util", "first")
  @js.native
  def first[T](arr: js.Array[T], func: js.Function3[/* x */ T, /* i */ Double, /* r */ js.Array[T], Boolean]): T | Null = js.native
  
  @JSImport("openfin/_v2/launcher/util", "resolveDir")
  @js.native
  def resolveDir(base: String, paths: js.Array[String]): js.Promise[String] = js.native
  
  @JSImport("openfin/_v2/launcher/util", "resolveRuntimeVersion")
  @js.native
  def resolveRuntimeVersion(versionOrChannel: String): js.Promise[String] = js.native
  
  @JSImport("openfin/_v2/launcher/util", "rmDir")
  @js.native
  def rmDir(dirPath: String): js.Promise[Unit] = js.native
  @JSImport("openfin/_v2/launcher/util", "rmDir")
  @js.native
  def rmDir(dirPath: String, removeSelf: Boolean): js.Promise[Unit] = js.native
  
  @JSImport("openfin/_v2/launcher/util", "unzip")
  @js.native
  def unzip(file: String, dest: String): js.Promise[_] = js.native
}
