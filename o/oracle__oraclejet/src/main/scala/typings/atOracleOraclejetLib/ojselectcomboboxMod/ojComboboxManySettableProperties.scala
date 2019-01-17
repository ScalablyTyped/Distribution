package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxManySettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Array[js.Any] | scala.Null, js.Array[js.Any] | scala.Null, java.lang.String] {
  var asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
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
  var translations_ojComboboxManySettableProperties: atOracleOraclejetLib.Anon_FilterFurther
  var validators: (js.Array[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
  ]) | scala.Null
  var valueOptions: js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null
  @JSName("value")
  var value_ojComboboxManySettableProperties: js.Array[_] | scala.Null
}

