package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction
  extends /* propName */ StringDictionary[js.Any] {
  var action: String
  var element: Element
}

object AnonAction {
  @scala.inline
  def apply(action: String, element: Element, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonAction]
  }
}

