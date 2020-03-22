package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScrollX
  extends /* propName */ StringDictionary[js.Any] {
  var scrollX: Double
  var scrollY: Double
}

object AnonScrollX {
  @scala.inline
  def apply(scrollX: Double, scrollY: Double, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonScrollX]
  }
}

