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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("ng-table/src/core", "NgTableDefaultGetDataProvider")
  @js.native
  open class NgTableDefaultGetDataProvider ()
    extends typings.ngTable.dataMod.NgTableDefaultGetDataProvider
  
  @JSImport("ng-table/src/core", "NgTableEventsChannel")
  @js.native
  open class NgTableEventsChannel protected ()
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
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/core", "NgTableParams")
  @js.native
  open class NgTableParams[T] ()
    extends typings.ngTable.ngTableParamsMod.NgTableParams[T] {
    def this(baseParameters: Boolean) = this()
    def this(baseParameters: IParamValues[T]) = this()
    def this(baseParameters: Boolean, baseSettings: ISettings[T]) = this()
    def this(baseParameters: Unit, baseSettings: ISettings[T]) = this()
    def this(baseParameters: IParamValues[T], baseSettings: ISettings[T]) = this()
  }
  /* static members */
  object NgTableParams {
    
    @JSImport("ng-table/src/core", "NgTableParams")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/core", "NgTableParams.$log")
    @js.native
    def $log: Any = js.native
    inline def $log_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$log")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.$q")
    @js.native
    def $q: Any = js.native
    inline def $q_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$q")(x.asInstanceOf[js.Any])
    
    inline def init(
      $q: IQService,
      $log: ILogService,
      ngTableDefaults: IDefaults,
      ngTableEventsChannel: typings.ngTable.ngTableEventsChannelMod.NgTableEventsChannel,
      ngTableSettings: NgTableSettings
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")($q.asInstanceOf[js.Any], $log.asInstanceOf[js.Any], ngTableDefaults.asInstanceOf[js.Any], ngTableEventsChannel.asInstanceOf[js.Any], ngTableSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ng-table/src/core", "NgTableParams.ngTableDefaults")
    @js.native
    def ngTableDefaults: Any = js.native
    inline def ngTableDefaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.ngTableEventsChannel")
    @js.native
    def ngTableEventsChannel: Any = js.native
    inline def ngTableEventsChannel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableEventsChannel")(x.asInstanceOf[js.Any])
    
    @JSImport("ng-table/src/core", "NgTableParams.ngTableSettings")
    @js.native
    def ngTableSettings: Any = js.native
    inline def ngTableSettings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableSettings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ng-table/src/core", "ngTableCoreModule")
  @js.native
  val ngTableCoreModule: IModule = js.native
}
