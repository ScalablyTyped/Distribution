package typings.minilog.minilogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minilog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var backends: MinilogBackends = js.native
  var defaultBackend: js.Any = js.native
  var defaultFormatter: String = js.native
  var suggest: Filter = js.native
  def apply(namespace: String): Minilog = js.native
}

