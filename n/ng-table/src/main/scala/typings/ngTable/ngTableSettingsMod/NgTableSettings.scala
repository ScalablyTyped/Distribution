package typings.ngTable.ngTableSettingsMod

import typings.ngTable.getGroupMod.IGetGroupFunc
import typings.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typings.ngTable.ngTableDefaultsMod.IDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
@js.native
class NgTableSettings protected () extends js.Object {
  def this(
    ngTableDefaults: IDefaults,
    ngTableDefaultGetData: IDefaultGetData[_],
    ngTableDefaultGetGroups: IGetGroupFunc[_]
  ) = this()
  
  def createDefaults[T](): ISettings[T] = js.native
  
  var defaults: js.Any = js.native
  
  def merge[T](existing: ISettings[T], newSettings: ISettings[T]): ISettings[T] = js.native
  
  var ngTableDefaultGetData: js.Any = js.native
  
  var ngTableDefaultGetGroups: js.Any = js.native
  
  var ngTableDefaults: js.Any = js.native
  
  /* private */ def optimizeFilterDelay[T](settings: js.Any): js.Any = js.native
}
/* static members */
@JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
@js.native
object NgTableSettings extends js.Object {
  
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}
