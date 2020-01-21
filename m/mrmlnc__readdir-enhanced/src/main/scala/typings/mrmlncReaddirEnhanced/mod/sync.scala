package typings.mrmlncReaddirEnhanced.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mrmlnc/readdir-enhanced", "sync")
@js.native
object sync extends js.Object {
  def apply(root: String): js.Array[String] = js.native
  def apply(root: String, options: Options): js.Array[String] = js.native
  def stat(root: String): js.Array[Entry] = js.native
  def stat(root: String, options: Options): js.Array[Entry] = js.native
}

