package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.WindowedMean")
@js.native
class WindowedMean ()
  extends typings.pixiSpine.PIXI.spine.core.WindowedMean {
  def this(windowSize: Double) = this()
  /* CompleteClass */
  override var addedValues: Double = js.native
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /* CompleteClass */
  override var lastValue: Double = js.native
  /* CompleteClass */
  override var mean: Double = js.native
  /* CompleteClass */
  override var values: js.Array[Double] = js.native
  /* CompleteClass */
  override def addValue(value: Double): Unit = js.native
  /* CompleteClass */
  override def getMean(): Double = js.native
  /* CompleteClass */
  override def hasEnoughData(): Boolean = js.native
}

