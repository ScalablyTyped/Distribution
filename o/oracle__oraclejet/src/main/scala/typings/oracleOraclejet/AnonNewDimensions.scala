package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewDimensions
  extends /* propName */ StringDictionary[js.Any] {
  var header: String | Double
  var newDimensions: AnonHeightWidth
  var oldDimensions: AnonHeightWidth
}

object AnonNewDimensions {
  @scala.inline
  def apply(
    header: String | Double,
    newDimensions: AnonHeightWidth,
    oldDimensions: AnonHeightWidth,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonNewDimensions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonNewDimensions]
  }
}

