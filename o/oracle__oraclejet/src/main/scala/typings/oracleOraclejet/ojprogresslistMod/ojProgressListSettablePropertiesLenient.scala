package typings.oracleOraclejet.ojprogresslistMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojprogresslist.ojProgressListSettableProperties> */
trait ojProgressListSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[DataProvider[_, _]] = js.undefined
}

object ojProgressListSettablePropertiesLenient {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, data: DataProvider[_, _] = null): ojProgressListSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressListSettablePropertiesLenient]
  }
}

