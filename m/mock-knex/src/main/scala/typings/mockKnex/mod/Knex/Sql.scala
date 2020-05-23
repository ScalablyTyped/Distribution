package typings.mockKnex.mod.Knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sql extends js.Object {
  var bindings: js.Any
  var method: String
  var options: js.Any
  var sql: String
  def toNative(): js.Any
}

object Sql {
  @scala.inline
  def apply(bindings: js.Any, method: String, options: js.Any, sql: String, toNative: () => js.Any): Sql = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], toNative = js.Any.fromFunction0(toNative))
    __obj.asInstanceOf[Sql]
  }
}

