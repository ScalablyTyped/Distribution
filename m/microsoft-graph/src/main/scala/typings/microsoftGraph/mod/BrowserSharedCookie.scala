package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSharedCookie
  extends StObject
     with Entity {
  
  // The comment for the shared cookie.
  var comment: js.UndefOr[String] = js.undefined
  
  // The date and time when the shared cookie was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The date and time when the shared cookie was deleted.
  var deletedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the cookie.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The history of modifications applied to the cookie.
  var history: js.UndefOr[js.Array[BrowserSharedCookieHistory]] = js.undefined
  
  // Controls whether a cookie is a host-only or domain cookie.
  var hostOnly: js.UndefOr[Boolean] = js.undefined
  
  // The URL of the cookie.
  var hostOrDomain: js.UndefOr[String] = js.undefined
  
  // The user who last modified the cookie.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date and time when the cookie was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The path of the cookie.
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are:
    * microsoftEdge, internetExplorer11, both, unknownFutureValue.
    */
  var sourceEnvironment: js.UndefOr[BrowserSharedCookieSourceEnvironment] = js.undefined
  
  /**
    * The status of the cookie. The possible values are: published, pendingAdd, pendingEdit, pendingDelete,
    * unknownFutureValue.
    */
  var status: js.UndefOr[BrowserSharedCookieStatus] = js.undefined
}
object BrowserSharedCookie {
  
  inline def apply(): BrowserSharedCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSharedCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSharedCookie] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDeletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeletedDateTimeNull: Self = StObject.set(x, "deletedDateTime", null)
    
    inline def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHistory(value: js.Array[BrowserSharedCookieHistory]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: BrowserSharedCookieHistory*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
    
    inline def setHostOnlyUndefined: Self = StObject.set(x, "hostOnly", js.undefined)
    
    inline def setHostOrDomain(value: String): Self = StObject.set(x, "hostOrDomain", value.asInstanceOf[js.Any])
    
    inline def setHostOrDomainUndefined: Self = StObject.set(x, "hostOrDomain", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSourceEnvironment(value: BrowserSharedCookieSourceEnvironment): Self = StObject.set(x, "sourceEnvironment", value.asInstanceOf[js.Any])
    
    inline def setSourceEnvironmentUndefined: Self = StObject.set(x, "sourceEnvironment", js.undefined)
    
    inline def setStatus(value: BrowserSharedCookieStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
