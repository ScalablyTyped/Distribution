package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.easingTypesMod.EasingModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/easing/utils", JSImport.Namespace)
@js.native
object easingUtilsMod extends js.Object {
  
  def createAnticipate(power: Double): Easing = js.native
  
  def createBackIn(power: Double): Easing = js.native
  
  def createExpoIn(power: Double): Easing = js.native
  
  val mirrorEasing: EasingModifier = js.native
  
  val reverseEasing: EasingModifier = js.native
}
