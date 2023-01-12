package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertBag extends StObject {
  
  var certId: String
  
  var certValue: OctetString | PkiObject
  
  var parsedValue: Any
}
object ICertBag {
  
  inline def apply(certId: String, certValue: OctetString | PkiObject, parsedValue: Any): ICertBag = {
    val __obj = js.Dynamic.literal(certId = certId.asInstanceOf[js.Any], certValue = certValue.asInstanceOf[js.Any], parsedValue = parsedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertBag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICertBag] (val x: Self) extends AnyVal {
    
    inline def setCertId(value: String): Self = StObject.set(x, "certId", value.asInstanceOf[js.Any])
    
    inline def setCertValue(value: OctetString | PkiObject): Self = StObject.set(x, "certValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
  }
}
