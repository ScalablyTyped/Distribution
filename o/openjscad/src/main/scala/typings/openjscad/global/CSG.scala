package typings.openjscad.global

import typings.openjscad.CSG.IArcOptions
import typings.openjscad.CSG.Polygon.Shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG")
@js.native
class CSG ()
  extends typings.openjscad.CSG
object CSG {
  
  @JSGlobal("CSG")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CSG.Connector")
  @js.native
  class Connector protected ()
    extends typings.openjscad.CSG.Connector {
    def this(point: js.Array[Double], axisvector: js.Array[Double], normalvector: js.Array[Double]) = this()
    def this(
      point: js.Array[Double],
      axisvector: js.Array[Double],
      normalvector: typings.openjscad.CSG.Vector3D
    ) = this()
    def this(
      point: js.Array[Double],
      axisvector: typings.openjscad.CSG.Vector3D,
      normalvector: js.Array[Double]
    ) = this()
    def this(
      point: typings.openjscad.CSG.Vector3D,
      axisvector: js.Array[Double],
      normalvector: js.Array[Double]
    ) = this()
    def this(
      point: typings.openjscad.CSG.Vector3D,
      axisvector: js.Array[Double],
      normalvector: typings.openjscad.CSG.Vector3D
    ) = this()
    def this(
      point: typings.openjscad.CSG.Vector3D,
      axisvector: typings.openjscad.CSG.Vector3D,
      normalvector: typings.openjscad.CSG.Vector3D
    ) = this()
  }
  
  @JSGlobal("CSG.ConnectorList")
  @js.native
  class ConnectorList protected ()
    extends typings.openjscad.CSG.ConnectorList {
    def this(connectors: js.Array[typings.openjscad.CSG.Connector]) = this()
  }
  object ConnectorList {
    
    @JSGlobal("CSG.ConnectorList")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("CSG.ConnectorList.defaultNormal")
    @js.native
    def defaultNormal: js.Array[Double] = js.native
    @scala.inline
    def defaultNormal_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNormal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("CSG.ConnectorList.fromPath2D")
    @js.native
    def fromPath2D(path2D: typings.std.Path2D, arg1: js.Any, arg2: js.Any): typings.openjscad.CSG.ConnectorList = js.native
    
    /* static member */
    @JSGlobal("CSG.ConnectorList._fromPath2DExplicit")
    @js.native
    def fromPath2DExplicit(path2D: js.Any, angleIsh: js.Any): typings.openjscad.CSG.ConnectorList = js.native
    
    /* static member */
    @JSGlobal("CSG.ConnectorList._fromPath2DTangents")
    @js.native
    def fromPath2DTangents(path2D: js.Any, start: js.Any, end: js.Any): typings.openjscad.CSG.ConnectorList = js.native
  }
  
  @JSGlobal("CSG.IsFloat")
  @js.native
  def IsFloat(n: js.Any): Boolean = js.native
  
  @JSGlobal("CSG.Line2D")
  @js.native
  class Line2D protected ()
    extends typings.openjscad.CSG.Line2D {
    def this(normal: typings.openjscad.CSG.Vector2D, w: Double) = this()
  }
  object Line2D {
    
    /* static member */
    @JSGlobal("CSG.Line2D.fromPoints")
    @js.native
    def fromPoints(p1: typings.openjscad.CSG.Vector2D, p2: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Line2D = js.native
  }
  
  @JSGlobal("CSG.Line3D")
  @js.native
  class Line3D protected ()
    extends typings.openjscad.CSG.Line3D {
    def this(point: typings.openjscad.CSG.Vector3D, direction: typings.openjscad.CSG.Vector3D) = this()
  }
  object Line3D {
    
    /* static member */
    @JSGlobal("CSG.Line3D.fromPlanes")
    @js.native
    def fromPlanes(p1: typings.openjscad.CSG.Plane, p2: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Line3D = js.native
    
    /* static member */
    @JSGlobal("CSG.Line3D.fromPoints")
    @js.native
    def fromPoints(p1: typings.openjscad.CSG.Vector3D, p2: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Line3D = js.native
  }
  
  @JSGlobal("CSG.Matrix4x4")
  @js.native
  class Matrix4x4 ()
    extends typings.openjscad.CSG.Matrix4x4 {
    def this(elements: js.Array[Double]) = this()
  }
  object Matrix4x4 {
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.mirroring")
    @js.native
    def mirroring(plane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.rotation")
    @js.native
    def rotation(
      rotationCenter: typings.openjscad.CSG.Vector3D,
      rotationAxis: typings.openjscad.CSG.Vector3D,
      degrees: Double
    ): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.rotationX")
    @js.native
    def rotationX(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.rotationY")
    @js.native
    def rotationY(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.rotationZ")
    @js.native
    def rotationZ(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.scaling")
    @js.native
    def scaling(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = js.native
    /* static member */
    @JSGlobal("CSG.Matrix4x4.scaling")
    @js.native
    def scaling(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.translation")
    @js.native
    def translation(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = js.native
    /* static member */
    @JSGlobal("CSG.Matrix4x4.translation")
    @js.native
    def translation(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* static member */
    @JSGlobal("CSG.Matrix4x4.unity")
    @js.native
    def unity(): typings.openjscad.CSG.Matrix4x4 = js.native
  }
  
  @JSGlobal("CSG.Node")
  @js.native
  class Node protected ()
    extends typings.openjscad.CSG.Node {
    def this(parent: typings.openjscad.CSG.Node) = this()
  }
  
  @JSGlobal("CSG.OrthoNormalBasis")
  @js.native
  class OrthoNormalBasis protected ()
    extends typings.openjscad.CSG.OrthoNormalBasis {
    def this(plane: typings.openjscad.CSG.Plane) = this()
    def this(plane: typings.openjscad.CSG.Plane, rightvector: typings.openjscad.CSG.Vector3D) = this()
  }
  object OrthoNormalBasis {
    
    /* static member */
    @JSGlobal("CSG.OrthoNormalBasis.GetCartesian")
    @js.native
    def GetCartesian(xaxisid: String, yaxisid: String): typings.openjscad.CSG.OrthoNormalBasis = js.native
    
    /* static member */
    @JSGlobal("CSG.OrthoNormalBasis.Z0Plane")
    @js.native
    def Z0Plane(): typings.openjscad.CSG.OrthoNormalBasis = js.native
  }
  
  @JSGlobal("CSG.Path2D")
  @js.native
  class Path2D protected ()
    extends typings.openjscad.CSG.Path2D {
    def this(points: js.Array[Double | typings.openjscad.CSG.Vector2D]) = this()
    def this(points: js.Array[Double | typings.openjscad.CSG.Vector2D], closed: Boolean) = this()
  }
  object Path2D {
    
    /* static member */
    @JSGlobal("CSG.Path2D.arc")
    @js.native
    def arc(options: IArcOptions): typings.openjscad.CSG.Path2D = js.native
  }
  
  @JSGlobal("CSG.Plane")
  @js.native
  class Plane protected ()
    extends typings.openjscad.CSG.Plane {
    def this(normal: typings.openjscad.CSG.Vector3D, w: Double) = this()
  }
  object Plane {
    
    @JSGlobal("CSG.Plane")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("CSG.Plane.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    @scala.inline
    def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("CSG.Plane.anyPlaneFromVector3Ds")
    @js.native
    def anyPlaneFromVector3Ds(
      a: typings.openjscad.CSG.Vector3D,
      b: typings.openjscad.CSG.Vector3D,
      c: typings.openjscad.CSG.Vector3D
    ): typings.openjscad.CSG.Plane = js.native
    
    /* static member */
    @JSGlobal("CSG.Plane.fromNormalAndPoint")
    @js.native
    def fromNormalAndPoint(normal: js.Array[Double], point: js.Array[Double]): typings.openjscad.CSG.Plane = js.native
    /* static member */
    @JSGlobal("CSG.Plane.fromNormalAndPoint")
    @js.native
    def fromNormalAndPoint(normal: typings.openjscad.CSG.Vector3D, point: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Plane = js.native
    
    /* static member */
    @JSGlobal("CSG.Plane.fromObject")
    @js.native
    def fromObject(obj: js.Any): typings.openjscad.CSG.Plane = js.native
    
    /* static member */
    @JSGlobal("CSG.Plane.fromPoints")
    @js.native
    def fromPoints(
      a: typings.openjscad.CSG.Vector3D,
      b: typings.openjscad.CSG.Vector3D,
      c: typings.openjscad.CSG.Vector3D
    ): typings.openjscad.CSG.Plane = js.native
    
    /* static member */
    @JSGlobal("CSG.Plane.fromVector3Ds")
    @js.native
    def fromVector3Ds(
      a: typings.openjscad.CSG.Vector3D,
      b: typings.openjscad.CSG.Vector3D,
      c: typings.openjscad.CSG.Vector3D
    ): typings.openjscad.CSG.Plane = js.native
  }
  
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
  object Polygon {
    
    @JSGlobal("CSG.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CSG.Polygon.Shared")
    @js.native
    class Shared protected ()
      extends typings.openjscad.CSG.Polygon.Shared {
      def this(color: js.Any) = this()
    }
    object Shared {
      
      /* static member */
      @JSGlobal("CSG.Polygon.Shared.fromColor")
      @js.native
      def fromColor(args: js.Any): typings.openjscad.CSG.Polygon.Shared = js.native
      
      /* static member */
      @JSGlobal("CSG.Polygon.Shared.fromObject")
      @js.native
      def fromObject(obj: js.Any): typings.openjscad.CSG.Polygon.Shared = js.native
    }
    
    /* static member */
    @JSGlobal("CSG.Polygon.createFromPoints")
    @js.native
    def createFromPoints(points: js.Array[js.Array[Double]]): typings.openjscad.CSG.Polygon = js.native
    @JSGlobal("CSG.Polygon.createFromPoints")
    @js.native
    def createFromPoints(
      points: js.Array[js.Array[Double]],
      shared: js.UndefOr[scala.Nothing],
      plane: typings.openjscad.CSG.Plane
    ): typings.openjscad.CSG.Polygon = js.native
    @JSGlobal("CSG.Polygon.createFromPoints")
    @js.native
    def createFromPoints(points: js.Array[js.Array[Double]], shared: typings.openjscad.CSG.Polygon.Shared): typings.openjscad.CSG.Polygon = js.native
    @JSGlobal("CSG.Polygon.createFromPoints")
    @js.native
    def createFromPoints(
      points: js.Array[js.Array[Double]],
      shared: typings.openjscad.CSG.Polygon.Shared,
      plane: typings.openjscad.CSG.Plane
    ): typings.openjscad.CSG.Polygon = js.native
    
    /* static member */
    @JSGlobal("CSG.Polygon.defaultShared")
    @js.native
    def defaultShared: typings.openjscad.CSG.Polygon.Shared = js.native
    @scala.inline
    def defaultShared_=(x: typings.openjscad.CSG.Polygon.Shared): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultShared")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("CSG.Polygon.fromObject")
    @js.native
    def fromObject(obj: js.Any): typings.openjscad.CSG.Polygon = js.native
    
    /* static member */
    @JSGlobal("CSG.Polygon.isConvexPoint")
    @js.native
    def isConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("CSG.Polygon.isStrictlyConvexPoint")
    @js.native
    def isStrictlyConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
    
    /* static member */
    @JSGlobal("CSG.Polygon.verticesConvex")
    @js.native
    def verticesConvex(vertices: js.Array[typings.openjscad.CSG.Vertex], planenormal: js.Any): Boolean = js.native
  }
  
  @JSGlobal("CSG.Polygon2D")
  @js.native
  class Polygon2D protected ()
    extends typings.openjscad.CAG {
    def this(points: js.Array[typings.openjscad.CSG.Vector2D]) = this()
  }
  
  @JSGlobal("CSG.PolygonTreeNode")
  @js.native
  class PolygonTreeNode ()
    extends typings.openjscad.CSG.PolygonTreeNode
  
  @JSGlobal("CSG.Properties")
  @js.native
  class Properties ()
    extends typings.openjscad.CSG.Properties
  object Properties {
    
    /* static member */
    @JSGlobal("CSG.Properties.addFrom")
    @js.native
    def addFrom(result: js.Any, otherproperties: typings.openjscad.CSG.Properties): Unit = js.native
    
    /* static member */
    @JSGlobal("CSG.Properties.cloneObj")
    @js.native
    def cloneObj(source: js.Any, result: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("CSG.Properties.transformObj")
    @js.native
    def transformObj(source: js.Any, result: js.Any, matrix4x4: typings.openjscad.CSG.Matrix4x4): Unit = js.native
  }
  
  @JSGlobal("CSG.Tree")
  @js.native
  class Tree protected ()
    extends typings.openjscad.CSG.Tree {
    def this(polygons: js.Array[typings.openjscad.CSG.Polygon]) = this()
  }
  
  @JSGlobal("CSG.Vector2D")
  @js.native
  class Vector2D protected ()
    extends typings.openjscad.CSG.Vector2D {
    def this(x: js.Array[Double]) = this()
    def this(x: typings.openjscad.CSG.Vector2D) = this()
    def this(x: Double, y: Double) = this()
  }
  object Vector2D {
    
    /* static member */
    @JSGlobal("CSG.Vector2D.Create")
    @js.native
    def Create(x: Double, y: Double): typings.openjscad.CSG.Vector2D = js.native
    
    /* static member */
    @JSGlobal("CSG.Vector2D.fromAngle")
    @js.native
    def fromAngle(radians: Double): typings.openjscad.CSG.Vector2D = js.native
    
    /* static member */
    @JSGlobal("CSG.Vector2D.fromAngleDegrees")
    @js.native
    def fromAngleDegrees(degrees: Double): typings.openjscad.CSG.Vector2D = js.native
    
    /* static member */
    @JSGlobal("CSG.Vector2D.fromAngleRadians")
    @js.native
    def fromAngleRadians(radians: Double): typings.openjscad.CSG.Vector2D = js.native
  }
  
  @JSGlobal("CSG.Vector3D")
  @js.native
  class Vector3D protected ()
    extends typings.openjscad.CSG.Vector3D {
    def this(v2: js.Array[Double]) = this()
    def this(v2: typings.openjscad.CSG.Vector2D) = this()
    def this(v3: typings.openjscad.CSG.Vector3D) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
  }
  object Vector3D {
    
    /* static member */
    @JSGlobal("CSG.Vector3D.Create")
    @js.native
    def Create(x: Double, y: Double, z: Double): typings.openjscad.CSG.Vector3D = js.native
  }
  
  @JSGlobal("CSG.Vertex")
  @js.native
  class Vertex protected ()
    extends typings.openjscad.CSG.Vertex {
    def this(pos: typings.openjscad.CSG.Vector3D) = this()
  }
  object Vertex {
    
    /* static member */
    @JSGlobal("CSG.Vertex.fromObject")
    @js.native
    def fromObject(obj: js.Any): typings.openjscad.CSG.Vertex = js.native
  }
  
  @JSGlobal("CSG.cube")
  @js.native
  def cube(options: js.Any): typings.openjscad.CSG = js.native
  
  @JSGlobal("CSG.cylinder")
  @js.native
  def cylinder(options: js.Any): typings.openjscad.CSG = js.native
  
  /* static member */
  @JSGlobal("CSG.defaultResolution2D")
  @js.native
  def defaultResolution2D: Double = js.native
  @scala.inline
  def defaultResolution2D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution2D")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("CSG.defaultResolution3D")
  @js.native
  def defaultResolution3D: Double = js.native
  @scala.inline
  def defaultResolution3D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution3D")(x.asInstanceOf[js.Any])
  
  @JSGlobal("CSG.fnNumberSort")
  @js.native
  def fnNumberSort(a: js.Any, b: js.Any): Double = js.native
  
  /* static member */
  @JSGlobal("CSG.fromCompactBinary")
  @js.native
  def fromCompactBinary(bin: js.Any): typings.openjscad.CSG = js.native
  
  /* static member */
  @JSGlobal("CSG.fromObject")
  @js.native
  def fromObject(obj: js.Any): typings.openjscad.CSG = js.native
  
  /* static member */
  @JSGlobal("CSG.fromPolygons")
  @js.native
  def fromPolygons(polygons: js.Array[typings.openjscad.CSG.Polygon]): typings.openjscad.CSG = js.native
  
  /* static member */
  @JSGlobal("CSG.fromSlices")
  @js.native
  def fromSlices(options: js.Any): typings.openjscad.CSG = js.native
  
  @JSGlobal("CSG.fuzzyCSGFactory")
  @js.native
  class fuzzyCSGFactory ()
    extends typings.openjscad.CSG.fuzzyCSGFactory
  
  @JSGlobal("CSG.fuzzyFactory")
  @js.native
  class fuzzyFactory protected ()
    extends typings.openjscad.CSG.fuzzyFactory {
    def this(numdimensions: Double, tolerance: Double) = this()
  }
  
  @JSGlobal("CSG.getTag")
  @js.native
  def getTag(): Double = js.native
  
  @JSGlobal("CSG.interpolateBetween2DPointsForY")
  @js.native
  def interpolateBetween2DPointsForY(point1: typings.openjscad.CSG.Vector2D, point2: typings.openjscad.CSG.Vector2D, y: Double): Double = js.native
  
  @JSGlobal("CSG.parseOption")
  @js.native
  def parseOption(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  
  @JSGlobal("CSG.parseOptionAs2DVector")
  @js.native
  def parseOptionAs2DVector(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  
  @JSGlobal("CSG.parseOptionAs3DVector")
  @js.native
  def parseOptionAs3DVector(options: js.Any, optionname: js.Any, defaultvalue: js.Any): typings.openjscad.CSG.Vector3D = js.native
  
  @JSGlobal("CSG.parseOptionAs3DVectorList")
  @js.native
  def parseOptionAs3DVectorList(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  
  @JSGlobal("CSG.parseOptionAsBool")
  @js.native
  def parseOptionAsBool(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  
  @JSGlobal("CSG.parseOptionAsFloat")
  @js.native
  def parseOptionAsFloat(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  
  @JSGlobal("CSG.parseOptionAsInt")
  @js.native
  def parseOptionAsInt(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  
  /**
    * polyhedron accepts openscad style arguments. I.e. define face vertices clockwise looking from outside
    */
  @JSGlobal("CSG.polyhedron")
  @js.native
  def polyhedron(options: js.Any): typings.openjscad.CSG = js.native
  
  @JSGlobal("CSG.reTesselateCoplanarPolygons")
  @js.native
  def reTesselateCoplanarPolygons(
    sourcepolygons: js.Array[typings.openjscad.CSG.Polygon],
    destpolygons: js.Array[typings.openjscad.CSG.Polygon]
  ): Unit = js.native
  
  @JSGlobal("CSG.roundedCube")
  @js.native
  def roundedCube(options: js.Any): typings.openjscad.CSG = js.native
  
  @JSGlobal("CSG.roundedCylinder")
  @js.native
  def roundedCylinder(options: js.Any): typings.openjscad.CSG = js.native
  
  @JSGlobal("CSG.solve2Linear")
  @js.native
  def solve2Linear(a: js.Any, b: js.Any, c: js.Any, d: js.Any, u: js.Any, v: js.Any): js.Array[Double] = js.native
  
  @JSGlobal("CSG.sphere")
  @js.native
  def sphere(options: js.Any): typings.openjscad.CSG = js.native
  
  @JSGlobal("CSG.staticTag")
  @js.native
  def staticTag: Double = js.native
  @scala.inline
  def staticTag_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticTag")(x.asInstanceOf[js.Any])
}
