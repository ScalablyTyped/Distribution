package typings.officeUiFabricReact.contextualMenuItemTypesMod

import typings.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemProps extends HTMLAttributes[IContextualMenuItemProps] {
  /**
    * Classnames for different aspects of a menu item
    */
  var classNames: IMenuItemClassNames = js.native
  /**
    * Optional callback to access the IContextualMenuRenderItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
    * If dismissAll is true, all menus will be closed.
    */
  var dismissMenu: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
    */
  var dismissSubMenu: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * This prop will get set by the wrapping component and will return the element that wraps this ContextualMenuItem.
    * Used for openSubMenu.
    */
  var getSubmenuTarget: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.native
  /**
    * If this item has icons
    */
  var hasIcons: js.UndefOr[Boolean] = js.native
  /**
    * Index of the item
    */
  var index: Double = js.native
  /**
    * The item to display
    */
  var item: IContextualMenuItem = js.native
  /**
    * Click handler for the checkmark
    */
  var onCheckmarkClick: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ MouseEvent[HTMLElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  /**
    * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
    */
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IContextualMenuItemProps {
  @scala.inline
  def apply(classNames: IMenuItemClassNames, index: Double, item: IContextualMenuItem): IContextualMenuItemProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemProps]
  }
  @scala.inline
  implicit class IContextualMenuItemPropsOps[Self <: IContextualMenuItemProps] (val x: Self) extends AnyVal {
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
    def setClassNames(value: IMenuItemClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: IContextualMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IContextualMenuRenderItem | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IContextualMenuRenderItem]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDismissMenu(value: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit): Self = this.set("dismissMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDismissMenu: Self = this.set("dismissMenu", js.undefined)
    @scala.inline
    def setDismissSubMenu(value: () => Unit): Self = this.set("dismissSubMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDismissSubMenu: Self = this.set("dismissSubMenu", js.undefined)
    @scala.inline
    def setGetSubmenuTarget(value: () => js.UndefOr[HTMLElement]): Self = this.set("getSubmenuTarget", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubmenuTarget: Self = this.set("getSubmenuTarget", js.undefined)
    @scala.inline
    def setHasIcons(value: Boolean): Self = this.set("hasIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasIcons: Self = this.set("hasIcons", js.undefined)
    @scala.inline
    def setOnCheckmarkClick(
      value: (/* item */ IContextualMenuItem, /* ev */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onCheckmarkClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCheckmarkClick: Self = this.set("onCheckmarkClick", js.undefined)
    @scala.inline
    def setOpenSubMenu(value: (/* item */ js.Any, /* target */ HTMLElement) => Unit): Self = this.set("openSubMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOpenSubMenu: Self = this.set("openSubMenu", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IContextualMenuItemStyleProps => DeepPartial[IContextualMenuItemStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

