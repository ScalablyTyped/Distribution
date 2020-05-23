package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.add
import typings.oracleOraclejet.oracleOraclejetStrings.remove
import typings.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEndCallback
  extends /* key */ StringDictionary[js.Any] {
  var action: add | remove | update
  var element: typings.std.Element
  def endCallback(): Unit
}

object ElementEndCallback {
  @scala.inline
  def apply(
    action: add | remove | update,
    element: typings.std.Element,
    endCallback: () => Unit,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): ElementEndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ElementEndCallback]
  }
}

