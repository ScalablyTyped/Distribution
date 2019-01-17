package typings
package atOracleOraclejetLib.ojcheckboxsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCheckboxsetEventMap[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueEventMap[
      js.Array[js.Any], 
      ojCheckboxsetSettableProperties[K, D], 
      js.Array[js.Any], 
      js.Array[js.Any]
    ] {
  var labelledByChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojCheckboxsetEventMap: atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojCheckboxsetEventMap: atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.ojAnimateStart
  var optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      (js.Function1[
        /* param0 */ atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionContext[D], 
        stdLib.Element
      ]) | scala.Null
    ]
  ]
  var optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojcheckboxsetMod.ojCheckboxsetNs.OptionsKeys]]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  @JSName("valueChanged")
  var valueChanged_ojCheckboxsetEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_]]
}

