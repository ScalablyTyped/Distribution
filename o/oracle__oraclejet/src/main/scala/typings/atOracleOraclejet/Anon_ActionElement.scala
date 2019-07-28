package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionElement
  extends /* propName */ StringDictionary[js.Any] {
  var action: String
  var element: Element
  def endCallback(): Unit
}

object Anon_ActionElement {
  @scala.inline
  def apply(
    action: String,
    element: Element,
    endCallback: () => Unit,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_ActionElement = {
    val __obj = js.Dynamic.literal(action = action, element = element, endCallback = js.Any.fromFunction0(endCallback))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionElement]
  }
}

