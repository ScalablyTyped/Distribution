package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectOneEventMap[K, D]
  extends ojSelectEventMap[js.Any, ojSelectOneSettableProperties[K, D], js.Any] {
  var minimumResultsForSearchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojSelectOneEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectOneNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojSelectOneEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectOneNs.ojAnimateStart
  var optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      (js.Function1[
        /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.OptionContext, 
        stdLib.Element
      ]) | scala.Null
    ]
  ]
  var optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojSelectNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  ]
  var optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildrenLabelValue]
  var pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class]
  var placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var readOnlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var renderModeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  ]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  @JSName("valueChanged")
  var valueChanged_ojSelectOneEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var valueOptionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_LabelValue]
}

