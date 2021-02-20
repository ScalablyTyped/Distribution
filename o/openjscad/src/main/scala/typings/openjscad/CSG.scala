package typings.openjscad

import typings.openjscad.CSG.Connector
import typings.openjscad.CSG.Matrix4x4
import typings.openjscad.CSG.OrthoNormalBasis
import typings.openjscad.CSG.Plane
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Polygon.Shared
import typings.openjscad.CSG.Properties
import typings.openjscad.CSG.Vector3D
import typings.openjscad.anon.Back
import typings.openjscad.anon.Class
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSG
  extends CxG
     with ICenter {
  
  var cachedBoundingBox: js.Array[Vector3D] = js.native
  
  def canonicalized(): CSG = js.native
  
  def connectTo(myConnector: Connector, otherConnector: Connector, mirror: Boolean, normalrotation: Double): CSG = js.native
  
  def contract(radius: Double, resolution: Double): CSG = js.native
  
  def cutByPlane(plane: Plane): CSG = js.native
  
  def expand(radius: Double, resolution: Double): CSG = js.native
  
  def expandedShell(radius: Double, resolution: Double, unionWithThis: Boolean): CSG = js.native
  
  def fixTJunctions(): CSG = js.native
  
  def getFeatures(features: js.Any): js.Any = js.native
  
  def getTransformationAndInverseTransformationToFlatLying(): js.Any = js.native
  
  def getTransformationToFlatLying(): js.Any = js.native
  
  def intersect(csg: js.Array[CSG]): CSG = js.native
  def intersect(csg: CSG): CSG = js.native
  
  def intersectSub(csg: CSG): CSG = js.native
  def intersectSub(csg: CSG, retesselate: js.UndefOr[scala.Nothing], canonicalize: Boolean): CSG = js.native
  def intersectSub(csg: CSG, retesselate: Boolean): CSG = js.native
  def intersectSub(csg: CSG, retesselate: Boolean, canonicalize: Boolean): CSG = js.native
  
  def invert(): CSG = js.native
  
  var isCanonicalized: Boolean = js.native
  
  var isRetesselated: Boolean = js.native
  
  def lieFlat(): CSG = js.native
  
  def mayOverlap(csg: CSG): Boolean = js.native
  
  var polygons: js.Array[Polygon] = js.native
  
  def projectToOrthoNormalBasis(orthobasis: OrthoNormalBasis): CAG = js.native
  
  var properties: Properties = js.native
  
  def reTesselated(): CSG = js.native
  
  def sectionCut(orthobasis: OrthoNormalBasis): CAG = js.native
  
  def setColor(args: js.Any): CSG = js.native
  
  def setShared(shared: Shared): CSG = js.native
  
  def stretchAtPlane(normal: js.Array[Double], point: js.Array[Double], length: Double): CSG = js.native
  
  def subtract(csg: js.Array[CSG]): CSG = js.native
  def subtract(csg: CSG): CSG = js.native
  
  def subtractSub(csg: CSG, retesselate: Boolean, canonicalize: Boolean): CSG = js.native
  
  def toCompactBinary(): Class = js.native
  
  def toPointCloud(cuberadius: js.Any): CSG = js.native
  
  def toPolygons(): js.Array[Polygon] = js.native
  
  def toTriangles(): js.Array[_] = js.native
  
  def toX3D(): Blob = js.native
  
  def transform1(matrix4x4: Matrix4x4): CSG = js.native
  
  def union(csg: js.Array[CSG]): CSG = js.native
  def union(csg: CSG): CSG = js.native
  
  def unionForNonIntersecting(csg: CSG): CSG = js.native
  
  def unionSub(csg: CSG): CSG = js.native
  def unionSub(csg: CSG, retesselate: js.UndefOr[scala.Nothing], canonicalize: Boolean): CSG = js.native
  def unionSub(csg: CSG, retesselate: Boolean): CSG = js.native
  def unionSub(csg: CSG, retesselate: Boolean, canonicalize: Boolean): CSG = js.native
}
object CSG {
  
  @js.native
  trait Connector extends CxG {
    
    def axisLine(): Line3D = js.native
    
    var axisvector: Vector3D = js.native
    
    def extend(distance: Double): Connector = js.native
    
    def getTransformationTo(other: Connector, mirror: Boolean, normalrotation: Double): Matrix4x4 = js.native
    
    def normalized(): Connector = js.native
    
    var normalvector: Vector3D = js.native
    
    var point: Vector3D = js.native
  }
  
  @js.native
  trait ConnectorList extends StObject {
    
    def appendConnector(conn: Connector): Unit = js.native
    
    var closed: Boolean = js.native
    
    var connectors_ : js.Array[Connector] = js.native
    
    def followWith(cagish: js.Any): CSG = js.native
    
    def setClosed(bool: Boolean): Unit = js.native
    
    def verify(): Unit = js.native
  }
  object ConnectorList {
    
    @scala.inline
    def apply(
      appendConnector: Connector => Unit,
      closed: Boolean,
      connectors_ : js.Array[Connector],
      followWith: js.Any => CSG,
      setClosed: Boolean => Unit,
      verify: () => Unit
    ): ConnectorList = {
      val __obj = js.Dynamic.literal(appendConnector = js.Any.fromFunction1(appendConnector), closed = closed.asInstanceOf[js.Any], connectors_ = connectors_.asInstanceOf[js.Any], followWith = js.Any.fromFunction1(followWith), setClosed = js.Any.fromFunction1(setClosed), verify = js.Any.fromFunction0(verify))
      __obj.asInstanceOf[ConnectorList]
    }
    
    @scala.inline
    implicit class ConnectorListMutableBuilder[Self <: ConnectorList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendConnector(value: Connector => Unit): Self = StObject.set(x, "appendConnector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectors_(value: js.Array[Connector]): Self = StObject.set(x, "connectors_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectors_Varargs(value: Connector*): Self = StObject.set(x, "connectors_", js.Array(value :_*))
      
      @scala.inline
      def setFollowWith(value: js.Any => CSG): Self = StObject.set(x, "followWith", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetClosed(value: Boolean => Unit): Self = StObject.set(x, "setClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerify(value: () => Unit): Self = StObject.set(x, "verify", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IArcOptions extends ICircleOptions {
    
    var endangle: js.UndefOr[Double] = js.native
    
    var maketangent: js.UndefOr[Boolean] = js.native
    
    var startangle: js.UndefOr[Double] = js.native
  }
  object IArcOptions {
    
    @scala.inline
    def apply(): IArcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArcOptions]
    }
    
    @scala.inline
    implicit class IArcOptionsMutableBuilder[Self <: IArcOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndangle(value: Double): Self = StObject.set(x, "endangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndangleUndefined: Self = StObject.set(x, "endangle", js.undefined)
      
      @scala.inline
      def setMaketangent(value: Boolean): Self = StObject.set(x, "maketangent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaketangentUndefined: Self = StObject.set(x, "maketangent", js.undefined)
      
      @scala.inline
      def setStartangle(value: Double): Self = StObject.set(x, "startangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartangleUndefined: Self = StObject.set(x, "startangle", js.undefined)
    }
  }
  
  @js.native
  trait ICircleOptions extends IRadiusOptions {
    
    var center: js.UndefOr[Vector2D | js.Array[Double]] = js.native
  }
  object ICircleOptions {
    
    @scala.inline
    def apply(): ICircleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICircleOptions]
    }
    
    @scala.inline
    implicit class ICircleOptionsMutableBuilder[Self <: ICircleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Vector2D | js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IEllpiticalArcOptions extends IRadiusOptions {
    
    var clockwise: js.UndefOr[Boolean] = js.native
    
    var large: js.UndefOr[Boolean] = js.native
    
    var xaxisrotation: js.UndefOr[Double] = js.native
    
    var xradius: js.UndefOr[Double] = js.native
    
    var yradius: js.UndefOr[Double] = js.native
  }
  object IEllpiticalArcOptions {
    
    @scala.inline
    def apply(): IEllpiticalArcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEllpiticalArcOptions]
    }
    
    @scala.inline
    implicit class IEllpiticalArcOptionsMutableBuilder[Self <: IEllpiticalArcOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setXaxisrotation(value: Double): Self = StObject.set(x, "xaxisrotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXaxisrotationUndefined: Self = StObject.set(x, "xaxisrotation", js.undefined)
      
      @scala.inline
      def setXradius(value: Double): Self = StObject.set(x, "xradius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXradiusUndefined: Self = StObject.set(x, "xradius", js.undefined)
      
      @scala.inline
      def setYradius(value: Double): Self = StObject.set(x, "yradius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYradiusUndefined: Self = StObject.set(x, "yradius", js.undefined)
    }
  }
  
  @js.native
  trait IRadiusOptions extends StObject {
    
    var radius: js.UndefOr[Double] = js.native
    
    var resolution: js.UndefOr[Double] = js.native
  }
  object IRadiusOptions {
    
    @scala.inline
    def apply(): IRadiusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadiusOptions]
    }
    
    @scala.inline
    implicit class IRadiusOptionsMutableBuilder[Self <: IRadiusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    }
  }
  
  @js.native
  trait IRectangleOptions extends StObject {
    
    var center: js.UndefOr[Vector2D] = js.native
    
    var corner1: js.UndefOr[Vector2D] = js.native
    
    var corner2: js.UndefOr[Vector2D] = js.native
    
    var radius: js.UndefOr[Vector2D] = js.native
  }
  object IRectangleOptions {
    
    @scala.inline
    def apply(): IRectangleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRectangleOptions]
    }
    
    @scala.inline
    implicit class IRectangleOptionsMutableBuilder[Self <: IRectangleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Vector2D): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setCorner1(value: Vector2D): Self = StObject.set(x, "corner1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorner1Undefined: Self = StObject.set(x, "corner1", js.undefined)
      
      @scala.inline
      def setCorner2(value: Vector2D): Self = StObject.set(x, "corner2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorner2Undefined: Self = StObject.set(x, "corner2", js.undefined)
      
      @scala.inline
      def setRadius(value: Vector2D): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  @js.native
  trait IRoundRectangleOptions extends StObject {
    
    var resolution: js.UndefOr[Double] = js.native
    
    var roundradius: Double = js.native
  }
  object IRoundRectangleOptions {
    
    @scala.inline
    def apply(roundradius: Double): IRoundRectangleOptions = {
      val __obj = js.Dynamic.literal(roundradius = roundradius.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRoundRectangleOptions]
    }
    
    @scala.inline
    implicit class IRoundRectangleOptionsMutableBuilder[Self <: IRoundRectangleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setRoundradius(value: Double): Self = StObject.set(x, "roundradius", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Line2D extends CxG {
    
    def absDistanceToPoint(point: Vector2D): Double = js.native
    
    def direction(): Vector2D = js.native
    
    def equals(l: Line2D): Boolean = js.native
    
    def intersectWithLine(line2d: Line2D): Vector2D = js.native
    
    var normal: Vector2D = js.native
    
    def origin(): Vector2D = js.native
    
    def reverse(): Line2D = js.native
    
    var w: Double = js.native
    
    def xAtY(y: Double): Double = js.native
  }
  
  @js.native
  trait Line3D extends CxG {
    
    def closestPointOnLine(point: Vector3D): Vector3D = js.native
    
    var direction: Vector3D = js.native
    
    def distanceToPoint(point: Vector3D): Double = js.native
    
    def equals(line3d: Line3D): Boolean = js.native
    
    def intersectWithPlane(plane: Plane): Vector3D = js.native
    
    var point: Vector3D = js.native
    
    def reverse(): Line3D = js.native
  }
  
  @js.native
  trait Matrix4x4 extends StObject {
    
    var elements: js.Array[Double] = js.native
    
    def isMirroring(): Boolean = js.native
    
    def leftMultiply1x2Vector(v: Vector2D): Vector2D = js.native
    
    def leftMultiply1x3Vector(v: Vector3D): Vector3D = js.native
    
    def minus(m: Matrix4x4): Matrix4x4 = js.native
    
    def multiply(m: Matrix4x4): Matrix4x4 = js.native
    
    def plus(m: Matrix4x4): Matrix4x4 = js.native
    
    def rightMultiply1x2Vector(v: Vector2D): Vector2D = js.native
    
    def rightMultiply1x3Vector(v: Vector3D): Vector3D = js.native
  }
  object Matrix4x4 {
    
    @scala.inline
    def apply(
      elements: js.Array[Double],
      isMirroring: () => Boolean,
      leftMultiply1x2Vector: Vector2D => Vector2D,
      leftMultiply1x3Vector: Vector3D => Vector3D,
      minus: Matrix4x4 => Matrix4x4,
      multiply: Matrix4x4 => Matrix4x4,
      plus: Matrix4x4 => Matrix4x4,
      rightMultiply1x2Vector: Vector2D => Vector2D,
      rightMultiply1x3Vector: Vector3D => Vector3D
    ): Matrix4x4 = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], isMirroring = js.Any.fromFunction0(isMirroring), leftMultiply1x2Vector = js.Any.fromFunction1(leftMultiply1x2Vector), leftMultiply1x3Vector = js.Any.fromFunction1(leftMultiply1x3Vector), minus = js.Any.fromFunction1(minus), multiply = js.Any.fromFunction1(multiply), plus = js.Any.fromFunction1(plus), rightMultiply1x2Vector = js.Any.fromFunction1(rightMultiply1x2Vector), rightMultiply1x3Vector = js.Any.fromFunction1(rightMultiply1x3Vector))
      __obj.asInstanceOf[Matrix4x4]
    }
    
    @scala.inline
    implicit class Matrix4x4MutableBuilder[Self <: Matrix4x4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: js.Array[Double]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: Double*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setIsMirroring(value: () => Boolean): Self = StObject.set(x, "isMirroring", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeftMultiply1x2Vector(value: Vector2D => Vector2D): Self = StObject.set(x, "leftMultiply1x2Vector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeftMultiply1x3Vector(value: Vector3D => Vector3D): Self = StObject.set(x, "leftMultiply1x3Vector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinus(value: Matrix4x4 => Matrix4x4): Self = StObject.set(x, "minus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiply(value: Matrix4x4 => Matrix4x4): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlus(value: Matrix4x4 => Matrix4x4): Self = StObject.set(x, "plus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightMultiply1x2Vector(value: Vector2D => Vector2D): Self = StObject.set(x, "rightMultiply1x2Vector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightMultiply1x3Vector(value: Vector3D => Vector3D): Self = StObject.set(x, "rightMultiply1x3Vector", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    def addPolygonTreeNodes(polygontreenodes: js.Array[PolygonTreeNode]): Unit = js.native
    
    var back: js.Any = js.native
    
    def clipPolygons(polygontreenodes: js.Array[PolygonTreeNode], alsoRemovecoplanarFront: Boolean): Unit = js.native
    
    def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
    
    var front: js.Any = js.native
    
    def getParentPlaneNormals(normals: js.Array[Vector3D], maxdepth: Double): Unit = js.native
    
    def invert(): Unit = js.native
    
    var parent: Node = js.native
    
    var plane: Plane = js.native
    
    var polygontreenodes: js.Array[PolygonTreeNode] = js.native
  }
  object Node {
    
    @scala.inline
    def apply(
      addPolygonTreeNodes: js.Array[PolygonTreeNode] => Unit,
      back: js.Any,
      clipPolygons: (js.Array[PolygonTreeNode], Boolean) => Unit,
      clipTo: (Tree, Boolean) => Unit,
      front: js.Any,
      getParentPlaneNormals: (js.Array[Vector3D], Double) => Unit,
      invert: () => Unit,
      parent: Node,
      plane: Plane,
      polygontreenodes: js.Array[PolygonTreeNode]
    ): Node = {
      val __obj = js.Dynamic.literal(addPolygonTreeNodes = js.Any.fromFunction1(addPolygonTreeNodes), back = back.asInstanceOf[js.Any], clipPolygons = js.Any.fromFunction2(clipPolygons), clipTo = js.Any.fromFunction2(clipTo), front = front.asInstanceOf[js.Any], getParentPlaneNormals = js.Any.fromFunction2(getParentPlaneNormals), invert = js.Any.fromFunction0(invert), parent = parent.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], polygontreenodes = polygontreenodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPolygonTreeNodes(value: js.Array[PolygonTreeNode] => Unit): Self = StObject.set(x, "addPolygonTreeNodes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBack(value: js.Any): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPolygons(value: (js.Array[PolygonTreeNode], Boolean) => Unit): Self = StObject.set(x, "clipPolygons", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClipTo(value: (Tree, Boolean) => Unit): Self = StObject.set(x, "clipTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFront(value: js.Any): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetParentPlaneNormals(value: (js.Array[Vector3D], Double) => Unit): Self = StObject.set(x, "getParentPlaneNormals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvert(value: () => Unit): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlane(value: Plane): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygontreenodes(value: js.Array[PolygonTreeNode]): Self = StObject.set(x, "polygontreenodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygontreenodesVarargs(value: PolygonTreeNode*): Self = StObject.set(x, "polygontreenodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OrthoNormalBasis extends CxG {
    
    def getInverseProjectionMatrix(): Matrix4x4 = js.native
    
    def getProjectionMatrix(): Matrix4x4 = js.native
    
    def line2Dto3D(line2d: Line2D): Line3D = js.native
    
    def line3Dto2D(line3d: Line3D): Line2D = js.native
    
    var plane: Plane = js.native
    
    var planeorigin: Vector3D = js.native
    
    def to2D(vec3: Vector3D): Vector2D = js.native
    
    def to3D(vec2: Vector2D): Vector3D = js.native
    
    var u: Vector3D = js.native
    
    var v: Vector3D = js.native
  }
  
  @js.native
  trait Path2D extends CxG {
    
    def appendArc(endpoint: Vector2D, options: IEllpiticalArcOptions): Path2D = js.native
    
    def appendBezier(controlpoints: js.Any, options: js.Any): Path2D = js.native
    
    def appendPoint(point: Vector2D): Path2D = js.native
    
    def appendPoints(points: js.Array[Vector2D]): Path2D = js.native
    
    def close(): Path2D = js.native
    
    var closed: Boolean = js.native
    
    def concat(otherpath: Path2D): Path2D = js.native
    
    def expandToCAG(pathradius: Double, resolution: Double): CAG = js.native
    
    def innerToCAG(): CAG = js.native
    
    var lastBezierControlPoint: Vector2D = js.native
    
    var points: js.Array[Vector2D] = js.native
    
    def rectangularExtrude(width: Double, height: Double, resolution: Double): CSG = js.native
  }
  
  @js.native
  trait Plane extends CxG {
    
    def equals(n: Plane): Boolean = js.native
    
    def flipped(): Plane = js.native
    
    def getTag(): Double = js.native
    
    def intersectWithLine(line3d: Line3D): Vector3D = js.native
    
    def intersectWithPlane(plane: Plane): Line3D = js.native
    
    def mirrorPoint(point3d: Vector3D): Vector3D = js.native
    
    var normal: Vector3D = js.native
    
    def signedDistanceToPoint(point: Vector3D): Double = js.native
    
    def splitLineBetweenPoints(p1: Vector3D, p2: Vector3D): Vector3D = js.native
    
    def splitPolygon(polygon: Polygon): Back = js.native
    
    var tag: Double = js.native
    
    var w: Double = js.native
  }
  
  @js.native
  trait Polygon extends CxG {
    
    /**
      *
      * @param walls Array of wall polygons
      * @param bottom Bottom polygon
      * @param top Top polygon
      */
    /* private */ def _addWalls(walls: js.Any, bottom: js.Any, top: js.Any, bFlipped: js.Any): js.Any = js.native
    
    def boundingBox(): js.Array[Vector3D] = js.native
    
    def boundingSphere(): js.Any = js.native
    
    var cachedBoundingBox: js.Array[Vector3D] = js.native
    
    var cachedBoundingSphere: js.Any = js.native
    
    def checkIfConvex(): Unit = js.native
    
    def extrude(offsetvector: js.Any): CSG = js.native
    
    def flipped(): Polygon = js.native
    
    def getArea(): Double = js.native
    
    def getSignedVolume(): Double = js.native
    
    def getTetraFeatures(features: js.Any): js.Array[_] = js.native
    
    var plane: Plane = js.native
    
    def projectToOrthoNormalBasis(orthobasis: OrthoNormalBasis): CAG = js.native
    
    def setColor(args: js.Any): Polygon = js.native
    
    var shared: Shared = js.native
    
    /**
      * Creates solid from slices (CSG.Polygon) by generating walls
      * @param {Object} options Solid generating options
      *  - numslices {Number} Number of slices to be generated
      *  - callback(t, slice) {Function} Callback function generating slices.
      *          arguments: t = [0..1], slice = [0..numslices - 1]
      *          return: CSG.Polygon or null to skip
      *  - loop {Boolean} no flats, only walls, it's used to generate solids like a tor
      */
    def solidFromSlices(options: js.Any): CSG = js.native
    
    var vertices: js.Array[Vertex] = js.native
  }
  object Polygon {
    
    @js.native
    trait Shared extends StObject {
      
      var color: js.Any = js.native
      
      def getHash(): js.Any = js.native
      
      def getTag(): js.Any = js.native
      
      var tag: js.Any = js.native
    }
    object Shared {
      
      @scala.inline
      def apply(color: js.Any, getHash: () => js.Any, getTag: () => js.Any, tag: js.Any): Shared = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], getHash = js.Any.fromFunction0(getHash), getTag = js.Any.fromFunction0(getTag), tag = tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[Shared]
      }
      
      @scala.inline
      implicit class SharedMutableBuilder[Self <: Shared] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetHash(value: () => js.Any): Self = StObject.set(x, "getHash", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetTag(value: () => js.Any): Self = StObject.set(x, "getTag", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type Polygon2D = CAG
  
  @js.native
  trait PolygonTreeNode extends StObject {
    
    def _splitByPlane(
      plane: js.Any,
      coplanarfrontnodes: js.Any,
      coplanarbacknodes: js.Any,
      frontnodes: js.Any,
      backnodes: js.Any
    ): Unit = js.native
    
    def addChild(polygon: Polygon): PolygonTreeNode = js.native
    
    def addPolygons(polygons: js.Any): Unit = js.native
    
    var children: js.Any = js.native
    
    def getPolygon(): Polygon = js.native
    
    def getPolygons(result: js.Array[Polygon]): Unit = js.native
    
    def invert(): Unit = js.native
    
    def invertSub(): Unit = js.native
    
    def isRemoved(): Boolean = js.native
    
    def isRootNode(): Boolean = js.native
    
    var parent: js.Any = js.native
    
    var polygon: Polygon = js.native
    
    def recursivelyInvalidatePolygon(): Unit = js.native
    
    def remove(): Unit = js.native
    
    var removed: Boolean = js.native
    
    def splitByPlane(
      plane: js.Any,
      coplanarfrontnodes: js.Any,
      coplanarbacknodes: js.Any,
      frontnodes: js.Any,
      backnodes: js.Any
    ): Unit = js.native
  }
  object PolygonTreeNode {
    
    @scala.inline
    def apply(
      _splitByPlane: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
      addChild: Polygon => PolygonTreeNode,
      addPolygons: js.Any => Unit,
      children: js.Any,
      getPolygon: () => Polygon,
      getPolygons: js.Array[Polygon] => Unit,
      invert: () => Unit,
      invertSub: () => Unit,
      isRemoved: () => Boolean,
      isRootNode: () => Boolean,
      parent: js.Any,
      polygon: Polygon,
      recursivelyInvalidatePolygon: () => Unit,
      remove: () => Unit,
      removed: Boolean,
      splitByPlane: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit
    ): PolygonTreeNode = {
      val __obj = js.Dynamic.literal(_splitByPlane = js.Any.fromFunction5(_splitByPlane), addChild = js.Any.fromFunction1(addChild), addPolygons = js.Any.fromFunction1(addPolygons), children = children.asInstanceOf[js.Any], getPolygon = js.Any.fromFunction0(getPolygon), getPolygons = js.Any.fromFunction1(getPolygons), invert = js.Any.fromFunction0(invert), invertSub = js.Any.fromFunction0(invertSub), isRemoved = js.Any.fromFunction0(isRemoved), isRootNode = js.Any.fromFunction0(isRootNode), parent = parent.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], recursivelyInvalidatePolygon = js.Any.fromFunction0(recursivelyInvalidatePolygon), remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], splitByPlane = js.Any.fromFunction5(splitByPlane))
      __obj.asInstanceOf[PolygonTreeNode]
    }
    
    @scala.inline
    implicit class PolygonTreeNodeMutableBuilder[Self <: PolygonTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddChild(value: Polygon => PolygonTreeNode): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddPolygons(value: js.Any => Unit): Self = StObject.set(x, "addPolygons", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPolygon(value: () => Polygon): Self = StObject.set(x, "getPolygon", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPolygons(value: js.Array[Polygon] => Unit): Self = StObject.set(x, "getPolygons", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvert(value: () => Unit): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvertSub(value: () => Unit): Self = StObject.set(x, "invertSub", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRemoved(value: () => Boolean): Self = StObject.set(x, "isRemoved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRootNode(value: () => Boolean): Self = StObject.set(x, "isRootNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygon(value: Polygon): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursivelyInvalidatePolygon(value: () => Unit): Self = StObject.set(x, "recursivelyInvalidatePolygon", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitByPlane(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "splitByPlane", js.Any.fromFunction5(value))
      
      @scala.inline
      def set_splitByPlane(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "_splitByPlane", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait Properties extends StObject {
    
    def _merge(otherproperties: Properties): Properties = js.native
    
    def _transform(matrix4x4: Matrix4x4): Properties = js.native
    
    var center: js.Any = js.native
    
    var cube: Properties = js.native
    
    var cylinder: Properties = js.native
    
    var end: js.Any = js.native
    
    var facecenters: js.Array[_] = js.native
    
    var facepoint: js.Any = js.native
    
    var facepointH: js.Any = js.native
    
    var facepointH90: js.Any = js.native
    
    var roundedCube: Properties = js.native
    
    var roundedCylinder: js.Any = js.native
    
    var sphere: Properties = js.native
    
    var start: js.Any = js.native
  }
  object Properties {
    
    @scala.inline
    def apply(
      _merge: Properties => Properties,
      _transform: Matrix4x4 => Properties,
      center: js.Any,
      cube: Properties,
      cylinder: Properties,
      end: js.Any,
      facecenters: js.Array[_],
      facepoint: js.Any,
      facepointH: js.Any,
      facepointH90: js.Any,
      roundedCube: Properties,
      roundedCylinder: js.Any,
      sphere: Properties,
      start: js.Any
    ): Properties = {
      val __obj = js.Dynamic.literal(_merge = js.Any.fromFunction1(_merge), _transform = js.Any.fromFunction1(_transform), center = center.asInstanceOf[js.Any], cube = cube.asInstanceOf[js.Any], cylinder = cylinder.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], facecenters = facecenters.asInstanceOf[js.Any], facepoint = facepoint.asInstanceOf[js.Any], facepointH = facepointH.asInstanceOf[js.Any], facepointH90 = facepointH90.asInstanceOf[js.Any], roundedCube = roundedCube.asInstanceOf[js.Any], roundedCylinder = roundedCylinder.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Properties]
    }
    
    @scala.inline
    implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: js.Any): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCube(value: Properties): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCylinder(value: Properties): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacecenters(value: js.Array[_]): Self = StObject.set(x, "facecenters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacecentersVarargs(value: js.Any*): Self = StObject.set(x, "facecenters", js.Array(value :_*))
      
      @scala.inline
      def setFacepoint(value: js.Any): Self = StObject.set(x, "facepoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacepointH(value: js.Any): Self = StObject.set(x, "facepointH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacepointH90(value: js.Any): Self = StObject.set(x, "facepointH90", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedCube(value: Properties): Self = StObject.set(x, "roundedCube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedCylinder(value: js.Any): Self = StObject.set(x, "roundedCylinder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSphere(value: Properties): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_merge(value: Properties => Properties): Self = StObject.set(x, "_merge", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_transform(value: Matrix4x4 => Properties): Self = StObject.set(x, "_transform", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Tree extends StObject {
    
    def addPolygons(polygons: js.Array[Polygon]): Unit = js.native
    
    def allPolygons(): js.Array[Polygon] = js.native
    
    def clipTo(tree: Tree): Unit = js.native
    def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
    
    def invert(): Unit = js.native
    
    var polygonTree: PolygonTreeNode = js.native
    
    var rootnode: Node = js.native
  }
  
  @js.native
  trait Vector2D extends CxG {
    
    def abs(): Vector2D = js.native
    
    def angle(): Double = js.native
    
    def angleDegrees(): Double = js.native
    
    def angleRadians(): Double = js.native
    
    def cross(a: Vector2D): Double = js.native
    
    def distanceTo(a: Vector2D): Double = js.native
    
    def distanceToSquared(a: Vector2D): Double = js.native
    
    def dividedBy(a: Double): Vector2D = js.native
    
    def dot(a: Vector2D): Double = js.native
    
    def equals(a: Vector2D): Boolean = js.native
    
    def length(): Double = js.native
    
    def lengthSquared(): Double = js.native
    
    def lerp(a: Vector2D, t: Double): Vector2D = js.native
    
    def max(p: Vector2D): Vector2D = js.native
    
    def min(p: Vector2D): Vector2D = js.native
    
    def minus(a: Vector2D): Vector2D = js.native
    
    def multiply4x4(matrix4x4: Matrix4x4): Vector2D = js.native
    
    def negated(): Vector2D = js.native
    
    def normal(): Vector2D = js.native
    
    def plus(a: Vector2D): Vector2D = js.native
    
    def times(a: Double): Vector2D = js.native
    
    def toVector3D(z: Double): Vector3D = js.native
    
    def unit(): Vector2D = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @js.native
  trait Vector3D extends CxG {
    
    def abs(): Vector3D = js.native
    
    def cross(a: Vector3D): Vector3D = js.native
    
    def distanceTo(a: Vector3D): Double = js.native
    
    def distanceToSquared(a: Vector3D): Double = js.native
    
    def dividedBy(a: Double): Vector3D = js.native
    
    def dot(a: Vector3D): Double = js.native
    
    def equals(a: Vector3D): Boolean = js.native
    
    def length(): Double = js.native
    
    def lengthSquared(): Double = js.native
    
    def lerp(a: Vector3D, t: Double): Vector3D = js.native
    
    def max(p: Vector3D): Vector3D = js.native
    
    def min(p: Vector3D): Vector3D = js.native
    
    def minus(a: Vector3D): Vector3D = js.native
    
    def multiply4x4(matrix4x4: Matrix4x4): Vector3D = js.native
    
    def negated(): Vector3D = js.native
    
    def plus(a: Vector3D): Vector3D = js.native
    
    def randomNonParallelVector(): Vector3D = js.native
    
    def times(a: Double): Vector3D = js.native
    
    def unit(): Vector3D = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  
  @js.native
  trait Vertex extends CxG {
    
    def flipped(): Vertex = js.native
    
    def getTag(): Double = js.native
    
    def interpolate(other: Vertex, t: Double): Vertex = js.native
    
    var pos: Vector3D = js.native
    
    var tag: Double = js.native
  }
  
  @js.native
  trait fuzzyCSGFactory extends StObject {
    
    def getCSG(sourcecsg: CSG): CSG = js.native
    
    def getPlane(sourceplane: Plane): Plane = js.native
    
    def getPolygon(sourcepolygon: Polygon): Polygon = js.native
    
    def getPolygonShared(sourceshared: Shared): Shared = js.native
    
    def getVertex(sourcevertex: Vertex): Vertex = js.native
    
    var planefactory: fuzzyFactory = js.native
    
    var polygonsharedfactory: js.Any = js.native
    
    var vertexfactory: fuzzyFactory = js.native
  }
  object fuzzyCSGFactory {
    
    @scala.inline
    def apply(
      getCSG: CSG => CSG,
      getPlane: Plane => Plane,
      getPolygon: Polygon => Polygon,
      getPolygonShared: Shared => Shared,
      getVertex: Vertex => Vertex,
      planefactory: fuzzyFactory,
      polygonsharedfactory: js.Any,
      vertexfactory: fuzzyFactory
    ): fuzzyCSGFactory = {
      val __obj = js.Dynamic.literal(getCSG = js.Any.fromFunction1(getCSG), getPlane = js.Any.fromFunction1(getPlane), getPolygon = js.Any.fromFunction1(getPolygon), getPolygonShared = js.Any.fromFunction1(getPolygonShared), getVertex = js.Any.fromFunction1(getVertex), planefactory = planefactory.asInstanceOf[js.Any], polygonsharedfactory = polygonsharedfactory.asInstanceOf[js.Any], vertexfactory = vertexfactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[fuzzyCSGFactory]
    }
    
    @scala.inline
    implicit class fuzzyCSGFactoryMutableBuilder[Self <: fuzzyCSGFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCSG(value: CSG => CSG): Self = StObject.set(x, "getCSG", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPlane(value: Plane => Plane): Self = StObject.set(x, "getPlane", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPolygon(value: Polygon => Polygon): Self = StObject.set(x, "getPolygon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPolygonShared(value: Shared => Shared): Self = StObject.set(x, "getPolygonShared", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVertex(value: Vertex => Vertex): Self = StObject.set(x, "getVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlanefactory(value: fuzzyFactory): Self = StObject.set(x, "planefactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonsharedfactory(value: js.Any): Self = StObject.set(x, "polygonsharedfactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexfactory(value: fuzzyFactory): Self = StObject.set(x, "vertexfactory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait fuzzyFactory extends StObject {
    
    def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any = js.native
    
    var lookuptable: js.Any = js.native
    
    var multiplier: Double = js.native
  }
  object fuzzyFactory {
    
    @scala.inline
    def apply(lookupOrCreate: (js.Any, js.Any) => js.Any, lookuptable: js.Any, multiplier: Double): fuzzyFactory = {
      val __obj = js.Dynamic.literal(lookupOrCreate = js.Any.fromFunction2(lookupOrCreate), lookuptable = lookuptable.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any])
      __obj.asInstanceOf[fuzzyFactory]
    }
    
    @scala.inline
    implicit class fuzzyFactoryMutableBuilder[Self <: fuzzyFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLookupOrCreate(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "lookupOrCreate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLookuptable(value: js.Any): Self = StObject.set(x, "lookuptable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    }
  }
}
