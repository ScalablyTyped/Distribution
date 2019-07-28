package typings.pixiDotJs.PIXINs.meshNs

import typings.pixiDotJs.PIXINs.CanvasRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.CanvasMeshRenderer")
@js.native
class CanvasMeshRenderer protected () extends js.Object {
  def this(renderer: CanvasRenderer) = this()
  var renderer: CanvasRenderer = js.native
  /* protected */ def _renderDrawTriangle(mesh: Mesh, index0: Double, index1: Double, index2: Double): Unit = js.native
  /* protected */ def _renderTriangleMesh(mesh: Mesh): Unit = js.native
  /* protected */ def _renderTriangles(mesh: Mesh): Unit = js.native
  def destroy(): Unit = js.native
  def render(mesh: Mesh): Unit = js.native
  /* protected */ def renderMeshFlat(mesh: Mesh): Unit = js.native
}

