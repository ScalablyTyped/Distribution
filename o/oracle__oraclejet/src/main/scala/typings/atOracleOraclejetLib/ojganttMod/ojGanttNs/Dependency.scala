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

object Dependency {
  @scala.inline
  def apply[K1, K2](
    id: K1,
    predecessorTaskId: K2,
    successorTaskId: K2,
    shortDesc: java.lang.String = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.startStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.startFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishStart = null
  ): Dependency[K1, K2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("predecessorTaskId")(predecessorTaskId.asInstanceOf[js.Any])
    __obj.updateDynamic("successorTaskId")(successorTaskId.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency[K1, K2]]
  }
}

