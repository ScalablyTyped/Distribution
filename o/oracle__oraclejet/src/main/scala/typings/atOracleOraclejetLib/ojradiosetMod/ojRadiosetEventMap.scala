package typings
package atOracleOraclejetLib.ojradiosetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRadiosetEventMap[K, D]
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueEventMap[js.Any, ojRadiosetSettableProperties[K, D], js.Any, js.Any] {
  var labelledByChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojRadiosetEventMap: atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojRadiosetEventMap: atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.ojAnimateStart
  var optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      (js.Function1[
        /* param0 */ atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionContext[D], 
        stdLib.Element
      ]) | scala.Null
    ]
  ]
  var optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.UndefOr[atOracleOraclejetLib.ojradiosetMod.ojRadiosetNs.OptionsKeys]]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  @JSName("valueChanged")
  var valueChanged_ojRadiosetEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
}

