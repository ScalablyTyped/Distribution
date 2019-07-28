package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.atOracleOraclejetStrings.add
import typings.atOracleOraclejet.atOracleOraclejetStrings.remove
import typings.atOracleOraclejet.atOracleOraclejetStrings.update
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionAddElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: Element
  def endCallback(): Unit
}

object Anon_ActionAddElement {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionAddElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element, endCallback = js.Any.fromFunction0(endCallback))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionAddElement]
  }
}

