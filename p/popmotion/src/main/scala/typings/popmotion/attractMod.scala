package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/utils/attract", JSImport.Namespace)
@js.native
object attractMod extends js.Object {
  
  def attract(constant: Double, origin: Double, v: Double): Double = js.native
  
  def attractExpo(constant: Double, origin: Double, v: Double): Double = js.native
  
  def createAttractor(): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = js.native
  def createAttractor(alterDisplacement: js.Function): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = js.native
}
