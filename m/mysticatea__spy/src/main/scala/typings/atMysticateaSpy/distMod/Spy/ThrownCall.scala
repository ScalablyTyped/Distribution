package typings.atMysticateaSpy.distMod.Spy

import typings.atMysticateaSpy.atMysticateaSpyStrings.`throw`
import typings.atMysticateaSpy.distMod.This
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each thrown call. */
trait ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: Parameters[T]
  var `this`: This[T]
  var `throw`: js.Any
  var `type`: `throw`
}

object ThrownCall {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    arguments: Parameters[T],
    `throw`: js.Any,
    `type`: `throw`,
    `this`: js.UndefOr[scala.Nothing] = js.undefined
  ): ThrownCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrownCall[T]]
  }
}

