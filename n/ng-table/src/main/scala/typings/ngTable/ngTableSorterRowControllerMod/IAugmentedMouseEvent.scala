package typings.ngTable.ngTableSorterRowControllerMod

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAugmentedMouseEvent extends IAngularEvent {
  var ctrlKey: Boolean = js.native
  var metaKey: Boolean = js.native
}

object IAugmentedMouseEvent {
  @scala.inline
  def apply(
    ctrlKey: Boolean,
    currentScope: IScope,
    defaultPrevented: Boolean,
    metaKey: Boolean,
    name: String,
    preventDefault: () => Unit,
    targetScope: IScope
  ): IAugmentedMouseEvent = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAugmentedMouseEvent]
  }
  @scala.inline
  implicit class IAugmentedMouseEventOps[Self <: IAugmentedMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
  }
  
}

