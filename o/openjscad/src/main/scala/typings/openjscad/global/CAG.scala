package typings.openjscad.global

import typings.openjscad.CSG.ICircleOptions
import typings.openjscad.CSG.IRectangleOptions
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Vector2D
import typings.std.Blob
import typings.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CAG")
@js.native
class CAG ()
  extends typings.openjscad.CAG
object CAG {
  
  /* static member */
  @JSGlobal("CAG.PathsToDxf")
  @js.native
  def PathsToDxf(paths: js.Array[Path2D]): Blob = js.native
  
  @JSGlobal("CAG.Side")
  @js.native
  class Side protected ()
    extends typings.openjscad.CAG.Side {
    def this(vertex0: typings.openjscad.CAG.Vertex, vertex1: typings.openjscad.CAG.Vertex) = this()
  }
  object Side {
    
    /* static member */
    @JSGlobal("CAG.Side._fromFakePolygon")
    @js.native
    def fromFakePolygon(polygon: Polygon): typings.openjscad.CAG.Side = js.native
  }
  
  @JSGlobal("CAG.Vertex")
  @js.native
  class Vertex protected ()
    extends typings.openjscad.CAG.Vertex {
    def this(pos: Vector2D) = this()
  }
  
  /* static member */
  @JSGlobal("CAG.circle")
  @js.native
  def circle(options: ICircleOptions): typings.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromCompactBinary")
  @js.native
  def fromCompactBinary(bin: js.Any): typings.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromFakeCSG")
  @js.native
  def fromFakeCSG(csg: typings.openjscad.CSG): typings.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromPoints")
  @js.native
  def fromPoints(points: js.Array[Vector2D]): typings.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromPointsNoCheck")
  @js.native
  def fromPointsNoCheck(points: js.Array[Vector2D]): typings.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.fromSides")
  @js.native
  def fromSides(sides: js.Array[typings.openjscad.CAG.Side]): typings.openjscad.CAG = js.native
  
  @JSGlobal("CAG.fuzzyCAGFactory")
  @js.native
  class fuzzyCAGFactory ()
    extends typings.openjscad.CAG.fuzzyCAGFactory
  
  /* static member */
  @JSGlobal("CAG.linesIntersect")
  @js.native
  def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = js.native
  
  /* static member */
  @JSGlobal("CAG.rectangle")
  @js.native
  def rectangle(options: IRectangleOptions): typings.openjscad.CAG = js.native
  
  /* static member */
  @JSGlobal("CAG.roundedRectangle")
  @js.native
  def roundedRectangle(options: js.Any): typings.openjscad.CAG = js.native
}
