package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.add
import typings.atOracleOraclejet.atOracleOraclejetStrings.remove
import typings.atOracleOraclejet.atOracleOraclejetStrings.update
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionAdd
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
}

object Anon_ActionAdd {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionAdd = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionAdd]
  }
}

