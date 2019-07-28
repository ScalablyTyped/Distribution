package typings.pixiDotJs.PIXINs.extrasNs

import typings.pixiDotJs.PIXINs.Matrix
import typings.pixiDotJs.PIXINs.Texture
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.TextureMatrix")
@js.native
class TextureMatrix protected () extends js.Object {
  def this(texture: Texture) = this()
  def this(texture: Texture, clampMargin: Double) = this()
  var _lastTextureID: Double = js.native
  var _texture: Texture = js.native
  var clampMargin: Double = js.native
  var clampOffset: Double = js.native
  var mapCoord: Matrix = js.native
  var texture: Texture = js.native
  var uClampFrame: Float32Array = js.native
  var uClampOffset: Float32Array = js.native
  def multiplyUvs(uvs: Float32Array): Float32Array = js.native
  def multiplyUvs(uvs: Float32Array, out: Float32Array): Float32Array = js.native
  def update(): Boolean = js.native
  def update(forceUpdate: Boolean): Boolean = js.native
}

