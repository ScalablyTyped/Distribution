package typings.powerRadix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("power-radix", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PowerRadix {
    def this(digits: String, sourceRadix: js.Array[Double]) = this()
    /**
      * Creates a new instance of PowerRadix
      */
    def this(digits: String, sourceRadix: Double) = this()
    def this(digits: js.Array[Double], sourceRadix: js.Array[Double]) = this()
    def this(digits: js.Array[Double], sourceRadix: Double) = this()
    def this(digits: Double, sourceRadix: js.Array[Double]) = this()
    def this(digits: Double, sourceRadix: Double) = this()
  }
  
  @js.native
  trait PowerRadix extends StObject {
    
    def toArray(targetRadix: js.Array[String]): js.Array[String] = js.native
    /**
      * Convert to target radix, return as Array
      * @param targetRadix - target radix / encoding characters
      * @return  source digits converted to target radix presented in format of Array
      */
    def toArray(targetRadix: Double): js.Array[String] = js.native
    
    def toString(targetRadix: js.Array[String]): String = js.native
    /**
      * Convert to target radix, return as String
      *
      * @param targetRadix - target radix / encoding characters
      * @return - source digits converted to target radix presented in format of Array
      */
    def toString(targetRadix: Double): String = js.native
  }
}
