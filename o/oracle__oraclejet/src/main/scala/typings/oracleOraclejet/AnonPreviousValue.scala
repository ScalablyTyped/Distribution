package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousValue
  extends /* propName */ StringDictionary[js.Any] {
  var previousValue: js.Any
  var value: js.Any
}

object AnonPreviousValue {
  @scala.inline
  def apply(
    previousValue: js.Any,
    value: js.Any,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonPreviousValue = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPreviousValue]
  }
}

