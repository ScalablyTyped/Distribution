package typings.openjscad.global

import typings.openjscad.CSG.IArcOptions
import typings.openjscad.CSG.Polygon.Shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG")
@js.native
open class CSG ()
  extends StObject
     with typings.openjscad.CSG {
  
  /* CompleteClass */
  override def center(cAxes: js.Array[String]): typings.openjscad.CxG = js.native
}
object CSG {
  
  @JSGlobal("CSG")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CSG.Connector")
  @js.native
  open class Connector protected ()
    extends StObject
       with typings.openjscad.CSG.Connector {
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
  open class ConnectorList protected ()
    extends StObject
       with typings.openjscad.CSG.ConnectorList {
    def this(connectors: js.Array[typings.openjscad.CSG.Connector]) = this()
    
    /* CompleteClass */
    override def appendConnector(conn: typings.openjscad.CSG.Connector): Unit = js.native
    
    /* CompleteClass */
    var closed: Boolean = js.native
    
    /* CompleteClass */
    var connectors_ : js.Array[typings.openjscad.CSG.Connector] = js.native
    
    /* CompleteClass */
    override def followWith(cagish: Any): typings.openjscad.CSG = js.native
    
    /* CompleteClass */
    override def setClosed(bool: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def verify(): Unit = js.native
  }
  object ConnectorList {
    
    @JSGlobal("CSG.ConnectorList")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("CSG.ConnectorList.defaultNormal")
    @js.native
    def defaultNormal: js.Array[Double] = js.native
    inline def defaultNormal_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNormal")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def fromPath2D(path2D: typings.std.Path2D, arg1: Any, arg2: Any): typings.openjscad.CSG.ConnectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPath2D")(path2D.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.ConnectorList]
    
    /* static member */
    inline def fromPath2DExplicit(path2D: Any, angleIsh: Any): typings.openjscad.CSG.ConnectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromPath2DExplicit")(path2D.asInstanceOf[js.Any], angleIsh.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.ConnectorList]
    
    /* static member */
    inline def fromPath2DTangents(path2D: Any, start: Any, end: Any): typings.openjscad.CSG.ConnectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromPath2DTangents")(path2D.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.ConnectorList]
  }
  
  inline def IsFloat(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFloat")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSGlobal("CSG.Line2D")
  @js.native
  open class Line2D protected ()
    extends StObject
       with typings.openjscad.CSG.Line2D {
    def this(normal: typings.openjscad.CSG.Vector2D, w: Double) = this()
  }
  object Line2D {
    
    @JSGlobal("CSG.Line2D")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromPoints(p1: typings.openjscad.CSG.Vector2D, p2: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Line2D = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Line2D]
  }
  
  @JSGlobal("CSG.Line3D")
  @js.native
  open class Line3D protected ()
    extends StObject
       with typings.openjscad.CSG.Line3D {
    def this(point: typings.openjscad.CSG.Vector3D, direction: typings.openjscad.CSG.Vector3D) = this()
  }
  object Line3D {
    
    @JSGlobal("CSG.Line3D")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromPlanes(p1: typings.openjscad.CSG.Plane, p2: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Line3D = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPlanes")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Line3D]
    
    /* static member */
    inline def fromPoints(p1: typings.openjscad.CSG.Vector3D, p2: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Line3D = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Line3D]
  }
  
  @JSGlobal("CSG.Matrix4x4")
  @js.native
  open class Matrix4x4 ()
    extends StObject
       with typings.openjscad.CSG.Matrix4x4 {
    def this(elements: js.Array[Double]) = this()
    
    /* CompleteClass */
    var elements: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def isMirroring(): Boolean = js.native
    
    /* CompleteClass */
    override def leftMultiply1x2Vector(v: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Vector2D = js.native
    
    /* CompleteClass */
    override def leftMultiply1x3Vector(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Vector3D = js.native
    
    /* CompleteClass */
    override def minus(m: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* CompleteClass */
    override def multiply(m: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* CompleteClass */
    override def plus(m: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Matrix4x4 = js.native
    
    /* CompleteClass */
    override def rightMultiply1x2Vector(v: typings.openjscad.CSG.Vector2D): typings.openjscad.CSG.Vector2D = js.native
    
    /* CompleteClass */
    override def rightMultiply1x3Vector(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Vector3D = js.native
  }
  object Matrix4x4 {
    
    @JSGlobal("CSG.Matrix4x4")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def mirroring(plane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("mirroring")(plane.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def rotation(
      rotationCenter: typings.openjscad.CSG.Vector3D,
      rotationAxis: typings.openjscad.CSG.Vector3D,
      degrees: Double
    ): typings.openjscad.CSG.Matrix4x4 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotation")(rotationCenter.asInstanceOf[js.Any], rotationAxis.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def rotationX(degrees: Double): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("rotationX")(degrees.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def rotationY(degrees: Double): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("rotationY")(degrees.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def rotationZ(degrees: Double): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("rotationZ")(degrees.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def scaling(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("scaling")(v.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    /* static member */
    inline def scaling(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("scaling")(v.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def translation(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("translation")(v.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    /* static member */
    inline def translation(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("translation")(v.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Matrix4x4]
    
    /* static member */
    inline def unity(): typings.openjscad.CSG.Matrix4x4 = ^.asInstanceOf[js.Dynamic].applyDynamic("unity")().asInstanceOf[typings.openjscad.CSG.Matrix4x4]
  }
  
  @JSGlobal("CSG.Node")
  @js.native
  open class Node protected ()
    extends StObject
       with typings.openjscad.CSG.Node {
    def this(parent: typings.openjscad.CSG.Node) = this()
    
    /* CompleteClass */
    override def addPolygonTreeNodes(polygontreenodes: js.Array[typings.openjscad.CSG.PolygonTreeNode]): Unit = js.native
    
    /* CompleteClass */
    var back: Any = js.native
    
    /* CompleteClass */
    override def clipPolygons(
      polygontreenodes: js.Array[typings.openjscad.CSG.PolygonTreeNode],
      alsoRemovecoplanarFront: Boolean
    ): Unit = js.native
    
    /* CompleteClass */
    override def clipTo(tree: typings.openjscad.CSG.Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
    
    /* CompleteClass */
    var front: Any = js.native
    
    /* CompleteClass */
    override def getParentPlaneNormals(normals: js.Array[typings.openjscad.CSG.Vector3D], maxdepth: Double): Unit = js.native
    
    /* CompleteClass */
    override def invert(): Unit = js.native
    
    /* CompleteClass */
    var parent: typings.openjscad.CSG.Node = js.native
    
    /* CompleteClass */
    var plane: typings.openjscad.CSG.Plane = js.native
    
    /* CompleteClass */
    var polygontreenodes: js.Array[typings.openjscad.CSG.PolygonTreeNode] = js.native
  }
  
  @JSGlobal("CSG.OrthoNormalBasis")
  @js.native
  open class OrthoNormalBasis protected ()
    extends StObject
       with typings.openjscad.CSG.OrthoNormalBasis {
    def this(plane: typings.openjscad.CSG.Plane) = this()
    def this(plane: typings.openjscad.CSG.Plane, rightvector: typings.openjscad.CSG.Vector3D) = this()
  }
  object OrthoNormalBasis {
    
    @JSGlobal("CSG.OrthoNormalBasis")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def GetCartesian(xaxisid: String, yaxisid: String): typings.openjscad.CSG.OrthoNormalBasis = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCartesian")(xaxisid.asInstanceOf[js.Any], yaxisid.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.OrthoNormalBasis]
    
    /* static member */
    inline def Z0Plane(): typings.openjscad.CSG.OrthoNormalBasis = ^.asInstanceOf[js.Dynamic].applyDynamic("Z0Plane")().asInstanceOf[typings.openjscad.CSG.OrthoNormalBasis]
  }
  
  @JSGlobal("CSG.Path2D")
  @js.native
  open class Path2D protected ()
    extends StObject
       with typings.openjscad.CSG.Path2D {
    def this(points: js.Array[Double | typings.openjscad.CSG.Vector2D]) = this()
    def this(points: js.Array[Double | typings.openjscad.CSG.Vector2D], closed: Boolean) = this()
  }
  object Path2D {
    
    @JSGlobal("CSG.Path2D")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def arc(options: IArcOptions): typings.openjscad.CSG.Path2D = ^.asInstanceOf[js.Dynamic].applyDynamic("arc")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Path2D]
  }
  
  @JSGlobal("CSG.Plane")
  @js.native
  open class Plane protected ()
    extends StObject
       with typings.openjscad.CSG.Plane {
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
    inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def anyPlaneFromVector3Ds(
      a: typings.openjscad.CSG.Vector3D,
      b: typings.openjscad.CSG.Vector3D,
      c: typings.openjscad.CSG.Vector3D
    ): typings.openjscad.CSG.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("anyPlaneFromVector3Ds")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Plane]
    
    /* static member */
    inline def fromNormalAndPoint(normal: js.Array[Double], point: js.Array[Double]): typings.openjscad.CSG.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNormalAndPoint")(normal.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Plane]
    /* static member */
    inline def fromNormalAndPoint(normal: typings.openjscad.CSG.Vector3D, point: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNormalAndPoint")(normal.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Plane]
    
    /* static member */
    inline def fromObject(obj: Any): typings.openjscad.CSG.Plane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Plane]
    
    /* static member */
    inline def fromPoints(
      a: typings.openjscad.CSG.Vector3D,
      b: typings.openjscad.CSG.Vector3D,
      c: typings.openjscad.CSG.Vector3D
    ): typings.openjscad.CSG.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Plane]
    
    /* static member */
    inline def fromVector3Ds(
      a: typings.openjscad.CSG.Vector3D,
      b: typings.openjscad.CSG.Vector3D,
      c: typings.openjscad.CSG.Vector3D
    ): typings.openjscad.CSG.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVector3Ds")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Plane]
  }
  
  @JSGlobal("CSG.Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with typings.openjscad.CSG.Polygon {
    def this(vertices: js.Array[typings.openjscad.CSG.Vertex]) = this()
    def this(vertices: typings.openjscad.CSG.Vector3D) = this()
    def this(vertices: js.Array[typings.openjscad.CSG.Vertex], shared: Shared) = this()
    def this(vertices: typings.openjscad.CSG.Vector3D, shared: Shared) = this()
    def this(vertices: js.Array[typings.openjscad.CSG.Vertex], shared: Unit, plane: typings.openjscad.CSG.Plane) = this()
    def this(
      vertices: js.Array[typings.openjscad.CSG.Vertex],
      shared: Shared,
      plane: typings.openjscad.CSG.Plane
    ) = this()
    def this(vertices: typings.openjscad.CSG.Vector3D, shared: Unit, plane: typings.openjscad.CSG.Plane) = this()
    def this(vertices: typings.openjscad.CSG.Vector3D, shared: Shared, plane: typings.openjscad.CSG.Plane) = this()
  }
  object Polygon {
    
    @JSGlobal("CSG.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CSG.Polygon.Shared")
    @js.native
    open class Shared protected ()
      extends StObject
         with typings.openjscad.CSG.Polygon.Shared {
      def this(color: Any) = this()
      
      /* CompleteClass */
      var color: Any = js.native
      
      /* CompleteClass */
      override def getHash(): Any = js.native
      
      /* CompleteClass */
      override def getTag(): Any = js.native
      
      /* CompleteClass */
      var tag: Any = js.native
    }
    object Shared {
      
      @JSGlobal("CSG.Polygon.Shared")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromColor(args: Any): typings.openjscad.CSG.Polygon.Shared = ^.asInstanceOf[js.Dynamic].applyDynamic("fromColor")(args.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Polygon.Shared]
      
      /* static member */
      inline def fromObject(obj: Any): typings.openjscad.CSG.Polygon.Shared = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Polygon.Shared]
    }
    
    /* static member */
    inline def createFromPoints(points: js.Array[js.Array[Double]]): typings.openjscad.CSG.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Polygon]
    inline def createFromPoints(points: js.Array[js.Array[Double]], shared: Unit, plane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromPoints")(points.asInstanceOf[js.Any], shared.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Polygon]
    inline def createFromPoints(points: js.Array[js.Array[Double]], shared: typings.openjscad.CSG.Polygon.Shared): typings.openjscad.CSG.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromPoints")(points.asInstanceOf[js.Any], shared.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Polygon]
    inline def createFromPoints(
      points: js.Array[js.Array[Double]],
      shared: typings.openjscad.CSG.Polygon.Shared,
      plane: typings.openjscad.CSG.Plane
    ): typings.openjscad.CSG.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromPoints")(points.asInstanceOf[js.Any], shared.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Polygon]
    
    /* static member */
    @JSGlobal("CSG.Polygon.defaultShared")
    @js.native
    def defaultShared: typings.openjscad.CSG.Polygon.Shared = js.native
    inline def defaultShared_=(x: typings.openjscad.CSG.Polygon.Shared): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultShared")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def fromObject(obj: Any): typings.openjscad.CSG.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Polygon]
    
    /* static member */
    inline def isConvexPoint(prevpoint: Any, point: Any, nextpoint: Any, normal: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConvexPoint")(prevpoint.asInstanceOf[js.Any], point.asInstanceOf[js.Any], nextpoint.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def isStrictlyConvexPoint(prevpoint: Any, point: Any, nextpoint: Any, normal: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrictlyConvexPoint")(prevpoint.asInstanceOf[js.Any], point.asInstanceOf[js.Any], nextpoint.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def verticesConvex(vertices: js.Array[typings.openjscad.CSG.Vertex], planenormal: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verticesConvex")(vertices.asInstanceOf[js.Any], planenormal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSGlobal("CSG.Polygon2D")
  @js.native
  open class Polygon2D protected ()
    extends StObject
       with typings.openjscad.CAG {
    def this(points: js.Array[typings.openjscad.CSG.Vector2D]) = this()
    
    /* CompleteClass */
    override def center(cAxes: js.Array[String]): typings.openjscad.CxG = js.native
  }
  
  @JSGlobal("CSG.PolygonTreeNode")
  @js.native
  open class PolygonTreeNode ()
    extends StObject
       with typings.openjscad.CSG.PolygonTreeNode {
    
    /* CompleteClass */
    override def _splitByPlane(plane: Any, coplanarfrontnodes: Any, coplanarbacknodes: Any, frontnodes: Any, backnodes: Any): Unit = js.native
    
    /* CompleteClass */
    override def addChild(polygon: typings.openjscad.CSG.Polygon): typings.openjscad.CSG.PolygonTreeNode = js.native
    
    /* CompleteClass */
    override def addPolygons(polygons: Any): Unit = js.native
    
    /* CompleteClass */
    var children: Any = js.native
    
    /* CompleteClass */
    override def getPolygon(): typings.openjscad.CSG.Polygon = js.native
    
    /* CompleteClass */
    override def getPolygons(result: js.Array[typings.openjscad.CSG.Polygon]): Unit = js.native
    
    /* CompleteClass */
    override def invert(): Unit = js.native
    
    /* CompleteClass */
    override def invertSub(): Unit = js.native
    
    /* CompleteClass */
    override def isRemoved(): Boolean = js.native
    
    /* CompleteClass */
    override def isRootNode(): Boolean = js.native
    
    /* CompleteClass */
    var parent: Any = js.native
    
    /* CompleteClass */
    var polygon: typings.openjscad.CSG.Polygon = js.native
    
    /* CompleteClass */
    override def recursivelyInvalidatePolygon(): Unit = js.native
    
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /* CompleteClass */
    var removed: Boolean = js.native
    
    /* CompleteClass */
    override def splitByPlane(plane: Any, coplanarfrontnodes: Any, coplanarbacknodes: Any, frontnodes: Any, backnodes: Any): Unit = js.native
  }
  
  @JSGlobal("CSG.Properties")
  @js.native
  open class Properties ()
    extends StObject
       with typings.openjscad.CSG.Properties {
    
    /* CompleteClass */
    override def _merge(otherproperties: typings.openjscad.CSG.Properties): typings.openjscad.CSG.Properties = js.native
    
    /* CompleteClass */
    override def _transform(matrix4x4: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Properties = js.native
    
    /* CompleteClass */
    var center: Any = js.native
    
    /* CompleteClass */
    var cube: typings.openjscad.CSG.Properties = js.native
    
    /* CompleteClass */
    var cylinder: typings.openjscad.CSG.Properties = js.native
    
    /* CompleteClass */
    var end: Any = js.native
    
    /* CompleteClass */
    var facecenters: js.Array[Any] = js.native
    
    /* CompleteClass */
    var facepoint: Any = js.native
    
    /* CompleteClass */
    var facepointH: Any = js.native
    
    /* CompleteClass */
    var facepointH90: Any = js.native
    
    /* CompleteClass */
    var roundedCube: typings.openjscad.CSG.Properties = js.native
    
    /* CompleteClass */
    var roundedCylinder: Any = js.native
    
    /* CompleteClass */
    var sphere: typings.openjscad.CSG.Properties = js.native
    
    /* CompleteClass */
    var start: Any = js.native
  }
  object Properties {
    
    @JSGlobal("CSG.Properties")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addFrom(result: Any, otherproperties: typings.openjscad.CSG.Properties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFrom")(result.asInstanceOf[js.Any], otherproperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def cloneObj(source: Any, result: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneObj")(source.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def transformObj(source: Any, result: Any, matrix4x4: typings.openjscad.CSG.Matrix4x4): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformObj")(source.asInstanceOf[js.Any], result.asInstanceOf[js.Any], matrix4x4.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("CSG.Tree")
  @js.native
  open class Tree protected ()
    extends StObject
       with typings.openjscad.CSG.Tree {
    def this(polygons: js.Array[typings.openjscad.CSG.Polygon]) = this()
  }
  
  @JSGlobal("CSG.Vector2D")
  @js.native
  open class Vector2D protected ()
    extends StObject
       with typings.openjscad.CSG.Vector2D {
    def this(x: js.Array[Double]) = this()
    def this(x: typings.openjscad.CSG.Vector2D) = this()
    def this(x: Double, y: Double) = this()
  }
  object Vector2D {
    
    @JSGlobal("CSG.Vector2D")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Create(x: Double, y: Double): typings.openjscad.CSG.Vector2D = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Vector2D]
    
    /* static member */
    inline def fromAngle(radians: Double): typings.openjscad.CSG.Vector2D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(radians.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Vector2D]
    
    /* static member */
    inline def fromAngleDegrees(degrees: Double): typings.openjscad.CSG.Vector2D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngleDegrees")(degrees.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Vector2D]
    
    /* static member */
    inline def fromAngleRadians(radians: Double): typings.openjscad.CSG.Vector2D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngleRadians")(radians.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Vector2D]
  }
  
  @JSGlobal("CSG.Vector3D")
  @js.native
  open class Vector3D protected ()
    extends StObject
       with typings.openjscad.CSG.Vector3D {
    def this(v2: js.Array[Double]) = this()
    def this(v2: typings.openjscad.CSG.Vector2D) = this()
    def this(v3: typings.openjscad.CSG.Vector3D) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
  }
  object Vector3D {
    
    @JSGlobal("CSG.Vector3D")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Create(x: Double, y: Double, z: Double): typings.openjscad.CSG.Vector3D = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Vector3D]
  }
  
  @JSGlobal("CSG.Vertex")
  @js.native
  open class Vertex protected ()
    extends StObject
       with typings.openjscad.CSG.Vertex {
    def this(pos: typings.openjscad.CSG.Vector3D) = this()
  }
  object Vertex {
    
    @JSGlobal("CSG.Vertex")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromObject(obj: Any): typings.openjscad.CSG.Vertex = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG.Vertex]
  }
  
  inline def cube(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("cube")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  inline def cylinder(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("cylinder")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  /* static member */
  @JSGlobal("CSG.defaultResolution2D")
  @js.native
  def defaultResolution2D: Double = js.native
  inline def defaultResolution2D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution2D")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("CSG.defaultResolution3D")
  @js.native
  def defaultResolution3D: Double = js.native
  inline def defaultResolution3D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolution3D")(x.asInstanceOf[js.Any])
  
  inline def fnNumberSort(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fnNumberSort")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def fromCompactBinary(bin: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompactBinary")(bin.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  /* static member */
  inline def fromObject(obj: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  /* static member */
  inline def fromPolygons(polygons: js.Array[typings.openjscad.CSG.Polygon]): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPolygons")(polygons.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  /* static member */
  inline def fromSlices(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSlices")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  @JSGlobal("CSG.fuzzyCSGFactory")
  @js.native
  open class fuzzyCSGFactory ()
    extends StObject
       with typings.openjscad.CSG.fuzzyCSGFactory {
    
    /* CompleteClass */
    override def getCSG(sourcecsg: typings.openjscad.CSG): typings.openjscad.CSG = js.native
    
    /* CompleteClass */
    override def getPlane(sourceplane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Plane = js.native
    
    /* CompleteClass */
    override def getPolygon(sourcepolygon: typings.openjscad.CSG.Polygon): typings.openjscad.CSG.Polygon = js.native
    
    /* CompleteClass */
    override def getPolygonShared(sourceshared: Shared): Shared = js.native
    
    /* CompleteClass */
    override def getVertex(sourcevertex: typings.openjscad.CSG.Vertex): typings.openjscad.CSG.Vertex = js.native
    
    /* CompleteClass */
    var planefactory: typings.openjscad.CSG.fuzzyFactory = js.native
    
    /* CompleteClass */
    var polygonsharedfactory: Any = js.native
    
    /* CompleteClass */
    var vertexfactory: typings.openjscad.CSG.fuzzyFactory = js.native
  }
  
  @JSGlobal("CSG.fuzzyFactory")
  @js.native
  open class fuzzyFactory protected ()
    extends StObject
       with typings.openjscad.CSG.fuzzyFactory {
    def this(numdimensions: Double, tolerance: Double) = this()
    
    /* CompleteClass */
    override def lookupOrCreate(els: Any, creatorCallback: Any): Any = js.native
    
    /* CompleteClass */
    var lookuptable: Any = js.native
    
    /* CompleteClass */
    var multiplier: Double = js.native
  }
  
  inline def getTag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")().asInstanceOf[Double]
  
  inline def interpolateBetween2DPointsForY(point1: typings.openjscad.CSG.Vector2D, point2: typings.openjscad.CSG.Vector2D, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateBetween2DPointsForY")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseOption(options: Any, optionname: Any, defaultvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOption")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseOptionAs2DVector(options: Any, optionname: Any, defaultvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOptionAs2DVector")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseOptionAs3DVector(options: Any, optionname: Any, defaultvalue: Any): typings.openjscad.CSG.Vector3D = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOptionAs3DVector")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[typings.openjscad.CSG.Vector3D]
  
  inline def parseOptionAs3DVectorList(options: Any, optionname: Any, defaultvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOptionAs3DVectorList")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseOptionAsBool(options: Any, optionname: Any, defaultvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOptionAsBool")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseOptionAsFloat(options: Any, optionname: Any, defaultvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOptionAsFloat")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseOptionAsInt(options: Any, optionname: Any, defaultvalue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseOptionAsInt")(options.asInstanceOf[js.Any], optionname.asInstanceOf[js.Any], defaultvalue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * polyhedron accepts openscad style arguments. I.e. define face vertices clockwise looking from outside
    */
  inline def polyhedron(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("polyhedron")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  inline def reTesselateCoplanarPolygons(
    sourcepolygons: js.Array[typings.openjscad.CSG.Polygon],
    destpolygons: js.Array[typings.openjscad.CSG.Polygon]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reTesselateCoplanarPolygons")(sourcepolygons.asInstanceOf[js.Any], destpolygons.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def roundedCube(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("roundedCube")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  inline def roundedCylinder(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("roundedCylinder")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  inline def solve2Linear(a: Any, b: Any, c: Any, d: Any, u: Any, v: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve2Linear")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], u.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def sphere(options: Any): typings.openjscad.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("sphere")(options.asInstanceOf[js.Any]).asInstanceOf[typings.openjscad.CSG]
  
  @JSGlobal("CSG.staticTag")
  @js.native
  def staticTag: Double = js.native
  inline def staticTag_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticTag")(x.asInstanceOf[js.Any])
}
