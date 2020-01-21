package typings.multiProgress.mod

import typings.progress.mod.ProgressBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiProgress extends js.Object {
  /**
    * Render the given progress bar
    */
  def move(index: Double): Unit = js.native
  /**
    * Add a new bar
    */
  def newBar(format: String, options: ProgressBarOptions): typings.progress.mod.^ = js.native
  /**
    * Close all bars
    */
  def terminate(): Unit = js.native
  /**
    * Move the bar indicated by index forward the number of steps indicated by value
    */
  def tick(index: Double, value: Double): Unit = js.native
  def tick(index: Double, value: Double, options: js.Any): Unit = js.native
  /**
    * Update the bar indicated by index to the value given
    */
  def update(index: Double, value: Double): Unit = js.native
  def update(index: Double, value: Double, options: js.Any): Unit = js.native
}

