package typings.ngDashTable.srcCoreMod

import typings.angular.angularMod.ILogService
import typings.angular.angularMod.IQService
import typings.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import typings.ngDashTable.srcCoreNgTableParamsMod.IParamValues
import typings.ngDashTable.srcCoreNgTableSettingsMod.ISettings
import typings.ngDashTable.srcCoreNgTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core", "NgTableParams")
@js.native
class NgTableParams[T] ()
  extends typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams[T] {
  def this(baseParameters: Boolean) = this()
  def this(baseParameters: IParamValues[T]) = this()
  def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
  def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
}

/* static members */
@JSImport("ng-table/src/core", "NgTableParams")
@js.native
object NgTableParams extends js.Object {
  @JSName("$log")
  var $log: js.Any = js.native
  @JSName("$q")
  var $q: js.Any = js.native
  var ngTableDefaults: js.Any = js.native
  var ngTableEventsChannel: js.Any = js.native
  var ngTableSettings: js.Any = js.native
  def init(
    $q: IQService,
    $log: ILogService,
    ngTableDefaults: IDefaults,
    ngTableEventsChannel: typings.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
    ngTableSettings: NgTableSettings
  ): Unit = js.native
}

