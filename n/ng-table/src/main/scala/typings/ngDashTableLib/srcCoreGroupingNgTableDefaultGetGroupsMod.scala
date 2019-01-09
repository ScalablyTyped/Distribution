package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", JSImport.Namespace)
@js.native
object srcCoreGroupingNgTableDefaultGetGroupsMod extends js.Object {
  def ngTableDefaultGetGroups[T](
    $q: angularLib.angularMod.angularNs.IQService,
    ngTableDefaultGetData: ngDashTableLib.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData[ngDashTableLib.srcCoreDataResultsMod.IDataRowGroup[T]]
  ): ngDashTableLib.srcCoreGroupingGetGroupMod.IGetGroupFunc[T] = js.native
}

