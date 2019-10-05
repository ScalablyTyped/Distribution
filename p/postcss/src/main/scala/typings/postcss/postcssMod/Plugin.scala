package typings.postcss.postcssMod

import typings.postcss.Anon_ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[T] extends Transformer {
  var postcss: Transformer = js.native
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: Anon_ToString): LazyResult = js.native
  def process(css: Anon_ToString, opts: js.Any): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
}

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
  def apply[T](name: String, initializer: PluginInitializer[T]): Plugin[T] = js.native
}

