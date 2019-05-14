package typings
package popmotionDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/inc/lookups", JSImport.Namespace)
@js.native
object libIncLookupsMod extends js.Object {
  @js.native
  object animationLookup
    extends /* key */ org.scalablytyped.runtime.StringDictionary[
          js.Function1[
            /* props */ org.scalablytyped.runtime.StringDictionary[js.Any], 
            popmotionLib.popmotionMod.Action
          ]
        ]
  
  @js.native
  object easingLookup extends js.Object {
    @JSName("anticipate")
    var anticipate_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("backInOut")
    var backInOut_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("backIn")
    var backIn_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("backOut")
    var backOut_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("circInOut")
    var circInOut_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("circIn")
    var circIn_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("circOut")
    var circOut_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("easeInOut")
    var easeInOut_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("easeIn")
    var easeIn_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("easeOut")
    var easeOut_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    @JSName("linear")
    var linear_Original: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
    def anticipate(v: scala.Double): scala.Double = js.native
    def backIn(v: scala.Double): scala.Double = js.native
    def backInOut(v: scala.Double): scala.Double = js.native
    def backOut(v: scala.Double): scala.Double = js.native
    def circIn(v: scala.Double): scala.Double = js.native
    def circInOut(v: scala.Double): scala.Double = js.native
    def circOut(v: scala.Double): scala.Double = js.native
    def easeIn(v: scala.Double): scala.Double = js.native
    def easeInOut(v: scala.Double): scala.Double = js.native
    def easeOut(v: scala.Double): scala.Double = js.native
    def linear(v: scala.Double): scala.Double = js.native
  }
  
}

