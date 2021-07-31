package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientData extends StObject {
  
  /** The client specified key of the client data. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Metadata about the client data. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The client specified value of the client data. */
  var value: js.UndefOr[String] = js.undefined
}
object ClientData {
  
  @scala.inline
  def apply(): ClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit class ClientDataMutableBuilder[Self <: ClientData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
