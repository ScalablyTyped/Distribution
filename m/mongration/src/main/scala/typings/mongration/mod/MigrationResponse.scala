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

trait MigrationResponse extends js.Object {
  var id: String
  var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`
}

object MigrationResponse {
  @scala.inline
  def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationResponse]
  }
}

