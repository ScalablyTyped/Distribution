package typings
package mobxLib.libCoreActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends js.Object {
  var isMobxAction: scala.Boolean
}

object IAction {
  @scala.inline
  def apply(isMobxAction: scala.Boolean): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isMobxAction")(isMobxAction)
    __obj.asInstanceOf[IAction]
  }
}

