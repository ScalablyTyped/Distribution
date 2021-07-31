package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingMod {
  
  @JSImport("ol/easing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def easeIn(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeIn")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def easeOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def inAndOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inAndOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def linear(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def upAndDown(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("upAndDown")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
}
