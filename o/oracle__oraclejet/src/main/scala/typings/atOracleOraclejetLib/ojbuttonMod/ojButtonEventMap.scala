package typings
package atOracleOraclejetLib.ojbuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonEventMap[SP /* <: ojButtonSettableProperties */]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[SP] {
  var chromingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
  ]
  var disabledChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Boolean]
  var displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  ]
  var ojAction: atOracleOraclejetLib.ojbuttonMod.ojButtonNs.ojAction
}

