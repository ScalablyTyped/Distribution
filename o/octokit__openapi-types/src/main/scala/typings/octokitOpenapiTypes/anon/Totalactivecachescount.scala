package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalactivecachescount extends StObject {
  
  /** @description The count of active caches across all repositories of an enterprise or an organization. */
  var total_active_caches_count: Double
  
  /** @description The total size in bytes of all active cache items across all repositories of an enterprise or an organization. */
  var total_active_caches_size_in_bytes: Double
}
object Totalactivecachescount {
  
  inline def apply(total_active_caches_count: Double, total_active_caches_size_in_bytes: Double): Totalactivecachescount = {
    val __obj = js.Dynamic.literal(total_active_caches_count = total_active_caches_count.asInstanceOf[js.Any], total_active_caches_size_in_bytes = total_active_caches_size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totalactivecachescount]
  }
  
  extension [Self <: Totalactivecachescount](x: Self) {
    
    inline def setTotal_active_caches_count(value: Double): Self = StObject.set(x, "total_active_caches_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_active_caches_size_in_bytes(value: Double): Self = StObject.set(x, "total_active_caches_size_in_bytes", value.asInstanceOf[js.Any])
  }
}
