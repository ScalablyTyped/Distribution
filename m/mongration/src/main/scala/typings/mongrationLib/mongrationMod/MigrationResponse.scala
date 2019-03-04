package typings
package mongrationLib.mongrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationResponse extends js.Object {
  var id: java.lang.String
  var status: mongrationLib.mongrationLibStrings.`not-run` | mongrationLib.mongrationLibStrings.skipped | mongrationLib.mongrationLibStrings.pending | mongrationLib.mongrationLibStrings.ok | mongrationLib.mongrationLibStrings.error | mongrationLib.mongrationLibStrings.rollback | mongrationLib.mongrationLibStrings.`rollback-error`
}

object MigrationResponse {
  @scala.inline
  def apply(
    id: java.lang.String,
    status: mongrationLib.mongrationLibStrings.`not-run` | mongrationLib.mongrationLibStrings.skipped | mongrationLib.mongrationLibStrings.pending | mongrationLib.mongrationLibStrings.ok | mongrationLib.mongrationLibStrings.error | mongrationLib.mongrationLibStrings.rollback | mongrationLib.mongrationLibStrings.`rollback-error`
  ): MigrationResponse = {
    val __obj = js.Dynamic.literal(id = id, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationResponse]
  }
}

