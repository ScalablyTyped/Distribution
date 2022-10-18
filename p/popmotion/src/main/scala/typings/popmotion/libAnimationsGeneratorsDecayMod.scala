package typings.popmotion

import typings.popmotion.libAnimationsTypesMod.Animation
import typings.popmotion.libAnimationsTypesMod.DecayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsGeneratorsDecayMod {
  
  @JSImport("popmotion/lib/animations/generators/decay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decay(hasVelocityFromPowerTimeConstantRestDeltaModifyTarget: DecayOptions): Animation[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decay")(hasVelocityFromPowerTimeConstantRestDeltaModifyTarget.asInstanceOf[js.Any]).asInstanceOf[Animation[Double]]
}
