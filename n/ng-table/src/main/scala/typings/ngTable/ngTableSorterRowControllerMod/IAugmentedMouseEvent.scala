package typings.ngTable.ngTableSorterRowControllerMod

import typings.angular.mod.IAngularEvent
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAugmentedMouseEvent extends IAngularEvent {
  var ctrlKey: Boolean
  var metaKey: Boolean
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
    targetScope: IScope,
    stopPropagation: () => Unit = null
  ): IAugmentedMouseEvent = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope.asInstanceOf[js.Any])
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[IAugmentedMouseEvent]
  }
}

