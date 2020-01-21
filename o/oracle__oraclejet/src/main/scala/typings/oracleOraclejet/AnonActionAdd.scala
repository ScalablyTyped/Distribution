package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.add
import typings.oracleOraclejet.oracleOraclejetStrings.remove
import typings.oracleOraclejet.oracleOraclejetStrings.update
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionAdd
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
}

object AnonActionAdd {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonActionAdd = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonActionAdd]
  }
}

