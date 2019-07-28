package typings.atOracleOraclejet.ojganttMod.ojGanttNs

import typings.atOracleOraclejet.atOracleOraclejetStrings.finishFinish
import typings.atOracleOraclejet.atOracleOraclejetStrings.finishStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.startFinish
import typings.atOracleOraclejet.atOracleOraclejetStrings.startStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Dependency[K1, K2] extends js.Object {
  var id: K1
  var predecessorTaskId: K2
  var shortDesc: js.UndefOr[String] = js.undefined
  var successorTaskId: K2
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[startStart | startFinish | finishFinish | finishStart] = js.undefined
}

object Dependency {
  @scala.inline
  def apply[K1, K2](
    id: K1,
    predecessorTaskId: K2,
    successorTaskId: K2,
    shortDesc: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: startStart | startFinish | finishFinish | finishStart = null
  ): Dependency[K1, K2] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency[K1, K2]]
  }
}

