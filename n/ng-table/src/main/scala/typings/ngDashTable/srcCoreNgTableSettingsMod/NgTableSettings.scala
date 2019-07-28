package typings.ngDashTable.srcCoreNgTableSettingsMod

import typings.ngDashTable.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData
import typings.ngDashTable.srcCoreGroupingGetGroupMod.IGetGroupFunc
import typings.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
@js.native
class NgTableSettings protected () extends js.Object {
  def this(
    ngTableDefaults: IDefaults,
    ngTableDefaultGetData: IDefaultGetData[_],
    ngTableDefaultGetGroups: IGetGroupFunc[_]
  ) = this()
  var defaults: js.Any = js.native
  var ngTableDefaultGetData: js.Any = js.native
  var ngTableDefaultGetGroups: js.Any = js.native
  var ngTableDefaults: js.Any = js.native
  def createDefaults[T](): ISettings[T] = js.native
  def merge[T](existing: ISettings[T], newSettings: ISettings[T]): ISettings[T] = js.native
  /* private */ def optimizeFilterDelay[T](settings: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ng-table/src/core/ngTableSettings", "NgTableSettings")
@js.native
object NgTableSettings extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

