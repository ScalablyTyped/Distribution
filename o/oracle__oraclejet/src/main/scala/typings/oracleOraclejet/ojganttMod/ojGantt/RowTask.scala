package typings.oracleOraclejet.ojganttMod.ojGantt

import typings.oracleOraclejet.AnonEnd
import typings.oracleOraclejet.AnonValue
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.milestone
import typings.oracleOraclejet.oracleOraclejetStrings.normal
import typings.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowTask[K2] extends js.Object {
  var baseline: js.UndefOr[AnonEnd] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: K2
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[String | js.Array[String]] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var progress: js.UndefOr[AnonValue] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[normal | milestone | summary | auto] = js.undefined
}

object RowTask {
  @scala.inline
  def apply[K2](
    id: K2,
    baseline: AnonEnd = null,
    borderRadius: String = null,
    end: String = null,
    height: Int | Double = null,
    label: String = null,
    labelPosition: String | js.Array[String] = null,
    labelStyle: js.Object = null,
    progress: AnonValue = null,
    shortDesc: String = null,
    start: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: normal | milestone | summary | auto = null
  ): RowTask[K2] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowTask[K2]]
  }
}

