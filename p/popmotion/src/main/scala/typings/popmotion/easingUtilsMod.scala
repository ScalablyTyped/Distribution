package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.easingTypesMod.EasingModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingUtilsMod {
  
  @JSImport("popmotion/lib/easing/utils", "createAnticipate")
  @js.native
  def createAnticipate(power: Double): Easing = js.native
  
  @JSImport("popmotion/lib/easing/utils", "createBackIn")
  @js.native
  def createBackIn(power: Double): Easing = js.native
  
  @JSImport("popmotion/lib/easing/utils", "createExpoIn")
  @js.native
  def createExpoIn(power: Double): Easing = js.native
  
  @JSImport("popmotion/lib/easing/utils", "mirrorEasing")
  @js.native
  val mirrorEasing: EasingModifier = js.native
  
  @JSImport("popmotion/lib/easing/utils", "reverseEasing")
  @js.native
  val reverseEasing: EasingModifier = js.native
}
