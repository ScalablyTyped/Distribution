package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action
  extends /* propName */ StringDictionary[js.Any] {
  var action: String
  var element: Element
}

object Anon_Action {
  @scala.inline
  def apply(action: String, element: Element, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, element = element)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Action]
  }
}

