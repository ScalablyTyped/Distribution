package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "plugin")
@js.native
object plugin extends js.Object {
  /**
    * Creates a PostCSS plugin with a standard API.
    * @param name Plugin name. Same as in name property in package.json. It will
    * be saved in plugin.postcssPlugin property.
    * @param initializer Will receive plugin options and should return functions
    * to modify nodes in input CSS.
    */
  def apply[T](name: String, initializer: PluginInitializer[T]): Plugin_[T] = js.native
}

