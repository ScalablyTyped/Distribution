package typings
package minilogLib.minilogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minilog", JSImport.Namespace)
@js.native
object minilogModMembers extends js.Object {
  var backends: minilogLib.minilogMod.MinilogNs.MinilogBackends = js.native
  var defaultBackend: js.Any = js.native
  var defaultFormatter: java.lang.String = js.native
  var suggest: minilogLib.minilogMod.MinilogNs.Filter = js.native
  def apply(namespace: java.lang.String): Minilog = js.native
  def disable(): Minilog = js.native
  def enable(): Minilog = js.native
  def pipe(dest: js.Any): minilogLib.minilogMod.MinilogNs.Transform = js.native
}

