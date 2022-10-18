package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canaccessclosed extends StObject {
  
  var can_access_closed: js.UndefOr[Boolean] = js.undefined
  
  var deactivated: js.UndefOr[String] = js.undefined
  
  var first_name: String
  
  var hidden: js.UndefOr[Double] = js.undefined
  
  var id: Double
  
  var is_closed: js.UndefOr[Boolean] = js.undefined
  
  var last_name: String
}
object Canaccessclosed {
  
  inline def apply(first_name: String, id: Double, last_name: String): Canaccessclosed = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canaccessclosed]
  }
  
  extension [Self <: Canaccessclosed](x: Self) {
    
    inline def setCan_access_closed(value: Boolean): Self = StObject.set(x, "can_access_closed", value.asInstanceOf[js.Any])
    
    inline def setCan_access_closedUndefined: Self = StObject.set(x, "can_access_closed", js.undefined)
    
    inline def setDeactivated(value: String): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Double): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_closed(value: Boolean): Self = StObject.set(x, "is_closed", value.asInstanceOf[js.Any])
    
    inline def setIs_closedUndefined: Self = StObject.set(x, "is_closed", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
  }
}
