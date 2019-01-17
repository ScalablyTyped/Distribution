package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSelectManyEventMap[K, D]
  extends ojSelectEventMap[
      js.Array[js.Any] | scala.Null, 
      ojSelectManySettableProperties[K, D], 
      js.Array[js.Any] | scala.Null
    ] {
  var minimumResultsForSearchChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojSelectManyEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojSelectManyEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojSelectManyNs.ojAnimateStart
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
  var valueChanged_ojSelectManyEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_] | scala.Null]
  var valueOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null]
}

