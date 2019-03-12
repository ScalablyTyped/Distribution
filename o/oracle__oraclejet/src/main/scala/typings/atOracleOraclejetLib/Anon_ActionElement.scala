package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionElement
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: java.lang.String
  var element: stdLib.Element
  def endCallback(): scala.Unit
}

object Anon_ActionElement {
  @scala.inline
  def apply(
    action: java.lang.String,
    element: stdLib.Element,
    endCallback: () => scala.Unit,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionElement = {
    val __obj = js.Dynamic.literal(action = action, element = element, endCallback = js.Any.fromFunction0(endCallback))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionElement]
  }
}

