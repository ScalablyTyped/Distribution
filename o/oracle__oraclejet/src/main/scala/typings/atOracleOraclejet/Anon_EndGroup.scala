package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndGroup
  extends /* propName */ StringDictionary[js.Any] {
  var endGroup: String
  var items: js.Array[String]
  var selectionData: js.Array[Anon_DataGroupData]
  var startGroup: String
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object Anon_EndGroup {
  @scala.inline
  def apply(
    endGroup: String,
    items: js.Array[String],
    selectionData: js.Array[Anon_DataGroupData],
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_EndGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup, items = items, selectionData = selectionData, startGroup = startGroup, xMax = xMax, xMin = xMin, yMax = yMax, yMin = yMin)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_EndGroup]
  }
}

