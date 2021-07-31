package typings.murmurhashJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Murmur2 extends StObject {
    
    def murmur2(str: String): Double
    def murmur2(str: String, seed: Double): Double
    @JSName("murmur2")
    var murmur2_Original: js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]
    
    def murmur3(str: String): Double
    def murmur3(str: String, seed: Double): Double
    @JSName("murmur3")
    var murmur3_Original: js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]
  }
  object Murmur2 {
    
    @scala.inline
    def apply(
      murmur2: (/* str */ String, /* seed */ js.UndefOr[Double]) => Double,
      murmur3: (/* str */ String, /* seed */ js.UndefOr[Double]) => Double
    ): Murmur2 = {
      val __obj = js.Dynamic.literal(murmur2 = js.Any.fromFunction2(murmur2), murmur3 = js.Any.fromFunction2(murmur3))
      __obj.asInstanceOf[Murmur2]
    }
    
    @scala.inline
    implicit class Murmur2MutableBuilder[Self <: Murmur2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMurmur2(value: (/* str */ String, /* seed */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "murmur2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMurmur3(value: (/* str */ String, /* seed */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "murmur3", js.Any.fromFunction2(value))
    }
  }
}
