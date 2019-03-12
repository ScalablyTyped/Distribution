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
    mixin: js.Any => scala.Unit,
    pipe: js.Any => js.Any,
    unpipe: js.Any => Transform,
    write: (js.Any, js.Any, js.Any) => scala.Unit
  ): Transform = {
    val __obj = js.Dynamic.literal(mixin = js.Any.fromFunction1(mixin), pipe = js.Any.fromFunction1(pipe), unpipe = js.Any.fromFunction1(unpipe), write = js.Any.fromFunction3(write))
  
    __obj.asInstanceOf[Transform]
  }
}

