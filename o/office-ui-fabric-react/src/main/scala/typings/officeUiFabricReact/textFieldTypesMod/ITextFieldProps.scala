package typings.officeUiFabricReact.textFieldTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.RegExp
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextFieldProps extends AllHTMLAttributes[HTMLInputElement | HTMLTextAreaElement] {
  
  /**
    * Aria label for the text field.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * For multiline text fields, whether or not to auto adjust text field height.
    * @defaultvalue false
    */
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the text field is borderless.
    * @defaultvalue false
    */
  var borderless: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the reveal password button for input type `'password'` (will be ignored unless
    * the `type` prop is set to `'password'`).
    */
  var canRevealPassword: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional callback to access the ITextField component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITextField]] = js.native
  
  /**
    * Default value of the text field. Only provide this if the text field is an uncontrolled component;
    * otherwise, use the `value` property.
    */
  @JSName("defaultValue")
  var defaultValue_ITextFieldProps: js.UndefOr[String] = js.native
  
  /**
    * Text field will start to validate after users stop typing for `deferredValidationTime` milliseconds.
    * Updates to this prop will not be respected.
    * @defaultvalue 200
    */
  var deferredValidationTime: js.UndefOr[Double] = js.native
  
  /**
    * Description displayed below the text field to provide additional details about what text to enter.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Static error message displayed below the text field. Use `onGetErrorMessage` to dynamically
    * change the error message displayed (if any) based on the current value. `errorMessage` and
    * `onGetErrorMessage` are mutually exclusive (`errorMessage` takes precedence).
    */
  var errorMessage: js.UndefOr[String | Element] = js.native
  
  /**
    * Props for an optional icon, displayed in the far right end of the text field.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * Optional class name that is added specifically to the input/textarea element.
    */
  var inputClassName: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Only used by `MaskedTextField`, which now has a separate `IMaskedTextFieldProps` interface.
    */
  var mask: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Only used by `MaskedTextField`, which now has a separate `IMaskedTextFieldProps` interface.
    */
  var maskChar: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Only used by `MaskedTextField`, which now has a separate `IMaskedTextFieldProps` interface.
    */
  var maskFormat: js.UndefOr[StringDictionary[RegExp]] = js.native
  
  /**
    * Whether or not the text field is a multiline text field.
    * @defaultvalue false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback for when the input value changes.
    * This is called on both `input` and `change` events.
    * (In a later version, this will probably only be called for the `change` event.)
    */
  @JSName("onChange")
  var onChange_ITextFieldProps: js.UndefOr[
    js.Function2[
      /* event */ FormEvent[HTMLInputElement | HTMLTextAreaElement], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Function used to determine whether the input value is valid and get an error message if not.
    * Mutually exclusive with the static string `errorMessage` (it will take precedence over this).
    *
    * When it returns `string | JSX.Element`:
    * - If valid, it returns empty string.
    * - If invalid, it returns the error message and the text field will
    *   show a red border and show an error message below the text field.
    *
    * When it returns `Promise<string | JSX.Element>`:
    * - The resolved value is displayed as the error message.
    * - If rejected, the value is thrown away.
    */
  var onGetErrorMessage: js.UndefOr[
    js.Function1[/* value */ String, js.UndefOr[String | Element | (js.Thenable[String | Element])]]
  ] = js.native
  
  /**
    * Function called after validation completes.
    */
  var onNotifyValidationResult: js.UndefOr[
    js.Function2[/* errorMessage */ String | Element, /* value */ js.UndefOr[String], Unit]
  ] = js.native
  
  /**
    * Custom renderer for the description.
    */
  var onRenderDescription: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  
  /**
    * Custom renderer for the label.
    * If you don't call defaultRender, ensure that you give your custom-rendered label an id and that
    * you set the textfield's aria-labelledby prop to that id.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  
  /**
    * Custom render function for prefix.
    */
  var onRenderPrefix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  
  /**
    * Custom render function for suffix.
    */
  var onRenderSuffix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.native
  
  /**
    * For multiline text fields, whether or not the field is resizable.
    * @defaultvalue true
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]] = js.native
  
  /**
    * Suffix displayed after the text field contents. This is not included in the value.
    * Ensure a descriptive label is present to assist screen readers, as the value does not include the suffix.
    */
  var suffix: js.UndefOr[String] = js.native
  
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Whether or not the text field is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.native
  
  /**
    * Run validation when focus moves into the input, and **do not** validate on change.
    *
    * (Unless this prop and/or `validateOnFocusOut` is set to true, validation will run on every change.)
    * @defaultvalue false
    */
  var validateOnFocusIn: js.UndefOr[Boolean] = js.native
  
  /**
    * Run validation when focus moves out of the input, and **do not** validate on change.
    *
    * (Unless this prop and/or `validateOnFocusIn` is set to true, validation will run on every change.)
    * @defaultvalue false
    */
  var validateOnFocusOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether validation should run when the input is initially rendered.
    * @defaultvalue true
    */
  var validateOnLoad: js.UndefOr[Boolean] = js.native
  
  /**
    * Current value of the text field. Only provide this if the text field is a controlled component where you
    * are maintaining its current state; otherwise, use the `defaultValue` property.
    */
  @JSName("value")
  var value_ITextFieldProps: js.UndefOr[String] = js.native
}
object ITextFieldProps {
  
  @scala.inline
  def apply(): ITextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextFieldProps]
  }
  
  @scala.inline
  implicit class ITextFieldPropsOps[Self <: ITextFieldProps] (val x: Self) extends AnyVal {
    
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
    def setAutoAdjustHeight(value: Boolean): Self = this.set("autoAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdjustHeight: Self = this.set("autoAdjustHeight", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setCanRevealPassword(value: Boolean): Self = this.set("canRevealPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRevealPassword: Self = this.set("canRevealPassword", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ITextField | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ITextField]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDeferredValidationTime(value: Double): Self = this.set("deferredValidationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredValidationTime: Self = this.set("deferredValidationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String | Element): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskChar(value: String): Self = this.set("maskChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskChar: Self = this.set("maskChar", js.undefined)
    
    @scala.inline
    def setMaskFormat(value: StringDictionary[RegExp]): Self = this.set("maskFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskFormat: Self = this.set("maskFormat", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* event */ FormEvent[HTMLInputElement | HTMLTextAreaElement], /* newValue */ js.UndefOr[String]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnGetErrorMessage(value: /* value */ String => js.UndefOr[String | Element | (js.Thenable[String | Element])]): Self = this.set("onGetErrorMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetErrorMessage: Self = this.set("onGetErrorMessage", js.undefined)
    
    @scala.inline
    def setOnNotifyValidationResult(value: (/* errorMessage */ String | Element, /* value */ js.UndefOr[String]) => Unit): Self = this.set("onNotifyValidationResult", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnNotifyValidationResult: Self = this.set("onNotifyValidationResult", js.undefined)
    
    @scala.inline
    def setOnRenderDescription(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderDescription", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderDescription: Self = this.set("onRenderDescription", js.undefined)
    
    @scala.inline
    def setOnRenderLabel(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderLabel: Self = this.set("onRenderLabel", js.undefined)
    
    @scala.inline
    def setOnRenderPrefix(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPrefix", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderPrefix: Self = this.set("onRenderPrefix", js.undefined)
    
    @scala.inline
    def setOnRenderSuffix(
      value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderSuffix", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderSuffix: Self = this.set("onRenderSuffix", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ITextFieldStyleProps => DeepPartial[ITextFieldStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUnderlined(value: Boolean): Self = this.set("underlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlined: Self = this.set("underlined", js.undefined)
    
    @scala.inline
    def setValidateOnFocusIn(value: Boolean): Self = this.set("validateOnFocusIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnFocusIn: Self = this.set("validateOnFocusIn", js.undefined)
    
    @scala.inline
    def setValidateOnFocusOut(value: Boolean): Self = this.set("validateOnFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnFocusOut: Self = this.set("validateOnFocusOut", js.undefined)
    
    @scala.inline
    def setValidateOnLoad(value: Boolean): Self = this.set("validateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnLoad: Self = this.set("validateOnLoad", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
