package typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INav extends js.Object {
  /**
    * The meta 'key' property of the currently selected NavItem of the Nav. Can return
    * undefined if the currently selected nav item has no populated key property. Be aware
    * that in order for Nav to properly understand which key is selected all NavItems in
    * all groups of the Nav must have populated key properties.
    */
  var selectedKey: js.UndefOr[String] = js.undefined
}

object INav {
  @scala.inline
  def apply(selectedKey: String = null): INav = {
    val __obj = js.Dynamic.literal()
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey)
    __obj.asInstanceOf[INav]
  }
}

