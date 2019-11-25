package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.close
import typings.atOracleOraclejet.atOracleOraclejetStrings.open
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionClose
  extends /* propName */ StringDictionary[js.Any] {
  var action: open | close
  var element: Element
}

object Anon_ActionClose {
  @scala.inline
  def apply(
    action: open | close,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionClose = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionClose]
  }
}

