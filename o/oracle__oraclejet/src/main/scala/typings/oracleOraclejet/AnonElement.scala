package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: String
  var element: Element
  def endCallback(): Unit
}

object AnonElement {
  @scala.inline
  def apply(
    action: String,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonElement]
  }
}

