package typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavLinkGroup extends js.Object {
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.undefined
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var collapseAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * If true, the group should render collapsed by default
    */
  var collapseByDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var expandAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * (Optional) Any additional properties to apply to a group.
    */
  var groupData: js.UndefOr[js.Any] = js.undefined
  /**
    * Links to render within this group
    */
  var links: js.Array[INavLink]
  /**
    * Text to render as the header of a group
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Callback invoked when a group header is clicked
    */
  var onHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* isCollapsing */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
}

object INavLinkGroup {
  @scala.inline
  def apply(
    links: js.Array[INavLink],
    automationId: String = null,
    collapseAriaLabel: String = null,
    collapseByDefault: js.UndefOr[Boolean] = js.undefined,
    expandAriaLabel: String = null,
    groupData: js.Any = null,
    name: String = null,
    onHeaderClick: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* isCollapsing */ js.UndefOr[Boolean]) => Unit = null
  ): INavLinkGroup = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    if (automationId != null) __obj.updateDynamic("automationId")(automationId.asInstanceOf[js.Any])
    if (collapseAriaLabel != null) __obj.updateDynamic("collapseAriaLabel")(collapseAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseByDefault)) __obj.updateDynamic("collapseByDefault")(collapseByDefault.asInstanceOf[js.Any])
    if (expandAriaLabel != null) __obj.updateDynamic("expandAriaLabel")(expandAriaLabel.asInstanceOf[js.Any])
    if (groupData != null) __obj.updateDynamic("groupData")(groupData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction2(onHeaderClick))
    __obj.asInstanceOf[INavLinkGroup]
  }
}

