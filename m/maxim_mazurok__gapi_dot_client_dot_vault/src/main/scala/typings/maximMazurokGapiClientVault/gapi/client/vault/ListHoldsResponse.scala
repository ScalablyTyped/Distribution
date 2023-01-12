package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHoldsResponse extends StObject {
  
  /** The list of holds. */
  var holds: js.UndefOr[js.Array[Hold]] = js.undefined
  
  /** Page token to retrieve the next page of results in the list. If this is empty, then there are no more holds to list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListHoldsResponse {
  
  inline def apply(): ListHoldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHoldsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHoldsResponse] (val x: Self) extends AnyVal {
    
    inline def setHolds(value: js.Array[Hold]): Self = StObject.set(x, "holds", value.asInstanceOf[js.Any])
    
    inline def setHoldsUndefined: Self = StObject.set(x, "holds", js.undefined)
    
    inline def setHoldsVarargs(value: Hold*): Self = StObject.set(x, "holds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
