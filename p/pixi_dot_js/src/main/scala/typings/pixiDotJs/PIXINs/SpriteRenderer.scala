package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.glCoreNs.VertexArrayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.SpriteRenderer")
@js.native
class SpriteRenderer protected () extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()
  var buffers: js.Array[BatchBuffer] = js.native
  var currentIndex: Double = js.native
  var groups: js.Array[_] = js.native
  var indices: js.Array[Double] = js.native
  var shaders: js.Array[Shader] = js.native
  var size: Double = js.native
  var sprites: js.Array[Sprite] = js.native
  var tick: Double = js.native
  var vaoMax: Double = js.native
  var vaos: js.Array[VertexArrayObject] = js.native
  var vertByteSize: Double = js.native
  var vertSize: Double = js.native
  var vertexBuffers: js.Array[Double] = js.native
  var vertexCount: Double = js.native
  /* protected */ def onContextChanged(): Unit = js.native
  /* protected */ def onPrerender(): Unit = js.native
  def render(sprite: Sprite): Unit = js.native
}

