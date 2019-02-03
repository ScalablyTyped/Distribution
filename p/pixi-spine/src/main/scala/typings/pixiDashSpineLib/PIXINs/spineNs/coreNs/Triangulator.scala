package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Triangulator")
@js.native
class Triangulator () extends js.Object {
  var convexPolygons: js.Any = js.native
  var convexPolygonsIndices: js.Any = js.native
  var indicesArray: js.Any = js.native
  var isConcaveArray: js.Any = js.native
  var polygonIndicesPool: js.Any = js.native
  var polygonPool: js.Any = js.native
  var triangles: js.Any = js.native
  def decompose(verticesArray: js.Array[scala.Double], triangles: js.Array[scala.Double]): js.Array[js.Array[scala.Double]] = js.native
  def triangulate(verticesArray: ArrayLike[scala.Double]): js.Array[scala.Double] = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Triangulator")
@js.native
object Triangulator extends js.Object {
  /* private */ def isConcave(index: js.Any, vertexCount: js.Any, vertices: js.Any, indices: js.Any): js.Any = js.native
  /* private */ def positiveArea(p1x: js.Any, p1y: js.Any, p2x: js.Any, p2y: js.Any, p3x: js.Any, p3y: js.Any): js.Any = js.native
  /* private */ def winding(p1x: js.Any, p1y: js.Any, p2x: js.Any, p2y: js.Any, p3x: js.Any, p3y: js.Any): js.Any = js.native
}

