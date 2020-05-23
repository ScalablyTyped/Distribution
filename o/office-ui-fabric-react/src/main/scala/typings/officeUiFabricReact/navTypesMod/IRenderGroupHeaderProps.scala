package typings.officeUiFabricReact.navTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderGroupHeaderProps extends INavLinkGroup {
  /**
    * Whether or not the group is presently expanded.
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object IRenderGroupHeaderProps {
  @scala.inline
  def apply(
    links: js.Array[INavLink],
    automationId: String = null,
    collapseAriaLabel: String = null,
    collapseByDefault: js.UndefOr[Boolean] = js.undefined,
    expandAriaLabel: String = null,
    groupData: js.Any = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onHeaderClick: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* isCollapsing */ js.UndefOr[Boolean]) => Unit = null
  ): IRenderGroupHeaderProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    if (automationId != null) __obj.updateDynamic("automationId")(automationId.asInstanceOf[js.Any])
    if (collapseAriaLabel != null) __obj.updateDynamic("collapseAriaLabel")(collapseAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseByDefault)) __obj.updateDynamic("collapseByDefault")(collapseByDefault.get.asInstanceOf[js.Any])
    if (expandAriaLabel != null) __obj.updateDynamic("expandAriaLabel")(expandAriaLabel.asInstanceOf[js.Any])
    if (groupData != null) __obj.updateDynamic("groupData")(groupData.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction2(onHeaderClick))
    __obj.asInstanceOf[IRenderGroupHeaderProps]
  }
}

