package typings.nodeDashMysqlDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: js.UndefOr[js.Object] = js.undefined
  var idGeneration: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function] = js.undefined
}

object Anon_Connection {
  @scala.inline
  def apply(connection: js.Object = null, idGeneration: String = null, transform: js.Function = null): Anon_Connection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (idGeneration != null) __obj.updateDynamic("idGeneration")(idGeneration.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Connection]
  }
}

