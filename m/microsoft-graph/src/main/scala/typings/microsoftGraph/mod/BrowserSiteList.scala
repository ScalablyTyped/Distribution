package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSiteList
  extends StObject
     with Entity {
  
  // The description of the site list.
  var description: js.UndefOr[String] = js.undefined
  
  // The name of the site list.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The user who last modified the site list.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date and time when the site list was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The user who published the site list.
  var publishedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date and time when the site list was published.
  var publishedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The current revision of the site list.
  var revision: js.UndefOr[String] = js.undefined
  
  // A collection of shared cookies defined for the site list.
  var sharedCookies: js.UndefOr[NullableOption[js.Array[BrowserSharedCookie]]] = js.undefined
  
  // A collection of sites defined for the site list.
  var sites: js.UndefOr[NullableOption[js.Array[BrowserSite]]] = js.undefined
  
  // The current status of the site list. The possible values are: draft, published, pending, unknownFutureValue.
  var status: js.UndefOr[BrowserSiteListStatus] = js.undefined
}
object BrowserSiteList {
  
  inline def apply(): BrowserSiteList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSiteList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSiteList] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPublishedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "publishedBy", value.asInstanceOf[js.Any])
    
    inline def setPublishedByNull: Self = StObject.set(x, "publishedBy", null)
    
    inline def setPublishedByUndefined: Self = StObject.set(x, "publishedBy", js.undefined)
    
    inline def setPublishedDateTime(value: NullableOption[String]): Self = StObject.set(x, "publishedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedDateTimeNull: Self = StObject.set(x, "publishedDateTime", null)
    
    inline def setPublishedDateTimeUndefined: Self = StObject.set(x, "publishedDateTime", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setSharedCookies(value: NullableOption[js.Array[BrowserSharedCookie]]): Self = StObject.set(x, "sharedCookies", value.asInstanceOf[js.Any])
    
    inline def setSharedCookiesNull: Self = StObject.set(x, "sharedCookies", null)
    
    inline def setSharedCookiesUndefined: Self = StObject.set(x, "sharedCookies", js.undefined)
    
    inline def setSharedCookiesVarargs(value: BrowserSharedCookie*): Self = StObject.set(x, "sharedCookies", js.Array(value*))
    
    inline def setSites(value: NullableOption[js.Array[BrowserSite]]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesNull: Self = StObject.set(x, "sites", null)
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: BrowserSite*): Self = StObject.set(x, "sites", js.Array(value*))
    
    inline def setStatus(value: BrowserSiteListStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
