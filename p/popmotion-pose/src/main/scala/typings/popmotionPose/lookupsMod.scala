package typings.popmotionPose

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.mod.Action_
import typings.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/inc/lookups", JSImport.Namespace)
@js.native
object lookupsMod extends js.Object {
  @js.native
  object animationLookup
    extends /* key */ StringDictionary[js.Function1[/* props */ StringDictionary[js.Any], Action_]]
  
  @js.native
  object easingLookup extends js.Object {
    @JSName("anticipate")
    var anticipate_Original: Easing = js.native
    @JSName("backInOut")
    var backInOut_Original: Easing = js.native
    @JSName("backIn")
    var backIn_Original: Easing = js.native
    @JSName("backOut")
    var backOut_Original: Easing = js.native
    @JSName("circInOut")
    var circInOut_Original: Easing = js.native
    @JSName("circIn")
    var circIn_Original: Easing = js.native
    @JSName("circOut")
    var circOut_Original: Easing = js.native
    @JSName("easeInOut")
    var easeInOut_Original: Easing = js.native
    @JSName("easeIn")
    var easeIn_Original: Easing = js.native
    @JSName("easeOut")
    var easeOut_Original: Easing = js.native
    @JSName("linear")
    var linear_Original: Easing = js.native
    def anticipate(v: Double): Double = js.native
    def backIn(v: Double): Double = js.native
    def backInOut(v: Double): Double = js.native
    def backOut(v: Double): Double = js.native
    def circIn(v: Double): Double = js.native
    def circInOut(v: Double): Double = js.native
    def circOut(v: Double): Double = js.native
    def easeIn(v: Double): Double = js.native
    def easeInOut(v: Double): Double = js.native
    def easeOut(v: Double): Double = js.native
    def linear(v: Double): Double = js.native
  }
  
}

