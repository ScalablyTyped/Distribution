package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var class_type: String | Null
  
  var id: String
  
  var mask: String | Null
  
  var name: String
  
  var subtype: String
  
  var `type`: String
  
  var verification_status: VerificationStatus | Null
}
object Account {
  
  inline def apply(id: String, name: String, subtype: String, `type`: String): Account = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], class_type = null, mask = null, verification_status = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setClass_type(value: String): Self = StObject.set(x, "class_type", value.asInstanceOf[js.Any])
    
    inline def setClass_typeNull: Self = StObject.set(x, "class_type", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskNull: Self = StObject.set(x, "mask", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerification_status(value: VerificationStatus): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
    
    inline def setVerification_statusNull: Self = StObject.set(x, "verification_status", null)
  }
}
