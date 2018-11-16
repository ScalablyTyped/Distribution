package typings
package pixiDotJsLib.PIXINs.extrasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.TextureMatrix")
@js.native
class TextureMatrix protected () extends js.Object {
  def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, clampMargin: scala.Double) = this()
  var _lastTextureID: scala.Double = js.native
  var _texture: pixiDotJsLib.PIXINs.Texture = js.native
  var clampMargin: scala.Double = js.native
  var clampOffset: scala.Double = js.native
  var mapCoord: pixiDotJsLib.PIXINs.Matrix = js.native
  var texture: pixiDotJsLib.PIXINs.Texture = js.native
  var uClampFrame: stdLib.Float32Array = js.native
  var uClampOffset: stdLib.Float32Array = js.native
  def multiplyUvs(uvs: stdLib.Float32Array): stdLib.Float32Array = js.native
  def multiplyUvs(uvs: stdLib.Float32Array, out: stdLib.Float32Array): stdLib.Float32Array = js.native
  def update(): scala.Boolean = js.native
  def update(forceUpdate: scala.Boolean): scala.Boolean = js.native
}

