package typings.ngTable

import typings.angular.mod.IQService
import typings.ngTable.getGroupMod.IGetGroupFunc
import typings.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typings.ngTable.resultsMod.IDataRowGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupingMod {
  
  @JSImport("ng-table/src/core/grouping", "ngTableDefaultGetGroups")
  @js.native
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}
