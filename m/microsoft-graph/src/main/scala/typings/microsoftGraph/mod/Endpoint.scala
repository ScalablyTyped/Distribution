package typings.microsoftGraph.mod

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
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapability(value: String): Self = this.set("capability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapability: Self = this.set("capability", js.undefined)
    
    @scala.inline
    def setProviderId(value: NullableOption[String]): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
    
    @scala.inline
    def setProviderIdNull: Self = this.set("providerId", null)
    
    @scala.inline
    def setProviderName(value: NullableOption[String]): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setProviderNameNull: Self = this.set("providerName", null)
    
    @scala.inline
    def setProviderResourceId(value: NullableOption[String]): Self = this.set("providerResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderResourceId: Self = this.set("providerResourceId", js.undefined)
    
    @scala.inline
    def setProviderResourceIdNull: Self = this.set("providerResourceId", null)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
