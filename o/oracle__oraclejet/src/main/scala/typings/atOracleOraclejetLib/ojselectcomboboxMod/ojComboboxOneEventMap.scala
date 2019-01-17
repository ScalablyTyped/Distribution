package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxOneEventMap[K, D]
  extends ojComboboxEventMap[js.Any, ojComboboxOneSettableProperties[K, D], js.Any, java.lang.String] {
  var asyncValidatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[_]]]
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
  ]
  var filterOnOpenChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rawValue
  ]
  var minLengthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojComboboxOneEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojComboboxOneEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojAnimateStart
  var ojValueUpdated: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxOneNs.ojValueUpdated
  var optionRendererChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.UndefOr[
      (js.Function1[
        /* param0 */ atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.OptionContext, 
        stdLib.Element
      ]) | scala.Null
    ]
  ]
  var optionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Option | atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxNs.Optgroup
    ]) | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  ]
  var optionsKeysChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ChildKeysChildren]
  var pickerAttributesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Class]
  var placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var rawValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var readOnlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var validatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    (js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]) | scala.Null
  ]
  @JSName("valueChanged")
  var valueChanged_ojComboboxOneEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var valueOptionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_LabelValue]
}

