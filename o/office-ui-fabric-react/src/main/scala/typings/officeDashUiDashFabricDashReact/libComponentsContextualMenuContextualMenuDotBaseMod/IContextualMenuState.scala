package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotBaseMod

import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuState extends js.Object {
  var contextualMenuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.undefined
  var contextualMenuTarget: js.UndefOr[Element] = js.undefined
  var dismissedMenuItemKey: js.UndefOr[String] = js.undefined
  /** True if the menu was expanded by mouse click OR hover (as opposed to by keyboard) */
  var expandedByMouseClick: js.UndefOr[Boolean] = js.undefined
  var expandedMenuItemKey: js.UndefOr[String] = js.undefined
  var positions: js.UndefOr[js.Any] = js.undefined
  var slideDirectionalClassName: js.UndefOr[String] = js.undefined
  var subMenuId: js.UndefOr[String] = js.undefined
  var submenuDirection: js.UndefOr[DirectionalHint] = js.undefined
  var submenuTarget: js.UndefOr[Element] = js.undefined
}

object IContextualMenuState {
  @scala.inline
  def apply(
    contextualMenuItems: js.Array[IContextualMenuItem] = null,
    contextualMenuTarget: Element = null,
    dismissedMenuItemKey: String = null,
    expandedByMouseClick: js.UndefOr[Boolean] = js.undefined,
    expandedMenuItemKey: String = null,
    positions: js.Any = null,
    slideDirectionalClassName: String = null,
    subMenuId: String = null,
    submenuDirection: DirectionalHint = null,
    submenuTarget: Element = null
  ): IContextualMenuState = {
    val __obj = js.Dynamic.literal()
    if (contextualMenuItems != null) __obj.updateDynamic("contextualMenuItems")(contextualMenuItems.asInstanceOf[js.Any])
    if (contextualMenuTarget != null) __obj.updateDynamic("contextualMenuTarget")(contextualMenuTarget.asInstanceOf[js.Any])
    if (dismissedMenuItemKey != null) __obj.updateDynamic("dismissedMenuItemKey")(dismissedMenuItemKey.asInstanceOf[js.Any])
    if (!js.isUndefined(expandedByMouseClick)) __obj.updateDynamic("expandedByMouseClick")(expandedByMouseClick.asInstanceOf[js.Any])
    if (expandedMenuItemKey != null) __obj.updateDynamic("expandedMenuItemKey")(expandedMenuItemKey.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (slideDirectionalClassName != null) __obj.updateDynamic("slideDirectionalClassName")(slideDirectionalClassName.asInstanceOf[js.Any])
    if (subMenuId != null) __obj.updateDynamic("subMenuId")(subMenuId.asInstanceOf[js.Any])
    if (submenuDirection != null) __obj.updateDynamic("submenuDirection")(submenuDirection.asInstanceOf[js.Any])
    if (submenuTarget != null) __obj.updateDynamic("submenuTarget")(submenuTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuState]
  }
}

