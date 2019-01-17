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

