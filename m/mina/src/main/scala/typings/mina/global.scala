package typings.mina

import typings.mina.mina.AnimationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mina {
    
    @JSGlobal("mina")
    @js.native
    def apply(
      a: Double,
      A: Double,
      b: Double,
      B: Double,
      get: js.Function0[Double],
      set: js.Function1[/* time */ Double, Unit]
    ): AnimationDescriptor = js.native
    @JSGlobal("mina")
    @js.native
    def apply(
      a: Double,
      A: Double,
      b: Double,
      B: Double,
      get: js.Function0[Double],
      set: js.Function1[/* time */ Double, Unit],
      easing: js.Function1[/* num */ Double, Double]
    ): AnimationDescriptor = js.native
    
    @JSGlobal("mina.backin")
    @js.native
    def backin(n: Double): Double = js.native
    
    @JSGlobal("mina.backout")
    @js.native
    def backout(n: Double): Double = js.native
    
    @JSGlobal("mina.bounce")
    @js.native
    def bounce(n: Double): Double = js.native
    
    @JSGlobal("mina.easein")
    @js.native
    def easein(n: Double): Double = js.native
    
    @JSGlobal("mina.easeinout")
    @js.native
    def easeinout(n: Double): Double = js.native
    
    @JSGlobal("mina.easeout")
    @js.native
    def easeout(n: Double): Double = js.native
    
    @JSGlobal("mina.elastic")
    @js.native
    def elastic(n: Double): Double = js.native
    
    @JSGlobal("mina.getById")
    @js.native
    def getById(id: String): AnimationDescriptor = js.native
    
    @JSGlobal("mina.linear")
    @js.native
    def linear(n: Double): Double = js.native
    
    @JSGlobal("mina.time")
    @js.native
    def time(): Double = js.native
  }
}
