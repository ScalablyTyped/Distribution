package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datasource[K, D] extends js.Object {
  var datasource: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var mode: atOracleOraclejetLib.atOracleOraclejetLibStrings.edit | atOracleOraclejetLib.atOracleOraclejetLibStrings.navigation
  var status: atOracleOraclejetLib.ojtableMod.ojTableNs.ContextStatus[K]
}

object Anon_Datasource {
  @scala.inline
  def apply[K, D](
    mode: atOracleOraclejetLib.atOracleOraclejetLibStrings.edit | atOracleOraclejetLib.atOracleOraclejetLibStrings.navigation,
    status: atOracleOraclejetLib.ojtableMod.ojTableNs.ContextStatus[K],
    datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): Anon_Datasource[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.updateDynamic("status")(status)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[Anon_Datasource[K, D]]
  }
}

