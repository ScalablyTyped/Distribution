package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easing {
  
  @JSImport("openlayers", "easing")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Start slow and speed up.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  inline def easeIn(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeIn")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Start fast and slow down.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  inline def easeOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Start slow, speed up, and then slow down again.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  inline def inAndOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inAndOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Maintain a constant speed over time.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  inline def linear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Start slow, speed up, and at the very end slow down again.  This has the
    * same general behavior as {@link ol.easing.inAndOut}, but the final slowdown
    * is delayed.
    * @param t Input between 0 and 1.
    * @return Output between 0 and 1.
    * @api
    */
  inline def upAndDown(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("upAndDown")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
}
