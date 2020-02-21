package typings.officeUiFabricReact.panelTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Classname for FocusTrapZone element
    */
  var focusTrapZoneClassName: js.UndefOr[String] = js.undefined
  /**
    * Panel has close button
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines where the header is rendered based on whether the user
    * has passed in a custom onRenderNavigation or onRenderNavigationContent render callback
    */
  var hasCustomNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.undefined
  /**
    * Is animation currently running
    */
  var isAnimating: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Based on state value setting footer to sticky or not
    */
  var isFooterSticky: js.UndefOr[Boolean] = js.undefined
  /**
    * Is panel hidden on dismiss
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Is panel on right side
    */
  var isOnRightSide: js.UndefOr[Boolean] = js.undefined
  /**
    * Is Panel open
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
  /**
    * Type of the panel.
    */
  var `type`: js.UndefOr[PanelType] = js.undefined
}

object IPanelStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    focusTrapZoneClassName: String = null,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    hasCustomNavigation: js.UndefOr[Boolean] = js.undefined,
    headerClassName: String = null,
    isAnimating: js.UndefOr[Boolean] = js.undefined,
    isFooterAtBottom: js.UndefOr[Boolean] = js.undefined,
    isFooterSticky: js.UndefOr[Boolean] = js.undefined,
    isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined,
    isOnRightSide: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    `type`: PanelType = null
  ): IPanelStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (focusTrapZoneClassName != null) __obj.updateDynamic("focusTrapZoneClassName")(focusTrapZoneClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCustomNavigation)) __obj.updateDynamic("hasCustomNavigation")(hasCustomNavigation.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimating)) __obj.updateDynamic("isAnimating")(isAnimating.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterAtBottom)) __obj.updateDynamic("isFooterAtBottom")(isFooterAtBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterSticky)) __obj.updateDynamic("isFooterSticky")(isFooterSticky.asInstanceOf[js.Any])
    if (!js.isUndefined(isHiddenOnDismiss)) __obj.updateDynamic("isHiddenOnDismiss")(isHiddenOnDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnRightSide)) __obj.updateDynamic("isOnRightSide")(isOnRightSide.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStyleProps]
  }
}

