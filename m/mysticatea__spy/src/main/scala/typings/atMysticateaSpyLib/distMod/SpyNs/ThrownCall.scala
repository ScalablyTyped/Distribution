package typings
package atMysticateaSpyLib.distMod.SpyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each thrown call. */
trait ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: stdLib.Parameters[T]
  var `this`: atMysticateaSpyLib.distMod.This[T]
  var `throw`: js.Any
  var `type`: atMysticateaSpyLib.atMysticateaSpyLibStrings.`throw`
}

object ThrownCall {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    arguments: stdLib.Parameters[T],
    `this`: atMysticateaSpyLib.distMod.This[T],
    `throw`: js.Any,
    `type`: atMysticateaSpyLib.atMysticateaSpyLibStrings.`throw`
  ): ThrownCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments)
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThrownCall[T]]
  }
}

