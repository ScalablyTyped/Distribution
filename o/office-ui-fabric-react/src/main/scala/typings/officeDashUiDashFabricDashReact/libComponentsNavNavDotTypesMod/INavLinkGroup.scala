package typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
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
    * If true, the group should render collapsed by default
    */
  var collapseByDefault: js.UndefOr[Boolean] = js.undefined
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
    collapseByDefault: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onHeaderClick: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* isCollapsing */ js.UndefOr[Boolean]) => Unit = null
  ): INavLinkGroup = {
    val __obj = js.Dynamic.literal(links = links)
    if (automationId != null) __obj.updateDynamic("automationId")(automationId)
    if (!js.isUndefined(collapseByDefault)) __obj.updateDynamic("collapseByDefault")(collapseByDefault)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction2(onHeaderClick))
    __obj.asInstanceOf[INavLinkGroup]
  }
}

