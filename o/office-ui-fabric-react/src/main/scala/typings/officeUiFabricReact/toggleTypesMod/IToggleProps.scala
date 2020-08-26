package typings.officeUiFabricReact.toggleTypesMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.checkbox
import typings.officeUiFabricReact.officeUiFabricReactStrings.menuitemcheckbox
import typings.officeUiFabricReact.officeUiFabricReactStrings.switch
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToggleProps extends HTMLAttributes[HTMLElement] {
  /**
    * Text for screen-reader to announce as the name of the toggle.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Render the root element as another type.
    */
  var as: js.UndefOr[IComponentAs[HTMLAttributes[HTMLElement]]] = js.native
  /**
    * Checked state of the toggle. If you are maintaining state yourself, use this property.
    * Otherwise use `defaultChecked`.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback to access the IToggle interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IToggle]] = js.native
  /**
    * Optional disabled flag.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the label (not the onText/offText) should be positioned inline with the toggle control.
    * Left (right in RTL) side when on/off text provided VS right (left in RTL) side when no on/off text.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var inlineLabel: js.UndefOr[Boolean] = js.native
  /**
    * Optional keytip for this toggle
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * A label for the toggle.
    */
  var label: js.UndefOr[String | Element] = js.native
  /**
    * @deprecated Use `ariaLabel` for name, and let the metadata convey state
    */
  var offAriaLabel: js.UndefOr[String] = js.native
  /**
    * Text to display when toggle is OFF.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var offText: js.UndefOr[String] = js.native
  /**
    * @deprecated Use `ariaLabel` for name, and let the metadata convey state
    */
  var onAriaLabel: js.UndefOr[String] = js.native
  /**
    * Callback issued when the value changes.
    */
  @JSName("onChange")
  var onChange_IToggleProps: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* checked */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  /**
    * Text to display when toggle is ON.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var onText: js.UndefOr[String] = js.native
  /**
    * (Optional) Specify whether to use the "switch" role (ARIA 1.1) or the checkbox role (ARIA 1.0).
    * If unspecified, defaults to "switch".
    */
  @JSName("role")
  var role_IToggleProps: js.UndefOr[checkbox | switch | menuitemcheckbox] = js.native
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IToggleProps {
  @scala.inline
  def apply(): IToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToggleProps]
  }
  @scala.inline
  implicit class ITogglePropsOps[Self <: IToggleProps] (val x: Self) extends AnyVal {
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
    def setAs(value: IComponentAs[HTMLAttributes[HTMLElement]]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IToggle | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IToggle]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInlineLabel(value: Boolean): Self = this.set("inlineLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineLabel: Self = this.set("inlineLabel", js.undefined)
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    @scala.inline
    def setLabel(value: String | Element): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOffAriaLabel(value: String): Self = this.set("offAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffAriaLabel: Self = this.set("offAriaLabel", js.undefined)
    @scala.inline
    def setOffText(value: String): Self = this.set("offText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffText: Self = this.set("offText", js.undefined)
    @scala.inline
    def setOnAriaLabel(value: String): Self = this.set("onAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAriaLabel: Self = this.set("onAriaLabel", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* checked */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChanged(value: /* checked */ Boolean => Unit): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOnText(value: String): Self = this.set("onText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnText: Self = this.set("onText", js.undefined)
    @scala.inline
    def setRole(value: checkbox | switch | menuitemcheckbox): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IToggleStyleProps => DeepPartial[IToggleStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

