package typings.openjscad.global

import typings.openjscad.CSG.ICircleOptions
import typings.openjscad.CSG.IRectangleOptions
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Vector2D
import typings.openjscad.CSG.fuzzyFactory
import typings.std.Blob
import typings.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CAG")
@js.native
open class CAG ()
  extends StObject
     with typings.openjscad.CAG {
  
  /* CompleteClass */
  override def center(cAxes: js.Array[String]): typings.openjscad.CxG = js.native
}
object CAG {
  
  @JSGlobal("CAG")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def PathsToDxf(paths: js.Array[Path2D]): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("PathsToDxf")(paths.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  @JSGlobal("CAG.Side")
  @js.native
  open class Side protected ()
    extends StObject
       with typings.openjscad.CAG.Side {
    def this(vertex0: typings.openjscad.CAG.Vertex, vertex1: typings.openjscad.CAG.Vertex) = this()
  }
  object Side {
    
    @JSGlobal("CAG.Side")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromFakePolygon(polygon: Polygon): typings.openjscad.CAG.Side = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromFakePolygon")(polygon.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG.Side]
  }
  
  @JSGlobal("CAG.Vertex")
  @js.native
  open class Vertex protected ()
    extends StObject
       with typings.openjscad.CAG.Vertex {
    def this(pos: Vector2D) = this()
    
    /* CompleteClass */
    override def getTag(): Double = js.native
    
    /* CompleteClass */
    var pos: Vector2D = js.native
    
    /* CompleteClass */
    var tag: Double = js.native
  }
  
  /* static member */
  inline def circle(options: ICircleOptions): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  /* static member */
  inline def fromCompactBinary(bin: Any): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompactBinary")(bin.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  /* static member */
  inline def fromFakeCSG(csg: typings.openjscad.CSG): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFakeCSG")(csg.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  /* static member */
  inline def fromPoints(points: js.Array[Vector2D]): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  /* static member */
  inline def fromPointsNoCheck(points: js.Array[Vector2D]): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPointsNoCheck")(points.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  /* static member */
  inline def fromSides(sides: js.Array[typings.openjscad.CAG.Side]): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSides")(sides.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  @JSGlobal("CAG.fuzzyCAGFactory")
  @js.native
  open class fuzzyCAGFactory ()
    extends StObject
       with typings.openjscad.CAG.fuzzyCAGFactory {
    
    /* CompleteClass */
    override def getCAG(sourcecag: typings.openjscad.CAG): typings.openjscad.CAG = js.native
    
    /* CompleteClass */
    override def getSide(sourceside: typings.openjscad.CAG.Side): typings.openjscad.CAG.Side = js.native
    
    /* CompleteClass */
    override def getVertex(sourcevertex: typings.openjscad.CAG.Vertex): typings.openjscad.CAG.Vertex = js.native
    
    /* CompleteClass */
    var vertexfactory: fuzzyFactory = js.native
  }
  
  /* static member */
  inline def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("linesIntersect")(p0start.asInstanceOf[js.Any], p0end.asInstanceOf[js.Any], p1start.asInstanceOf[js.Any], p1end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def rectangle(options: IRectangleOptions): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
  
  /* static member */
  inline def roundedRectangle(options: Any): typings.openjscad.CAG = ^.asInstanceOf[js.Dynamic].applyDynamic("roundedRectangle")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CAG]
}
