package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Animation")
@js.native
class Animation protected ()
  extends typings.phaser.spine.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
}

/* static members */
@JSGlobal("spine.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

