package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.Any
  var sql: js.Any
}

object Params {
  @scala.inline
  def apply(params: js.Any, sql: js.Any): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

