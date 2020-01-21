package typings.ngTable

import typings.angular.mod.IQService
import typings.ngTable.getGroupMod.IGetGroupFunc
import typings.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typings.ngTable.resultsMod.IDataRowGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", JSImport.Namespace)
@js.native
object ngTableDefaultGetGroupsMod extends js.Object {
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}

