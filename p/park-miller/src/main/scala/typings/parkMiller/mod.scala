package typings.parkMiller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("park-miller", JSImport.Namespace)
  @js.native
  class ^ protected () extends ParkMiller {
    /**
    	[Park-Miller](https://en.wikipedia.org/wiki/Lehmer_random_number_generator) pseudorandom number generator (PRNG).
    	@param seed - [Initialization seed.](https://en.wikipedia.org/wiki/Random_seed)
    	@example
    	```
    	import ParkMiller = require('park-miller');
    	const random = new ParkMiller(10);
    	random.integer();
    	//=> 2027521326
    	```
    	*/
    def this(seed: Double) = this()
  }
  
  @js.native
  trait ParkMiller extends StObject {
    
    def boolean(): Boolean = js.native
    
    def float(): Double = js.native
    
    def floatInRange(min: Double, max: Double): Double = js.native
    
    def integer(): Double = js.native
    
    def integerInRange(min: Double, max: Double): Double = js.native
  }
  object ParkMiller {
    
    @scala.inline
    def apply(
      boolean: () => Boolean,
      float: () => Double,
      floatInRange: (Double, Double) => Double,
      integer: () => Double,
      integerInRange: (Double, Double) => Double
    ): ParkMiller = {
      val __obj = js.Dynamic.literal(boolean = js.Any.fromFunction0(boolean), float = js.Any.fromFunction0(float), floatInRange = js.Any.fromFunction2(floatInRange), integer = js.Any.fromFunction0(integer), integerInRange = js.Any.fromFunction2(integerInRange))
      __obj.asInstanceOf[ParkMiller]
    }
    
    @scala.inline
    implicit class ParkMillerMutableBuilder[Self <: ParkMiller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: () => Boolean): Self = StObject.set(x, "boolean", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFloat(value: () => Double): Self = StObject.set(x, "float", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFloatInRange(value: (Double, Double) => Double): Self = StObject.set(x, "floatInRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInteger(value: () => Double): Self = StObject.set(x, "integer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIntegerInRange(value: (Double, Double) => Double): Self = StObject.set(x, "integerInRange", js.Any.fromFunction2(value))
    }
  }
}
