package typings.pkijs.anon

import typings.pkijs.mod.RelativeDistinguishedNamesSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuer extends StObject {
  
  var issuer: js.UndefOr[RelativeDistinguishedNamesSchema] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
}
object Issuer {
  
  inline def apply(): Issuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issuer]
  }
  
  extension [Self <: Issuer](x: Self) {
    
    inline def setIssuer(value: RelativeDistinguishedNamesSchema): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
