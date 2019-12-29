package typings.md5DashFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5-file/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  def apply(filename: String): js.Promise[String] = js.native
  def sync(filename: String): String = js.native
}

