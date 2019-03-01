package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionClose
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: atOracleOraclejetLib.atOracleOraclejetLibStrings.open | atOracleOraclejetLib.atOracleOraclejetLibStrings.close
  var element: stdLib.Element
}

object Anon_ActionClose {
  @scala.inline
  def apply(
    action: atOracleOraclejetLib.atOracleOraclejetLibStrings.open | atOracleOraclejetLib.atOracleOraclejetLibStrings.close,
    element: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionClose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("element")(element)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionClose]
  }
}

