package typings.pluginDashError.pluginDashErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugin-error", JSImport.Namespace)
@js.native
class ^ protected () extends PluginError {
  /**
    * Constructor
    * @param options Options, including message and plugin name
    */
  def this(options: PluginErrorOpts3) = this()
  /**
    * Constructor
    * @param pluginName The name of your plugin
    * @param message If you pass an error object as the message the stack will be pulled from that, otherwise one will be created.
    * @param options Options
    */
  def this(pluginName: String, message: String) = this()
  def this(pluginName: String, message: Error) = this()
  /**
    * Constructor
    * @param pluginName The name of your plugin
    * @param options Options, including message
    */
  def this(pluginName: String, options: PluginErrorOpts2) = this()
  def this(pluginName: String, message: String, options: PluginErrorOpts) = this()
  def this(pluginName: String, message: Error, options: PluginErrorOpts) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

