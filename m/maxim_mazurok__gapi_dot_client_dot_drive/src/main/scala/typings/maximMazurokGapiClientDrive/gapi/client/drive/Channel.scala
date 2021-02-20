package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends StObject {
  
  /** The address where notifications are delivered for this channel. */
  var address: js.UndefOr[String] = js.native
  
  /** Date and time of notification channel expiration, expressed as a Unix timestamp, in milliseconds. Optional. */
  var expiration: js.UndefOr[String] = js.native
  
  /** A UUID or similar unique string that identifies this channel. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies this as a notification channel used to watch for changes to a resource, which is "api#channel". */
  var kind: js.UndefOr[String] = js.native
  
  /** Additional parameters controlling delivery channel behavior. Optional. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.Channel with TopLevel[js.Any]
  ] = js.native
  
  /** A Boolean value to indicate whether payload is wanted. Optional. */
  var payload: js.UndefOr[Boolean] = js.native
  
  /** An opaque ID that identifies the resource being watched on this channel. Stable across different API versions. */
  var resourceId: js.UndefOr[String] = js.native
  
  /** A version-specific identifier for the watched resource. */
  var resourceUri: js.UndefOr[String] = js.native
  
  /** An arbitrary string delivered to the target address with each notification delivered over this channel. Optional. */
  var token: js.UndefOr[String] = js.native
  
  /** The type of delivery mechanism used for this channel. */
  var `type`: js.UndefOr[String] = js.native
}
object Channel {
  
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.Channel with TopLevel[js.Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
