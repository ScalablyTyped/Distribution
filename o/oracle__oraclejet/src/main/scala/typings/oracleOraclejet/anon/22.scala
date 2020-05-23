package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `22`[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null
}

object `22` {
  @scala.inline
  def apply[K, D](datasource: DataProvider[K, D] = null): `22`[K, D] = {
    val __obj = js.Dynamic.literal(datasource = datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`[K, D]]
  }
}

