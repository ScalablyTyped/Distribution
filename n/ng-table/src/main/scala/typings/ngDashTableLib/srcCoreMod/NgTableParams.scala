package typings
package ngDashTableLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core", "NgTableParams")
@js.native
class NgTableParams[T] ()
  extends ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T] {
  def this(baseParameters: ngDashTableLib.srcCoreNgTableParamsMod.IParamValues[T]) = this()
  def this(baseParameters: scala.Boolean) = this()
  def this(baseParameters: ngDashTableLib.srcCoreNgTableParamsMod.IParamValues[T], baseSettings: ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[T]) = this()
  def this(baseParameters: scala.Boolean, baseSettings: ngDashTableLib.srcCoreNgTableSettingsMod.ISettings[T]) = this()
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
    $q: angularLib.angularMod.angularNs.IQService,
    $log: angularLib.angularMod.angularNs.ILogService,
    ngTableDefaults: ngDashTableLib.srcCoreNgTableDefaultsMod.IDefaults,
    ngTableEventsChannel: ngDashTableLib.srcCoreNgTableEventsChannelMod.NgTableEventsChannel,
    ngTableSettings: ngDashTableLib.srcCoreNgTableSettingsMod.NgTableSettings
  ): scala.Unit = js.native
}

