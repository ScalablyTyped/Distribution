package typings
package atOracleOraclejetLib.ojganttMod.ojGanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowTask[K2] extends js.Object {
  var baseline: js.UndefOr[atOracleOraclejetLib.Anon_BorderRadiusEnd] = js.undefined
  var borderRadius: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var id: K2
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelPosition: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var progress: js.UndefOr[atOracleOraclejetLib.Anon_BorderRadiusHeightSvgClassName] = js.undefined
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.normal | atOracleOraclejetLib.atOracleOraclejetLibStrings.milestone | atOracleOraclejetLib.atOracleOraclejetLibStrings.summary | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
}

object RowTask {
  @scala.inline
  def apply[K2](
    id: K2,
    baseline: atOracleOraclejetLib.Anon_BorderRadiusEnd = null,
    borderRadius: java.lang.String = null,
    end: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    labelPosition: java.lang.String | js.Array[java.lang.String] = null,
    labelStyle: js.Object = null,
    progress: atOracleOraclejetLib.Anon_BorderRadiusHeightSvgClassName = null,
    shortDesc: java.lang.String = null,
    start: java.lang.String = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.normal | atOracleOraclejetLib.atOracleOraclejetLibStrings.milestone | atOracleOraclejetLib.atOracleOraclejetLibStrings.summary | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null
  ): RowTask[K2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (end != null) __obj.updateDynamic("end")(end)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (start != null) __obj.updateDynamic("start")(start)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowTask[K2]]
  }
}

