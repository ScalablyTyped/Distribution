package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItemStyleProps extends js.Object {
  /**
    * Whether or not the menu item is checked.
    */
  var checked: Boolean
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the menu item is disabled.
    */
  var disabled: Boolean
  /**
    * The optional class name to apply to the divider element.
    */
  var dividerClassName: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the menu item is expanded.
    */
  var expanded: Boolean
  /**
    * The optional class name to apply to the icon element.
    */
  var iconClassName: js.UndefOr[String] = js.undefined
  /**
    * Indicates if a menu item is an anchor link.
    */
  var isAnchorLink: Boolean
  /**
    * The optional class name to apply to the item element.
    */
  var itemClassName: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the icon used is of the known set of icons.
    */
  var knownIcon: Boolean
  /**
    * Whether or not the primary section of a split menu item is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The optional class name to apply to the sub-menu if present.
    */
  var subMenuClassName: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IContextualMenuItemStyleProps {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    expanded: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    theme: ITheme,
    className: String = null,
    dividerClassName: String = null,
    iconClassName: String = null,
    itemClassName: String = null,
    primaryDisabled: js.UndefOr[Boolean] = js.undefined,
    subMenuClassName: String = null
  ): IContextualMenuItemStyleProps = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, expanded = expanded, isAnchorLink = isAnchorLink, knownIcon = knownIcon, theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dividerClassName != null) __obj.updateDynamic("dividerClassName")(dividerClassName)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName)
    if (!js.isUndefined(primaryDisabled)) __obj.updateDynamic("primaryDisabled")(primaryDisabled)
    if (subMenuClassName != null) __obj.updateDynamic("subMenuClassName")(subMenuClassName)
    __obj.asInstanceOf[IContextualMenuItemStyleProps]
  }
}

