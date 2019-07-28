package typings.pg.pgMod

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
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount)
  
    __obj.asInstanceOf[QueryResultBase]
  }
}

