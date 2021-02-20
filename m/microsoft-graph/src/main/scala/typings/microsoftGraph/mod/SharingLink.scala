package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharingLink extends StObject {
  
  // The app the link is associated with.
  var application: js.UndefOr[NullableOption[Identity]] = js.native
  
  /**
    * If true then the user can only use this link to view the item on the web, and cannot use it to download the contents of
    * the item. Only for OneDrive for Business and SharePoint.
    */
  var preventsDownload: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone,
    * organization indicates the link is only usable for users signed into the same tenant.
    */
  var scope: js.UndefOr[NullableOption[String]] = js.native
  
  // The type of the link created.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * For embed links, this property contains the HTML code for an &amp;lt;iframe&amp;gt; element that will embed the item in
    * a webpage.
    */
  var webHtml: js.UndefOr[NullableOption[String]] = js.native
  
  // A URL that opens the item in the browser on the OneDrive website.
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
}
object SharingLink {
  
  @scala.inline
  def apply(): SharingLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingLink]
  }
  
  @scala.inline
  implicit class SharingLinkMutableBuilder[Self <: SharingLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: NullableOption[Identity]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNull: Self = StObject.set(x, "application", null)
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setPreventsDownload(value: NullableOption[Boolean]): Self = StObject.set(x, "preventsDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventsDownloadNull: Self = StObject.set(x, "preventsDownload", null)
    
    @scala.inline
    def setPreventsDownloadUndefined: Self = StObject.set(x, "preventsDownload", js.undefined)
    
    @scala.inline
    def setScope(value: NullableOption[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNull: Self = StObject.set(x, "scope", null)
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWebHtml(value: NullableOption[String]): Self = StObject.set(x, "webHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebHtmlNull: Self = StObject.set(x, "webHtml", null)
    
    @scala.inline
    def setWebHtmlUndefined: Self = StObject.set(x, "webHtml", js.undefined)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
