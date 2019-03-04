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
  def apply(__mocks: js.Any, resetAll: js.Function0[scala.Unit], toJSON: js.Function0[js.Any]): Target = {
    val __obj = js.Dynamic.literal(__mocks = __mocks, resetAll = resetAll, toJSON = toJSON)
  
    __obj.asInstanceOf[Target]
  }
}

