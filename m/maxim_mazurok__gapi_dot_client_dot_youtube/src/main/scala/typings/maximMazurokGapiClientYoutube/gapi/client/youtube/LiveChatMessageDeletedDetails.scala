package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessageDeletedDetails extends StObject {
  
  var deletedMessageId: js.UndefOr[String] = js.undefined
}
object LiveChatMessageDeletedDetails {
  
  inline def apply(): LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageDeletedDetails]
  }
  
  extension [Self <: LiveChatMessageDeletedDetails](x: Self) {
    
    inline def setDeletedMessageId(value: String): Self = StObject.set(x, "deletedMessageId", value.asInstanceOf[js.Any])
    
    inline def setDeletedMessageIdUndefined: Self = StObject.set(x, "deletedMessageId", js.undefined)
  }
}
