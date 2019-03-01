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
    endCallback: js.Function0[scala.Unit],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("endCallback")(endCallback)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionElement]
  }
}

