package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activecachescount extends StObject {
  
  /**
    * @description The number of active caches in the repository.
    * @example 3
    */
  var active_caches_count: Double
  
  /**
    * @description The sum of the size in bytes of all the active cache items in the repository.
    * @example 2322142
    */
  var active_caches_size_in_bytes: Double
  
  /**
    * @description The repository owner and name for the cache usage being shown.
    * @example octo-org/Hello-World
    */
  var full_name: String
}
object Activecachescount {
  
  inline def apply(active_caches_count: Double, active_caches_size_in_bytes: Double, full_name: String): Activecachescount = {
    val __obj = js.Dynamic.literal(active_caches_count = active_caches_count.asInstanceOf[js.Any], active_caches_size_in_bytes = active_caches_size_in_bytes.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activecachescount]
  }
  
  extension [Self <: Activecachescount](x: Self) {
    
    inline def setActive_caches_count(value: Double): Self = StObject.set(x, "active_caches_count", value.asInstanceOf[js.Any])
    
    inline def setActive_caches_size_in_bytes(value: Double): Self = StObject.set(x, "active_caches_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
  }
}
