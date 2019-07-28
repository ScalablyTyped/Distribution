package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.TextureHandler")
@js.native
class TextureHandler () extends js.Object {
  var crossOrigin: Boolean | String = js.native
  def load(url: String, callback: js.Function): Unit = js.native
  def open(url: String, data: js.Any): js.Any = js.native
  def patch(asset: Asset, assets: AssetRegistry): Unit = js.native
}

