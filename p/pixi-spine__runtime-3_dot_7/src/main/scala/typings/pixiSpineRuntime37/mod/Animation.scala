package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@JSImport("@pixi-spine/runtime-3.7", "Animation")
@js.native
open class Animation protected ()
  extends StObject
     with Animation2 {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  /* CompleteClass */
  var duration: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var timelines: js.Array[Timeline] = js.native
}
object Animation {
  
  @JSImport("@pixi-spine/runtime-3.7", "Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def binarySearch(values: ArrayLike2[Double], target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearch(values: ArrayLike2[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def linearSearch(values: ArrayLike2[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearSearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
}
