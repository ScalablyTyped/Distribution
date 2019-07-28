package typings.ngDashTable

import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IColumnDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  @JSName("$column")
  var $column: js.UndefOr[IColumnDef] = js.undefined
  @JSName("$columns")
  var $columns: js.Array[IColumnDef]
}

object Anon_Column {
  @scala.inline
  def apply($columns: js.Array[IColumnDef], $column: IColumnDef = null): Anon_Column = {
    val __obj = js.Dynamic.literal($columns = $columns)
    if ($column != null) __obj.updateDynamic("$column")($column)
    __obj.asInstanceOf[Anon_Column]
  }
}

