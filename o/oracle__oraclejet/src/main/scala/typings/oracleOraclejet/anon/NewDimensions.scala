package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewDimensions
  extends /* key */ StringDictionary[js.Any] {
  var header: String | Double
  var newDimensions: HeightWidth
  var oldDimensions: HeightWidth
}

object NewDimensions {
  @scala.inline
  def apply(
    header: String | Double,
    newDimensions: HeightWidth,
    oldDimensions: HeightWidth,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): NewDimensions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NewDimensions]
  }
}

