package typings.mssql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Js extends js.Object {
  @JSName("js")
  var js_ : js.Any = js.native
  var sql: js.Any = js.native
}

object Js {
  @scala.inline
  def apply(js_ : js.Any, sql: js.Any): Js = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
  @scala.inline
  implicit class JsOps[Self <: Js] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJs_(value: js.Any): Self = this.set("js", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: js.Any): Self = this.set("sql", value.asInstanceOf[js.Any])
  }
  
}

