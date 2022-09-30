package typings.pkijs.anon

import typings.pkijs.mod.GeneralNamesSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerUID extends StObject {
  
  var issuer: js.UndefOr[GeneralNamesSchema] = js.undefined
  
  var issuerUID: js.UndefOr[String] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
}
object IssuerUID {
  
  inline def apply(): IssuerUID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerUID]
  }
  
  extension [Self <: IssuerUID](x: Self) {
    
    inline def setIssuer(value: GeneralNamesSchema): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUID(value: String): Self = StObject.set(x, "issuerUID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUIDUndefined: Self = StObject.set(x, "issuerUID", js.undefined)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
