package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceHandler extends js.Object {
  @JSName("load")
  def load_string(
    url: playcanvasLib.playcanvasLibStrings.string,
    callback: js.Function1[/* repeated */ js.Any, js.Object]
  ): scala.Unit
  @JSName("open")
  def open_string(url: playcanvasLib.playcanvasLibStrings.string, data: js.Any): js.Any
  def patch(asset: Asset, assets: AssetRegistry): scala.Unit
}

object ResourceHandler {
  @scala.inline
  def apply(
    load_string: (playcanvasLib.playcanvasLibStrings.string, js.Function1[/* repeated */ js.Any, js.Object]) => scala.Unit,
    open_string: (playcanvasLib.playcanvasLibStrings.string, js.Any) => js.Any,
    patch: (Asset, AssetRegistry) => scala.Unit
  ): ResourceHandler = {
    val __obj = js.Dynamic.literal(patch = js.Any.fromFunction2(patch))
    __obj.updateDynamic("load")(js.Any.fromFunction2(load_string))
    __obj.updateDynamic("open")(js.Any.fromFunction2(open_string))
    __obj.asInstanceOf[ResourceHandler]
  }
}

