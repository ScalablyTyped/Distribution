package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasourceD[K, D] extends js.Object {
  var datasource: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
}

object Anon_DatasourceD {
  @scala.inline
  def apply[K, D](datasource: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null): Anon_DatasourceD[K, D] = {
    val __obj = js.Dynamic.literal()
    if (datasource != null) __obj.updateDynamic("datasource")(datasource)
    __obj.asInstanceOf[Anon_DatasourceD[K, D]]
  }
}

