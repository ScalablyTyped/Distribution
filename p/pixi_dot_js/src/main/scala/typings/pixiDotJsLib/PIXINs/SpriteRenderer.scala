package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.SpriteRenderer")
@js.native
class SpriteRenderer protected () extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()
  var buffers: js.Array[BatchBuffer] = js.native
  var currentIndex: scala.Double = js.native
  var groups: js.Array[_] = js.native
  var indices: js.Array[scala.Double] = js.native
  var shaders: js.Array[Shader] = js.native
  var size: scala.Double = js.native
  var sprites: js.Array[Sprite] = js.native
  var tick: scala.Double = js.native
  var vaoMax: scala.Double = js.native
  var vaos: js.Array[pixiDotJsLib.PIXINs.glCoreNs.VertexArrayObject] = js.native
  var vertByteSize: scala.Double = js.native
  var vertSize: scala.Double = js.native
  var vertexBuffers: js.Array[scala.Double] = js.native
  var vertexCount: scala.Double = js.native
  /* protected */ def onContextChanged(): scala.Unit = js.native
  /* protected */ def onPrerender(): scala.Unit = js.native
  def render(sprite: Sprite): scala.Unit = js.native
}

