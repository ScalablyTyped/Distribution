package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionscaches extends StObject {
  
  /** @description Array of caches */
  var actions_caches: js.Array[Lastaccessedat]
  
  /**
    * @description Total number of caches
    * @example 2
    */
  var total_count: Double
}
object Actionscaches {
  
  inline def apply(actions_caches: js.Array[Lastaccessedat], total_count: Double): Actionscaches = {
    val __obj = js.Dynamic.literal(actions_caches = actions_caches.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionscaches]
  }
  
  extension [Self <: Actionscaches](x: Self) {
    
    inline def setActions_caches(value: js.Array[Lastaccessedat]): Self = StObject.set(x, "actions_caches", value.asInstanceOf[js.Any])
    
    inline def setActions_cachesVarargs(value: Lastaccessedat*): Self = StObject.set(x, "actions_caches", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
