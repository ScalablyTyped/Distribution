package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionAddElement
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var action: atOracleOraclejetLib.atOracleOraclejetLibStrings.add | atOracleOraclejetLib.atOracleOraclejetLibStrings.remove | atOracleOraclejetLib.atOracleOraclejetLibStrings.update
  var element: stdLib.Element
  def endCallback(): scala.Unit
}

object Anon_ActionAddElement {
  @scala.inline
  def apply(
    action: atOracleOraclejetLib.atOracleOraclejetLibStrings.add | atOracleOraclejetLib.atOracleOraclejetLibStrings.remove | atOracleOraclejetLib.atOracleOraclejetLibStrings.update,
    element: stdLib.Element,
    endCallback: js.Function0[scala.Unit],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ActionAddElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("endCallback")(endCallback)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ActionAddElement]
  }
}

