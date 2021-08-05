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
  
  inline def apply(): HmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKeyMetadata]
  }
  
  extension [Self <: HmacKeyMetadata](x: Self) {
    
    inline def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
    
    inline def setAccessIdUndefined: Self = StObject.set(x, "accessId", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
