package typings.mersenneTwister

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mersenne-twister", JSImport.Namespace)
  @js.native
  /**
    * constructs mt with a number
    * @params seed
    */
  class ^ () extends MersenneTwister {
    def this(seed: js.Array[Double]) = this()
    def this(seed: Double) = this()
  }
  
  @js.native
  trait MersenneTwister extends StObject {
    
    /**
      * initializes mt with a number
      */
    def init_seed(seed: Double): Unit = js.native
    
    /**
      * generates a random number on [0,1)-real-interval
      */
    def random(): Double = js.native
    
    /**
      * generates a random number on (0,1)-real-interval
      */
    def random_excl(): Double = js.native
    
    /**
      * generates a random number on [0,1]-real-interval
      */
    def random_incl(): Double = js.native
    
    /**
      * generates a random number on [0,0xffffffff]-interval
      */
    def random_int(): Double = js.native
    
    /**
      * generates a random number on [0,0x7fffffff]-interval
      */
    def random_int31(): Double = js.native
    
    /**
      * generates a random number on [0,1) with 53-bit resolution
      */
    def random_long(): Double = js.native
  }
  object MersenneTwister {
    
    @scala.inline
    def apply(
      init_seed: Double => Unit,
      random: () => Double,
      random_excl: () => Double,
      random_incl: () => Double,
      random_int: () => Double,
      random_int31: () => Double,
      random_long: () => Double
    ): MersenneTwister = {
      val __obj = js.Dynamic.literal(init_seed = js.Any.fromFunction1(init_seed), random = js.Any.fromFunction0(random), random_excl = js.Any.fromFunction0(random_excl), random_incl = js.Any.fromFunction0(random_incl), random_int = js.Any.fromFunction0(random_int), random_int31 = js.Any.fromFunction0(random_int31), random_long = js.Any.fromFunction0(random_long))
      __obj.asInstanceOf[MersenneTwister]
    }
    
    @scala.inline
    implicit class MersenneTwisterMutableBuilder[Self <: MersenneTwister] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit_seed(value: Double => Unit): Self = StObject.set(x, "init_seed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandom_excl(value: () => Double): Self = StObject.set(x, "random_excl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandom_incl(value: () => Double): Self = StObject.set(x, "random_incl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandom_int(value: () => Double): Self = StObject.set(x, "random_int", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandom_int31(value: () => Double): Self = StObject.set(x, "random_int31", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRandom_long(value: () => Double): Self = StObject.set(x, "random_long", js.Any.fromFunction0(value))
    }
  }
}
