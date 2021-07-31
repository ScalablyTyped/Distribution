package typings.ngTable

import typings.angular.mod.IQService
import typings.ngTable.getGroupMod.IGetGroupFunc
import typings.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typings.ngTable.resultsMod.IDataRowGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableDefaultGetGroupsMod {
  
  @JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTableDefaultGetGroups")($q.asInstanceOf[js.Any], ngTableDefaultGetData.asInstanceOf[js.Any])).asInstanceOf[IGetGroupFunc[T]]
}
