package typings
package ngDashTableLib.srcCoreNgTableSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
@js.native
class NgTableSettings protected () extends js.Object {
  def this(ngTableDefaults: ngDashTableLib.srcCoreNgTableDefaultsMod.IDefaults, ngTableDefaultGetData: ngDashTableLib.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData[_], ngTableDefaultGetGroups: ngDashTableLib.srcCoreGroupingGetGroupMod.IGetGroupFunc[_]) = this()
  var defaults: js.Any = js.native
  var ngTableDefaultGetData: js.Any = js.native
  var ngTableDefaultGetGroups: js.Any = js.native
  var ngTableDefaults: js.Any = js.native
  def createDefaults[T](): ISettings[T] = js.native
  def merge[T](existing: ISettings[T], newSettings: ISettings[T]): ISettings[T] = js.native
  /* private */ def optimizeFilterDelay[T](settings: js.Any): js.Any = js.native
}

@JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
@js.native
object NgTableSettings extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[java.lang.String] = js.native
}

