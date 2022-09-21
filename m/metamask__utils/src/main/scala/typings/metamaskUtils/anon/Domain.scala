package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var __typename: String
  
  var domain: IsMigrated
  
  var expiryDate: String
}
object Domain {
  
  inline def apply(__typename: String, domain: IsMigrated, expiryDate: String): Domain = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setDomain(value: IsMigrated): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpiryDate(value: String): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
    
    inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
  }
}
