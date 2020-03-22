package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndGroup
  extends /* propName */ StringDictionary[js.Any] {
  var endGroup: String
  var items: js.Array[String]
  var selectionData: js.Array[AnonGroupData]
  var startGroup: String
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object AnonEndGroup {
  @scala.inline
  def apply(
    endGroup: String,
    items: js.Array[String],
    selectionData: js.Array[AnonGroupData],
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonEndGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionData = selectionData.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonEndGroup]
  }
}

