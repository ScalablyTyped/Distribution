package typings.mysticateaSpy.mod.Spy_

import typings.mysticateaSpy.mod.This
import typings.mysticateaSpy.mysticateaSpyStrings.`throw`
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
  def apply[T](
    arguments: Parameters[T],
    `throw`: js.Any,
    `type`: `throw`,
    `this`: js.UndefOr[This[T]] = js.undefined
  ): ThrownCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrownCall[T]]
  }
}

