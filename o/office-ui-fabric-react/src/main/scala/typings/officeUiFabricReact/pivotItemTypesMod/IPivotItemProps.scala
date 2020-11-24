package typings.officeUiFabricReact.pivotItemTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPivotItemProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Defines whether to always render the pivot item (regardless of whether it is selected or not).
    * Useful if you're rendering content that is expensive to mount.
    *
    * @defaultvalue false
    */
  var alwaysRender: js.UndefOr[Boolean] = js.native
  
  /**
    * The aria label of each pivot link which will read by screen reader instead of linkText.
    *
    * Note that unless you have compelling requirements you should not override aria-label.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  
  /**
    * Props for the header command button. This provides a way to pass in native props, such as data-* and aria-*,
    * for each pivot header/link element.
    */
  var headerButtonProps: js.UndefOr[IButtonProps | (StringDictionary[String | Double | Boolean])] = js.native
  
  /**
    * The text displayed of each pivot link.
    */
  var headerText: js.UndefOr[String] = js.native
  
  /**
    * Defines an optional item count displayed in parentheses just after the `linkText`.
    *
    * Examples: completed (4), Unread (99+)
    */
  var itemCount: js.UndefOr[Double | String] = js.native
  
  /**
    * An optional icon to show next to the pivot link.
    */
  var itemIcon: js.UndefOr[String] = js.native
  
  /**
    * An required key to uniquely identify a pivot item.
    *
    * Note: The 'key' from react props cannot be used inside component.
    */
  var itemKey: js.UndefOr[String] = js.native
  
  /**
    * Optional keytip for this PivotItem.
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  
  /**
    * The text displayed of each pivot link - renaming to `headerText`.
    * @deprecated Use `headerText` instead.
    */
  var linkText: js.UndefOr[String] = js.native
  
  /**
    * Optional custom renderer for the pivot item link.
    */
  var onRenderItemLink: js.UndefOr[IRenderFunction[IPivotItemProps]] = js.native
}
object IPivotItemProps {
  
  @scala.inline
  def apply(): IPivotItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotItemProps]
  }
  
  @scala.inline
  implicit class IPivotItemPropsOps[Self <: IPivotItemProps] (val x: Self) extends AnyVal {
    
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
    def setAlwaysRender(value: Boolean): Self = this.set("alwaysRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysRender: Self = this.set("alwaysRender", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setHeaderButtonProps(value: IButtonProps | (StringDictionary[String | Double | Boolean])): Self = this.set("headerButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderButtonProps: Self = this.set("headerButtonProps", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setItemCount(value: Double | String): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    
    @scala.inline
    def setItemIcon(value: String): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemIcon: Self = this.set("itemIcon", js.undefined)
    
    @scala.inline
    def setItemKey(value: String): Self = this.set("itemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemKey: Self = this.set("itemKey", js.undefined)
    
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    
    @scala.inline
    def setOnRenderItemLink(
      value: (/* props */ js.UndefOr[IPivotItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPivotItemProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderItemLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderItemLink: Self = this.set("onRenderItemLink", js.undefined)
  }
}
