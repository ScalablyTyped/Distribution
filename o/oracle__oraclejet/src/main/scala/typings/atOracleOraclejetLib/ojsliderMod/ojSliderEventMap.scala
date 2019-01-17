package typings
package atOracleOraclejetLib.ojsliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSliderEventMap
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueEventMap[
      scala.Double | scala.Null, 
      ojSliderSettableProperties, 
      scala.Double | scala.Null, 
      scala.Double | scala.Null
    ] {
  var maxChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var minChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojSliderEventMap: atOracleOraclejetLib.ojsliderMod.ojSliderNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojSliderEventMap: atOracleOraclejetLib.ojsliderMod.ojSliderNs.ojAnimateStart
  var orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ]
  var stepChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double | scala.Null]
  var transientValueChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var typeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMin | atOracleOraclejetLib.atOracleOraclejetLibStrings.fromMax | atOracleOraclejetLib.atOracleOraclejetLibStrings.single
  ]
}

