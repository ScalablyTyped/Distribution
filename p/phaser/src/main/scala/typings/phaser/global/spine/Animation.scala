package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Animation")
@js.native
class Animation protected ()
  extends typings.phaser.spine.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
}
object Animation {
  
  /* static member */
  @JSGlobal("spine.Animation.binarySearch")
  @js.native
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  @JSGlobal("spine.Animation.binarySearch")
  @js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  
  /* static member */
  @JSGlobal("spine.Animation.linearSearch")
  @js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}
