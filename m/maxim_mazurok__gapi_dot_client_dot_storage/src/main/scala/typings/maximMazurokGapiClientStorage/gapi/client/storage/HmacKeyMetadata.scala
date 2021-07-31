package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacKeyMetadata extends StObject {
  
  /** The ID of the HMAC Key. */
  var accessId: js.UndefOr[String] = js.undefined
  
  /** HTTP 1.1 Entity tag for the HMAC key. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID of the HMAC key, including the Project ID and the Access ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Project ID owning the service account to which the key authenticates. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The link to this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The email address of the key's associated service account. */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /** The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The creation time of the HMAC key in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.undefined
  
  /** The last modification time of the HMAC key metadata in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.undefined
}
object HmacKeyMetadata {
  
  @scala.inline
  def apply(): HmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKeyMetadata]
  }
  
  @scala.inline
  implicit class HmacKeyMetadataMutableBuilder[Self <: HmacKeyMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessIdUndefined: Self = StObject.set(x, "accessId", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
