package typings.popmotion

import typings.popmotion.anon.Damping
import typings.popmotion.typesMod.SpringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findSpringMod {
  
  @JSImport("popmotion/lib/animations/utils/find-spring", "calcAngularFreq")
  @js.native
  def calcAngularFreq(undampedFreq: Double, dampingRatio: Double): Double = js.native
  
  @JSImport("popmotion/lib/animations/utils/find-spring", "findSpring")
  @js.native
  def findSpring(hasDurationBounceVelocityMass: SpringOptions): Damping = js.native
  
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
