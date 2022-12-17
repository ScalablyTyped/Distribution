package typings.pkijs.anon

import typings.pkijs.mod.SignatureSchema
import typings.pkijs.mod.TBSRequestSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalSignature extends StObject {
  
  var optionalSignature: js.UndefOr[SignatureSchema] = js.undefined
  
  var tbsRequest: js.UndefOr[TBSRequestSchema] = js.undefined
}
object OptionalSignature {
  
  inline def apply(): OptionalSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalSignature]
  }
  
  extension [Self <: OptionalSignature](x: Self) {
    
    inline def setOptionalSignature(value: SignatureSchema): Self = StObject.set(x, "optionalSignature", value.asInstanceOf[js.Any])
    
    inline def setOptionalSignatureUndefined: Self = StObject.set(x, "optionalSignature", js.undefined)
    
    inline def setTbsRequest(value: TBSRequestSchema): Self = StObject.set(x, "tbsRequest", value.asInstanceOf[js.Any])
    
    inline def setTbsRequestUndefined: Self = StObject.set(x, "tbsRequest", js.undefined)
  }
}
