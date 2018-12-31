package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMeta extends js.Object {
  var action: js.Any
  var pattern: Pattern
  var plugin: PluginDefinition
  var schema: js.Any
  def end(cb: js.Function0[scala.Unit]): js.UndefOr[scala.Nothing]
  def use(handler: AddMetaMiddleware): AddMeta
}

