package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var path: String
  var previousValue: js.Any
  var value: js.Any
}

object Anon_Key {
  @scala.inline
  def apply(
    path: String,
    previousValue: js.Any,
    value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

