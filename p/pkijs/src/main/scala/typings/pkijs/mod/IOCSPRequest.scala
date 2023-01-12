package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCSPRequest extends StObject {
  
  var optionalSignature: js.UndefOr[Signature] = js.undefined
  
  var tbsRequest: TBSRequest
}
object IOCSPRequest {
  
  inline def apply(tbsRequest: TBSRequest): IOCSPRequest = {
    val __obj = js.Dynamic.literal(tbsRequest = tbsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCSPRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOCSPRequest] (val x: Self) extends AnyVal {
    
    inline def setOptionalSignature(value: Signature): Self = StObject.set(x, "optionalSignature", value.asInstanceOf[js.Any])
    
    inline def setOptionalSignatureUndefined: Self = StObject.set(x, "optionalSignature", js.undefined)
    
    inline def setTbsRequest(value: TBSRequest): Self = StObject.set(x, "tbsRequest", value.asInstanceOf[js.Any])
  }
}
