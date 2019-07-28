package typings.atMysticateaSpy.distMod.SpyNs

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
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `return`: ReturnType[T], `this`: This[T], `type`: `return`): ReturnedCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments)
    __obj.updateDynamic("return")(`return`)
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReturnedCall[T]]
  }
}

