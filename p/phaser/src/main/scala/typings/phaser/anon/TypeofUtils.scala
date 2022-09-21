package typings.phaser.anon

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.MixBlend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUtils extends StObject {
  
  /* static member */
  var SUPPORTS_TYPED_ARRAYS: Boolean = js.native
  
  /* static member */
  def arrayCopy[T](
    source: ArrayLike[T],
    sourceStart: Double,
    dest: ArrayLike[T],
    destStart: Double,
    numElements: Double
  ): Unit = js.native
  
  /* static member */
  def contains[T](array: js.Array[T], element: T): Boolean = js.native
  def contains[T](array: js.Array[T], element: T, identity: Boolean): Boolean = js.native
  
  /* static member */
  def ensureArrayCapacity[T](array: js.Array[T], size: Double): js.Array[T] = js.native
  def ensureArrayCapacity[T](array: js.Array[T], size: Double, value: Any): js.Array[T] = js.native
  
  /* static member */
  def newArray[T](size: Double, defaultValue: T): js.Array[T] = js.native
  
  /* static member */
  def newFloatArray(size: Double): ArrayLike[Double] = js.native
  
  /* static member */
  def newShortArray(size: Double): ArrayLike[Double] = js.native
  
  /* static member */
  def setArraySize[T](array: js.Array[T], size: Double): js.Array[T] = js.native
  def setArraySize[T](array: js.Array[T], size: Double, value: Any): js.Array[T] = js.native
  
  /* static member */
  def toFloatArray(array: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = js.native
  
  /* static member */
  def toSinglePrecision(value: Double): Double = js.native
  
  /* static member */
  def webkit602BugfixHelper(alpha: Double, blend: MixBlend): Unit = js.native
}
