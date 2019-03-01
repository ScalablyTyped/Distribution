package typings
package nodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.Any
  var sql: js.Any
}

object Anon_Params {
  @scala.inline
  def apply(params: js.Any, sql: js.Any): Anon_Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("sql")(sql)
    __obj.asInstanceOf[Anon_Params]
  }
}

