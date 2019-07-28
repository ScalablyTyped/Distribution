package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMeta extends js.Object {
  var action: js.Any
  var pattern: Pattern
  var plugin: PluginDefinition
  var schema: js.Any
  def end(cb: js.Function0[Unit]): js.UndefOr[scala.Nothing]
  def use(handler: AddMetaMiddleware): AddMeta
}

object AddMeta {
  @scala.inline
  def apply(
    action: js.Any,
    end: js.Function0[Unit] => js.UndefOr[scala.Nothing],
    pattern: Pattern,
    plugin: PluginDefinition,
    schema: js.Any,
    use: AddMetaMiddleware => AddMeta
  ): AddMeta = {
    val __obj = js.Dynamic.literal(action = action, end = js.Any.fromFunction1(end), pattern = pattern, plugin = plugin, schema = schema, use = js.Any.fromFunction1(use))
  
    __obj.asInstanceOf[AddMeta]
  }
}

