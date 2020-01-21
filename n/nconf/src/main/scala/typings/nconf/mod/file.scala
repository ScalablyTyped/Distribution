package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nconf", "file")
@js.native
object file extends js.Object {
  def apply(name: String): Provider = js.native
  def apply(name: String, filename: String): Provider = js.native
  def apply(name: String, options: IFileOptions): Provider = js.native
  def apply(options: IFileOptions): Provider = js.native
}

