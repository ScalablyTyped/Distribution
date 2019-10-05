package typings.ngDashTable

import typings.angular.angularMod.ILogService
import typings.angular.angularMod.IModule
import typings.angular.angularMod.IQService
import typings.angular.angularMod.IRootScopeService
import typings.ngDashTable.srcCoreNgTableDefaultsMod.IDefaults
import typings.ngDashTable.srcCoreNgTableParamsMod.IParamValues
import typings.ngDashTable.srcCoreNgTableSettingsMod.ISettings
import typings.ngDashTable.srcCoreNgTableSettingsMod.NgTableSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core", JSImport.Namespace)
@js.native
object srcCoreMod extends js.Object {
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typings.ngDashTable.srcCoreDataMod.NgTableDefaultGetDataProvider
  
  @js.native
  class NgTableEventsChannel protected ()
    extends typings.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  
  @js.native
  class NgTableParams[T] ()
    extends typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  
  val ngTableCoreModule: IModule = js.native
  /* static members */
  @js.native
  object NgTableEventsChannel extends js.Object {
    @JSName("$inject")
    var $inject: js.Array[String] = js.native
  }
  
  /* static members */
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
  
}

