package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.edit
import typings.atOracleOraclejet.atOracleOraclejetStrings.navigation
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojtableMod.ojTableNs.ContextStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datasource[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null
  var mode: edit | navigation
  var status: ContextStatus[K]
}

object Anon_Datasource {
  @scala.inline
  def apply[K, D](mode: edit | navigation, status: ContextStatus[K], datasource: DataProvider[K, D] = null): Anon_Datasource[K, D] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status)
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[Anon_Datasource[K, D]]
  }
}

