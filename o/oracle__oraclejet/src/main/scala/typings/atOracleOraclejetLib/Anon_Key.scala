package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var path: java.lang.String
  var previousValue: js.Any
  var value: js.Any
}

object Anon_Key {
  @scala.inline
  def apply(
    path: java.lang.String,
    previousValue: js.Any,
    value: js.Any,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("previousValue")(previousValue)
    __obj.updateDynamic("value")(value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

