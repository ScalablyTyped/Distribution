package typings.pkijs.anon

import typings.pkijs.mod.IssuerAndSerialNumberSchema
import typings.pkijs.mod.RecipientKeyIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerAndSerialNumber extends StObject {
  
  var issuerAndSerialNumber: js.UndefOr[IssuerAndSerialNumberSchema] = js.undefined
  
  var rKeyId: js.UndefOr[RecipientKeyIdentifierSchema] = js.undefined
}
object IssuerAndSerialNumber {
  
  inline def apply(): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuerAndSerialNumber] (val x: Self) extends AnyVal {
    
    inline def setIssuerAndSerialNumber(value: IssuerAndSerialNumberSchema): Self = StObject.set(x, "issuerAndSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setIssuerAndSerialNumberUndefined: Self = StObject.set(x, "issuerAndSerialNumber", js.undefined)
    
    inline def setRKeyId(value: RecipientKeyIdentifierSchema): Self = StObject.set(x, "rKeyId", value.asInstanceOf[js.Any])
    
    inline def setRKeyIdUndefined: Self = StObject.set(x, "rKeyId", js.undefined)
  }
}
