package typings
package ngDashTableLib.srcBrowserNgTableColumnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableColumn", "NgTableColumn")
@js.native
class NgTableColumn[TCol /* <: ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef | ngDashTableLib.srcBrowserPublicDashInterfacesMod.IDynamicTableColDef */] () extends js.Object {
  /**
    * Creates a $column for use within a header template
    *
    * @param column the initial definition for $column to build
    * @param defaultScope the $scope to supply to the $column getter methods when not supplied by caller
    * @param columns a reference to the $columns array to make available on the context supplied to the
    * $column getter methods
    */
  def buildColumn(
    column: TCol,
    defaultScope: angularLib.angularMod.IScope,
    columns: js.Array[ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef]
  ): ngDashTableLib.srcBrowserPublicDashInterfacesMod.IColumnDef = js.native
  /* private */ def createDefaults(): js.Any = js.native
  /* private */ def createGetterSetter(initialValue: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableColumn", "NgTableColumn")
@js.native
object NgTableColumn extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

