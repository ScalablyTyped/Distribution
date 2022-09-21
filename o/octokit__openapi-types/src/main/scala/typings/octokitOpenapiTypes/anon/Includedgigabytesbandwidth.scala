package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includedgigabytesbandwidth extends StObject {
  
  /** @description Free storage space (GB) for GitHub Packages. */
  var included_gigabytes_bandwidth: Double
  
  /** @description Sum of the free and paid storage space (GB) for GitHuub Packages. */
  var total_gigabytes_bandwidth_used: Double
  
  /** @description Total paid storage space (GB) for GitHuub Packages. */
  var total_paid_gigabytes_bandwidth_used: Double
}
object Includedgigabytesbandwidth {
  
  inline def apply(
    included_gigabytes_bandwidth: Double,
    total_gigabytes_bandwidth_used: Double,
    total_paid_gigabytes_bandwidth_used: Double
  ): Includedgigabytesbandwidth = {
    val __obj = js.Dynamic.literal(included_gigabytes_bandwidth = included_gigabytes_bandwidth.asInstanceOf[js.Any], total_gigabytes_bandwidth_used = total_gigabytes_bandwidth_used.asInstanceOf[js.Any], total_paid_gigabytes_bandwidth_used = total_paid_gigabytes_bandwidth_used.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includedgigabytesbandwidth]
  }
  
  extension [Self <: Includedgigabytesbandwidth](x: Self) {
    
    inline def setIncluded_gigabytes_bandwidth(value: Double): Self = StObject.set(x, "included_gigabytes_bandwidth", value.asInstanceOf[js.Any])
    
    inline def setTotal_gigabytes_bandwidth_used(value: Double): Self = StObject.set(x, "total_gigabytes_bandwidth_used", value.asInstanceOf[js.Any])
    
    inline def setTotal_paid_gigabytes_bandwidth_used(value: Double): Self = StObject.set(x, "total_paid_gigabytes_bandwidth_used", value.asInstanceOf[js.Any])
  }
}
