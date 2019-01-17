package typings
package atOracleOraclejetLib.ojinputnumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputNumberEventMap
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueEventMap[
      scala.Double | scala.Null, 
      ojInputNumberSettableProperties, 
      scala.Double | scala.Null, 
      java.lang.String
    ] {
  var asyncValidatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[scala.Double]]
  ]
  var autocompleteChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String
  ]
  var autofocusChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  ]
  var maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojInputNumberEventMap: atOracleOraclejetLib.ojinputnumberMod.ojInputNumberNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojInputNumberEventMap: atOracleOraclejetLib.ojinputnumberMod.ojInputNumberNs.ojAnimateStart
  var placeholderChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var rawValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var readonlyChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean | scala.Null]
  var requiredChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var stepChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var validatorsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[scala.Double] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ]
  ]
  var virtualKeyboardChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.number | atOracleOraclejetLib.atOracleOraclejetLibStrings.text
  ]
}

