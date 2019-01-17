package typings
package atOracleOraclejetLib.ojradiosetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRadiosetSettableProperties[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueSettableProperties[js.Any, js.Any, js.Any] {
  var labelledBy: java.lang.String | scala.Null
  var optionRenderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionContext[D], 
      stdLib.Element
    ]) | scala.Null
  ] = js.undefined
  var options: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var optionsKeys: js.UndefOr[atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionsKeys] = js.undefined
  var required: scala.Boolean
  @JSName("translations")
  var translations_ojRadiosetSettableProperties: atOracleOraclejetLib.Anon_Required
}

