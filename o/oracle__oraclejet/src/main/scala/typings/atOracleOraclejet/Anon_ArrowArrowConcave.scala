package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.arrow
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowConcave
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowOpen
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangleRounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowArrowConcave extends js.Object {
  var color: String
  var endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object Anon_ArrowArrowConcave {
  @scala.inline
  def apply(
    color: String,
    endConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    startConnectorType: arrowOpen | arrow | arrowConcave | circle | rectangle | rectangleRounded | none,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): Anon_ArrowArrowConcave = {
    val __obj = js.Dynamic.literal(color = color, endConnectorType = endConnectorType.asInstanceOf[js.Any], startConnectorType = startConnectorType.asInstanceOf[js.Any], svgClassName = svgClassName, svgStyle = svgStyle, width = width)
  
    __obj.asInstanceOf[Anon_ArrowArrowConcave]
  }
}

