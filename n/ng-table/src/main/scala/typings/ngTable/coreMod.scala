package typings.ngTable

import typings.angular.mod.ILogService
import typings.angular.mod.IModule
import typings.angular.mod.IQService
import typings.angular.mod.IRootScopeService
import typings.ngTable.ngTableDefaultsMod.IDefaults
import typings.ngTable.ngTableParamsMod.IParamValues
import typings.ngTable.ngTableSettingsMod.ISettings
import typings.ngTable.ngTableSettingsMod.NgTableSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("ng-table/src/core", "NgTableDefaultGetDataProvider")
  @js.native
  class NgTableDefaultGetDataProvider ()
    extends typings.ngTable.dataMod.NgTableDefaultGetDataProvider
  
  @JSImport("ng-table/src/core", "NgTableEventsChannel")
  @js.native
  class NgTableEventsChannel protected ()
    extends typings.ngTable.ngTableEventsChannelMod.NgTableEventsChannel {
    def this($rootScope: IRootScopeService) = this()
  }
  /* static members */
  object NgTableEventsChannel {
    
    @JSImport("ng-table/src/core", "NgTableEventsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/core", "NgTableEventsChannel.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    @scala.inline
    def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/core", "NgTableParams")
  @js.native
  class NgTableParams[T] ()
    extends typings.ngTable.ngTableParamsMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: js.UndefOr[scala.Nothing], baseSettings: ISettings[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  /* static members */
  object NgTableParams {
    
    @JSImport("ng-table/src/core", "NgTableParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/core", "NgTableParams.$log")
    @js.native
    def $log: js.Any = js.native
    @scala.inline
    def $log_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$log")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.$q")
    @js.native
    def $q: js.Any = js.native
    @scala.inline
    def $q_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$q")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.init")
    @js.native
    def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typings.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = js.native
    
    @JSImport("ng-table/src/core", "NgTableParams.ngTableDefaults")
    @js.native
    def ngTableDefaults: js.Any = js.native
    @scala.inline
    def ngTableDefaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.ngTableEventsChannel")
    @js.native
    def ngTableEventsChannel: js.Any = js.native
    @scala.inline
    def ngTableEventsChannel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableEventsChannel")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.ngTableSettings")
    @js.native
    def ngTableSettings: js.Any = js.native
    @scala.inline
    def ngTableSettings_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableSettings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/core", "ngTableCoreModule")
  @js.native
  val ngTableCoreModule: IModule = js.native
}
