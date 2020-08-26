package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.officeUiFabricReact.scrollablePaneBaseMod.ScrollablePaneBase
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneProps extends HTMLAttributes[HTMLElement | ScrollablePaneBase] {
  /**
    * Optional callback to access the IScrollablePane interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IScrollablePane]] = js.native
  /**
    * Sets the initial scroll position of the ScrollablePane
    */
  var initialScrollPosition: js.UndefOr[Double] = js.native
  var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IScrollablePaneProps {
  @scala.inline
  def apply(): IScrollablePaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollablePaneProps]
  }
  @scala.inline
  implicit class IScrollablePanePropsOps[Self <: IScrollablePaneProps] (val x: Self) extends AnyVal {
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
    def setComponentRefFunction1(value: /* ref */ IScrollablePane | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IScrollablePane]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setInitialScrollPosition(value: Double): Self = this.set("initialScrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialScrollPosition: Self = this.set("initialScrollPosition", js.undefined)
    @scala.inline
    def setScrollbarVisibility(value: ScrollbarVisibility): Self = this.set("scrollbarVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarVisibility: Self = this.set("scrollbarVisibility", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IScrollablePaneStyleProps => DeepPartial[IScrollablePaneStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

