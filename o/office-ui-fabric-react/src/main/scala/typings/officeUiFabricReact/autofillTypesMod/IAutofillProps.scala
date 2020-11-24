package typings.officeUiFabricReact.autofillTypesMod

import typings.officeUiFabricReact.autofillAutofillMod.Autofill
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutofillProps extends InputHTMLAttributes[HTMLInputElement | Autofill] {
  
  /**
    * Gets the compoonent ref.
    */
  var componentRef: js.UndefOr[IRefObject[IAutofill]] = js.native
  
  /**
    * The default value to be visible. This is different from placeholder
    * because it actually sets the current value of the picker
    * Note: This will only be set upon component creation
    * and will not update with subsequent prop updates.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.native
  
  /**
    * When the user uses left arrow, right arrow, clicks, or deletes text autofill is disabled
    * Since the user has taken control. It is automatically reenabled when the user enters text and the
    * cursor is at the end of the text in the input box. This specifies other key presses that will reenabled
    * autofill.
    * @defaultvalue [KeyCodes.down, KeyCodes.up]
    */
  var enableAutofillOnKeyPress: js.UndefOr[js.Array[KeyCodes]] = js.native
  
  /**
    * A callback used to modify the input string.
    *
    * @param composing - true if the change event was triggered while the
    * inner input was in the middle of a multi-character composition.
    * (for example, jp-hiragana IME input)
    */
  var onInputChange: js.UndefOr[js.Function2[/* value */ String, /* composing */ Boolean, String]] = js.native
  
  /**
    * A callback for when the current input value changes.
    *
    * @param composing - true if the change event was triggered while the
    * inner input was in the middle of a multi-character composition.
    * (for example, jp-hiragana IME input)
    */
  var onInputValueChange: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /**
    * Should the value of the input be selected? True if we're focused on our input, false otherwise.
    * We need to explicitly not select the text in the autofill if we are no longer focused.
    * In IE11, selecting a input will also focus the input, causing other element's focus to be stolen.
    */
  var preventValueSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Handler for checking if the full value of the input should
    * be seleced in componentDidUpdate
    *
    * @returns - should the full value of the input be selected?
    */
  var shouldSelectFullInputValueInComponentDidUpdate: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * The suggested autofill value that will display.
    */
  var suggestedDisplayValue: js.UndefOr[String] = js.native
  
  /**
    * Handler for checking and updating the value if needed
    * in componentWillReceiveProps
    *
    * @returns - the updated value to set, if needed
    */
  var updateValueInWillReceiveProps: js.UndefOr[js.Function0[String | Null]] = js.native
}
object IAutofillProps {
  
  @scala.inline
  def apply(): IAutofillProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutofillProps]
  }
  
  @scala.inline
  implicit class IAutofillPropsOps[Self <: IAutofillProps] (val x: Self) extends AnyVal {
    
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
    def setComponentRefFunction1(value: /* ref */ IAutofill | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IAutofill]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDefaultVisibleValue(value: String): Self = this.set("defaultVisibleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVisibleValue: Self = this.set("defaultVisibleValue", js.undefined)
    
    @scala.inline
    def setEnableAutofillOnKeyPressVarargs(value: KeyCodes*): Self = this.set("enableAutofillOnKeyPress", js.Array(value :_*))
    
    @scala.inline
    def setEnableAutofillOnKeyPress(value: js.Array[KeyCodes]): Self = this.set("enableAutofillOnKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutofillOnKeyPress: Self = this.set("enableAutofillOnKeyPress", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: (/* value */ String, /* composing */ Boolean) => String): Self = this.set("onInputChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setOnInputValueChange(value: (/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean]) => Unit): Self = this.set("onInputValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInputValueChange: Self = this.set("onInputValueChange", js.undefined)
    
    @scala.inline
    def setPreventValueSelection(value: Boolean): Self = this.set("preventValueSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventValueSelection: Self = this.set("preventValueSelection", js.undefined)
    
    @scala.inline
    def setShouldSelectFullInputValueInComponentDidUpdate(value: () => Boolean): Self = this.set("shouldSelectFullInputValueInComponentDidUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShouldSelectFullInputValueInComponentDidUpdate: Self = this.set("shouldSelectFullInputValueInComponentDidUpdate", js.undefined)
    
    @scala.inline
    def setSuggestedDisplayValue(value: String): Self = this.set("suggestedDisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDisplayValue: Self = this.set("suggestedDisplayValue", js.undefined)
    
    @scala.inline
    def setUpdateValueInWillReceiveProps(value: () => String | Null): Self = this.set("updateValueInWillReceiveProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdateValueInWillReceiveProps: Self = this.set("updateValueInWillReceiveProps", js.undefined)
  }
}
