package typings.oracleOraclejet

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon22[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null
}

object Anon22 {
  @scala.inline
  def apply[K, D](datasource: DataProvider[K, D] = null): Anon22[K, D] = {
    val __obj = js.Dynamic.literal()
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon22[K, D]]
  }
}

