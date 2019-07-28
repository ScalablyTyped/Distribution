package typings.atMysticateaSpy.distMod.SpyNs

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
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `this`: This[T], `throw`: js.Any, `type`: `throw`): ThrownCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments)
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThrownCall[T]]
  }
}

