package typings.oracleOraclejet.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet.baseComponentSettableProperties> */
trait baseComponentSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var translations: js.UndefOr[js.Object] = js.undefined
}

object baseComponentSettablePropertiesLenient {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, translations: js.Object = null): baseComponentSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseComponentSettablePropertiesLenient]
  }
}

