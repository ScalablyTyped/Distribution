package typings
package mockingooseLib.mockingooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var __mocks: js.Any
  def resetAll(): scala.Unit
  def toJSON(): js.Any
}

object Target {
  @scala.inline
  def apply(__mocks: js.Any, resetAll: () => scala.Unit, toJSON: () => js.Any): Target = {
    val __obj = js.Dynamic.literal(__mocks = __mocks, resetAll = js.Any.fromFunction0(resetAll), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Target]
  }
}

