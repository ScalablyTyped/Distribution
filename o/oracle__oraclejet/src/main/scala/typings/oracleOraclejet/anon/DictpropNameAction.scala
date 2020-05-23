package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.close
import typings.oracleOraclejet.oracleOraclejetStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameAction
  extends /* key */ StringDictionary[js.Any] {
  var action: open | close
  var element: typings.std.Element
}

object DictpropNameAction {
  @scala.inline
  def apply(
    action: open | close,
    element: typings.std.Element,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): DictpropNameAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropNameAction]
  }
}

