package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: js.UndefOr[js.Object | scala.Null] = js.undefined
  var idGeneration: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[js.Function | scala.Null] = js.undefined
}

object Anon_Connection {
  @scala.inline
  def apply(connection: js.Object = null, idGeneration: java.lang.String = null, transform: js.Function = null): Anon_Connection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (idGeneration != null) __obj.updateDynamic("idGeneration")(idGeneration)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Connection]
  }
}

