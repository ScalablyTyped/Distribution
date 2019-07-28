package typings.pixiDotJs.PIXINs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TextureMatrix")
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

