package typings.mina

import typings.mina.mina.AnimationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object mina {
    
    inline def apply(
      a: Double,
      A: Double,
      b: Double,
      B: Double,
      get: js.Function0[Double],
      set: js.Function1[/* time */ Double, Unit]
    ): AnimationDescriptor = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], A.asInstanceOf[js.Any], b.asInstanceOf[js.Any], B.asInstanceOf[js.Any], get.asInstanceOf[js.Any], set.asInstanceOf[js.Any])).asInstanceOf[AnimationDescriptor]
    inline def apply(
      a: Double,
      A: Double,
      b: Double,
      B: Double,
      get: js.Function0[Double],
      set: js.Function1[/* time */ Double, Unit],
      easing: js.Function1[/* num */ Double, Double]
    ): AnimationDescriptor = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], A.asInstanceOf[js.Any], b.asInstanceOf[js.Any], B.asInstanceOf[js.Any], get.asInstanceOf[js.Any], set.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[AnimationDescriptor]
    
    @JSGlobal("mina")
    @js.native
    val ^ : js.Any = js.native
    
    inline def backin(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backin")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def backout(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backout")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def bounce(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounce")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easein(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easein")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeinout(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeinout")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def easeout(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeout")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def elastic(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getById(id: String): AnimationDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("getById")(id.asInstanceOf[js.Any]).asInstanceOf[AnimationDescriptor]
    
    inline def linear(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("linear")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def time(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Double]
  }
}
