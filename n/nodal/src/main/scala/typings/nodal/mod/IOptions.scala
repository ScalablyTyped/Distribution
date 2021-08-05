package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOptions extends StObject {
  
  var as: String
  
  var multiple: Boolean
  
  var name: String
  
  var via: String
}
object IOptions {
  
  inline def apply(as: String, multiple: Boolean, name: String, via: String): IOptions = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  extension [Self <: IOptions](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
  }
}
