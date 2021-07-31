package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Objects extends StObject {
  
  /** The list of items. */
  // tslint:disable-next-line:ban-types
  var items: js.UndefOr[js.Array[Object]] = js.undefined
  
  /** The kind of item this is. For lists of objects, this is always storage#objects. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of prefixes of objects matching-but-not-listed up to and including the requested delimiter. */
  var prefixes: js.UndefOr[js.Array[String]] = js.undefined
}
object Objects {
  
  @scala.inline
  def apply(): Objects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Objects]
  }
  
  @scala.inline
  implicit class ObjectsMutableBuilder[Self <: Objects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Object*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    @scala.inline
    def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value :_*))
  }
}
