package typings.openjscad.global.CSG

import typings.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Polygon")
@js.native
class Polygon protected ()
  extends typings.openjscad.CSG.Polygon {
  def this(vertices: js.Array[typings.openjscad.CSG.Vertex]) = this()
  def this(vertices: typings.openjscad.CSG.Vector3D) = this()
  def this(vertices: js.Array[typings.openjscad.CSG.Vertex], shared: Shared) = this()
  def this(vertices: typings.openjscad.CSG.Vector3D, shared: Shared) = this()
  def this(
    vertices: js.Array[typings.openjscad.CSG.Vertex],
    shared: js.UndefOr[scala.Nothing],
    plane: typings.openjscad.CSG.Plane
  ) = this()
  def this(
    vertices: js.Array[typings.openjscad.CSG.Vertex],
    shared: Shared,
    plane: typings.openjscad.CSG.Plane
  ) = this()
  def this(
    vertices: typings.openjscad.CSG.Vector3D,
    shared: js.UndefOr[scala.Nothing],
    plane: typings.openjscad.CSG.Plane
  ) = this()
  def this(vertices: typings.openjscad.CSG.Vector3D, shared: Shared, plane: typings.openjscad.CSG.Plane) = this()
}
/* static members */
@JSGlobal("CSG.Polygon")
@js.native
object Polygon extends js.Object {
  
  def createFromPoints(points: js.Array[js.Array[Double]]): typings.openjscad.CSG.Polygon = js.native
  def createFromPoints(
    points: js.Array[js.Array[Double]],
    shared: js.UndefOr[scala.Nothing],
    plane: typings.openjscad.CSG.Plane
  ): typings.openjscad.CSG.Polygon = js.native
  def createFromPoints(points: js.Array[js.Array[Double]], shared: typings.openjscad.CSG.Polygon.Shared): typings.openjscad.CSG.Polygon = js.native
  def createFromPoints(
    points: js.Array[js.Array[Double]],
    shared: typings.openjscad.CSG.Polygon.Shared,
    plane: typings.openjscad.CSG.Plane
  ): typings.openjscad.CSG.Polygon = js.native
  
  var defaultShared: typings.openjscad.CSG.Polygon.Shared = js.native
  
  def fromObject(obj: js.Any): typings.openjscad.CSG.Polygon = js.native
  
  def isConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
  
  def isStrictlyConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
  
  def verticesConvex(vertices: js.Array[typings.openjscad.CSG.Vertex], planenormal: js.Any): Boolean = js.native
  
  @js.native
  class Shared protected ()
    extends typings.openjscad.CSG.Polygon.Shared {
    def this(color: js.Any) = this()
  }
  /* static members */
  @js.native
  object Shared extends js.Object {
    
    def fromColor(args: js.Any): typings.openjscad.CSG.Polygon.Shared = js.native
    
    def fromObject(obj: js.Any): typings.openjscad.CSG.Polygon.Shared = js.native
  }
}
