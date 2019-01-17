package typings
package atOracleOraclejetLib.ojganttMod.ojGanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Dependency[K1, K2] extends js.Object {
  var id: K1
  var predecessorTaskId: K2
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var successorTaskId: K2
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.startStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.startFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishStart
  ] = js.undefined
}

