package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RewriteResponse extends StObject {
  
  /** true if the copy is finished; otherwise, false if the copy is in progress. This property is always present in the response. */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The total size of the object being copied in bytes. This property is always present in the response. */
  var objectSize: js.UndefOr[String] = js.undefined
  
  /** A resource containing the metadata for the copied-to object. This property is present in the response only when copying completes. */
  // tslint:disable-next-line:ban-types
  var resource: js.UndefOr[Object] = js.undefined
  
  /** A token to use in subsequent requests to continue copying data. This token is present in the response only when there is more data to copy. */
  var rewriteToken: js.UndefOr[String] = js.undefined
  
  /** The total bytes written so far, which can be used to provide a waiting user with a progress indicator. This property is always present in the response. */
  var totalBytesRewritten: js.UndefOr[String] = js.undefined
}
object RewriteResponse {
  
  inline def apply(): RewriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RewriteResponse]
  }
  
  extension [Self <: RewriteResponse](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObjectSize(value: String): Self = StObject.set(x, "objectSize", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeUndefined: Self = StObject.set(x, "objectSize", js.undefined)
    
    inline def setResource(value: Object): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setRewriteToken(value: String): Self = StObject.set(x, "rewriteToken", value.asInstanceOf[js.Any])
    
    inline def setRewriteTokenUndefined: Self = StObject.set(x, "rewriteToken", js.undefined)
    
    inline def setTotalBytesRewritten(value: String): Self = StObject.set(x, "totalBytesRewritten", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesRewrittenUndefined: Self = StObject.set(x, "totalBytesRewritten", js.undefined)
  }
}
