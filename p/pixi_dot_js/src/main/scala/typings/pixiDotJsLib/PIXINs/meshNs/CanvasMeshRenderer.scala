package typings
package pixiDotJsLib.PIXINs.meshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.CanvasMeshRenderer")
@js.native
class CanvasMeshRenderer protected () extends js.Object {
  def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
  var renderer: pixiDotJsLib.PIXINs.CanvasRenderer = js.native
  /* protected */ def _renderDrawTriangle(mesh: Mesh, index0: scala.Double, index1: scala.Double, index2: scala.Double): scala.Unit = js.native
  /* protected */ def _renderTriangleMesh(mesh: Mesh): scala.Unit = js.native
  /* protected */ def _renderTriangles(mesh: Mesh): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def render(mesh: Mesh): scala.Unit = js.native
  /* protected */ def renderMeshFlat(mesh: Mesh): scala.Unit = js.native
}

