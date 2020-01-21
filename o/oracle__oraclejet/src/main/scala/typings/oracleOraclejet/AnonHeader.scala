package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader
  extends /* propName */ StringDictionary[js.Any] {
  var header: String | Double
  var newDimensions: AnonHeight
  var oldDimensions: AnonHeight
}

object AnonHeader {
  @scala.inline
  def apply(
    header: String | Double,
    newDimensions: AnonHeight,
    oldDimensions: AnonHeight,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonHeader]
  }
}

