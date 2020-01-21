package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.Any
  var sql: js.Any
}

object AnonParams {
  @scala.inline
  def apply(params: js.Any, sql: js.Any): AnonParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParams]
  }
}

