package typings.openjscad

import typings.openjscad.CAG.Side
import typings.openjscad.CSG.Matrix4x4
import typings.openjscad.CSG.OrthoNormalBasis
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Vector2D
import typings.openjscad.CSG.Vector3D
import typings.openjscad.CSG.fuzzyFactory
import typings.openjscad.anon.SideVertexIndices
import typings.std.Blob
import typings.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAG
  extends CxG
     with ICenter {
  
  def _toCSGWall(z0: js.Any, z1: js.Any): CSG = js.native
  
  def _toPlanePolygons(options: js.Any): js.Array[Polygon] = js.native
  
  def _toVector3DPairs(m: Matrix4x4): js.Array[js.Array[Vector3D]] = js.native
  
  def _toWallPolygons(options: js.Any): js.Array[_] = js.native
  
  def area(): Double = js.native
  
  def canonicalized(): CAG = js.native
  
  def check(): Unit = js.native
  
  def contract(radius: Double, resolution: Double): CAG = js.native
  
  def expand(radius: Double, resolution: Double): CAG = js.native
  
  def expandedShell(radius: Double, resolution: Double): CAG = js.native
  
  def extrude(options: CAGExtrudeOptions): CSG = js.native
  
  def extrudeInOrthonormalBasis(orthonormalbasis: OrthoNormalBasis, depth: Double): CSG = js.native
  def extrudeInOrthonormalBasis(orthonormalbasis: OrthoNormalBasis, depth: Double, options: js.Any): CSG = js.native
  
  def extrudeInPlane(axis1: js.Any, axis2: js.Any, depth: js.Any, options: js.Any): CSG = js.native
  
  def flipped(): CAG = js.native
  
  def getOutlinePaths(): js.Array[Path2D] = js.native
  
  def intersect(cag: js.Array[CAG]): CAG = js.native
  def intersect(cag: CAG): CAG = js.native
  
  var isCanonicalized: Boolean = js.native
  
  def isSelfIntersecting(): Boolean = js.native
  
  def overCutInsideCorners(cutterradius: js.Any): CAG = js.native
  
  def rotateExtrude(options: js.Any): CSG = js.native
  
  var sides: js.Array[Side] = js.native
  
  def subtract(cag: js.Array[CAG]): CAG = js.native
  def subtract(cag: CAG): CAG = js.native
  
  def toCompactBinary(): SideVertexIndices = js.native
  
  def toDxf(): Blob = js.native
  
  def union(cag: js.Array[CAG]): CAG = js.native
  def union(cag: CAG): CAG = js.native
}
object CAG {
  
  @js.native
  trait Side extends CxG {
    
    def direction(): Vector2D = js.native
    
    def flipped(): Side = js.native
    
    def getTag(): Double = js.native
    
    def length(): Double = js.native
    
    def lengthSquared(): Double = js.native
    
    var tag: Double = js.native
    
    def toPolygon3D(z0: js.Any, z1: js.Any): Polygon = js.native
    
    var vertex0: Vertex = js.native
    
    var vertex1: Vertex = js.native
  }
  
  @js.native
  trait Vertex extends StObject {
    
    def getTag(): Double = js.native
    
    var pos: Vector2D = js.native
    
    var tag: Double = js.native
  }
  object Vertex {
    
    @scala.inline
    def apply(getTag: () => Double, pos: Vector2D, tag: Double): Vertex = {
      val __obj = js.Dynamic.literal(getTag = js.Any.fromFunction0(getTag), pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vertex]
    }
    
    @scala.inline
    implicit class VertexMutableBuilder[Self <: Vertex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTag(value: () => Double): Self = StObject.set(x, "getTag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPos(value: Vector2D): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait fuzzyCAGFactory extends StObject {
    
    def getCAG(sourcecag: CAG): CAG = js.native
    
    def getSide(sourceside: Side): Side = js.native
    
    def getVertex(sourcevertex: Vertex): Vertex = js.native
    
    var vertexfactory: fuzzyFactory = js.native
  }
  object fuzzyCAGFactory {
    
    @scala.inline
    def apply(
      getCAG: CAG => CAG,
      getSide: Side => Side,
      getVertex: Vertex => Vertex,
      vertexfactory: fuzzyFactory
    ): fuzzyCAGFactory = {
      val __obj = js.Dynamic.literal(getCAG = js.Any.fromFunction1(getCAG), getSide = js.Any.fromFunction1(getSide), getVertex = js.Any.fromFunction1(getVertex), vertexfactory = vertexfactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[fuzzyCAGFactory]
    }
    
    @scala.inline
    implicit class fuzzyCAGFactoryMutableBuilder[Self <: fuzzyCAGFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCAG(value: CAG => CAG): Self = StObject.set(x, "getCAG", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSide(value: Side => Side): Self = StObject.set(x, "getSide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVertex(value: Vertex => Vertex): Self = StObject.set(x, "getVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVertexfactory(value: fuzzyFactory): Self = StObject.set(x, "vertexfactory", value.asInstanceOf[js.Any])
    }
  }
}
