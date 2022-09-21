package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsbn {
  
  @JSImport("node-forge", "jsbn.BigInteger")
  @js.native
  open class BigInteger protected () extends StObject {
    def this(a: String) = this()
    def this(a: js.Array[Double]) = this()
    def this(a: Null) = this()
    def this(a: BigInteger) = this()
    def this(a: String, b: Double) = this()
    def this(a: js.Array[Double], b: Double) = this()
    def this(a: Double, c: RandomGenerator) = this()
    def this(a: Double, b: Double, c: RandomGenerator) = this()
    
    def abs(): BigInteger = js.native
    
    def add(a: BigInteger): BigInteger = js.native
    
    def am(i: Double, x: Double, w: BigInteger, j: Double, c: Double, n: Double): Double = js.native
    
    def and(a: BigInteger): BigInteger = js.native
    
    def andNot(a: BigInteger): BigInteger = js.native
    
    def bitCount(): Double = js.native
    
    def bitLength(): Double = js.native
    
    def byteValue(): Double = js.native
    
    def clearBit(n: Double): BigInteger = js.native
    
    def compareTo(a: BigInteger): Double = js.native
    
    var data: js.Array[Double] = js.native
    
    def divide(a: BigInteger): BigInteger = js.native
    
    def divideAndRemainder(a: BigInteger): js.Array[BigInteger] = js.native
    
    def equals(a: BigInteger): Boolean = js.native
    
    def flipBit(n: Double): BigInteger = js.native
    
    def gcd(a: BigInteger): BigInteger = js.native
    
    def getLowestSetBit(): Double = js.native
    
    def intValue(): Double = js.native
    
    def isProbablePrime(t: Double): Boolean = js.native
    
    def max(a: BigInteger): BigInteger = js.native
    
    def min(a: BigInteger): BigInteger = js.native
    
    def mod(a: BigInteger): BigInteger = js.native
    
    def modInverse(m: BigInteger): BigInteger = js.native
    
    def modPow(e: BigInteger, m: BigInteger): BigInteger = js.native
    
    def modPowInt(e: Double, m: BigInteger): BigInteger = js.native
    
    def multiply(a: BigInteger): BigInteger = js.native
    
    def negate(): BigInteger = js.native
    
    def not(): BigInteger = js.native
    
    def or(a: BigInteger): BigInteger = js.native
    
    // Array of 2 items
    def pow(e: Double): BigInteger = js.native
    
    def remainder(a: BigInteger): BigInteger = js.native
    
    var s: Double = js.native
    
    def shiftLeft(n: Double): BigInteger = js.native
    
    def shiftRight(n: Double): BigInteger = js.native
    
    def shortValue(): Double = js.native
    
    def signum(): Double = js.native
    
    def squareTo(a: BigInteger): BigInteger = js.native
    
    def subtract(a: BigInteger): BigInteger = js.native
    
    var t: Double = js.native
    
    def testBit(n: Double): Boolean = js.native
    
    def toByteArray(): js.Array[Double] = js.native
    
    def toString(b: Double): String = js.native
    
    def xor(a: BigInteger): BigInteger = js.native
  }
  object BigInteger {
    
    @JSImport("node-forge", "jsbn.BigInteger")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("node-forge", "jsbn.BigInteger.ONE")
    @js.native
    def ONE: BigInteger = js.native
    inline def ONE_=(x: BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("node-forge", "jsbn.BigInteger.ZERO")
    @js.native
    def ZERO: BigInteger = js.native
    inline def ZERO_=(x: BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  trait RandomGenerator extends StObject {
    
    def nextBytes(bytes: js.Array[Double]): Unit
  }
  object RandomGenerator {
    
    inline def apply(nextBytes: js.Array[Double] => Unit): RandomGenerator = {
      val __obj = js.Dynamic.literal(nextBytes = js.Any.fromFunction1(nextBytes))
      __obj.asInstanceOf[RandomGenerator]
    }
    
    extension [Self <: RandomGenerator](x: Self) {
      
      inline def setNextBytes(value: js.Array[Double] => Unit): Self = StObject.set(x, "nextBytes", js.Any.fromFunction1(value))
    }
  }
}
