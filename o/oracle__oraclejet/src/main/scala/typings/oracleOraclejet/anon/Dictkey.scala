package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var path: String
  var previousValue: js.Any
  var value: js.Any
}

object Dictkey {
  @scala.inline
  def apply(
    path: String,
    previousValue: js.Any,
    value: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

