package typings.officeUiFabricReact.overlayTypesMod

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
trait IOverlayProps extends HTMLAttributes[HTMLElement] {
  /**
    * Allow body scroll on touch devices. Changing after mounting has no effect.
    * @defaultvalue false
    */
  var allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IOverlay]] = js.native
  /**
    * Whether to use the dark-themed overlay.
    * @defaultvalue false
    */
  var isDarkThemed: js.UndefOr[Boolean] = js.native
  @JSName("onClick")
  var onClick_IOverlayProps: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IOverlayProps {
  @scala.inline
  def apply(): IOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayProps]
  }
  @scala.inline
  implicit class IOverlayPropsOps[Self <: IOverlayProps] (val x: Self) extends AnyVal {
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
    def setAllowTouchBodyScroll(value: Boolean): Self = this.set("allowTouchBodyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTouchBodyScroll: Self = this.set("allowTouchBodyScroll", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IOverlay | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IOverlay]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setIsDarkThemed(value: Boolean): Self = this.set("isDarkThemed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDarkThemed: Self = this.set("isDarkThemed", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IOverlayStyleProps => DeepPartial[IOverlayStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

