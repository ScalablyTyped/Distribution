package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends DirectoryObject {
  
  /**
    * Describes the capability that is associated with this resource. (e.g. Messages, Conversations, etc.) Not nullable.
    * Read-only.
    */
  var capability: js.UndefOr[String] = js.native
  
  // Application id of the publishing underlying service. Not nullable. Read-only.
  var providerId: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the publishing underlying service. Read-only.
  var providerName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * For Microsoft 365 groups, this is set to a well-known name for the resource (e.g. Yammer.FeedURL etc.). Not nullable.
    * Read-only.
    */
  var providerResourceId: js.UndefOr[NullableOption[String]] = js.native
  
  // URL of the published resource. Not nullable. Read-only.
  var uri: js.UndefOr[String] = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapability(value: String): Self = StObject.set(x, "capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityUndefined: Self = StObject.set(x, "capability", js.undefined)
    
    @scala.inline
    def setProviderId(value: NullableOption[String]): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdNull: Self = StObject.set(x, "providerId", null)
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    @scala.inline
    def setProviderName(value: NullableOption[String]): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameNull: Self = StObject.set(x, "providerName", null)
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
    
    @scala.inline
    def setProviderResourceId(value: NullableOption[String]): Self = StObject.set(x, "providerResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderResourceIdNull: Self = StObject.set(x, "providerResourceId", null)
    
    @scala.inline
    def setProviderResourceIdUndefined: Self = StObject.set(x, "providerResourceId", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
