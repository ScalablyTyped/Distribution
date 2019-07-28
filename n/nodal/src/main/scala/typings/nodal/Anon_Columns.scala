package typings.nodal

import typings.nodal.nodalMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.Array[IColumn]
  var table: String
}

object Anon_Columns {
  @scala.inline
  def apply(columns: js.Array[IColumn], table: String): Anon_Columns = {
    val __obj = js.Dynamic.literal(columns = columns, table = table)
  
    __obj.asInstanceOf[Anon_Columns]
  }
}

