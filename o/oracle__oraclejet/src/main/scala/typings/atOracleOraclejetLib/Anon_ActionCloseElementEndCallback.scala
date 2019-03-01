package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCloseElementEndCallback
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: atOracleOraclejetLib.atOracleOraclejetLibStrings.open | atOracleOraclejetLib.atOracleOraclejetLibStrings.close
  var element: stdLib.Element
  def endCallback(): scala.Unit
}

object Anon_ActionCloseElementEndCallback {
  @scala.inline
  def apply(
    action: atOracleOraclejetLib.atOracleOraclejetLibStrings.open | atOracleOraclejetLib.atOracleOraclejetLibStrings.close,
    element: stdLib.Element,
    endCallback: js.Function0[scala.Unit],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionCloseElementEndCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("endCallback")(endCallback)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionCloseElementEndCallback]
  }
}

