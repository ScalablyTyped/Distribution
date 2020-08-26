package typings.officeUiFabricReact.panelTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Classname for FocusTrapZone element
    */
  var focusTrapZoneClassName: js.UndefOr[String] = js.native
  /**
    * Panel has close button
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Determines where the header is rendered based on whether the user
    * has passed in a custom onRenderNavigation or onRenderNavigationContent render callback
    */
  var hasCustomNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.native
  /**
    * Is animation currently running
    */
  var isAnimating: js.UndefOr[Boolean] = js.native
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.native
  /**
    * Based on state value setting footer to sticky or not
    */
  var isFooterSticky: js.UndefOr[Boolean] = js.native
  /**
    * Is panel hidden on dismiss
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Is panel on right side
    */
  var isOnRightSide: js.UndefOr[Boolean] = js.native
  /**
    * Is Panel open
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
  /**
    * Type of the panel.
    */
  var `type`: js.UndefOr[PanelType] = js.native
}

object IPanelStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPanelStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStyleProps]
  }
  @scala.inline
  implicit class IPanelStylePropsOps[Self <: IPanelStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFocusTrapZoneClassName(value: String): Self = this.set("focusTrapZoneClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusTrapZoneClassName: Self = this.set("focusTrapZoneClassName", js.undefined)
    @scala.inline
    def setHasCloseButton(value: Boolean): Self = this.set("hasCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCloseButton: Self = this.set("hasCloseButton", js.undefined)
    @scala.inline
    def setHasCustomNavigation(value: Boolean): Self = this.set("hasCustomNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCustomNavigation: Self = this.set("hasCustomNavigation", js.undefined)
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    @scala.inline
    def setIsAnimating(value: Boolean): Self = this.set("isAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAnimating: Self = this.set("isAnimating", js.undefined)
    @scala.inline
    def setIsFooterAtBottom(value: Boolean): Self = this.set("isFooterAtBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFooterAtBottom: Self = this.set("isFooterAtBottom", js.undefined)
    @scala.inline
    def setIsFooterSticky(value: Boolean): Self = this.set("isFooterSticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFooterSticky: Self = this.set("isFooterSticky", js.undefined)
    @scala.inline
    def setIsHiddenOnDismiss(value: Boolean): Self = this.set("isHiddenOnDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHiddenOnDismiss: Self = this.set("isHiddenOnDismiss", js.undefined)
    @scala.inline
    def setIsOnRightSide(value: Boolean): Self = this.set("isOnRightSide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOnRightSide: Self = this.set("isOnRightSide", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setType(value: PanelType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

