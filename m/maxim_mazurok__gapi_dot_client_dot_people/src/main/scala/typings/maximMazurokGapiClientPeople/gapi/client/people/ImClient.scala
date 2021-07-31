package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImClient extends StObject {
  
  /** Output only. The protocol of the IM client formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedProtocol: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of the IM client translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /** Metadata about the IM client. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /**
    * The protocol of the IM client. The protocol can be custom or one of these predefined values: * `aim` * `msn` * `yahoo` * `skype` * `qq` * `googleTalk` * `icq` * `jabber` *
    * `netMeeting`
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /** The type of the IM client. The type can be custom or one of these predefined values: * `home` * `work` * `other` */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The user name used in the IM client. */
  var username: js.UndefOr[String] = js.undefined
}
object ImClient {
  
  @scala.inline
  def apply(): ImClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImClient]
  }
  
  @scala.inline
  implicit class ImClientMutableBuilder[Self <: ImClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedProtocol(value: String): Self = StObject.set(x, "formattedProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedProtocolUndefined: Self = StObject.set(x, "formattedProtocol", js.undefined)
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
