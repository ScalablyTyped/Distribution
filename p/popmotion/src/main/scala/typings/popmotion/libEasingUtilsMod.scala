package typings.popmotion

import typings.popmotion.libEasingTypesMod.Easing
import typings.popmotion.libEasingTypesMod.EasingModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEasingUtilsMod {
  
  @JSImport("popmotion/lib/easing/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnticipate(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnticipate")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def createBackIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createBackIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def createExpoIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @JSImport("popmotion/lib/easing/utils", "mirrorEasing")
  @js.native
  val mirrorEasing: EasingModifier = js.native
  
  @JSImport("popmotion/lib/easing/utils", "reverseEasing")
  @js.native
  val reverseEasing: EasingModifier = js.native
}
