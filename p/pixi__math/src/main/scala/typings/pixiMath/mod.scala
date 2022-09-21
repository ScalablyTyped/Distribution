package typings.pixiMath

import typings.pixiMath.mod.SHAPES.CIRC
import typings.pixiMath.mod.SHAPES.ELIP
import typings.pixiMath.mod.SHAPES.POLY
import typings.pixiMath.mod.SHAPES.RECT
import typings.pixiMath.mod.SHAPES.RREC
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
    extends StObject
       with IShape {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
    def this(x: Double, y: Unit, radius: Double) = this()
    def this(x: Unit, y: Double, radius: Double) = this()
    def this(x: Unit, y: Unit, radius: Double) = this()
    
    /**
      * Checks whether the x and y coordinates given are contained within this circle
      * @param x - The X coordinate of the point to test
      * @param y - The Y coordinate of the point to test
      * @returns Whether the x/y coordinates are within this Circle
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns the framing rectangle of the circle as a Rectangle object
      * @returns The framing rectangle
      */
    def getBounds(): Rectangle = js.native
    
    /** @default 0 */
    var radius: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.CIRC
      * @see PIXI.SHAPES
      */
    val `type`: CIRC = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
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
    extends StObject
       with IShape {
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
    
    /**
      * Checks whether the x and y coordinates given are contained within this ellipse
      * @param x - The X coordinate of the point to test
      * @param y - The Y coordinate of the point to test
      * @returns Whether the x/y coords are within this ellipse
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Returns the framing rectangle of the ellipse as a Rectangle object
      * @returns The framing rectangle
      */
    def getBounds(): Rectangle = js.native
    
    /** @default 0 */
    var height: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.ELIP
      * @see PIXI.SHAPES
      */
    val `type`: ELIP = js.native
    
    /** @default 0 */
    var width: Double = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
  }
  
  @JSImport("@pixi/math", "Matrix")
  @js.native
  open class Matrix protected () extends StObject {
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
    
    /** @default 1 */
    var a: Double = js.native
    
    /**
      * Appends the given Matrix to this Matrix.
      * @param matrix - The matrix to append.
      * @returns This matrix. Good for chaining method calls.
      */
    def append(matrix: Matrix): this.type = js.native
    
    /**
      * Get a new position with the current transformation applied.
      * Can be used to go from a child's coordinate space to the world coordinate space. (e.g. rendering)
      * @param pos - The origin
      * @param {PIXI.Point} [newPos] - The point that the new position is assigned to (allowed to be same as input)
      * @returns {PIXI.Point} The new point, transformed through this matrix
      */
    @JSName("apply")
    def apply[P /* <: IPointData */](pos: IPointData): P = js.native
    @JSName("apply")
    def apply[P /* <: IPointData */](pos: IPointData, newPos: P): P = js.native
    
    /**
      * Get a new position with the inverse of the current transformation applied.
      * Can be used to go from the world coordinate space to a child's coordinate space. (e.g. input)
      * @param pos - The origin
      * @param {PIXI.Point} [newPos] - The point that the new position is assigned to (allowed to be same as input)
      * @returns {PIXI.Point} The new point, inverse-transformed through this matrix
      */
    def applyInverse[P /* <: IPointData */](pos: IPointData): P = js.native
    def applyInverse[P /* <: IPointData */](pos: IPointData, newPos: P): P = js.native
    
    var array: js.typedarray.Float32Array | Null = js.native
    
    /** @default 0 */
    var b: Double = js.native
    
    /** @default 0 */
    var c: Double = js.native
    
    /**
      * Changes the values of the matrix to be the same as the ones in given matrix
      * @param {PIXI.Matrix} matrix - The matrix to copy from.
      * @returns {PIXI.Matrix} this
      */
    def copyFrom(matrix: Matrix): this.type = js.native
    
    /**
      * Changes the values of the given matrix to be the same as the ones in this matrix
      * @param matrix - The matrix to copy to.
      * @returns The matrix given in parameter with its values updated.
      */
    def copyTo(matrix: Matrix): Matrix = js.native
    
    /** @default 1 */
    var d: Double = js.native
    
    /**
      * Decomposes the matrix (x, y, scaleX, scaleY, and rotation) and sets the properties on to a transform.
      * @param transform - The transform to apply the properties to.
      * @returns The transform with the newly applied properties
      */
    def decompose(transform: Transform): Transform = js.native
    
    /**
      * Creates a Matrix object based on the given array. The Element to Matrix mapping order is as follows:
      *
      * a = array[0]
      * b = array[1]
      * c = array[3]
      * d = array[4]
      * tx = array[2]
      * ty = array[5]
      * @param array - The array that the matrix will be populated from.
      */
    def fromArray(array: js.Array[Double]): Unit = js.native
    
    /**
      * Resets this Matrix to an identity (default) matrix.
      * @returns This matrix. Good for chaining method calls.
      */
    def identity(): this.type = js.native
    
    /**
      * Inverts this matrix
      * @returns This matrix. Good for chaining method calls.
      */
    def invert(): this.type = js.native
    
    /**
      * Prepends the given Matrix to this Matrix.
      * @param matrix - The matrix to prepend
      * @returns This matrix. Good for chaining method calls.
      */
    def prepend(matrix: Matrix): this.type = js.native
    
    /**
      * Applies a rotation transformation to the matrix.
      * @param angle - The angle in radians.
      * @returns This matrix. Good for chaining method calls.
      */
    def rotate(angle: Double): this.type = js.native
    
    /**
      * Applies a scale transformation to the matrix.
      * @param x - The amount to scale horizontally
      * @param y - The amount to scale vertically
      * @returns This matrix. Good for chaining method calls.
      */
    def scale(x: Double, y: Double): this.type = js.native
    
    /**
      * Sets the matrix properties.
      * @param a - Matrix component
      * @param b - Matrix component
      * @param c - Matrix component
      * @param d - Matrix component
      * @param tx - Matrix component
      * @param ty - Matrix component
      * @returns This matrix. Good for chaining method calls.
      */
    def set(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
    
    /**
      * Sets the matrix based on all the available properties
      * @param x - Position on the x axis
      * @param y - Position on the y axis
      * @param pivotX - Pivot on the x axis
      * @param pivotY - Pivot on the y axis
      * @param scaleX - Scale on the x axis
      * @param scaleY - Scale on the y axis
      * @param rotation - Rotation in radians
      * @param skewX - Skew on the x axis
      * @param skewY - Skew on the y axis
      * @returns This matrix. Good for chaining method calls.
      */
    def setTransform(
      x: Double,
      y: Double,
      pivotX: Double,
      pivotY: Double,
      scaleX: Double,
      scaleY: Double,
      rotation: Double,
      skewX: Double,
      skewY: Double
    ): this.type = js.native
    
    /**
      * Creates an array from the current Matrix object.
      * @param transpose - Whether we need to transpose the matrix or not
      * @param [out=new Float32Array(9)] - If provided the array will be assigned to out
      * @returns The newly created array which contains the matrix
      */
    def toArray(transpose: Boolean): js.typedarray.Float32Array = js.native
    def toArray(transpose: Boolean, out: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
    
    /**
      * Translates the matrix on the x and y.
      * @param x - How much to translate x by
      * @param y - How much to translate y by
      * @returns This matrix. Good for chaining method calls.
      */
    def translate(x: Double, y: Double): this.type = js.native
    
    /** @default 0 */
    var tx: Double = js.native
    
    /** @default 0 */
    var ty: Double = js.native
  }
  
  @JSImport("@pixi/math", "ObservablePoint")
  @js.native
  open class ObservablePoint[T] protected ()
    extends StObject
       with IPoint
       with typings.pixiMath.GlobalMixins.Point {
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
    
    var _x: Double = js.native
    
    var _y: Double = js.native
    
    /** The callback function triggered when `x` and/or `y` are changed */
    def cb(): Any = js.native
    
    def clone(cb: js.ThisFunction0[/* this */ T, Any]): ObservablePoint[Any] = js.native
    def clone(cb: js.ThisFunction0[/* this */ T, Any], scope: Any): ObservablePoint[Any] = js.native
    def clone(cb: Unit, scope: Any): ObservablePoint[Any] = js.native
    
    /** The owner of the callback */
    var scope: Any = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    /** Position of the observable point on the x axis. */
    @JSName("x")
    def x_MObservablePoint: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    /** Position of the observable point on the y axis. */
    @JSName("y")
    def y_MObservablePoint: Double = js.native
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
    extends StObject
       with IPoint
       with typings.pixiMath.GlobalMixins.Point {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSImport("@pixi/math", "Polygon")
  @js.native
  open class Polygon protected ()
    extends StObject
       with IShape {
    def this(points: js.Array[Double | IPointData]) = this()
    
    /** `false` after moveTo, `true` after `closePath`. In all other cases it is `true`. */
    var closeStroke: Boolean = js.native
    
    /**
      * Checks whether the x and y coordinates passed to this function are contained within this polygon.
      * @param x - The X coordinate of the point to test.
      * @param y - The Y coordinate of the point to test.
      * @returns - Whether the x/y coordinates are within this polygon.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /** An array of the points of this polygon. */
    var points: js.Array[Double] = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.POLY
      * @see PIXI.SHAPES
      */
    val `type`: POLY = js.native
  }
  
  @JSImport("@pixi/math", "RAD_TO_DEG")
  @js.native
  val RAD_TO_DEG: Double = js.native
  
  @JSImport("@pixi/math", "Rectangle")
  @js.native
  open class Rectangle protected ()
    extends StObject
       with typings.pixiMath.GlobalMixins.Rectangle
       with IShape {
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
    
    /** Returns the bottom edge of the rectangle. */
    def bottom: Double = js.native
    
    /**
      * Enlarges rectangle that way its corners lie on grid
      * @param resolution - resolution
      * @param eps - precision
      * @returns Returns itself.
      */
    def ceil(): this.type = js.native
    def ceil(resolution: Double): this.type = js.native
    def ceil(resolution: Double, eps: Double): this.type = js.native
    def ceil(resolution: Unit, eps: Double): this.type = js.native
    
    /**
      * Checks whether the x and y coordinates given are contained within this Rectangle
      * @param x - The X coordinate of the point to test
      * @param y - The Y coordinate of the point to test
      * @returns Whether the x/y coordinates are within this Rectangle
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /**
      * Copies another rectangle to this one.
      * @param rectangle - The rectangle to copy from.
      * @returns Returns itself.
      */
    def copyFrom(rectangle: Rectangle): Rectangle = js.native
    
    /**
      * Copies this rectangle to another one.
      * @param rectangle - The rectangle to copy to.
      * @returns Returns given parameter.
      */
    def copyTo(rectangle: Rectangle): Rectangle = js.native
    
    /**
      * Enlarges this rectangle to include the passed rectangle.
      * @param rectangle - The rectangle to include.
      * @returns Returns itself.
      */
    def enlarge(rectangle: Rectangle): this.type = js.native
    
    /**
      * Fits this rectangle around the passed one.
      * @param rectangle - The rectangle to fit.
      * @returns Returns itself.
      */
    def fit(rectangle: Rectangle): this.type = js.native
    
    /** @default 0 */
    var height: Double = js.native
    
    /**
      * Determines whether the `other` Rectangle transformed by `transform` intersects with `this` Rectangle object.
      * Returns true only if the area of the intersection is >0, this means that Rectangles
      * sharing a side are not overlapping. Another side effect is that an arealess rectangle
      * (width or height equal to zero) can't intersect any other rectangle.
      * @param {Rectangle} other - The Rectangle to intersect with `this`.
      * @param {Matrix} transform - The transformation matrix of `other`.
      * @returns {boolean} A value of `true` if the transformed `other` Rectangle intersects with `this`; otherwise `false`.
      */
    def intersects(other: Rectangle): Boolean = js.native
    def intersects(other: Rectangle, transform: Matrix): Boolean = js.native
    
    /** Returns the left edge of the rectangle. */
    def left: Double = js.native
    
    /**
      * Pads the rectangle making it grow in all directions.
      * If paddingY is omitted, both paddingX and paddingY will be set to paddingX.
      * @param paddingX - The horizontal padding amount.
      * @param paddingY - The vertical padding amount.
      * @returns Returns itself.
      */
    def pad(): this.type = js.native
    def pad(paddingX: Double): this.type = js.native
    def pad(paddingX: Double, paddingY: Double): this.type = js.native
    def pad(paddingX: Unit, paddingY: Double): this.type = js.native
    
    /** Returns the right edge of the rectangle. */
    def right: Double = js.native
    
    /** Returns the top edge of the rectangle. */
    def top: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.RECT
      * @see PIXI.SHAPES
      */
    val `type`: RECT = js.native
    
    /** @default 0 */
    var width: Double = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
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
    extends StObject
       with IShape {
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
    
    /**
      * Checks whether the x and y coordinates given are contained within this Rounded Rectangle
      * @param x - The X coordinate of the point to test.
      * @param y - The Y coordinate of the point to test.
      * @returns - Whether the x/y coordinates are within this Rounded Rectangle.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    
    /** @default 0 */
    var height: Double = js.native
    
    /** @default 20 */
    var radius: Double = js.native
    
    /**
      * The type of the object, mainly used to avoid `instanceof` checks
      * @default PIXI.SHAPES.RREC
      * @see PIXI.SHAPES
      */
    val `type`: RREC = js.native
    
    /** @default 0 */
    var width: Double = js.native
    
    /** @default 0 */
    var x: Double = js.native
    
    /** @default 0 */
    var y: Double = js.native
  }
  
  @js.native
  sealed trait SHAPES extends StObject
  @JSImport("@pixi/math", "SHAPES")
  @js.native
  object SHAPES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SHAPES & Double] = js.native
    
    @js.native
    sealed trait CIRC
      extends StObject
         with SHAPES
    /* 2 */ val CIRC: typings.pixiMath.mod.SHAPES.CIRC & Double = js.native
    
    @js.native
    sealed trait ELIP
      extends StObject
         with SHAPES
    /* 3 */ val ELIP: typings.pixiMath.mod.SHAPES.ELIP & Double = js.native
    
    @js.native
    sealed trait POLY
      extends StObject
         with SHAPES
    /* 0 */ val POLY: typings.pixiMath.mod.SHAPES.POLY & Double = js.native
    
    @js.native
    sealed trait RECT
      extends StObject
         with SHAPES
    /* 1 */ val RECT: typings.pixiMath.mod.SHAPES.RECT & Double = js.native
    
    @js.native
    sealed trait RREC
      extends StObject
         with SHAPES
    /* 4 */ val RREC: typings.pixiMath.mod.SHAPES.RREC & Double = js.native
  }
  
  @JSImport("@pixi/math", "Transform")
  @js.native
  open class Transform ()
    extends StObject
       with typings.pixiMath.GlobalMixins.Transform {
    
    /** The locally unique ID of the local transform used to calculate the current local transformation matrix. */
    /* protected */ var _currentLocalID: Double = js.native
    
    /**
      * The X-coordinate value of the normalized local X axis,
      * the first column of the local transformation matrix without a scale.
      */
    /* protected */ var _cx: Double = js.native
    
    /**
      * The X-coordinate value of the normalized local Y axis,
      * the second column of the local transformation matrix without a scale.
      */
    /* protected */ var _cy: Double = js.native
    
    /** The locally unique ID of the local transform. */
    /* protected */ var _localID: Double = js.native
    
    /** The locally unique ID of the parent's world transform used to calculate the current world transformation matrix. */
    var _parentID: Double = js.native
    
    /** The rotation amount. */
    /* protected */ var _rotation: Double = js.native
    
    /**
      * The Y-coordinate value of the normalized local X axis,
      * the first column of the local transformation matrix without a scale.
      */
    /* protected */ var _sx: Double = js.native
    
    /**
      * The Y-coordinate value of the normalized local Y axis,
      * the second column of the local transformation matrix without a scale.
      */
    /* protected */ var _sy: Double = js.native
    
    /** The locally unique ID of the world transform. */
    var _worldID: Double = js.native
    
    /** The local transformation matrix. */
    var localTransform: Matrix = js.native
    
    /** Called when a value changes. */
    /* protected */ def onChange(): Unit = js.native
    
    /** The pivot point of the displayObject that it rotates around. */
    var pivot: ObservablePoint[Any] = js.native
    
    /** The coordinate of the object relative to the local coordinates of the parent. */
    var position: ObservablePoint[Any] = js.native
    
    /** The rotation of the object in radians. */
    def rotation: Double = js.native
    def rotation_=(value: Double): Unit = js.native
    
    /** The scale factor of the object. */
    var scale: ObservablePoint[Any] = js.native
    
    /**
      * Decomposes a matrix and sets the transforms properties based on it.
      * @param matrix - The matrix to decompose
      */
    def setFromMatrix(matrix: Matrix): Unit = js.native
    
    /** The skew amount, on the x and y axis. */
    var skew: ObservablePoint[Any] = js.native
    
    /** Updates the local transformation matrix. */
    def updateLocalTransform(): Unit = js.native
    
    /** Called when the skew or the rotation changes. */
    /* protected */ def updateSkew(): Unit = js.native
    
    /**
      * Updates the local and the world transformation matrices.
      * @param parentTransform - The parent transform
      */
    def updateTransform(parentTransform: Transform): Unit = js.native
    
    /** The world transformation matrix. */
    var worldTransform: Matrix = js.native
  }
  /* static members */
  object Transform {
    
    /** A default (identity) transform. */
    @JSImport("@pixi/math", "Transform.IDENTITY")
    @js.native
    val IDENTITY: Transform = js.native
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
    inline def matrixAppendRotationInv(matrix: Matrix, rotation: GD8Symmetry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def matrixAppendRotationInv(matrix: Matrix, rotation: GD8Symmetry, tx: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def matrixAppendRotationInv(matrix: Matrix, rotation: GD8Symmetry, tx: Double, ty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def matrixAppendRotationInv(matrix: Matrix, rotation: GD8Symmetry, tx: Unit, ty: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixAppendRotationInv")(matrix.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
  
  type GD8Symmetry = Double
  
  @js.native
  trait IPoint
    extends StObject
       with IPointData {
    
    def copyFrom(p: IPointData): this.type = js.native
    
    def copyTo[T /* <: IPoint */](p: T): T = js.native
    
    def equals(p: IPointData): Boolean = js.native
    
    def set(): Unit = js.native
    def set(x: Double): Unit = js.native
    def set(x: Double, y: Double): Unit = js.native
    def set(x: Unit, y: Double): Unit = js.native
  }
  
  trait IPointData
    extends StObject
       with typings.pixiMath.GlobalMixins.IPointData {
    
    var x: Double
    
    var y: Double
  }
  object IPointData {
    
    inline def apply(x: Double, y: Double): IPointData = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPointData]
    }
    
    extension [Self <: IPointData](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pixiMath.mod.Circle
    - typings.pixiMath.mod.Ellipse
    - typings.pixiMath.mod.Polygon
    - typings.pixiMath.mod.Rectangle
    - typings.pixiMath.mod.RoundedRectangle
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
    
    extension [Self <: ISize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
