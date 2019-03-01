package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndGroup
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var endGroup: java.lang.String
  var items: js.Array[java.lang.String]
  var selectionData: js.Array[Anon_DataGroupData]
  var startGroup: java.lang.String
  var xMax: scala.Double
  var xMin: scala.Double
  var yMax: scala.Double
  var yMin: scala.Double
}

object Anon_EndGroup {
  @scala.inline
  def apply(
    endGroup: java.lang.String,
    items: js.Array[java.lang.String],
    selectionData: js.Array[Anon_DataGroupData],
    startGroup: java.lang.String,
    xMax: scala.Double,
    xMin: scala.Double,
    yMax: scala.Double,
    yMin: scala.Double,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_EndGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endGroup")(endGroup)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("selectionData")(selectionData)
    __obj.updateDynamic("startGroup")(startGroup)
    __obj.updateDynamic("xMax")(xMax)
    __obj.updateDynamic("xMin")(xMin)
    __obj.updateDynamic("yMax")(yMax)
    __obj.updateDynamic("yMin")(yMin)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_EndGroup]
  }
}

