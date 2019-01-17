package typings
package atOracleOraclejetLib.ojtimeaxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisEventMap
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentEventMap[ojTimeAxisSettableProperties] {
  var converterChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
  ]
  var endChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var scaleChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years
  ]
  var startChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
}

