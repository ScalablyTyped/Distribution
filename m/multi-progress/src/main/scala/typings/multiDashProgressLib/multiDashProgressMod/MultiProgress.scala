package typings
package multiDashProgressLib.multiDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiProgress extends js.Object {
  /**
    * Render the given progress bar
    */
  def move(index: scala.Double): scala.Unit = js.native
  /**
    * Add a new bar
    */
  def newBar(format: java.lang.String, options: progressLib.progressMod.ProgressBarOptions): progressLib.progressMod.^ = js.native
  /**
    * Close all bars
    */
  def terminate(): scala.Unit = js.native
  /**
    * Move the bar indicated by index forward the number of steps indicated by value
    */
  def tick(index: scala.Double, value: scala.Double): scala.Unit = js.native
  def tick(index: scala.Double, value: scala.Double, options: js.Any): scala.Unit = js.native
  /**
    * Update the bar indicated by index to the value given
    */
  def update(index: scala.Double, value: scala.Double): scala.Unit = js.native
  def update(index: scala.Double, value: scala.Double, options: js.Any): scala.Unit = js.native
}

