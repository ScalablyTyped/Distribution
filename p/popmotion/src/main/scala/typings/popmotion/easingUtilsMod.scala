package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.easingTypesMod.EasingModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingUtilsMod {
  
  @JSImport("popmotion/lib/easing/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createAnticipate(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnticipate")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @scala.inline
  def createBackIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createBackIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @scala.inline
  def createExpoIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @JSImport("popmotion/lib/easing/utils", "mirrorEasing")
  @js.native
  val mirrorEasing: EasingModifier = js.native
  
  @JSImport("popmotion/lib/easing/utils", "reverseEasing")
  @js.native
  val reverseEasing: EasingModifier = js.native
}
