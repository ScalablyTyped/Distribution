package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSharedCookieHistory extends StObject {
  
  // The comment for the shared cookie.
  var comment: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the cookie.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Controls whether a cookie is a host-only or domain cookie.
  var hostOnly: js.UndefOr[Boolean] = js.undefined
  
  // The URL of the cookie.
  var hostOrDomain: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user who last modified the cookie.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  
  // The path of the cookie.
  var path: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time when the cookie was last published.
  var publishedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are:
    * microsoftEdge, internetExplorer11, both, unknownFutureValue.
    */
  var sourceEnvironment: js.UndefOr[NullableOption[BrowserSharedCookieSourceEnvironment]] = js.undefined
}
object BrowserSharedCookieHistory {
  
  inline def apply(): BrowserSharedCookieHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSharedCookieHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSharedCookieHistory] (val x: Self) extends AnyVal {
    
    inline def setComment(value: NullableOption[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
    
    inline def setHostOnlyUndefined: Self = StObject.set(x, "hostOnly", js.undefined)
    
    inline def setHostOrDomain(value: NullableOption[String]): Self = StObject.set(x, "hostOrDomain", value.asInstanceOf[js.Any])
    
    inline def setHostOrDomainNull: Self = StObject.set(x, "hostOrDomain", null)
    
    inline def setHostOrDomainUndefined: Self = StObject.set(x, "hostOrDomain", js.undefined)
    
    inline def setLastModifiedBy(value: IdentitySet): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPublishedDateTime(value: String): Self = StObject.set(x, "publishedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedDateTimeUndefined: Self = StObject.set(x, "publishedDateTime", js.undefined)
    
    inline def setSourceEnvironment(value: NullableOption[BrowserSharedCookieSourceEnvironment]): Self = StObject.set(x, "sourceEnvironment", value.asInstanceOf[js.Any])
    
    inline def setSourceEnvironmentNull: Self = StObject.set(x, "sourceEnvironment", null)
    
    inline def setSourceEnvironmentUndefined: Self = StObject.set(x, "sourceEnvironment", js.undefined)
  }
}
