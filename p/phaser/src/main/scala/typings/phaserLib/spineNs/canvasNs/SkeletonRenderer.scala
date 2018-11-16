package typings
package phaserLib.spineNs.canvasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.canvas.SkeletonRenderer")
@js.native
class SkeletonRenderer protected () extends js.Object {
  def this(context: stdLib.CanvasRenderingContext2D) = this()
  var ctx: js.Any = js.native
  var debugRendering: scala.Boolean = js.native
  var tempColor: js.Any = js.native
  var triangleRendering: scala.Boolean = js.native
  var vertices: js.Any = js.native
  /* private */ def computeMeshVertices(slot: js.Any, mesh: js.Any, pma: js.Any): js.Any = js.native
  /* private */ def computeRegionVertices(slot: js.Any, region: js.Any, pma: js.Any): js.Any = js.native
  def draw(skeleton: phaserLib.spineNs.Skeleton): scala.Unit = js.native
  /* private */ def drawImages(skeleton: js.Any): js.Any = js.native
  /* private */ def drawTriangle(
    img: js.Any,
    x0: js.Any,
    y0: js.Any,
    u0: js.Any,
    v0: js.Any,
    x1: js.Any,
    y1: js.Any,
    u1: js.Any,
    v1: js.Any,
    x2: js.Any,
    y2: js.Any,
    u2: js.Any,
    v2: js.Any
  ): js.Any = js.native
  /* private */ def drawTriangles(skeleton: js.Any): js.Any = js.native
}

@JSGlobal("spine.canvas.SkeletonRenderer")
@js.native
object SkeletonRenderer extends js.Object {
  var QUAD_TRIANGLES: js.Array[scala.Double] = js.native
  var VERTEX_SIZE: scala.Double = js.native
}

