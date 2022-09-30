package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OCSPRequestJson extends StObject {
  
  var optionalSignature: js.UndefOr[SignatureJson] = js.undefined
  
  var tbsRequest: TBSRequestJson
}
object OCSPRequestJson {
  
  inline def apply(tbsRequest: TBSRequestJson): OCSPRequestJson = {
    val __obj = js.Dynamic.literal(tbsRequest = tbsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCSPRequestJson]
  }
  
  extension [Self <: OCSPRequestJson](x: Self) {
    
    inline def setOptionalSignature(value: SignatureJson): Self = StObject.set(x, "optionalSignature", value.asInstanceOf[js.Any])
    
    inline def setOptionalSignatureUndefined: Self = StObject.set(x, "optionalSignature", js.undefined)
    
    inline def setTbsRequest(value: TBSRequestJson): Self = StObject.set(x, "tbsRequest", value.asInstanceOf[js.Any])
  }
}
