package typings.mockKnex.mod.Knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sql extends js.Object {
  var bindings: js.Any = js.native
  var method: String = js.native
  var options: js.Any = js.native
  var sql: String = js.native
  def toNative(): js.Any = js.native
}

object Sql {
  @scala.inline
  def apply(bindings: js.Any, method: String, options: js.Any, sql: String, toNative: () => js.Any): Sql = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], toNative = js.Any.fromFunction0(toNative))
    __obj.asInstanceOf[Sql]
  }
  @scala.inline
  implicit class SqlOps[Self <: Sql] (val x: Self) extends AnyVal {
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
    def setBindings(value: js.Any): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setToNative(value: () => js.Any): Self = this.set("toNative", js.Any.fromFunction0(value))
  }
  
}

