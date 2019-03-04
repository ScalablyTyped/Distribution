package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  @JSName("$column")
  var $column: js.UndefOr[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef] = js.undefined
  @JSName("$columns")
  var $columns: js.Array[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef]
}

object Anon_Column {
  @scala.inline
  def apply(
    $columns: js.Array[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef],
    $column: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal($columns = $columns)
    if ($column != null) __obj.updateDynamic("$column")($column)
    __obj.asInstanceOf[Anon_Column]
  }
}

