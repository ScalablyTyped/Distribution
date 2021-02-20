package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Utils")
@js.native
class Utils ()
  extends typings.pixiSpine.PIXI.spine.core.Utils
object Utils {
  
  @JSGlobal("PIXI.spine.core.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.SUPPORTS_TYPED_ARRAYS")
  @js.native
  def SUPPORTS_TYPED_ARRAYS: Boolean = js.native
  @scala.inline
  def SUPPORTS_TYPED_ARRAYS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_TYPED_ARRAYS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.arrayCopy")
  @js.native
  def arrayCopy[T](
    source: ArrayLike[T],
    sourceStart: Double,
    dest: ArrayLike[T],
    destStart: Double,
    numElements: Double
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.contains")
  @js.native
  def contains[T](array: js.Array[T], element: T): Boolean = js.native
  @JSGlobal("PIXI.spine.core.Utils.contains")
  @js.native
  def contains[T](array: js.Array[T], element: T, identity: Boolean): Boolean = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.ensureArrayCapacity")
  @js.native
  def ensureArrayCapacity[T](array: js.Array[T], size: Double): js.Array[T] = js.native
  @JSGlobal("PIXI.spine.core.Utils.ensureArrayCapacity")
  @js.native
  def ensureArrayCapacity[T](array: js.Array[T], size: Double, value: js.Any): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.newArray")
  @js.native
  def newArray[T](size: Double, defaultValue: T): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.newFloatArray")
  @js.native
  def newFloatArray(size: Double): ArrayLike[Double] = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.newShortArray")
  @js.native
  def newShortArray(size: Double): ArrayLike[Double] = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.setArraySize")
  @js.native
  def setArraySize[T](array: js.Array[T], size: Double): js.Array[T] = js.native
  @JSGlobal("PIXI.spine.core.Utils.setArraySize")
  @js.native
  def setArraySize[T](array: js.Array[T], size: Double, value: js.Any): js.Array[T] = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.toFloatArray")
  @js.native
  def toFloatArray(array: js.Array[Double]): js.Array[Double] | Float32Array = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.toSinglePrecision")
  @js.native
  def toSinglePrecision(value: Double): Double = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.Utils.webkit602BugfixHelper")
  @js.native
  def webkit602BugfixHelper(alpha: Double, blend: typings.pixiSpine.PIXI.spine.core.MixBlend): Unit = js.native
}
