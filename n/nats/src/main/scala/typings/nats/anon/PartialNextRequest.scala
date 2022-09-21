package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.NextRequest> */
trait PartialNextRequest extends StObject {
  
  var batch: js.UndefOr[Double] = js.undefined
  
  var expires: js.UndefOr[Double] = js.undefined
  
  var no_wait: js.UndefOr[Boolean] = js.undefined
}
object PartialNextRequest {
  
  inline def apply(): PartialNextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNextRequest]
  }
  
  extension [Self <: PartialNextRequest](x: Self) {
    
    inline def setBatch(value: Double): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setNo_wait(value: Boolean): Self = StObject.set(x, "no_wait", value.asInstanceOf[js.Any])
    
    inline def setNo_waitUndefined: Self = StObject.set(x, "no_wait", js.undefined)
  }
}
