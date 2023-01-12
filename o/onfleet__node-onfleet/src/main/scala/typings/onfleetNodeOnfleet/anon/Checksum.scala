package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checksum extends StObject {
  
  var checksum: Null
  
  var failedScanCount: Double
}
object Checksum {
  
  inline def apply(checksum: Null, failedScanCount: Double): Checksum = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], failedScanCount = failedScanCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checksum] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: Null): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setFailedScanCount(value: Double): Self = StObject.set(x, "failedScanCount", value.asInstanceOf[js.Any])
  }
}
