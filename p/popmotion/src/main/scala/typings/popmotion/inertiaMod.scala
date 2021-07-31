package typings.popmotion

import typings.popmotion.anon.Stop
import typings.popmotion.typesMod.InertiaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inertiaMod {
  
  @JSImport("popmotion/lib/animations/inertia", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def inertia(
    hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnComplete: InertiaOptions
  ): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnComplete.asInstanceOf[js.Any]).asInstanceOf[Stop]
}
