package typings.meteor.toolsMod

import typings.meteor.Anon_Cwd
import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var console: Console = js.native
  def execFileAsync(command: String): js.Any = js.native
  def execFileAsync(command: String, args: js.Array[_]): js.Any = js.native
  def execFileAsync(command: String, args: js.Array[_], options: Anon_Cwd): js.Any = js.native
  def execFileSync(command: String): String = js.native
  def execFileSync(command: String, args: js.Array[_]): String = js.native
  def execFileSync(command: String, args: js.Array[_], options: Anon_Cwd): String = js.native
}

