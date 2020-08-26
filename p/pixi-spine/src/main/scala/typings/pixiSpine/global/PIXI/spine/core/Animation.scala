package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import typings.pixiSpine.PIXI.spine.core.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Animation")
@js.native
class Animation protected ()
  extends typings.pixiSpine.PIXI.spine.core.Animation {
  def this(name: String, timelines: js.Array[Timeline], duration: Double) = this()
}

/* static members */
@JSGlobal("PIXI.spine.core.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}

