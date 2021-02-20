package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easing {
  
  /**
    * Start slow and speed up.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  @JSImport("openlayers", "easing.easeIn")
  @js.native
  def easeIn(t: Double): Double = js.native
  
  /**
    * Start fast and slow down.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  @JSImport("openlayers", "easing.easeOut")
  @js.native
  def easeOut(t: Double): Double = js.native
  
  /**
    * Start slow, speed up, and then slow down again.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  @JSImport("openlayers", "easing.inAndOut")
  @js.native
  def inAndOut(t: Double): Double = js.native
  
  /**
    * Maintain a constant speed over time.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  @JSImport("openlayers", "easing.linear")
  @js.native
  def linear(t: Double): Double = js.native
  
  /**
    * Start slow, speed up, and at the very end slow down again.  This has the
    * same general behavior as {@link ol.easing.inAndOut}, but the final slowdown
    * is delayed.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  @JSImport("openlayers", "easing.upAndDown")
  @js.native
  def upAndDown(t: Double): Double = js.native
}
