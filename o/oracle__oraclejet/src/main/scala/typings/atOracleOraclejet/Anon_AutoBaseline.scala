package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.milestone
import typings.atOracleOraclejet.atOracleOraclejetStrings.normal
import typings.atOracleOraclejet.atOracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBaseline extends js.Object {
  var baseline: js.UndefOr[Anon_BorderRadius] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var labelPosition: js.UndefOr[String | js.Array[String]] = js.undefined
  var progress: js.UndefOr[Anon_BorderRadiusHeight] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[normal | milestone | summary | auto] = js.undefined
}

object Anon_AutoBaseline {
  @scala.inline
  def apply(
    baseline: Anon_BorderRadius = null,
    borderRadius: String = null,
    height: Int | Double = null,
    labelPosition: String | js.Array[String] = null,
    progress: Anon_BorderRadiusHeight = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: normal | milestone | summary | auto = null
  ): Anon_AutoBaseline = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoBaseline]
  }
}

