package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourceHandler extends js.Object {
  @JSName("load")
  def load_string(
    url: playcanvasLib.playcanvasLibStrings.string,
    callback: js.Function1[/* repeated */js.Any, js.Object]
  ): scala.Unit
  @JSName("open")
  def open_string(url: playcanvasLib.playcanvasLibStrings.string, data: js.Any): js.Any
  def patch(asset: Asset, assets: AssetRegistry): scala.Unit
}

