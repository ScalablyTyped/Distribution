package typings
package pixiDotJsLib.PIXINs.meshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.Mesh")
@js.native
class Mesh protected ()
  extends pixiDotJsLib.PIXINs.Container {
  def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array, uvs: stdLib.Float32Array) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array, uvs: stdLib.Float32Array, indices: stdLib.Uint16Array) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, vertices: stdLib.Float32Array, uvs: stdLib.Float32Array, indices: stdLib.Uint16Array, drawMode: scala.Double) = this()
  var _geometryVersion: scala.Double = js.native
  var _glDatas: org.scalablytyped.runtime.NumberDictionary[js.Any] = js.native
  var _texture: pixiDotJsLib.PIXINs.Texture = js.native
  var _uvTransform: pixiDotJsLib.PIXINs.extrasNs.TextureMatrix = js.native
  var autoUpdate: scala.Boolean = js.native
  var blendMode: scala.Double = js.native
  var canvasPadding: scala.Double = js.native
  var dirty: scala.Double = js.native
  var dirtyVertex: scala.Boolean = js.native
  var drawMode: scala.Double = js.native
  var indexDirty: scala.Double = js.native
  var indices: stdLib.Uint16Array = js.native
  var pluginName: java.lang.String = js.native
  var texture: pixiDotJsLib.PIXINs.Texture = js.native
  var tint: scala.Double = js.native
  var tintRgb: stdLib.Float32Array = js.native
  var uploadUvTransform: scala.Boolean = js.native
  var uvs: stdLib.Float32Array = js.native
  var vertexDirty: scala.Double = js.native
  var vertices: stdLib.Float32Array = js.native
  /* protected */ def _onTextureUpdate(): scala.Unit = js.native
  /* protected */ def _refresh(): scala.Unit = js.native
  def containsPoint(point: pixiDotJsLib.PIXINs.Point): scala.Boolean = js.native
  def multiplyUvs(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(forceUpdate: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("PIXI.mesh.Mesh")
@js.native
object Mesh extends js.Object {
  var DRAW_MODES: pixiDotJsLib.Anon_TRIANGLES = js.native
}

