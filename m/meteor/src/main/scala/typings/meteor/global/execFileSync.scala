package typings.meteor.global

import typings.meteor.anon.Cwd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("execFileSync")
@js.native
object execFileSync extends js.Object {
  def apply(command: String): String = js.native
  def apply(command: String, args: js.Array[_]): String = js.native
  def apply(command: String, args: js.Array[_], options: Cwd): String = js.native
}

