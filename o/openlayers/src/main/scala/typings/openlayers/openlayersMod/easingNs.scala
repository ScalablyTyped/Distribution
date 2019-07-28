package typings.openlayers.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "easing")
@js.native
object easingNs extends js.Object {
  /**
    * Start slow and speed up.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  def easeIn(t: Double): Double = js.native
  /**
    * Start fast and slow down.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  def easeOut(t: Double): Double = js.native
  /**
    * Start slow, speed up, and then slow down again.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  def inAndOut(t: Double): Double = js.native
  /**
    * Maintain a constant speed over time.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  def linear(t: Double): Double = js.native
  /**
    * Start slow, speed up, and at the very end slow down again.  This has the
    * same general behavior as {@link ol.easing.inAndOut}, but the final slowdown
    * is delayed.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  def upAndDown(t: Double): Double = js.native
}

