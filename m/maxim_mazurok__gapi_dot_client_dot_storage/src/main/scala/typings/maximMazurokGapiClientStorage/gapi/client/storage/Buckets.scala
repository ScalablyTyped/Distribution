package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buckets extends StObject {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[Bucket]] = js.undefined
  
  /** The kind of item this is. For lists of buckets, this is always storage#buckets. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object Buckets {
  
  inline def apply(): Buckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buckets]
  }
  
  extension [Self <: Buckets](x: Self) {
    
    inline def setItems(value: js.Array[Bucket]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Bucket*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
