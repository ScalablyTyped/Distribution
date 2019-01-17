package typings
package atOracleOraclejetLib.ojcheckboxsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCheckboxsetSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Array[js.Any], js.Array[js.Any], js.Array[js.Any]] {
  var labelledBy: java.lang.String | scala.Null
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys] = js.undefined
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojCheckboxsetSettableProperties: atOracleOraclejetLib.Anon_Required
  @JSName("value")
  var value_ojCheckboxsetSettableProperties: js.Array[_]
}

