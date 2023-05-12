package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Institution extends StObject {
  
  var institution_id: String
  
  var name: String
}
object Institution {
  
  inline def apply(institution_id: String, name: String): Institution = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Institution] (val x: Self) extends AnyVal {
    
    inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
