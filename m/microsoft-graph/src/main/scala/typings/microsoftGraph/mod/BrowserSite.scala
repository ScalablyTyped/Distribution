package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSite
  extends StObject
     with Entity {
  
  /**
    * Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or
    * Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
    */
  var allowRedirect: js.UndefOr[Boolean] = js.undefined
  
  // The comment for the site.
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Controls what compatibility setting is used for specific sites or domains. The possible values are: default,
    * internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9,
    * internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
    */
  var compatibilityMode: js.UndefOr[BrowserSiteCompatibilityMode] = js.undefined
  
  // The date and time when the site was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The date and time when the site was deleted.
  var deletedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The history of modifications applied to the site.
  var history: js.UndefOr[js.Array[BrowserSiteHistory]] = js.undefined
  
  // The user who last modified the site.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date and time when the site was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
  var mergeType: js.UndefOr[BrowserSiteMergeType] = js.undefined
  
  /**
    * Indicates the status of the site. The possible values are: published, pendingAdd, pendingEdit, pendingDelete,
    * unknownFutureValue.
    */
  var status: js.UndefOr[BrowserSiteStatus] = js.undefined
  
  /**
    * The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11,
    * microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow
    * opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15,
    * 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the
    * internetExplorerMode option.
    */
  var targetEnvironment: js.UndefOr[BrowserSiteTargetEnvironment] = js.undefined
  
  // The URL of the site.
  var webUrl: js.UndefOr[String] = js.undefined
}
object BrowserSite {
  
  inline def apply(): BrowserSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSite] (val x: Self) extends AnyVal {
    
    inline def setAllowRedirect(value: Boolean): Self = StObject.set(x, "allowRedirect", value.asInstanceOf[js.Any])
    
    inline def setAllowRedirectUndefined: Self = StObject.set(x, "allowRedirect", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCompatibilityMode(value: BrowserSiteCompatibilityMode): Self = StObject.set(x, "compatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityModeUndefined: Self = StObject.set(x, "compatibilityMode", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDeletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeletedDateTimeNull: Self = StObject.set(x, "deletedDateTime", null)
    
    inline def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
    
    inline def setHistory(value: js.Array[BrowserSiteHistory]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: BrowserSiteHistory*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setMergeType(value: BrowserSiteMergeType): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    inline def setStatus(value: BrowserSiteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetEnvironment(value: BrowserSiteTargetEnvironment): Self = StObject.set(x, "targetEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTargetEnvironmentUndefined: Self = StObject.set(x, "targetEnvironment", js.undefined)
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
