package typings
package atOracleOraclejetLib.ojmessageMod.ojMessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Message extends js.Object {
  var autoTimeout: js.UndefOr[scala.Double] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var closeAffordance: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.defaults
  ] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.error | atOracleOraclejetLib.atOracleOraclejetLibStrings.warning | atOracleOraclejetLib.atOracleOraclejetLibStrings.confirmation | atOracleOraclejetLib.atOracleOraclejetLibStrings.info | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

