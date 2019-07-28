package typings.playcanvas.pcNs

import typings.playcanvas.playcanvasStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceHandler extends js.Object {
  @JSName("load")
  def load_string(url: string, callback: js.Function1[/* repeated */ js.Any, js.Object]): Unit
  @JSName("open")
  def open_string(url: string, data: js.Any): js.Any
  def patch(asset: Asset, assets: AssetRegistry): Unit
}

object ResourceHandler {
  @scala.inline
  def apply(
    load_string: (string, js.Function1[/* repeated */ js.Any, js.Object]) => Unit,
    open_string: (string, js.Any) => js.Any,
    patch: (Asset, AssetRegistry) => Unit
  ): ResourceHandler = {
    val __obj = js.Dynamic.literal(patch = js.Any.fromFunction2(patch))
    __obj.updateDynamic("load")(js.Any.fromFunction2(load_string))
    __obj.updateDynamic("open")(js.Any.fromFunction2(open_string))
    __obj.asInstanceOf[ResourceHandler]
  }
}

