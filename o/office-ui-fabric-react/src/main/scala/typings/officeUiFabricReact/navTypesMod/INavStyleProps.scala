package typings.officeUiFabricReact.navTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Inherited from INavProps
    * A collection of link groups to display in the navigation bar
    */
  var groups: js.Array[INavLinkGroup] | Null
  /**
    * is button
    */
  var isButtonEntry: js.UndefOr[Boolean] = js.undefined
  /**
    * is element disabled
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * is element expanded boolean
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /**
    * is element a group boolean
    */
  var isGroup: js.UndefOr[Boolean] = js.undefined
  /**
    * is element a link boolean
    */
  var isLink: js.UndefOr[Boolean] = js.undefined
  /**
    * is element on top boolean
    */
  var isOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * is element selected boolean
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * left padding value
    */
  var leftPadding: js.UndefOr[Double] = js.undefined
  /**
    * left padding when expanded value
    */
  var leftPaddingExpanded: js.UndefOr[Double] = js.undefined
  /**
    * Nav height value
    */
  var navHeight: js.UndefOr[Double] = js.undefined
  /**
    * position value
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * right padding value
    */
  var rightPadding: js.UndefOr[Double] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object INavStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    groups: js.Array[INavLinkGroup] = null,
    isButtonEntry: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isGroup: js.UndefOr[Boolean] = js.undefined,
    isLink: js.UndefOr[Boolean] = js.undefined,
    isOnTop: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    leftPadding: Int | Double = null,
    leftPaddingExpanded: Int | Double = null,
    navHeight: Int | Double = null,
    position: Int | Double = null,
    rightPadding: Int | Double = null
  ): INavStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(isButtonEntry)) __obj.updateDynamic("isButtonEntry")(isButtonEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isGroup)) __obj.updateDynamic("isGroup")(isGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnTop)) __obj.updateDynamic("isOnTop")(isOnTop.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (leftPadding != null) __obj.updateDynamic("leftPadding")(leftPadding.asInstanceOf[js.Any])
    if (leftPaddingExpanded != null) __obj.updateDynamic("leftPaddingExpanded")(leftPaddingExpanded.asInstanceOf[js.Any])
    if (navHeight != null) __obj.updateDynamic("navHeight")(navHeight.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rightPadding != null) __obj.updateDynamic("rightPadding")(rightPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavStyleProps]
  }
}

