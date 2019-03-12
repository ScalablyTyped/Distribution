package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCloseElement
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: atOracleOraclejetLib.atOracleOraclejetLibStrings.open | atOracleOraclejetLib.atOracleOraclejetLibStrings.close
  var element: stdLib.Element
  def endCallback(): scala.Unit
}

object Anon_ActionCloseElement {
  @scala.inline
  def apply(
    action: atOracleOraclejetLib.atOracleOraclejetLibStrings.open | atOracleOraclejetLib.atOracleOraclejetLibStrings.close,
    element: stdLib.Element,
    endCallback: () => scala.Unit,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionCloseElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element, endCallback = js.Any.fromFunction0(endCallback))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionCloseElement]
  }
}

