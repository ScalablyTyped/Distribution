package typings.popmotionEasing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("@popmotion/easing", "bounceIn")
  @js.native
  def bounceIn(p: Double): Double = js.native
  
  @JSImport("@popmotion/easing", "bounceInOut")
  @js.native
  def bounceInOut(p: Double): Double = js.native
  
  @JSImport("@popmotion/easing", "bounceOut")
  @js.native
  def bounceOut(p: Double): Double = js.native
  
  @JSImport("@popmotion/easing", "circIn")
  @js.native
  val circIn: Easing = js.native
  
  @JSImport("@popmotion/easing", "circInOut")
  @js.native
  val circInOut: Easing = js.native
  
  @JSImport("@popmotion/easing", "circOut")
  @js.native
  val circOut: Easing = js.native
  
  @JSImport("@popmotion/easing", "createAnticipateEasing")
  @js.native
  def createAnticipateEasing(power: Double): Easing = js.native
  
  @JSImport("@popmotion/easing", "createBackIn")
  @js.native
  def createBackIn(power: Double): Easing = js.native
  
  @JSImport("@popmotion/easing", "createExpoIn")
  @js.native
  def createExpoIn(power: Double): Easing = js.native
  
  @JSImport("@popmotion/easing", "createMirroredEasing")
  @js.native
  val createMirroredEasing: EasingModifier = js.native
  
  @JSImport("@popmotion/easing", "createReversedEasing")
  @js.native
  val createReversedEasing: EasingModifier = js.native
  
  @JSImport("@popmotion/easing", "cubicBezier")
  @js.native
  def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = js.native
  
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
