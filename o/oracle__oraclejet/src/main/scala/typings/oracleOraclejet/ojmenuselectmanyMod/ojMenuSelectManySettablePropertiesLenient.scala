package typings.oracleOraclejet.ojmenuselectmanyMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmenuselectmanyMod.ojMenuSelectMany.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmenuselectmany.ojMenuSelectManySettableProperties> */
trait ojMenuSelectManySettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[js.Array[Option] | (DataProvider[_, _])] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object ojMenuSelectManySettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[Option] | (DataProvider[_, _]) = null,
    value: js.Array[_] = null
  ): ojMenuSelectManySettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSelectManySettablePropertiesLenient]
  }
}

