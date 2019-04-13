package typings
package minilogLib.minilogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minilog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var backends: MinilogBackends = js.native
  var defaultBackend: js.Any = js.native
  var defaultFormatter: java.lang.String = js.native
  var suggest: Filter = js.native
  def apply(namespace: java.lang.String): Minilog = js.native
  def disable(): Minilog = js.native
  def enable(): Minilog = js.native
  def pipe(dest: js.Any): Transform = js.native
}

