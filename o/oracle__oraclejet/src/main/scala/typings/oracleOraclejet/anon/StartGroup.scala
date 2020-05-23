package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartGroup
  extends /* key */ StringDictionary[js.Any] {
  var endGroup: String
  var startGroup: String
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object StartGroup {
  @scala.inline
  def apply(
    endGroup: String,
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): StartGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StartGroup]
  }
}

