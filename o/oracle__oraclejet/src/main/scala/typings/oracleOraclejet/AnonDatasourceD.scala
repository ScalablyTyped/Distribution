package typings.oracleOraclejet

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatasourceD[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null
}

object AnonDatasourceD {
  @scala.inline
  def apply[K, D](datasource: DataProvider[K, D] = null): AnonDatasourceD[K, D] = {
    val __obj = js.Dynamic.literal()
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatasourceD[K, D]]
  }
}

