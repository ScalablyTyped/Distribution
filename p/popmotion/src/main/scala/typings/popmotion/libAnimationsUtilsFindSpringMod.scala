package typings.popmotion

import typings.popmotion.anon.Damping
import typings.popmotion.libAnimationsTypesMod.SpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsUtilsFindSpringMod {
  
  @JSImport("popmotion/lib/animations/utils/find-spring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcAngularFreq(undampedFreq: Double, dampingRatio: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcAngularFreq")(undampedFreq.asInstanceOf[js.Any], dampingRatio.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findSpring(hasDurationBounceVelocityMass: SpringOptions): Damping = ^.asInstanceOf[js.Dynamic].applyDynamic("findSpring")(hasDurationBounceVelocityMass.asInstanceOf[js.Any]).asInstanceOf[Damping]
  
  @JSImport("popmotion/lib/animations/utils/find-spring", "maxDamping")
  @js.native
  val maxDamping: /* 1 */ Double = js.native
  
  @JSImport("popmotion/lib/animations/utils/find-spring", "maxDuration")
  @js.native
  val maxDuration: /* 10 */ Double = js.native
  
  @JSImport("popmotion/lib/animations/utils/find-spring", "minDamping")
  @js.native
  val minDamping: /* 0.05 */ Double = js.native
  
  @JSImport("popmotion/lib/animations/utils/find-spring", "minDuration")
  @js.native
  val minDuration: /* 0.01 */ Double = js.native
}
