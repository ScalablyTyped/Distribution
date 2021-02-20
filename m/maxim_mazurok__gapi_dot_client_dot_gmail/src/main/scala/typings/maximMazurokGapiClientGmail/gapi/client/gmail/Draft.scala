package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draft extends StObject {
  
  /** The immutable ID of the draft. */
  var id: js.UndefOr[String] = js.native
  
  /** The message content of the draft. */
  var message: js.UndefOr[Message] = js.native
}
object Draft {
  
  @scala.inline
  def apply(): Draft = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Draft]
  }
  
  @scala.inline
  implicit class DraftMutableBuilder[Self <: Draft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
