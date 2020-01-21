package typings.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResultBase extends js.Object {
  var command: String
  var fields: js.Array[FieldDef]
  var oid: Double
  var rowCount: Double
}

object QueryResultBase {
  @scala.inline
  def apply(command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double): QueryResultBase = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryResultBase]
  }
}

