package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.close
import typings.oracleOraclejet.oracleOraclejetStrings.open
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndCallback
  extends /* propName */ StringDictionary[js.Any] {
  var action: open | close
  var element: Element
  def endCallback(): Unit
}

object AnonEndCallback {
  @scala.inline
  def apply(
    action: open | close,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonEndCallback]
  }
}

