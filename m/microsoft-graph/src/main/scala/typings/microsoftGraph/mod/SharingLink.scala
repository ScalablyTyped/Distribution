package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharingLink extends js.Object {
  
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
  implicit class SharingLinkOps[Self <: SharingLink] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: NullableOption[Identity]): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    
    @scala.inline
    def setPreventsDownload(value: NullableOption[Boolean]): Self = this.set("preventsDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventsDownload: Self = this.set("preventsDownload", js.undefined)
    
    @scala.inline
    def setPreventsDownloadNull: Self = this.set("preventsDownload", null)
    
    @scala.inline
    def setScope(value: NullableOption[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setWebHtml(value: NullableOption[String]): Self = this.set("webHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebHtml: Self = this.set("webHtml", js.undefined)
    
    @scala.inline
    def setWebHtmlNull: Self = this.set("webHtml", null)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
    
    @scala.inline
    def setWebUrlNull: Self = this.set("webUrl", null)
  }
}
