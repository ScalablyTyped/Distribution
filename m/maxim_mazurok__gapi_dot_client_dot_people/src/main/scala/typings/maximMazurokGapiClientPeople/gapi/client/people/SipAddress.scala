package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipAddress extends StObject {
  
  /** Output only. The type of the SIP address translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale. */
  var formattedType: js.UndefOr[String] = js.native
  
  /** Metadata about the SIP address. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The type of the SIP address. The type can be custom or or one of these predefined values: * `home` * `work` * `mobile` * `other` */
  var `type`: js.UndefOr[String] = js.native
  
  /** The SIP address in the [RFC 3261 19.1](https://tools.ietf.org/html/rfc3261#section-19.1) SIP URI format. */
  var value: js.UndefOr[String] = js.native
}
object SipAddress {
  
  @scala.inline
  def apply(): SipAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipAddress]
  }
  
  @scala.inline
  implicit class SipAddressMutableBuilder[Self <: SipAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
