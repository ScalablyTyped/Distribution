package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndGroupPropName
  extends /* propName */ StringDictionary[js.Any] {
  var endGroup: String
  var startGroup: String
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object Anon_EndGroupPropName {
  @scala.inline
  def apply(
    endGroup: String,
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_EndGroupPropName = {
    val __obj = js.Dynamic.literal(endGroup = endGroup, startGroup = startGroup, xMax = xMax, xMin = xMin, yMax = yMax, yMin = yMin)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_EndGroupPropName]
  }
}

