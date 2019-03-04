package typings
package atOracleOraclejetLib.ojmenuselectmanyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuSelectManySettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var disabled: scala.Boolean
  var options: js.Array[atOracleOraclejetLib.ojmenuselectmanyMod.ojMenuSelectManyNs.Option] | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, _]) | scala.Null
  var value: js.Array[_]
}

object ojMenuSelectManySettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    value: js.Array[_],
    options: js.Array[atOracleOraclejetLib.ojmenuselectmanyMod.ojMenuSelectManyNs.Option] | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, _]) = null
  ): ojMenuSelectManySettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled, value = value)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSelectManySettableProperties]
  }
}

