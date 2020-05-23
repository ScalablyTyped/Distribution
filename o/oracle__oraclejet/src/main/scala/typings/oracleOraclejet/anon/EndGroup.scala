package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndGroup
  extends /* key */ StringDictionary[js.Any] {
  var endGroup: String
  var items: js.Array[String]
  var selectionData: js.Array[GroupData]
  var startGroup: String
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object EndGroup {
  @scala.inline
  def apply(
    endGroup: String,
    items: js.Array[String],
    selectionData: js.Array[GroupData],
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): EndGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionData = selectionData.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EndGroup]
  }
}

