package typings.atMysticateaSpy.distMod.Spy

import typings.atMysticateaSpy.atMysticateaSpyStrings.`return`
import typings.atMysticateaSpy.distMod.This
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each returned call. */
trait ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: Parameters[T]
  var `return`: ReturnType[T]
  var `this`: This[T]
  var `type`: `return`
}

object ReturnedCall {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    arguments: Parameters[T],
    `return`: ReturnType[T],
    `type`: `return`,
    `this`: js.UndefOr[scala.Nothing] = js.undefined
  ): ReturnedCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedCall[T]]
  }
}

