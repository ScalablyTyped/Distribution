package typings.popmotion

import typings.popmotion.anon.Damping
import typings.popmotion.typesMod.SpringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/utils/find-spring", JSImport.Namespace)
@js.native
object findSpringMod extends js.Object {
  
  def calcAngularFreq(undampedFreq: Double, dampingRatio: Double): Double = js.native
  
  def findSpring(hasDurationBounceVelocityMass: SpringOptions): Damping = js.native
  
  val maxDamping: /* 1 */ Double = js.native
  
  val maxDuration: /* 10 */ Double = js.native
  
  val minDamping: /* 0.05 */ Double = js.native
  
  val minDuration: /* 0.01 */ Double = js.native
}
