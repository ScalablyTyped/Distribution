package typings.officeUiFabricReact.labelTypesMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.LabelHTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLLabelElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILabelProps extends LabelHTMLAttributes[HTMLLabelElement] {
  /**
    * Render the root element as another type.
    */
  var as: js.UndefOr[IComponentAs[AllHTMLAttributes[HTMLElement]]] = js.native
  /**
    * Optional callback to access the ILabel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILabel]] = js.native
  /**
    * Renders the label as disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the associated form field is required or not
    * @defaultvalue false
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Styles for the label.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ILabelProps {
  @scala.inline
  def apply(): ILabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabelProps]
  }
  @scala.inline
  implicit class ILabelPropsOps[Self <: ILabelProps] (val x: Self) extends AnyVal {
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
    def setAs(value: IComponentAs[AllHTMLAttributes[HTMLElement]]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ILabel | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ILabel]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ILabelStyleProps => DeepPartial[ILabelStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

