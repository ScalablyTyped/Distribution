package typings
package pluginDashErrorLib.pluginDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugin-error", JSImport.Namespace)
@js.native
class namespaced protected () extends PluginError {
  /**
    * Constructor
    * @param options Options, including message and plugin name
    */
  def this(options: pluginDashErrorLib.pluginDashErrorMod.PluginErrorNs.PluginErrorOpts3) = this()
  /**
    * Constructor
    * @param pluginName The name of your plugin
    * @param message If you pass an error object as the message the stack will be pulled from that, otherwise one will be created.
    * @param options Options
    */
  def this(pluginName: java.lang.String, message: java.lang.String) = this()
  def this(pluginName: java.lang.String, message: stdLib.Error) = this()
  /**
    * Constructor
    * @param pluginName The name of your plugin
    * @param options Options, including message
    */
  def this(pluginName: java.lang.String, options: pluginDashErrorLib.pluginDashErrorMod.PluginErrorNs.PluginErrorOpts2) = this()
  def this(pluginName: java.lang.String, message: java.lang.String, options: pluginDashErrorLib.pluginDashErrorMod.PluginErrorNs.PluginErrorOpts) = this()
  def this(pluginName: java.lang.String, message: stdLib.Error, options: pluginDashErrorLib.pluginDashErrorMod.PluginErrorNs.PluginErrorOpts) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

