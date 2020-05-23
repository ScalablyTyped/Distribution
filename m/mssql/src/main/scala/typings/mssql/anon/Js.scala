package typings.mssql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Js extends js.Object {
  @JSName("js")
  var js_ : js.Any
  var sql: js.Any
}

object Js {
  @scala.inline
  def apply(js_ : js.Any, sql: js.Any): Js = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
}

