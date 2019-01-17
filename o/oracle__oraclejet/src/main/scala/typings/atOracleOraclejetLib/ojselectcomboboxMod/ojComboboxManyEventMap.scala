package typings
package atOracleOraclejetLib.ojselectcomboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojComboboxManyEventMap[K, D]
  extends ojComboboxEventMap[
      js.Array[js.Any] | scala.Null, 
      ojComboboxManySettableProperties[K, D], 
      js.Array[js.Any] | scala.Null, 
      java.lang.String
    ] {
  var asyncValidatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[js.Array[_]]]
  ]
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[_] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter | scala.Null
  ]
  var minLengthChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojComboboxManyEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxManyNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojComboboxManyEventMap: atOracleOraclejetLib.ojselectcomboboxMod.ojComboboxManyNs.ojAnimateStart
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
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[js.Array[_]] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]) | scala.Null
  ]
  @JSName("valueChanged")
  var valueChanged_ojComboboxManyEventMap: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[_] | scala.Null]
  var valueOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_LabelValue] | scala.Null]
}

