package typings.popmotionEasing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@popmotion/easing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@popmotion/easing", "anticipate")
  @js.native
  val anticipate: Easing = js.native
  
  @JSImport("@popmotion/easing", "backIn")
  @js.native
  val backIn: Easing = js.native
  
  @JSImport("@popmotion/easing", "backInOut")
  @js.native
  val backInOut: Easing = js.native
  
  @JSImport("@popmotion/easing", "backOut")
  @js.native
  val backOut: Easing = js.native
  
  inline def bounceIn(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceIn")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bounceInOut(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceInOut")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bounceOut(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceOut")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@popmotion/easing", "circIn")
  @js.native
  val circIn: Easing = js.native
  
  @JSImport("@popmotion/easing", "circInOut")
  @js.native
  val circInOut: Easing = js.native
  
  @JSImport("@popmotion/easing", "circOut")
  @js.native
  val circOut: Easing = js.native
  
  inline def createAnticipateEasing(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnticipateEasing")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def createBackIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createBackIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def createExpoIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @JSImport("@popmotion/easing", "createMirroredEasing")
  @js.native
  val createMirroredEasing: EasingModifier = js.native
  
  @JSImport("@popmotion/easing", "createReversedEasing")
  @js.native
  val createReversedEasing: EasingModifier = js.native
  
  inline def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicBezier")(mX1.asInstanceOf[js.Any], mY1.asInstanceOf[js.Any], mX2.asInstanceOf[js.Any], mY2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* aX */ Double, Double]]
  
  @JSImport("@popmotion/easing", "easeIn")
  @js.native
  val easeIn: Easing = js.native
  
  @JSImport("@popmotion/easing", "easeInOut")
  @js.native
  val easeInOut: Easing = js.native
  
  @JSImport("@popmotion/easing", "easeOut")
  @js.native
  val easeOut: Easing = js.native
  
  @JSImport("@popmotion/easing", "linear")
  @js.native
  val linear: Easing = js.native
  
  @JSImport("@popmotion/easing", "mirrored")
  @js.native
  val mirrored: EasingModifier = js.native
  
  @JSImport("@popmotion/easing", "reversed")
  @js.native
  val reversed: EasingModifier = js.native
  
  type Easing = js.Function1[/* v */ Double, Double]
  
  type EasingModifier = js.Function1[/* easing */ Easing, Easing]
}
