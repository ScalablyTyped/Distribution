package typings.pixiDotJs.PIXINs.meshNs

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDotJs.Anon_TRIANGLEMESH
import typings.pixiDotJs.PIXINs.Container
import typings.pixiDotJs.PIXINs.Point
import typings.pixiDotJs.PIXINs.Texture
import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.Mesh")
@js.native
class Mesh protected () extends Container {
  def this(texture: Texture) = this()
  def this(texture: Texture, vertices: Float32Array) = this()
  def this(texture: Texture, vertices: Float32Array, uvs: Float32Array) = this()
  def this(texture: Texture, vertices: Float32Array, uvs: Float32Array, indices: Uint16Array) = this()
  def this(
    texture: Texture,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array,
    drawMode: Double
  ) = this()
  var _geometryVersion: Double = js.native
  var _glDatas: NumberDictionary[js.Any] = js.native
  var _texture: Texture = js.native
  var _uvTransform: typings.pixiDotJs.PIXINs.extrasNs.TextureMatrix = js.native
  var autoUpdate: Boolean = js.native
  var blendMode: Double = js.native
  var canvasPadding: Double = js.native
  var dirty: Double = js.native
  var dirtyVertex: Boolean = js.native
  var drawMode: Double = js.native
  var indexDirty: Double = js.native
  var indices: Uint16Array = js.native
  var pluginName: String = js.native
  var texture: Texture = js.native
  var tint: Double = js.native
  var tintRgb: Float32Array = js.native
  var uploadUvTransform: Boolean = js.native
  var uvs: Float32Array = js.native
  var vertexDirty: Double = js.native
  var vertices: Float32Array = js.native
  /* protected */ def _onTextureUpdate(): Unit = js.native
  /* protected */ def _refresh(): Unit = js.native
  def containsPoint(point: Point): Boolean = js.native
  def multiplyUvs(): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(forceUpdate: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.mesh.Mesh")
@js.native
object Mesh extends js.Object {
  var DRAW_MODES: Anon_TRIANGLEMESH = js.native
}

