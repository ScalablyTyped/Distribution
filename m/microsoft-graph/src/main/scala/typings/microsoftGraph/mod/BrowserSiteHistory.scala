package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSiteHistory extends StObject {
  
  /**
    * Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or
    * Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
    */
  var allowRedirect: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The comment for the site.
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Controls what compatibility setting is used for specific sites or domains. The possible values are: default,
    * internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9,
    * internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
    */
  var compatibilityMode: js.UndefOr[NullableOption[BrowserSiteCompatibilityMode]] = js.undefined
  
  // The user who last modified the site.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
  var mergeType: js.UndefOr[NullableOption[BrowserSiteMergeType]] = js.undefined
  
  // The date and time when the site was last published.
  var publishedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11,
    * microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow
    * opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15,
    * 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the
    * internetExplorerMode option.
    */
  var targetEnvironment: js.UndefOr[NullableOption[BrowserSiteTargetEnvironment]] = js.undefined
}
object BrowserSiteHistory {
  
  inline def apply(): BrowserSiteHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSiteHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSiteHistory] (val x: Self) extends AnyVal {
    
    inline def setAllowRedirect(value: NullableOption[Boolean]): Self = StObject.set(x, "allowRedirect", value.asInstanceOf[js.Any])
    
    inline def setAllowRedirectNull: Self = StObject.set(x, "allowRedirect", null)
    
    inline def setAllowRedirectUndefined: Self = StObject.set(x, "allowRedirect", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCompatibilityMode(value: NullableOption[BrowserSiteCompatibilityMode]): Self = StObject.set(x, "compatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityModeNull: Self = StObject.set(x, "compatibilityMode", null)
    
    inline def setCompatibilityModeUndefined: Self = StObject.set(x, "compatibilityMode", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setMergeType(value: NullableOption[BrowserSiteMergeType]): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    inline def setMergeTypeNull: Self = StObject.set(x, "mergeType", null)
    
    inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    inline def setPublishedDateTime(value: String): Self = StObject.set(x, "publishedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPublishedDateTimeUndefined: Self = StObject.set(x, "publishedDateTime", js.undefined)
    
    inline def setTargetEnvironment(value: NullableOption[BrowserSiteTargetEnvironment]): Self = StObject.set(x, "targetEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTargetEnvironmentNull: Self = StObject.set(x, "targetEnvironment", null)
    
    inline def setTargetEnvironmentUndefined: Self = StObject.set(x, "targetEnvironment", js.undefined)
  }
}
