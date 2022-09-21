package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.FormEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldTypesMod {
  
  trait IMaskedTextFieldProps
    extends StObject
       with ITextFieldProps
  object IMaskedTextFieldProps {
    
    inline def apply(): IMaskedTextFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMaskedTextFieldProps]
    }
  }
  
  trait ITextField extends StObject {
    
    /** Blurs the input */
    def blur(): Unit
    
    /** Sets focus to the input. */
    def focus(): Unit
    
    /** Select the value of the text field. */
    def select(): Unit
    
    /** Gets the selection end of the text field. Returns -1 if there is no selection. */
    var selectionEnd: Double | Null
    
    /** Gets the selection start of the text field. Returns -1 if there is no selection. */
    var selectionStart: Double | Null
    
    /** Sets the selection end of the text field to a specified value. */
    def setSelectionEnd(value: Double): Unit
    
    /**
      * Sets the start and end positions of a selection in a text field.
      * Call with start and end set to the same value to set the cursor position.
      * @param start - Index of the start of the selection.
      * @param end - Index of the end of the selection.
      */
    def setSelectionRange(start: Double, end: Double): Unit
    
    /** Sets the selection start of the text field to a specified value. */
    def setSelectionStart(value: Double): Unit
    
    /** Gets the current value of the input. */
    var value: js.UndefOr[String] = js.undefined
  }
  object ITextField {
    
    inline def apply(
      blur: () => Unit,
      focus: () => Unit,
      select: () => Unit,
      setSelectionEnd: Double => Unit,
      setSelectionRange: (Double, Double) => Unit,
      setSelectionStart: Double => Unit
    ): ITextField = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), select = js.Any.fromFunction0(select), setSelectionEnd = js.Any.fromFunction1(setSelectionEnd), setSelectionRange = js.Any.fromFunction2(setSelectionRange), setSelectionStart = js.Any.fromFunction1(setSelectionStart), selectionEnd = null, selectionStart = null)
      __obj.asInstanceOf[ITextField]
    }
    
    extension [Self <: ITextField](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setSelect(value: () => Unit): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
      
      inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectionEndNull: Self = StObject.set(x, "selectionEnd", null)
      
      inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      inline def setSelectionStartNull: Self = StObject.set(x, "selectionStart", null)
      
      inline def setSetSelectionEnd(value: Double => Unit): Self = StObject.set(x, "setSelectionEnd", js.Any.fromFunction1(value))
      
      inline def setSetSelectionRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setSelectionRange", js.Any.fromFunction2(value))
      
      inline def setSetSelectionStart(value: Double => Unit): Self = StObject.set(x, "setSelectionStart", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ITextFieldProps
    extends StObject
       with AllHTMLAttributes[HTMLInputElement | HTMLTextAreaElement] {
    
    /**
      * Aria label for the text field.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * For multiline text fields, whether or not to auto adjust text field height.
      * @defaultvalue false
      */
    var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the text field is borderless.
      * @defaultvalue false
      */
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the reveal password button for input type `'password'` (will be ignored unless
      * the `type` prop is set to `'password'`).
      */
    var canRevealPassword: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional callback to access the ITextField component. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ITextField]] = js.undefined
    
    /**
      * Default value of the text field. Only provide this if the text field is an uncontrolled component;
      * otherwise, use the `value` property.
      */
    @JSName("defaultValue")
    var defaultValue_ITextFieldProps: js.UndefOr[String] = js.undefined
    
    /**
      * Text field will start to validate after users stop typing for `deferredValidationTime` milliseconds.
      * Updates to this prop will not be respected.
      * @defaultvalue 200
      */
    var deferredValidationTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Description displayed below the text field to provide additional details about what text to enter.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Static error message displayed below the text field. Use `onGetErrorMessage` to dynamically
      * change the error message displayed (if any) based on the current value. `errorMessage` and
      * `onGetErrorMessage` are mutually exclusive (`errorMessage` takes precedence).
      */
    var errorMessage: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Props for an optional icon, displayed in the far right end of the text field.
      */
    var iconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Optional class name that is added specifically to the input/textarea element.
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Only used by `MaskedTextField`, which now has a separate `IMaskedTextFieldProps` interface.
      */
    var mask: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Only used by `MaskedTextField`, which now has a separate `IMaskedTextFieldProps` interface.
      */
    var maskChar: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Only used by `MaskedTextField`, which now has a separate `IMaskedTextFieldProps` interface.
      */
    var maskFormat: js.UndefOr[StringDictionary[js.RegExp]] = js.undefined
    
    /**
      * Whether or not the text field is a multiline text field.
      * @defaultvalue false
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
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
      ] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Function called after validation completes.
      */
    var onNotifyValidationResult: js.UndefOr[
        js.Function2[/* errorMessage */ String | Element, /* value */ js.UndefOr[String], Unit]
      ] = js.undefined
    
    /**
      * Custom renderer for the description.
      */
    var onRenderDescription: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
    
    /**
      * Custom renderer for the actual single-line input field (not used if `multiline` is true).
      * This receives the processed props which would usually be passed to the `<input>` element
      * and allows manually modifying them or rendering as a different element. (Use with care,
      * since changes here could easily break the component.)
      */
    var onRenderInput: js.UndefOr[
        IRenderFunction[InputHTMLAttributes[HTMLInputElement] & RefAttributes[HTMLInputElement]]
      ] = js.undefined
    
    /**
      * Custom renderer for the label.
      * If you don't call defaultRender, ensure that you give your custom-rendered label an id and that
      * you set the textfield's aria-labelledby prop to that id.
      */
    var onRenderLabel: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
    
    /**
      * Custom render function for prefix.
      */
    var onRenderPrefix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
    
    /**
      * Custom render function for suffix.
      */
    var onRenderSuffix: js.UndefOr[IRenderFunction[ITextFieldProps]] = js.undefined
    
    /**
      * For multiline text fields, whether or not the field is resizable.
      * @defaultvalue true
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]] = js.undefined
    
    /**
      * Suffix displayed after the text field contents. This is not included in the value.
      * Ensure a descriptive label is present to assist screen readers, as the value does not include the suffix.
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Whether or not the text field is underlined.
      * @defaultvalue false
      */
    var underlined: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run validation when focus moves into the input, and **do not** validate on change.
      *
      * (Unless this prop and/or `validateOnFocusOut` is set to true, validation will run on every change.)
      * @defaultvalue false
      */
    var validateOnFocusIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run validation when focus moves out of the input, and **do not** validate on change.
      *
      * (Unless this prop and/or `validateOnFocusIn` is set to true, validation will run on every change.)
      * @defaultvalue false
      */
    var validateOnFocusOut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether validation should run when the input is initially rendered.
      * @defaultvalue true
      */
    var validateOnLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current value of the text field. Only provide this if the text field is a controlled component where you
      * are maintaining its current state; otherwise, use the `defaultValue` property.
      */
    @JSName("value")
    var value_ITextFieldProps: js.UndefOr[String] = js.undefined
  }
  object ITextFieldProps {
    
    inline def apply(): ITextFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextFieldProps]
    }
    
    extension [Self <: ITextFieldProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setCanRevealPassword(value: Boolean): Self = StObject.set(x, "canRevealPassword", value.asInstanceOf[js.Any])
      
      inline def setCanRevealPasswordUndefined: Self = StObject.set(x, "canRevealPassword", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ITextField]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ITextField | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDeferredValidationTime(value: Double): Self = StObject.set(x, "deferredValidationTime", value.asInstanceOf[js.Any])
      
      inline def setDeferredValidationTimeUndefined: Self = StObject.set(x, "deferredValidationTime", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setErrorMessage(value: String | Element): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
      
      inline def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
      
      inline def setMaskFormat(value: StringDictionary[js.RegExp]): Self = StObject.set(x, "maskFormat", value.asInstanceOf[js.Any])
      
      inline def setMaskFormatUndefined: Self = StObject.set(x, "maskFormat", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ FormEvent[HTMLInputElement | HTMLTextAreaElement], /* newValue */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnGetErrorMessage(value: /* value */ String => js.UndefOr[String | Element | (js.Thenable[String | Element])]): Self = StObject.set(x, "onGetErrorMessage", js.Any.fromFunction1(value))
      
      inline def setOnGetErrorMessageUndefined: Self = StObject.set(x, "onGetErrorMessage", js.undefined)
      
      inline def setOnNotifyValidationResult(value: (/* errorMessage */ String | Element, /* value */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onNotifyValidationResult", js.Any.fromFunction2(value))
      
      inline def setOnNotifyValidationResultUndefined: Self = StObject.set(x, "onNotifyValidationResult", js.undefined)
      
      inline def setOnRenderDescription(
        value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderDescription", js.Any.fromFunction2(value))
      
      inline def setOnRenderDescriptionUndefined: Self = StObject.set(x, "onRenderDescription", js.undefined)
      
      inline def setOnRenderInput(
        value: (/* props */ js.UndefOr[InputHTMLAttributes[HTMLInputElement] & RefAttributes[HTMLInputElement]], /* defaultRender */ js.UndefOr[
              js.Function1[
                /* props */ js.UndefOr[InputHTMLAttributes[HTMLInputElement] & RefAttributes[HTMLInputElement]], 
                Element | Null
              ]
            ]) => Element | Null
      ): Self = StObject.set(x, "onRenderInput", js.Any.fromFunction2(value))
      
      inline def setOnRenderInputUndefined: Self = StObject.set(x, "onRenderInput", js.undefined)
      
      inline def setOnRenderLabel(
        value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderLabel", js.Any.fromFunction2(value))
      
      inline def setOnRenderLabelUndefined: Self = StObject.set(x, "onRenderLabel", js.undefined)
      
      inline def setOnRenderPrefix(
        value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPrefix", js.Any.fromFunction2(value))
      
      inline def setOnRenderPrefixUndefined: Self = StObject.set(x, "onRenderPrefix", js.undefined)
      
      inline def setOnRenderSuffix(
        value: (/* props */ js.UndefOr[ITextFieldProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITextFieldProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderSuffix", js.Any.fromFunction2(value))
      
      inline def setOnRenderSuffixUndefined: Self = StObject.set(x, "onRenderSuffix", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ITextFieldStyleProps, ITextFieldStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ITextFieldStyleProps => DeepPartial[ITextFieldStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      inline def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
      
      inline def setValidateOnFocusIn(value: Boolean): Self = StObject.set(x, "validateOnFocusIn", value.asInstanceOf[js.Any])
      
      inline def setValidateOnFocusInUndefined: Self = StObject.set(x, "validateOnFocusIn", js.undefined)
      
      inline def setValidateOnFocusOut(value: Boolean): Self = StObject.set(x, "validateOnFocusOut", value.asInstanceOf[js.Any])
      
      inline def setValidateOnFocusOutUndefined: Self = StObject.set(x, "validateOnFocusOut", js.undefined)
      
      inline def setValidateOnLoad(value: Boolean): Self = StObject.set(x, "validateOnLoad", value.asInstanceOf[js.Any])
      
      inline def setValidateOnLoadUndefined: Self = StObject.set(x, "validateOnLoad", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TextField/TextField.types.ITextFieldProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TextField/TextField.types.ITextFieldProps, 'className' | 'disabled' | 'inputClassName' | 'required' | 'multiline' | 'borderless' | 'resizable' | 'underlined' | 'autoAdjustHeight'> & {  hasErrorMessage :boolean | undefined,   hasIcon :boolean | undefined,   hasLabel :boolean | undefined,   focused :boolean | undefined,   hasRevealButton :boolean | undefined} */
  trait ITextFieldStyleProps extends StObject {
    
    var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Element has focus. */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** Element has an error message. */
    var hasErrorMessage: js.UndefOr[Boolean] = js.undefined
    
    /** Element has an icon. */
    var hasIcon: js.UndefOr[Boolean] = js.undefined
    
    /** Element has a label. */
    var hasLabel: js.UndefOr[Boolean] = js.undefined
    
    /** Element has a peek button for passwords */
    var hasRevealButton: js.UndefOr[Boolean] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
    
    var underlined: js.UndefOr[Boolean] = js.undefined
  }
  object ITextFieldStyleProps {
    
    inline def apply(theme: ITheme): ITextFieldStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextFieldStyleProps]
    }
    
    extension [Self <: ITextFieldStyleProps](x: Self) {
      
      inline def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHasErrorMessage(value: Boolean): Self = StObject.set(x, "hasErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setHasErrorMessageUndefined: Self = StObject.set(x, "hasErrorMessage", js.undefined)
      
      inline def setHasIcon(value: Boolean): Self = StObject.set(x, "hasIcon", value.asInstanceOf[js.Any])
      
      inline def setHasIconUndefined: Self = StObject.set(x, "hasIcon", js.undefined)
      
      inline def setHasLabel(value: Boolean): Self = StObject.set(x, "hasLabel", value.asInstanceOf[js.Any])
      
      inline def setHasLabelUndefined: Self = StObject.set(x, "hasLabel", js.undefined)
      
      inline def setHasRevealButton(value: Boolean): Self = StObject.set(x, "hasRevealButton", value.asInstanceOf[js.Any])
      
      inline def setHasRevealButtonUndefined: Self = StObject.set(x, "hasRevealButton", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      inline def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
    }
  }
  
  trait ITextFieldStyles extends StObject {
    
    /**
      * Style for description element.
      */
    var description: IStyle
    
    /**
      * Style for error message element.
      */
    var errorMessage: IStyle
    
    /**
      * Style for main field entry element.
      */
    var field: IStyle
    
    /**
      * Style for field group encompassing entry area (prefix, field, icon and suffix).
      */
    var fieldGroup: IStyle
    
    /**
      * Style for icon prop element.
      */
    var icon: IStyle
    
    /**
      * Style for prefix element.
      */
    var prefix: IStyle
    
    /**
      * Styling for reveal password button
      */
    var revealButton: IStyle
    
    /**
      * Styling for reveal password icon
      */
    var revealIcon: IStyle
    
    /**
      * Styling for reveal password span
      */
    var revealSpan: IStyle
    
    /**
      * Style for root element.
      */
    var root: IStyle
    
    /**
      * Styling for subcomponents.
      */
    var subComponentStyles: ITextFieldSubComponentStyles
    
    /**
      * Style for suffix element.
      */
    var suffix: IStyle
    
    /**
      * Style for TextField wrapper element.
      */
    var wrapper: IStyle
  }
  object ITextFieldStyles {
    
    inline def apply(subComponentStyles: ITextFieldSubComponentStyles): ITextFieldStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextFieldStyles]
    }
    
    extension [Self <: ITextFieldStyles](x: Self) {
      
      inline def setDescription(value: IStyle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setErrorMessage(value: IStyle): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setField(value: IStyle): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldGroup(value: IStyle): Self = StObject.set(x, "fieldGroup", value.asInstanceOf[js.Any])
      
      inline def setFieldGroupNull: Self = StObject.set(x, "fieldGroup", null)
      
      inline def setFieldGroupUndefined: Self = StObject.set(x, "fieldGroup", js.undefined)
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPrefix(value: IStyle): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRevealButton(value: IStyle): Self = StObject.set(x, "revealButton", value.asInstanceOf[js.Any])
      
      inline def setRevealButtonNull: Self = StObject.set(x, "revealButton", null)
      
      inline def setRevealButtonUndefined: Self = StObject.set(x, "revealButton", js.undefined)
      
      inline def setRevealIcon(value: IStyle): Self = StObject.set(x, "revealIcon", value.asInstanceOf[js.Any])
      
      inline def setRevealIconNull: Self = StObject.set(x, "revealIcon", null)
      
      inline def setRevealIconUndefined: Self = StObject.set(x, "revealIcon", js.undefined)
      
      inline def setRevealSpan(value: IStyle): Self = StObject.set(x, "revealSpan", value.asInstanceOf[js.Any])
      
      inline def setRevealSpanNull: Self = StObject.set(x, "revealSpan", null)
      
      inline def setRevealSpanUndefined: Self = StObject.set(x, "revealSpan", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSubComponentStyles(value: ITextFieldSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: IStyle): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setWrapper(value: IStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperNull: Self = StObject.set(x, "wrapper", null)
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait ITextFieldSubComponentStyles extends StObject {
    
    /**
      * Styling for Label child component.
      */
    var label: IStyleFunctionOrObject[Any, Any]
  }
  object ITextFieldSubComponentStyles {
    
    inline def apply(label: IStyleFunctionOrObject[Any, Any]): ITextFieldSubComponentStyles = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextFieldSubComponentStyles]
    }
    
    extension [Self <: ITextFieldSubComponentStyles](x: Self) {
      
      inline def setLabel(value: IStyleFunctionOrObject[Any, Any]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Any => DeepPartial[Any]): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    }
  }
}
