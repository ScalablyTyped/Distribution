package typings.officeUiFabricReact.fabricTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.officeUiFabricReact.officeUiFabricReactStrings.ltr
import typings.officeUiFabricReact.officeUiFabricReactStrings.rtl
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFabricProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Applies the current body background specified in the theme to the root element.
    */
  var applyTheme: js.UndefOr[Boolean] = js.native
  /**
    * Applies the current body background specified in the theme to the body element.
    */
  var applyThemeToBody: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the root element type, defaults to `div`.
    */
  var as: js.UndefOr[ElementType[_]] = js.native
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  /**
    * Specifies the direction of the content. Will inject a `dir` attribute, and also ensure that the `rtl` flag of the
    * contextual theme object is set correctly so that css registered with merge-styles can be auto flipped correctly.
    */
  @JSName("dir")
  var dir_IFabricProps: js.UndefOr[rtl | ltr | auto] = js.native
  /**
    * Overrides the styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]] = js.native
  /**
    * Injected by the `styled` HOC wrapper.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IFabricProps {
  @scala.inline
  def apply(): IFabricProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFabricProps]
  }
  @scala.inline
  implicit class IFabricPropsOps[Self <: IFabricProps] (val x: Self) extends AnyVal {
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
    def setApplyTheme(value: Boolean): Self = this.set("applyTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyTheme: Self = this.set("applyTheme", js.undefined)
    @scala.inline
    def setApplyThemeToBody(value: Boolean): Self = this.set("applyThemeToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyThemeToBody: Self = this.set("applyThemeToBody", js.undefined)
    @scala.inline
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDir(value: rtl | ltr | auto): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IFabricStyleProps => DeepPartial[IFabricStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

