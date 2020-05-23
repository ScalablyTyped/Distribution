package typings.oracleOraclejet.ojswitcherMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojswitcher.ojSwitcherSettableProperties> */
trait ojSwitcherSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var value: js.UndefOr[String] = js.undefined
}

object ojSwitcherSettablePropertiesLenient {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, value: String = null): ojSwitcherSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSwitcherSettablePropertiesLenient]
  }
}

