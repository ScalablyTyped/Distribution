package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxOneSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Any, js.Any, java.lang.String] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[_]]
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
  var filterOnOpen: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue
  var minLength: scala.Double
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (js.Array[
    atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
  ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: atOracleOraclejetLib.Anon_ChildKeysChildren
  var pickerAttributes: atOracleOraclejetLib.Anon_Class
  var placeholder: java.lang.String | scala.Null
  val rawValue: java.lang.String | scala.Null
  var readOnly: scala.Boolean
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojComboboxOneSettableProperties: atOracleOraclejetLib.Anon_FilterFurther
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null
  var valueOption: atOracleOraclejetLib.Anon_LabelValue
}

