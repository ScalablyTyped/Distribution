package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThreatListsResponse extends StObject {
  
  /** The lists available for download by the client. */
  var threatLists: js.UndefOr[js.Array[ThreatListDescriptor]] = js.native
}
object ListThreatListsResponse {
  
  @scala.inline
  def apply(): ListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThreatListsResponse]
  }
  
  @scala.inline
  implicit class ListThreatListsResponseMutableBuilder[Self <: ListThreatListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreatLists(value: js.Array[ThreatListDescriptor]): Self = StObject.set(x, "threatLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatListsUndefined: Self = StObject.set(x, "threatLists", js.undefined)
    
    @scala.inline
    def setThreatListsVarargs(value: ThreatListDescriptor*): Self = StObject.set(x, "threatLists", js.Array(value :_*))
  }
}
