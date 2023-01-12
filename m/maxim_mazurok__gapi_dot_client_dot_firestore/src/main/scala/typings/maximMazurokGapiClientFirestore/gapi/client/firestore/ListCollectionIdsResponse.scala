package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionIdsResponse extends StObject {
  
  /** The collection ids. */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A page token that may be used to continue the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCollectionIdsResponse {
  
  inline def apply(): ListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionIdsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollectionIdsResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    inline def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
