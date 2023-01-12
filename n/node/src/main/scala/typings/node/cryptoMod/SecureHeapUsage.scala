package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureHeapUsage extends StObject {
  
  /**
    * The minimum allocation from the secure heap as specified using the `--secure-heap-min` command-line flag.
    */
  var min: Double
  
  /**
    * The total allocated secure heap size as specified using the `--secure-heap=n` command-line flag.
    */
  var total: Double
  
  /**
    * The total number of bytes currently allocated from the secure heap.
    */
  var used: Double
  
  /**
    * The calculated ratio of `used` to `total` allocated bytes.
    */
  var utilization: Double
}
object SecureHeapUsage {
  
  inline def apply(min: Double, total: Double, used: Double, utilization: Double): SecureHeapUsage = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any], utilization = utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureHeapUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecureHeapUsage] (val x: Self) extends AnyVal {
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUtilization(value: Double): Self = StObject.set(x, "utilization", value.asInstanceOf[js.Any])
  }
}
