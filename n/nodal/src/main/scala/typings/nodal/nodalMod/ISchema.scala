package typings.nodal.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISchema extends js.Object {
  var columns: js.Array[IColumn]
  var table: String
}

object ISchema {
  @scala.inline
  def apply(columns: js.Array[IColumn], table: String): ISchema = {
    val __obj = js.Dynamic.literal(columns = columns, table = table)
  
    __obj.asInstanceOf[ISchema]
  }
}

