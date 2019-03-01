package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_External[V]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var previousValue: V
  var subproperty: Anon_Key
  var updatedFrom: atOracleOraclejetLib.atOracleOraclejetLibStrings.external | atOracleOraclejetLib.atOracleOraclejetLibStrings.internal
  var value: V
}

object Anon_External {
  @scala.inline
  def apply[V](
    previousValue: V,
    subproperty: Anon_Key,
    updatedFrom: atOracleOraclejetLib.atOracleOraclejetLibStrings.external | atOracleOraclejetLib.atOracleOraclejetLibStrings.internal,
    value: V,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_External[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    __obj.updateDynamic("subproperty")(subproperty)
    __obj.updateDynamic("updatedFrom")(updatedFrom.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_External[V]]
  }
}

