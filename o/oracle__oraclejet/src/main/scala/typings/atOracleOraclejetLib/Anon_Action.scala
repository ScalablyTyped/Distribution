package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: java.lang.String
  var element: stdLib.Element
}

object Anon_Action {
  @scala.inline
  def apply(
    action: java.lang.String,
    element: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("element")(element)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Action]
  }
}

