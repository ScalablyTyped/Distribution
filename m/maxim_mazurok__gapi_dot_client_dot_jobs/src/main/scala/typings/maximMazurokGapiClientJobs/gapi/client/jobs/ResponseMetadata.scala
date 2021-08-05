package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseMetadata extends StObject {
  
  /** A unique id associated with this call. This id is logged for tracking purposes. */
  var requestId: js.UndefOr[String] = js.undefined
}
object ResponseMetadata {
  
  inline def apply(): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetadata]
  }
  
  extension [Self <: ResponseMetadata](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
