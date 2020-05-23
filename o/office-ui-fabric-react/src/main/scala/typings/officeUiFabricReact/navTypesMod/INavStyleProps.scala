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
    leftPadding: js.UndefOr[Double] = js.undefined,
    leftPaddingExpanded: js.UndefOr[Double] = js.undefined,
    navHeight: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined,
    rightPadding: js.UndefOr[Double] = js.undefined
  ): INavStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isButtonEntry)) __obj.updateDynamic("isButtonEntry")(isButtonEntry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isGroup)) __obj.updateDynamic("isGroup")(isGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnTop)) __obj.updateDynamic("isOnTop")(isOnTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftPadding)) __obj.updateDynamic("leftPadding")(leftPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftPaddingExpanded)) __obj.updateDynamic("leftPaddingExpanded")(leftPaddingExpanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navHeight)) __obj.updateDynamic("navHeight")(navHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightPadding)) __obj.updateDynamic("rightPadding")(rightPadding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavStyleProps]
  }
}

