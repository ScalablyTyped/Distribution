package typings.opentelemetryApi.pluginMod

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin[T] extends js.Object {
  
  /** Method to disable the instrumentation  */
  def disable(): Unit = js.native
  
  /**
    * Method that enables the instrumentation patch.
    * @param moduleExports The value of the `module.exports` property that would
    *     normally be exposed by the required module. ex: `http`, `https` etc.
    * @param TracerProvider a tracer provider.
    * @param logger a logger instance.
    * @param [config] an object to configure the plugin.
    */
  def enable(moduleExports: T, TracerProvider: TracerProvider, logger: Logger): T = js.native
  def enable(moduleExports: T, TracerProvider: TracerProvider, logger: Logger, config: PluginConfig): T = js.native
  
  /**
    * Name of the module that the plugin instrument.
    */
  var moduleName: String = js.native
  
  /**
    * Contains all supported versions.
    * All versions must be compatible with [semver](https://semver.org/spec/v2.0.0.html) format.
    * If the version is not supported, we won't apply instrumentation patch (see `enable` method).
    * If omitted, all versions of the module will be patched.
    */
  var supportedVersions: js.UndefOr[js.Array[String]] = js.native
}
