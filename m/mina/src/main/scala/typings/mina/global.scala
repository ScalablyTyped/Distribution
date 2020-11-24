package typings.mina

import typings.mina.mina.AnimationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object mina extends js.Object {
    
    def apply(
      a: Double,
      A: Double,
      b: Double,
      B: Double,
      get: js.Function0[Double],
      set: js.Function1[/* time */ Double, Unit]
    ): AnimationDescriptor = js.native
    def apply(
      a: Double,
      A: Double,
      b: Double,
      B: Double,
      get: js.Function0[Double],
      set: js.Function1[/* time */ Double, Unit],
      easing: js.Function1[/* num */ Double, Double]
    ): AnimationDescriptor = js.native
    
    def backin(n: Double): Double = js.native
    
    def backout(n: Double): Double = js.native
    
    def bounce(n: Double): Double = js.native
    
    def easein(n: Double): Double = js.native
    
    def easeinout(n: Double): Double = js.native
    
    def easeout(n: Double): Double = js.native
    
    def elastic(n: Double): Double = js.native
    
    def getById(id: String): AnimationDescriptor = js.native
    
    def linear(n: Double): Double = js.native
    
    def time(): Double = js.native
  }
}
