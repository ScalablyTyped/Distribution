package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typings.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrowArrowConcave extends js.Object {
  var color: String
  var endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object AnonArrowArrowConcave {
  @scala.inline
  def apply(
    color: String,
    endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): AnonArrowArrowConcave = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endConnectorType = endConnectorType.asInstanceOf[js.Any], startConnectorType = startConnectorType.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrowArrowConcave]
  }
}

