package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Animation")
@js.native
class Animation protected ()
  extends StObject
     with typings.phaser.spine.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[typings.phaser.spine.Event],
    alpha: Double,
    blend: typings.phaser.spine.MixBlend,
    direction: typings.phaser.spine.MixDirection
  ): Unit = js.native
  
  /* CompleteClass */
  var duration: Double = js.native
  
  /* CompleteClass */
  override def hasTimeline(id: Double): Boolean = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var timelineIds: js.Array[Boolean] = js.native
  
  /* CompleteClass */
  var timelines: js.Array[Timeline] = js.native
}
object Animation {
  
  @JSGlobal("spine.Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def binarySearch(values: ArrayLike[Double], target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linearSearch")(values.asInstanceOf[js.Any], target.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
}
