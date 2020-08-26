package typings.officeUiFabricReact.contextualMenuItemTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemStyleProps extends js.Object {
  /**
    * Whether or not the menu item is checked.
    */
  var checked: Boolean = js.native
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether or not the menu item is disabled.
    */
  var disabled: Boolean = js.native
  /**
    * The optional class name to apply to the divider element.
    */
  var dividerClassName: js.UndefOr[String] = js.native
  /**
    * Whether or not the menu item is expanded.
    */
  var expanded: Boolean = js.native
  /**
    * The optional class name to apply to the icon element.
    */
  var iconClassName: js.UndefOr[String] = js.native
  /**
    * Indicates if a menu item is an anchor link.
    */
  var isAnchorLink: Boolean = js.native
  /**
    * The optional class name to apply to the item element.
    */
  var itemClassName: js.UndefOr[String] = js.native
  /**
    * Indicates if the icon used is of the known set of icons.
    */
  var knownIcon: Boolean = js.native
  /**
    * Whether or not the primary section of a split menu item is disabled.
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The optional class name to apply to the sub-menu if present.
    */
  var subMenuClassName: js.UndefOr[String] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme = js.native
}

object IContextualMenuItemStyleProps {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    expanded: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    theme: ITheme
  ): IContextualMenuItemStyleProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isAnchorLink = isAnchorLink.asInstanceOf[js.Any], knownIcon = knownIcon.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemStyleProps]
  }
  @scala.inline
  implicit class IContextualMenuItemStylePropsOps[Self <: IContextualMenuItemStyleProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAnchorLink(value: Boolean): Self = this.set("isAnchorLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setKnownIcon(value: Boolean): Self = this.set("knownIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDividerClassName(value: String): Self = this.set("dividerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerClassName: Self = this.set("dividerClassName", js.undefined)
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    @scala.inline
    def setItemClassName(value: String): Self = this.set("itemClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassName: Self = this.set("itemClassName", js.undefined)
    @scala.inline
    def setPrimaryDisabled(value: Boolean): Self = this.set("primaryDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryDisabled: Self = this.set("primaryDisabled", js.undefined)
    @scala.inline
    def setSubMenuClassName(value: String): Self = this.set("subMenuClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuClassName: Self = this.set("subMenuClassName", js.undefined)
  }
  
}

