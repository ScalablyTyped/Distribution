package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.TextureHandler")
@js.native
class TextureHandler () extends js.Object {
  var crossOrigin: scala.Boolean | java.lang.String = js.native
  def load(url: java.lang.String, callback: js.Function): scala.Unit = js.native
  def open(url: java.lang.String, data: js.Any): js.Any = js.native
  def patch(asset: Asset, assets: AssetRegistry): scala.Unit = js.native
}

