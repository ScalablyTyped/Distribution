package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropNameValue
  extends /* key */ StringDictionary[js.Any] {
  var value: Double
}

object DictpropNameValue {
  @scala.inline
  def apply(value: Double, StringDictionary: /* name */ StringDictionary[js.Any] = null): DictpropNameValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropNameValue]
  }
}

