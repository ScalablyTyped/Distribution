package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minilog", "Transform")
@js.native
class Transform () extends js.Object {
  def mixin(dest: js.Any): Unit = js.native
  def pipe(dest: js.Any): js.Any = js.native
  def unpipe(from: js.Any): Transform = js.native
  def write(name: js.Any, level: js.Any, args: js.Any): Unit = js.native
}

