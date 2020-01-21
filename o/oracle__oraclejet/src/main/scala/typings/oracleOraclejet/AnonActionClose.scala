package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.close
import typings.oracleOraclejet.oracleOraclejetStrings.open
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionClose
  extends /* propName */ StringDictionary[js.Any] {
  var action: open | close
  var element: Element
}

object AnonActionClose {
  @scala.inline
  def apply(
    action: open | close,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonActionClose = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonActionClose]
  }
}

