package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionAdd
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: atOracleOraclejetLib.atOracleOraclejetLibStrings.add | atOracleOraclejetLib.atOracleOraclejetLibStrings.remove | atOracleOraclejetLib.atOracleOraclejetLibStrings.update
  var element: stdLib.Element
}

object Anon_ActionAdd {
  @scala.inline
  def apply(
    action: atOracleOraclejetLib.atOracleOraclejetLibStrings.add | atOracleOraclejetLib.atOracleOraclejetLibStrings.remove | atOracleOraclejetLib.atOracleOraclejetLibStrings.update,
    element: stdLib.Element,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionAdd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("element")(element)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionAdd]
  }
}

