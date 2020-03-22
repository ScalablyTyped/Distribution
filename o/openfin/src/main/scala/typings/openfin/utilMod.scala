package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/launcher/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def exists(path: String): js.Promise[Boolean] = js.native
  def first[T](arr: js.Array[T], func: js.Function3[/* x */ T, /* i */ Double, /* r */ js.Array[T], Boolean]): T | Null = js.native
  def resolveDir(base: String, paths: js.Array[String]): js.Promise[String] = js.native
  def resolveRuntimeVersion(versionOrChannel: String): js.Promise[String] = js.native
  def rmDir(dirPath: String): js.Promise[Unit] = js.native
  def rmDir(dirPath: String, removeSelf: Boolean): js.Promise[Unit] = js.native
  def unzip(file: String, dest: String): js.Promise[_] = js.native
}

