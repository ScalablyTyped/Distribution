package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartGroup
  extends /* propName */ StringDictionary[js.Any] {
  var endGroup: String
  var startGroup: String
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object AnonStartGroup {
  @scala.inline
  def apply(
    endGroup: String,
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonStartGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonStartGroup]
  }
}

