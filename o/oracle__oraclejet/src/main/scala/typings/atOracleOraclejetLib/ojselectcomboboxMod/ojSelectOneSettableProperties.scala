package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectOneSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Any, js.Any, js.Any] {
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
  var translations_ojSelectOneSettableProperties: atOracleOraclejetLib.Anon_FilterFurtherMoreMatchesFound
  var valueOption: atOracleOraclejetLib.Anon_LabelValue
}

object ojSelectOneSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    minimumResultsForSearch: scala.Double,
    optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue,
    pickerAttributes: atOracleOraclejetLib.Anon_Class,
    readOnly: scala.Boolean,
    renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native,
    required: scala.Boolean,
    translations: atOracleOraclejetLib.Anon_FilterFurtherMoreMatchesFound,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: js.Any,
    valueOption: atOracleOraclejetLib.Anon_LabelValue,
    describedBy: java.lang.String = null,
    optionRenderer: js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
      stdLib.Element
    ] = null,
    options: (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) = null,
    placeholder: java.lang.String = null
  ): ojSelectOneSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("helpHints")(helpHints)
    __obj.updateDynamic("labelHint")(labelHint)
    __obj.updateDynamic("messagesCustom")(messagesCustom)
    __obj.updateDynamic("minimumResultsForSearch")(minimumResultsForSearch)
    __obj.updateDynamic("optionsKeys")(optionsKeys)
    __obj.updateDynamic("pickerAttributes")(pickerAttributes)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("valueOption")(valueOption)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(optionRenderer)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[ojSelectOneSettableProperties[K, D]]
  }
}

