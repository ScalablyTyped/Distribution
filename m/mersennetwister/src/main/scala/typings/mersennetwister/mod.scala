package typings.mersennetwister

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mersennetwister", JSImport.Namespace)
  @js.native
  /** Creates a new instance seeded by an unsined 32-bit integer or or array of unsigned 32-bit integers */
  open class ^ ()
    extends StObject
       with MersenneTwister {
    def this(seed: js.Array[Double]) = this()
    def this(seed: Double) = this()
    
    /** Returns a random 32-bit unsigned integer */
    /* CompleteClass */
    override def int(): Double = js.native
    
    /** Returns a random 31-bit unsigned integer */
    /* CompleteClass */
    override def int31(): Double = js.native
    
    /**
      * This is an alias of the `rnd()` method
      * @alias rnd()
      */
    /* CompleteClass */
    override def random(): Double = js.native
    
    /** Returns a random float in the range [0,1] */
    /* CompleteClass */
    override def real(): Double = js.native
    
    /** Returns a random float in the range (0,1) */
    /* CompleteClass */
    override def realx(): Double = js.native
    
    /** Returns a random float in the range [0,1) with 32-bit precision */
    /* CompleteClass */
    override def rnd(): Double = js.native
    
    /** Returns a random float in the range [0,1) with 53-bit precision */
    /* CompleteClass */
    override def rndHiRes(): Double = js.native
    
    /** Reseed the generator with the specified 32-bit unsigned integer */
    /* CompleteClass */
    override def seed(seed: Double): Unit = js.native
    
    /** Reseed the generator's state vector with an array of 32-bit unsigned integers */
    /* CompleteClass */
    override def seedArray(seeds: js.Array[Double]): Unit = js.native
  }
  
  trait MersenneTwister extends StObject {
    
    /** Returns a random 32-bit unsigned integer */
    def int(): Double
    
    /** Returns a random 31-bit unsigned integer */
    def int31(): Double
    
    /**
      * This is an alias of the `rnd()` method
      * @alias rnd()
      */
    def random(): Double
    
    /** Returns a random float in the range [0,1] */
    def real(): Double
    
    /** Returns a random float in the range (0,1) */
    def realx(): Double
    
    /** Returns a random float in the range [0,1) with 32-bit precision */
    def rnd(): Double
    
    /** Returns a random float in the range [0,1) with 53-bit precision */
    def rndHiRes(): Double
    
    /** Reseed the generator with the specified 32-bit unsigned integer */
    def seed(seed: Double): Unit
    
    /** Reseed the generator's state vector with an array of 32-bit unsigned integers */
    def seedArray(seeds: js.Array[Double]): Unit
  }
  object MersenneTwister {
    
    inline def apply(
      int: () => Double,
      int31: () => Double,
      random: () => Double,
      real: () => Double,
      realx: () => Double,
      rnd: () => Double,
      rndHiRes: () => Double,
      seed: Double => Unit,
      seedArray: js.Array[Double] => Unit
    ): MersenneTwister = {
      val __obj = js.Dynamic.literal(int = js.Any.fromFunction0(int), int31 = js.Any.fromFunction0(int31), random = js.Any.fromFunction0(random), real = js.Any.fromFunction0(real), realx = js.Any.fromFunction0(realx), rnd = js.Any.fromFunction0(rnd), rndHiRes = js.Any.fromFunction0(rndHiRes), seed = js.Any.fromFunction1(seed), seedArray = js.Any.fromFunction1(seedArray))
      __obj.asInstanceOf[MersenneTwister]
    }
    
    extension [Self <: MersenneTwister](x: Self) {
      
      inline def setInt(value: () => Double): Self = StObject.set(x, "int", js.Any.fromFunction0(value))
      
      inline def setInt31(value: () => Double): Self = StObject.set(x, "int31", js.Any.fromFunction0(value))
      
      inline def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      inline def setReal(value: () => Double): Self = StObject.set(x, "real", js.Any.fromFunction0(value))
      
      inline def setRealx(value: () => Double): Self = StObject.set(x, "realx", js.Any.fromFunction0(value))
      
      inline def setRnd(value: () => Double): Self = StObject.set(x, "rnd", js.Any.fromFunction0(value))
      
      inline def setRndHiRes(value: () => Double): Self = StObject.set(x, "rndHiRes", js.Any.fromFunction0(value))
      
      inline def setSeed(value: Double => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction1(value))
      
      inline def setSeedArray(value: js.Array[Double] => Unit): Self = StObject.set(x, "seedArray", js.Any.fromFunction1(value))
    }
  }
}
