package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingMod {
  
  @JSImport("popmotion/lib/easing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("popmotion/lib/easing", "anticipate")
  @js.native
  val anticipate: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "backIn")
  @js.native
  val backIn: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "backInOut")
  @js.native
  val backInOut: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "backOut")
  @js.native
  val backOut: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "bounceIn")
  @js.native
  val bounceIn: Easing = js.native
  
  inline def bounceInOut(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceInOut")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bounceOut(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceOut")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("popmotion/lib/easing", "circIn")
  @js.native
  val circIn: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "circInOut")
  @js.native
  val circInOut: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "circOut")
  @js.native
  val circOut: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "easeIn")
  @js.native
  val easeIn: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "easeInOut")
  @js.native
  val easeInOut: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "easeOut")
  @js.native
  val easeOut: Easing = js.native
  
  @JSImport("popmotion/lib/easing", "linear")
  @js.native
  val linear: Easing = js.native
}
