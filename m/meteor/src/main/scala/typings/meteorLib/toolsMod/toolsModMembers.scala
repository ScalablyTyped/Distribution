package typings
package meteorLib.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", JSImport.Namespace)
@js.native
object toolsModMembers extends js.Object {
  var console: nodeLib.Console = js.native
  def execFileAsync(command: java.lang.String): js.Any = js.native
  def execFileAsync(command: java.lang.String, args: js.Array[_]): js.Any = js.native
  def execFileAsync(command: java.lang.String, args: js.Array[_], options: meteorLib.Anon_Cwd): js.Any = js.native
  def execFileSync(command: java.lang.String): nodeLib.String = js.native
  def execFileSync(command: java.lang.String, args: js.Array[_]): nodeLib.String = js.native
  def execFileSync(command: java.lang.String, args: js.Array[_], options: meteorLib.Anon_Cwd): nodeLib.String = js.native
}

