package typings.ngDashTable

import typings.angular.angularMod.IQService
import typings.ngDashTable.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData
import typings.ngDashTable.srcCoreDataResultsMod.IDataRowGroup
import typings.ngDashTable.srcCoreGroupingGetGroupMod.IGetGroupFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping", JSImport.Namespace)
@js.native
object srcCoreGroupingMod extends js.Object {
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}

