package typings
package atMysticateaSpyLib.distMod.SpyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each returned call. */
trait ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: stdLib.Parameters[T]
  var `return`: stdLib.ReturnType[T]
  var `this`: atMysticateaSpyLib.distMod.This[T]
  var `type`: atMysticateaSpyLib.atMysticateaSpyLibStrings.`return`
}

object ReturnedCall {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    arguments: stdLib.Parameters[T],
    `return`: stdLib.ReturnType[T],
    `this`: atMysticateaSpyLib.distMod.This[T],
    `type`: atMysticateaSpyLib.atMysticateaSpyLibStrings.`return`
  ): ReturnedCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments)
    __obj.updateDynamic("return")(`return`)
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReturnedCall[T]]
  }
}

