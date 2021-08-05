package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingMod {
  
  @JSImport("ol/easing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def easeIn(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeIn")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def easeOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def inAndOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inAndOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def linear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def upAndDown(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("upAndDown")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
}
