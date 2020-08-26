package typings.officeUiFabricReact.commandBarTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarItemProps extends IContextualMenuItem {
  /**
    * Custom styles for individual button
    */
  var buttonStyles: js.UndefOr[IButtonStyles] = js.native
  /**
    * A custom cache key to be used for this item. If `cacheKey` is changed, the cache will invalidate.
    * Defaults to `key` value.
    */
  var cacheKey: js.UndefOr[String] = js.native
  /**
    * Method to override the render of the individual command bar button.
    * Not used when item is rendered in overflow.
    * @defaultvalue CommandBarButton
    */
  var commandBarButtonAs: js.UndefOr[IComponentAs[ICommandBarItemProps]] = js.native
  /**
    * Show only an icon for this item, not text.
    * Does not apply if item is in the overflow.
    * @defaultvalue false
    */
  var iconOnly: js.UndefOr[Boolean] = js.native
  /**
    * Context under which the item is being rendered.
    * This value is mutated by the CommandBar and is useful for adjusting the `onRender` function.
    */
  var renderedInOverflow: js.UndefOr[Boolean] = js.native
  /**
    * Props for the tooltip when in `iconOnly` mode.
    */
  var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.native
}

object ICommandBarItemProps {
  @scala.inline
  def apply(key: String): ICommandBarItemProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarItemProps]
  }
  @scala.inline
  implicit class ICommandBarItemPropsOps[Self <: ICommandBarItemProps] (val x: Self) extends AnyVal {
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
    def setButtonStyles(value: IButtonStyles): Self = this.set("buttonStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyles: Self = this.set("buttonStyles", js.undefined)
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    @scala.inline
    def setCommandBarButtonAs(value: IComponentAs[ICommandBarItemProps]): Self = this.set("commandBarButtonAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandBarButtonAs: Self = this.set("commandBarButtonAs", js.undefined)
    @scala.inline
    def setIconOnly(value: Boolean): Self = this.set("iconOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconOnly: Self = this.set("iconOnly", js.undefined)
    @scala.inline
    def setRenderedInOverflow(value: Boolean): Self = this.set("renderedInOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedInOverflow: Self = this.set("renderedInOverflow", js.undefined)
    @scala.inline
    def setTooltipHostProps(value: ITooltipHostProps): Self = this.set("tooltipHostProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipHostProps: Self = this.set("tooltipHostProps", js.undefined)
  }
  
}

