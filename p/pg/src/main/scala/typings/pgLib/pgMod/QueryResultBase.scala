package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResultBase extends js.Object {
  var command: java.lang.String
  var fields: js.Array[FieldDef]
  var oid: scala.Double
  var rowCount: scala.Double
}

object QueryResultBase {
  @scala.inline
  def apply(command: java.lang.String, fields: js.Array[FieldDef], oid: scala.Double, rowCount: scala.Double): QueryResultBase = {
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount)
  
    __obj.asInstanceOf[QueryResultBase]
  }
}

