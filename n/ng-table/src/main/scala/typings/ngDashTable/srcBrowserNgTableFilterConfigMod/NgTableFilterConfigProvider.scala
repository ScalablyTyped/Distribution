package typings.ngDashTable.srcBrowserNgTableFilterConfigMod

import typings.angular.angularMod.IServiceProvider
import typings.angular.angularMod.autoNs.IInjectorService
import typings.ngDashTable.srcBrowserPublicDashInterfacesMod.IFilterConfigValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider")
@js.native
class NgTableFilterConfigProvider protected () extends IServiceProvider {
  def this($injector: IInjectorService) = this()
  /* CompleteClass */
  @JSName("$get")
  override var $get: js.Any = js.native
  var config: js.Any = js.native
  var defaultConfig: js.Any = js.native
  @JSName("$get")
  def $get_MNgTableFilterConfigProvider(): NgTableFilterConfig = js.native
  /**
    * Reset back to factory defaults the config values that `NgTableFilterConfig` service will use
    */
  def resetConfigs(): Unit = js.native
  /**
    * Set the config values used by `NgTableFilterConfig` service
    */
  def setConfig(customConfig: IFilterConfigValues): Unit = js.native
}

/* static members */
@JSImport("ng-table/src/browser/ngTableFilterConfig", "NgTableFilterConfigProvider")
@js.native
object NgTableFilterConfigProvider extends js.Object {
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}

