package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Children
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.FilterFurther
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojselectcombobox.ojComboboxManySettableProperties<K, D>> */
@js.native
trait ojComboboxManySettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var asyncValidators: js.UndefOr[js.Array[AsyncValidator[js.Array[_]]]] = js.native
  var converter: js.UndefOr[Converter[_] | RegisteredConverter | Null] = js.native
  var describedBy: js.UndefOr[String | Null] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var displayOptions: js.UndefOr[ConverterHint] = js.native
  var help: js.UndefOr[Instruction] = js.native
  var helpHints: js.UndefOr[Definition] = js.native
  var labelHint: js.UndefOr[String] = js.native
  var messagesCustom: js.UndefOr[js.Array[^]] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null] = js.native
  var options: js.UndefOr[
    (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) | Null
  ] = js.native
  var optionsKeys: js.UndefOr[Children] = js.native
  var pickerAttributes: js.UndefOr[Class] = js.native
  var placeholder: js.UndefOr[String | Null] = js.native
  var rawValue: js.UndefOr[String | Null] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[FilterFurther] = js.native
  var valid: js.UndefOr[
    typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
  var validators: js.UndefOr[(js.Array[Validator[js.Array[_]] | RegisteredValidator]) | Null] = js.native
  var value: js.UndefOr[js.Array[_] | Null] = js.native
  var valueOptions: js.UndefOr[js.Array[LabelValue] | Null] = js.native
}

object ojComboboxManySettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojComboboxManySettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojComboboxManySettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojComboboxManySettablePropertiesLenientOps[Self <: ojComboboxManySettablePropertiesLenient[_, _], K, D] (val x: Self with (ojComboboxManySettablePropertiesLenient[K, D])) extends AnyVal {
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
    def setAsyncValidatorsVarargs(value: AsyncValidator[js.Array[js.Any]]*): Self = this.set("asyncValidators", js.Array(value :_*))
    @scala.inline
    def setAsyncValidators(value: js.Array[AsyncValidator[js.Array[_]]]): Self = this.set("asyncValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncValidators: Self = this.set("asyncValidators", js.undefined)
    @scala.inline
    def setConverter(value: Converter[_] | RegisteredConverter): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setConverterNull: Self = this.set("converter", null)
    @scala.inline
    def setDescribedBy(value: String): Self = this.set("describedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescribedBy: Self = this.set("describedBy", js.undefined)
    @scala.inline
    def setDescribedByNull: Self = this.set("describedBy", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisplayOptions(value: ConverterHint): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    @scala.inline
    def setHelp(value: Instruction): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHelpHints(value: Definition): Self = this.set("helpHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpHints: Self = this.set("helpHints", js.undefined)
    @scala.inline
    def setLabelHint(value: String): Self = this.set("labelHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHint: Self = this.set("labelHint", js.undefined)
    @scala.inline
    def setMessagesCustomVarargs(value: ^ *): Self = this.set("messagesCustom", js.Array(value :_*))
    @scala.inline
    def setMessagesCustom(value: js.Array[^]): Self = this.set("messagesCustom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesCustom: Self = this.set("messagesCustom", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setOptionRenderer(value: /* param0 */ OptionContext => Element): Self = this.set("optionRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOptionRenderer: Self = this.set("optionRenderer", js.undefined)
    @scala.inline
    def setOptionRendererNull: Self = this.set("optionRenderer", null)
    @scala.inline
    def setOptionsVarargs(
      value: (typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup)*
    ): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(
      value: (js.Array[
          typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
        ]) | (DataProvider[K, D])
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
    @scala.inline
    def setOptionsKeys(value: Children): Self = this.set("optionsKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsKeys: Self = this.set("optionsKeys", js.undefined)
    @scala.inline
    def setPickerAttributes(value: Class): Self = this.set("pickerAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerAttributes: Self = this.set("pickerAttributes", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    @scala.inline
    def setRawValue(value: String): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawValue: Self = this.set("rawValue", js.undefined)
    @scala.inline
    def setRawValueNull: Self = this.set("rawValue", null)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTranslations(value: FilterFurther): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    @scala.inline
    def setValidatorsVarargs(value: (Validator[js.Array[js.Any]] | RegisteredValidator)*): Self = this.set("validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: js.Array[Validator[js.Array[_]] | RegisteredValidator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
    @scala.inline
    def setValidatorsNull: Self = this.set("validators", null)
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    @scala.inline
    def setValueOptionsVarargs(value: LabelValue*): Self = this.set("valueOptions", js.Array(value :_*))
    @scala.inline
    def setValueOptions(value: js.Array[LabelValue]): Self = this.set("valueOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueOptions: Self = this.set("valueOptions", js.undefined)
    @scala.inline
    def setValueOptionsNull: Self = this.set("valueOptions", null)
  }
  
}

