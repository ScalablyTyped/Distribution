package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.milestone
import typings.oracleOraclejet.oracleOraclejetStrings.normal
import typings.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseline extends js.Object {
  var baseline: js.UndefOr[AnonSvgClassName] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var labelPosition: js.UndefOr[String | js.Array[String]] = js.undefined
  var progress: js.UndefOr[AnonSvgStyle] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[normal | milestone | summary | auto] = js.undefined
}

object AnonBaseline {
  @scala.inline
  def apply(
    baseline: AnonSvgClassName = null,
    borderRadius: String = null,
    height: Int | Double = null,
    labelPosition: String | js.Array[String] = null,
    progress: AnonSvgStyle = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: normal | milestone | summary | auto = null
  ): AnonBaseline = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseline]
  }
}

