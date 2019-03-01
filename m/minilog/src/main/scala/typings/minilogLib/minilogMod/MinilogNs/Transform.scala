package typings
package minilogLib.minilogMod.MinilogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  def mixin(dest: js.Any): scala.Unit
  def pipe(dest: js.Any): js.Any
  def unpipe(from: js.Any): Transform
  def write(name: js.Any, level: js.Any, args: js.Any): scala.Unit
}

object Transform {
  @scala.inline
  def apply(
    mixin: js.Function1[js.Any, scala.Unit],
    pipe: js.Function1[js.Any, js.Any],
    unpipe: js.Function1[js.Any, Transform],
    write: js.Function3[js.Any, js.Any, js.Any, scala.Unit]
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mixin")(mixin)
    __obj.updateDynamic("pipe")(pipe)
    __obj.updateDynamic("unpipe")(unpipe)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Transform]
  }
}

