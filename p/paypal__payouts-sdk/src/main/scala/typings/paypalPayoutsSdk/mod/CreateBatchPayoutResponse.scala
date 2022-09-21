package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchPayoutResponse extends StObject {
  
  var batch_header: js.UndefOr[PayoutHeader] = js.undefined
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.undefined
}
object CreateBatchPayoutResponse {
  
  inline def apply(): CreateBatchPayoutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchPayoutResponse]
  }
  
  extension [Self <: CreateBatchPayoutResponse](x: Self) {
    
    inline def setBatch_header(value: PayoutHeader): Self = StObject.set(x, "batch_header", value.asInstanceOf[js.Any])
    
    inline def setBatch_headerUndefined: Self = StObject.set(x, "batch_header", js.undefined)
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
  }
}
