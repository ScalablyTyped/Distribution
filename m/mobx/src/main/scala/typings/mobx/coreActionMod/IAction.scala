package typings.mobx.coreActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends js.Object {
  var isMobxAction: Boolean
}

object IAction {
  @scala.inline
  def apply(isMobxAction: Boolean): IAction = {
    val __obj = js.Dynamic.literal(isMobxAction = isMobxAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
}

