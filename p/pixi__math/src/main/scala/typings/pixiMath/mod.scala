package typings.pixiMath

import typings.pixiMath.libGroupD8Mod.GD8Symmetry
import typings.pixiMath.libIpointdataMod.IPointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/math", "Circle")
  @js.native
  /**
    * @param x - The X coordinate of the center of this circle
    * @param y - The Y coordinate of the center of this circle
    * @param radius - The radius of the circle
    */
  open class Circle ()
    extends typings.pixiMath.libShapesCircleMod.Circle {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
    def this(x: Double, y: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, radius: Double) = this()
  }
  
  @JSImport("@pixi/math", "DEG_TO_RAD")
  @js.native
  val DEG_TO_RAD: Double = js.native
  
  @JSImport("@pixi/math", "Ellipse")
  @js.native
  /**
    * @param x - The X coordinate of the center of this ellipse
    * @param y - The Y coordinate of the center of this ellipse
    * @param halfWidth - The half width of this ellipse
    * @param halfHeight - The half height of this ellipse
    */
  open class Ellipse ()
    extends typings.pixiMath.libShapesEllipseMod.Ellipse {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, halfWidth: Double) = this()
    def this(x: Double, y: Unit, halfWidth: Double) = this()
    def this(x: Unit, y: Double, halfWidth: Double) = this()
    def this(x: Unit, y: Unit, halfWidth: Double) = this()
    def this(x: Double, y: Double, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Double, y: Double, halfWidth: Unit, halfHeight: Double) = this()
    def this(x: Double, y: Unit, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Double, y: Unit, halfWidth: Unit, halfHeight: Double) = this()
    def this(x: Unit, y: Double, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Unit, y: Double, halfWidth: Unit, halfHeight: Double) = this()
    def this(x: Unit, y: Unit, halfWidth: Double, halfHeight: Double) = this()
    def this(x: Unit, y: Unit, halfWidth: Unit, halfHeight: Double) = this()
  }
  
  @JSImport("@pixi/math", "Matrix")
  @js.native
  open class Matrix protected ()
    extends typings.pixiMath.libMatrixMod.Matrix {
    /**
      * @param a - x scale
      * @param b - y skew
      * @param c - x skew
      * @param d - y scale
      * @param tx - x translation
      * @param ty - y translation
      */
    def this(
      a: js.UndefOr[Double],
      b: js.UndefOr[Double],
      c: js.UndefOr[Double],
      d: js.UndefOr[Double],
      tx: js.UndefOr[Double],
      ty: js.UndefOr[Double]
    ) = this()
  }
  
  @JSImport("@pixi/math", "ObservablePoint")
  @js.native
  open class ObservablePoint[T] protected ()
    extends typings.pixiMath.libObservablePointMod.ObservablePoint[T] {
    /**
      * Creates a new `ObservablePoint`
      * @param cb - callback function triggered when `x` and/or `y` are changed
      * @param scope - owner of callback
      * @param {number} [x=0] - position of the point on the x axis
      * @param {number} [y=0] - position of the point on the y axis
      */
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T) = this()
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T, x: Double) = this()
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T, x: Double, y: Double) = this()
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T, x: Unit, y: Double) = this()
  }
  
  @JSImport("@pixi/math", "PI_2")
  @js.native
  val PI_2: Double = js.native
  
  @JSImport("@pixi/math", "Point")
  @js.native
  /**
    * Creates a new `Point`
    * @param {number} [x=0] - position of the point on the x axis
    * @param {number} [y=0] - position of the point on the y axis
    */
  open class Point ()
    extends typings.pixiMath.libPointMod.Point {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  
  @JSImport("@pixi/math", "Polygon")
  @js.native
  open class Polygon protected ()
    extends typings.pixiMath.libShapesPolygonMod.Polygon {
    def this(points: js.Array[Double | IPointData]) = this()
  }
  
  @JSImport("@pixi/math", "RAD_TO_DEG")
  @js.native
  val RAD_TO_DEG: Double = js.native
  
  @JSImport("@pixi/math", "Rectangle")
  @js.native
  open class Rectangle protected ()
    extends typings.pixiMath.libShapesRectangleMod.Rectangle {
    /**
      * @param x - The X coordinate of the upper-left corner of the rectangle
      * @param y - The Y coordinate of the upper-left corner of the rectangle
      * @param width - The overall width of the rectangle
      * @param height - The overall height of the rectangle
      */
    def this(
      x: js.UndefOr[String | Double],
      y: js.UndefOr[String | Double],
      width: js.UndefOr[String | Double],
      height: js.UndefOr[String | Double]
    ) = this()
  }
  
  @JSImport("@pixi/math", "RoundedRectangle")
  @js.native
  /**
    * @param x - The X coordinate of the upper-left corner of the rounded rectangle
    * @param y - The Y coordinate of the upper-left corner of the rounded rectangle
    * @param width - The overall width of this rounded rectangle
    * @param height - The overall height of this rounded rectangle
    * @param radius - Controls the radius of the rounded corners
    */
  open class RoundedRectangle ()
    extends typings.pixiMath.libShapesRoundedRectangleMod.RoundedRectangle {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, radius: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Unit, radius: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double, radius: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Unit, radius: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double, radius: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Unit, radius: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double, radius: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double, radius: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double, radius: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Unit, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Unit, radius: Double) = this()
  }
  
  @JSImport("@pixi/math", "SHAPES")
  @js.native
  object SHAPES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiMath.libConstMod.SHAPES & Double] = js.native
    
    /* 2 */ val CIRC: typings.pixiMath.libConstMod.SHAPES.CIRC & Double = js.native
    
    /* 3 */ val ELIP: typings.pixiMath.libConstMod.SHAPES.ELIP & Double = js.native
    
    /* 0 */ val POLY: typings.pixiMath.libConstMod.SHAPES.POLY & Double = js.native
    
    /* 1 */ val RECT: typings.pixiMath.libConstMod.SHAPES.RECT & Double = js.native
    
    /* 4 */ val RREC: typings.pixiMath.libConstMod.SHAPES.RREC & Double = js.native
  }
  
  @JSImport("@pixi/math", "Transform")
  @js.native
  open class Transform ()
    extends typings.pixiMath.libTransformMod.Transform
  /* static members */
  object Transform {
    
    /** A default (identity) transform. */
    @JSImport("@pixi/math", "Transform.IDENTITY")
    @js.native
    val IDENTITY: typings.pixiMath.libTransformMod.Transform = js.native
  }
  
  object groupD8 {
    
    @JSImport("@pixi/math", "groupD8")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * | Rotation | Direction |
      * |----------|-----------|
      * | 0°       | East      |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.E")
    @js.native
    def E: Double = js.native
    inline def E_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
    
    /**
      * Reflection about the main diagonal.
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.MAIN_DIAGONAL")
    @js.native
    def MAIN_DIAGONAL: Double = js.native
    inline def MAIN_DIAGONAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN_DIAGONAL")(x.asInstanceOf[js.Any])
    
    /**
      * Reflection about X-axis.
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.MIRROR_HORIZONTAL")
    @js.native
    def MIRROR_HORIZONTAL: Double = js.native
    inline def MIRROR_HORIZONTAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIRROR_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    /**
      * Reflection about Y-axis.
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.MIRROR_VERTICAL")
    @js.native
    def MIRROR_VERTICAL: Double = js.native
    inline def MIRROR_VERTICAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIRROR_VERTICAL")(x.asInstanceOf[js.Any])
    
    /**
      * | Rotation    | Direction    |
      * |-------------|--------------|
      * | -90°/270°↻  | North        |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.N")
    @js.native
    def N: Double = js.native
    
    /**
      * | Rotation    | Direction    |
      * |-------------|--------------|
      * | -45°/315°↻  | Northeast    |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.NE")
    @js.native
    def NE: Double = js.native
    inline def NE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NE")(x.asInstanceOf[js.Any])
    
    /**
      * | Rotation    | Direction    |
      * |-------------|--------------|
      * | -135°/225°↻ | Northwest    |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.NW")
    @js.native
    def NW: Double = js.native
    inline def NW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NW")(x.asInstanceOf[js.Any])
    
    inline def N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
    
    /**
      * Reflection about reverse diagonal.
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.REVERSE_DIAGONAL")
    @js.native
    def REVERSE_DIAGONAL: Double = js.native
    inline def REVERSE_DIAGONAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVERSE_DIAGONAL")(x.asInstanceOf[js.Any])
    
    /**
      * | Rotation | Direction |
      * |----------|-----------|
      * | 90°↻     | South     |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.S")
    @js.native
    def S: Double = js.native
    
    /**
      * | Rotation | Direction |
      * |----------|-----------|
      * | 45°↻     | Southeast |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.SE")
    @js.native
    def SE: Double = js.native
    inline def SE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SE")(x.asInstanceOf[js.Any])
    
    /**
      * | Rotation | Direction |
      * |----------|-----------|
      * | 135°↻    | Southwest |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.SW")
    @js.native
    def SW: Double = js.native
    inline def SW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SW")(x.asInstanceOf[js.Any])
    
    inline def S_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
    
    /**
      * | Rotation | Direction |
      * |----------|-----------|
      * | 180°     | West      |
      * @memberof PIXI.groupD8
      * @constant {PIXI.GD8Symmetry}
      */
    @JSImport("@pixi/math", "groupD8.W")
    @js.native
    def W: Double = js.native
    inline def W_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W")(x.asInstanceOf[js.Any])
    
    /**
      * Composes the two D8 operations.
      *
      * Taking `^` as reflection:
      *
      * |       | E=0 | S=2 | W=4 | N=6 | E^=8 | S^=10 | W^=12 | N^=14 |
      * |-------|-----|-----|-----|-----|------|-------|-------|-------|
      * | E=0   | E   | S   | W   | N   | E^   | S^    | W^    | N^    |
      * | S=2   | S   | W   | N   | E   | S^   | W^    | N^    | E^    |
      * | W=4   | W   | N   | E   | S   | W^   | N^    | E^    | S^    |
      * | N=6   | N   | E   | S   | W   | N^   | E^    | S^    | W^    |
      * | E^=8  | E^  | N^  | W^  | S^  | E    | N     | W     | S     |
      * | S^=10 | S^  | E^  | N^  | W^  | S    | E     | N     | W     |
      * | W^=12 | W^  | S^  | E^  | N^  | W    | S     | E     | N     |
      * | N^=14 | N^  | W^  | S^  | E^  | N    | W     | S     | E     |
      *
      * [This is a Cayley table]{@link https://en.wikipedia.org/wiki/Cayley_table}
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} rotationSecond - Second operation, which
      *   is the row in the above cayley table.
      * @param {PIXI.GD8Symmetry} rotationFirst - First operation, which
      *   is the column in the above cayley table.
      * @returns {PIXI.GD8Symmetry} Composed operation
      */
    inline def add(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(rotationSecond.asInstanceOf[js.Any], rotationFirst.asInstanceOf[js.Any])).asInstanceOf[GD8Symmetry]
    
    /**
      * Approximates the vector `V(dx,dy)` into one of the
      * eight directions provided by `groupD8`.
      * @memberof PIXI.groupD8
      * @param {number} dx - X-component of the vector
      * @param {number} dy - Y-component of the vector
      * @returns {PIXI.GD8Symmetry} Approximation of the vector into
      *  one of the eight symmetries.
      */
    inline def byDirection(dx: Double, dy: Double): GD8Symmetry = (^.asInstanceOf[js.Dynamic].applyDynamic("byDirection")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[GD8Symmetry]
    
    /**
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} rotation - symmetry whose opposite
      *   is needed. Only rotations have opposite symmetries while
      *   reflections don't.
      * @returns {PIXI.GD8Symmetry} The opposite symmetry of `rotation`
      */
    inline def inv(rotation: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("inv")(rotation.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
    
    /**
      * Checks if the rotation angle is vertical, i.e. south
      * or north. It doesn't work for reflections.
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} rotation - The number to check.
      * @returns {boolean} Whether or not the direction is vertical
      */
    inline def isVertical(rotation: GD8Symmetry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(rotation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Helps sprite to compensate texture packer rotation.
      * @memberof PIXI.groupD8
      * @param {PIXI.Matrix} matrix - sprite world matrix
      * @param {PIXI.GD8Symmetry} rotation - The rotation factor to use.
      * @param {number} tx - sprite anchoring
      * @param {number} ty - sprite anchoring
      */
    inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry, tx: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry, tx: Double, ty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def matrixAppendRotationInv(matrix: typings.pixiMath.libMatrixMod.Matrix, rotation: GD8Symmetry, tx: Unit, ty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Adds 180 degrees to rotation, which is a commutative
      * operation.
      * @memberof PIXI.groupD8
      * @param {number} rotation - The number to rotate.
      * @returns {number} Rotated number
      */
    inline def rotate180(rotation: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rotate180")(rotation.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Reverse of `add`.
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} rotationSecond - Second operation
      * @param {PIXI.GD8Symmetry} rotationFirst - First operation
      * @returns {PIXI.GD8Symmetry} Result
      */
    inline def sub(rotationSecond: GD8Symmetry, rotationFirst: GD8Symmetry): GD8Symmetry = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(rotationSecond.asInstanceOf[js.Any], rotationFirst.asInstanceOf[js.Any])).asInstanceOf[GD8Symmetry]
    
    /**
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
      * @returns {PIXI.GD8Symmetry} The X-component of the U-axis
      *    after rotating the axes.
      */
    inline def uX(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("uX")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
    
    /**
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
      * @returns {PIXI.GD8Symmetry} The Y-component of the U-axis
      *    after rotating the axes.
      */
    inline def uY(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("uY")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
    
    /**
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
      * @returns {PIXI.GD8Symmetry} The X-component of the V-axis
      *    after rotating the axes.
      */
    inline def vX(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("vX")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
    
    /**
      * @memberof PIXI.groupD8
      * @param {PIXI.GD8Symmetry} ind - sprite rotation angle.
      * @returns {PIXI.GD8Symmetry} The Y-component of the V-axis
      *    after rotating the axes.
      */
    inline def vY(ind: GD8Symmetry): GD8Symmetry = ^.asInstanceOf[js.Dynamic].applyDynamic("vY")(ind.asInstanceOf[js.Any]).asInstanceOf[GD8Symmetry]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiMath.libShapesCircleMod.Circle
    - typings.pixiMath.libShapesEllipseMod.Ellipse
    - typings.pixiMath.libShapesPolygonMod.Polygon
    - typings.pixiMath.libShapesRectangleMod.Rectangle
    - typings.pixiMath.libShapesRoundedRectangleMod.RoundedRectangle
  */
  trait IShape extends StObject
  
  trait ISize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ISize {
    
    inline def apply(height: Double, width: Double): ISize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
