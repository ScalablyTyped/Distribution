package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputDateSettableProperties
  extends atOracleOraclejetLib.ojinputtextMod.inputBaseSettableProperties[java.lang.String, java.lang.String, java.lang.String] {
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  var datePicker: atOracleOraclejetLib.`Anon_`
  var dayMetaData: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
    ]
  ]
  var keyboardEdit: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  var max: java.lang.String | scala.Null
  var min: java.lang.String | scala.Null
  var pickerAttributes: atOracleOraclejetLib.Anon_Class
  var renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  @JSName("translations")
  var translations_ojInputDateSettableProperties: atOracleOraclejetLib.Anon_CurrentText
  def dayFormatter(param: atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput): scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
}

object ojInputDateSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[java.lang.String]],
    autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String,
    autofocus: scala.Boolean,
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter,
    datePicker: atOracleOraclejetLib.`Anon_`,
    dayFormatter: js.Function1[
      atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterInput, 
      scala.Null | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs.DayFormatterOutput
    ],
    dayMetaData: org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[
        org.scalablytyped.runtime.StringDictionary[atOracleOraclejetLib.Anon_ClassNameDisabled]
      ]
    ],
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    keyboardEdit: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    pickerAttributes: atOracleOraclejetLib.Anon_Class,
    placeholder: java.lang.String,
    rawValue: java.lang.String,
    readonly: scala.Boolean,
    renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_CurrentText,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: java.lang.String,
    describedBy: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    validators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null
  ): ojInputDateSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncValidators")(asyncValidators)
    __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    __obj.updateDynamic("autofocus")(autofocus)
    __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    __obj.updateDynamic("datePicker")(datePicker)
    __obj.updateDynamic("dayFormatter")(dayFormatter)
    __obj.updateDynamic("dayMetaData")(dayMetaData)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpHints")(helpHints)
    __obj.updateDynamic("keyboardEdit")(keyboardEdit.asInstanceOf[js.Any])
    __obj.updateDynamic("labelHint")(labelHint)
    __obj.updateDynamic("messagesCustom")(messagesCustom)
    __obj.updateDynamic("pickerAttributes")(pickerAttributes)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("rawValue")(rawValue)
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojInputDateSettableProperties]
  }
}

