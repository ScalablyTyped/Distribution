package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attractMod {
  
  @JSImport("popmotion/lib/utils/attract", "attract")
  @js.native
  def attract(constant: Double, origin: Double, v: Double): Double = js.native
  
  @JSImport("popmotion/lib/utils/attract", "attractExpo")
  @js.native
  def attractExpo(constant: Double, origin: Double, v: Double): Double = js.native
  
  @JSImport("popmotion/lib/utils/attract", "createAttractor")
  @js.native
  def createAttractor(): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = js.native
  @JSImport("popmotion/lib/utils/attract", "createAttractor")
  @js.native
  def createAttractor(alterDisplacement: js.Function): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = js.native
}
