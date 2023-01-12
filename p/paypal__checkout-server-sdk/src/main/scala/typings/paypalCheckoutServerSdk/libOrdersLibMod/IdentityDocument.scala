package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityDocument extends StObject {
  
  var expiration_date: String
  
  var id_number: String
  
  var issued_date: String
  
  var issuer: DocumentIssuer
  
  var `type`: IdentityDocumentType
}
object IdentityDocument {
  
  inline def apply(
    expiration_date: String,
    id_number: String,
    issued_date: String,
    issuer: DocumentIssuer,
    `type`: IdentityDocumentType
  ): IdentityDocument = {
    val __obj = js.Dynamic.literal(expiration_date = expiration_date.asInstanceOf[js.Any], id_number = id_number.asInstanceOf[js.Any], issued_date = issued_date.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityDocument] (val x: Self) extends AnyVal {
    
    inline def setExpiration_date(value: String): Self = StObject.set(x, "expiration_date", value.asInstanceOf[js.Any])
    
    inline def setId_number(value: String): Self = StObject.set(x, "id_number", value.asInstanceOf[js.Any])
    
    inline def setIssued_date(value: String): Self = StObject.set(x, "issued_date", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: DocumentIssuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setType(value: IdentityDocumentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
