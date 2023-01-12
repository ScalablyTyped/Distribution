package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DDD extends StObject {
  
  var DDD: Double
  
  var DDD_DD: Double
}
object DDD {
  
  inline def apply(DDD: Double, DDD_DD: Double): DDD = {
    val __obj = js.Dynamic.literal(DDD = DDD.asInstanceOf[js.Any], DDD_DD = DDD_DD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DDD] (val x: Self) extends AnyVal {
    
    inline def setDDD(value: Double): Self = StObject.set(x, "DDD", value.asInstanceOf[js.Any])
    
    inline def setDDD_DD(value: Double): Self = StObject.set(x, "DDD_DD", value.asInstanceOf[js.Any])
  }
}
