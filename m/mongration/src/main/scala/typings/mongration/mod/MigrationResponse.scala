package typings.mongration.mod

import typings.mongration.mongrationStrings.`not-run`
import typings.mongration.mongrationStrings.`rollback-error`
import typings.mongration.mongrationStrings.error
import typings.mongration.mongrationStrings.ok
import typings.mongration.mongrationStrings.pending
import typings.mongration.mongrationStrings.rollback
import typings.mongration.mongrationStrings.skipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationResponse extends js.Object {
  var id: String = js.native
  var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error` = js.native
}

object MigrationResponse {
  @scala.inline
  def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationResponse]
  }
  @scala.inline
  implicit class MigrationResponseOps[Self <: MigrationResponse] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

