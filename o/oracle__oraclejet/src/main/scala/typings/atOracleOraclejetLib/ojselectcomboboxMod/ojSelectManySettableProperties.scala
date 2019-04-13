package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectManySettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[
      js.Array[js.Any] | scala.Null, 
      js.Array[js.Any] | scala.Null, 
      js.Array[js.Any] | scala.Null
    ] {
  var minimumResultsForSearch: scala.Double
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue
  var pickerAttributes: atOracleOraclejetLib.Anon_Class
  var placeholder: java.lang.String | scala.Null
  var readOnly: scala.Boolean
  var renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojSelectManySettableProperties: atOracleOraclejetLib.Anon_FilterFurtherMoreMatchesFound
  var valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null
  @JSName("value")
  var value_ojSelectManySettableProperties: js.Array[_] | scala.Null
}

object ojSelectManySettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.^],
    minimumResultsForSearch: scala.Double,
    optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue,
    pickerAttributes: atOracleOraclejetLib.Anon_Class,
    readOnly: scala.Boolean,
    renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_FilterFurtherMoreMatchesFound,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    describedBy: java.lang.String = null,
    optionRenderer: /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext => stdLib.Element = null,
    options: (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) = null,
    placeholder: java.lang.String = null,
    value: js.Array[_] = null,
    valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] = null
  ): ojSelectManySettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, labelHint = labelHint, messagesCustom = messagesCustom, minimumResultsForSearch = minimumResultsForSearch, optionsKeys = optionsKeys, pickerAttributes = pickerAttributes, readOnly = readOnly, renderMode = renderMode.asInstanceOf[js.Any], required = required, translations = translations, valid = valid.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueOptions != null) __obj.updateDynamic("valueOptions")(valueOptions)
    __obj.asInstanceOf[ojSelectManySettableProperties[K, D]]
  }
}

