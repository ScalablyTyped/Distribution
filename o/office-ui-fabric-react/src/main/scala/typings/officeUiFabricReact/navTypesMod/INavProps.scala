package typings.officeUiFabricReact.navTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavProps extends js.Object {
  /**
    * (Optional) The nav container aria label.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Additional css class to apply to the Nav
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the INav interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[INav]] = js.native
  /**
    * (Optional) The nav container aria label. The link name is prepended to this label.
    * If not provided, the aria label will default to the link name.
    *
    * @deprecated - Use expandAriaLabel and collapseAriaLabel on groups instead
    */
  var expandButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * A collection of link groups to display in the navigation bar
    */
  var groups: js.Array[INavLinkGroup] | Null = js.native
  /**
    * (Optional) The key of the nav item initially selected.
    */
  var initialSelectedKey: js.UndefOr[String] = js.native
  /**
    * Indicates whether the navigation component renders on top of other content in the UI
    */
  var isOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Render a custom link in place of the normal one.
    * This replaces the entire button rather than simply button content
    */
  var linkAs: js.UndefOr[IComponentAs[INavButtonProps]] = js.native
  /**
    * Function callback invoked when a link in the navigation is clicked
    */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.native
  /**
    * Function callback invoked when the chevron on a link is clicked
    */
  var onLinkExpandClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.native
  /**
    * Used to customize how content inside the group header is rendered
    * @defaultvalue Default group header rendering
    */
  var onRenderGroupHeader: js.UndefOr[IRenderFunction[IRenderGroupHeaderProps]] = js.native
  /**
    * Used to customize how content inside the link tag is rendered
    * @defaultvalue Default link rendering
    */
  var onRenderLink: js.UndefOr[IRenderFunction[INavLink]] = js.native
  /**
    * (Deprecated) Use ariaCurrent on links instead
    * @deprecated Use ariaCurrent on links instead
    */
  var selectedAriaLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) The key of the nav item selected by caller.
    */
  var selectedKey: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[INavStyleProps, INavStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object INavProps {
  @scala.inline
  def apply(): INavProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavProps]
  }
  @scala.inline
  implicit class INavPropsOps[Self <: INavProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ INav | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[INav]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setExpandButtonAriaLabel(value: String): Self = this.set("expandButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandButtonAriaLabel: Self = this.set("expandButtonAriaLabel", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: INavLinkGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[INavLinkGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsNull: Self = this.set("groups", null)
    @scala.inline
    def setInitialSelectedKey(value: String): Self = this.set("initialSelectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelectedKey: Self = this.set("initialSelectedKey", js.undefined)
    @scala.inline
    def setIsOnTop(value: Boolean): Self = this.set("isOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOnTop: Self = this.set("isOnTop", js.undefined)
    @scala.inline
    def setLinkAs(value: IComponentAs[INavButtonProps]): Self = this.set("linkAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkAs: Self = this.set("linkAs", js.undefined)
    @scala.inline
    def setOnLinkClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit
    ): Self = this.set("onLinkClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLinkClick: Self = this.set("onLinkClick", js.undefined)
    @scala.inline
    def setOnLinkExpandClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit
    ): Self = this.set("onLinkExpandClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLinkExpandClick: Self = this.set("onLinkExpandClick", js.undefined)
    @scala.inline
    def setOnRenderGroupHeader(
      value: (/* props */ js.UndefOr[IRenderGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IRenderGroupHeaderProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderGroupHeader", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderGroupHeader: Self = this.set("onRenderGroupHeader", js.undefined)
    @scala.inline
    def setOnRenderLink(
      value: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLink], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderLink", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderLink: Self = this.set("onRenderLink", js.undefined)
    @scala.inline
    def setSelectedAriaLabel(value: String): Self = this.set("selectedAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedAriaLabel: Self = this.set("selectedAriaLabel", js.undefined)
    @scala.inline
    def setSelectedKey(value: String): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
    @scala.inline
    def setStylesFunction1(value: INavStyleProps => DeepPartial[INavStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[INavStyleProps, INavStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

