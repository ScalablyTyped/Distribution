package typings.pixiMath

import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.libTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatrixMod {
  
  @JSImport("@pixi/math/lib/Matrix", "Matrix")
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
}
