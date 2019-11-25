package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasourceD[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null
}

object Anon_DatasourceD {
  @scala.inline
  def apply[K, D](datasource: DataProvider[K, D] = null): Anon_DatasourceD[K, D] = {
    val __obj = js.Dynamic.literal()
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DatasourceD[K, D]]
  }
}

