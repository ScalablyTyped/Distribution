package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMattersResponse extends StObject {
  
  /** List of matters. */
  var matters: js.UndefOr[js.Array[Matter]] = js.native
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListMattersResponse {
  
  @scala.inline
  def apply(): ListMattersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMattersResponse]
  }
  
  @scala.inline
  implicit class ListMattersResponseMutableBuilder[Self <: ListMattersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatters(value: js.Array[Matter]): Self = StObject.set(x, "matters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMattersUndefined: Self = StObject.set(x, "matters", js.undefined)
    
    @scala.inline
    def setMattersVarargs(value: Matter*): Self = StObject.set(x, "matters", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
