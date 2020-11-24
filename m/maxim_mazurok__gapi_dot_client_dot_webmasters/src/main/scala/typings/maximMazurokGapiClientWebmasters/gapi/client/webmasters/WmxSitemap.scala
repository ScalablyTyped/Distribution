package typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WmxSitemap extends js.Object {
  
  /** The various content types in the sitemap. */
  var contents: js.UndefOr[js.Array[WmxSitemapContent]] = js.native
  
  /** Number of errors in the sitemap. These are issues with the sitemap itself that need to be fixed before it can be processed correctly. */
  var errors: js.UndefOr[String] = js.native
  
  /** If true, the sitemap has not been processed. */
  var isPending: js.UndefOr[Boolean] = js.native
  
  /** If true, the sitemap is a collection of sitemaps. */
  var isSitemapsIndex: js.UndefOr[Boolean] = js.native
  
  /** Date & time in which this sitemap was last downloaded. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastDownloaded: js.UndefOr[String] = js.native
  
  /** Date & time in which this sitemap was submitted. Date format is in RFC 3339 format (yyyy-mm-dd). */
  var lastSubmitted: js.UndefOr[String] = js.native
  
  /** The url of the sitemap. */
  var path: js.UndefOr[String] = js.native
  
  /** The type of the sitemap. For example: rssFeed. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Number of warnings for the sitemap. These are generally non-critical issues with URLs in the sitemaps. */
  var warnings: js.UndefOr[String] = js.native
}
object WmxSitemap {
  
  @scala.inline
  def apply(): WmxSitemap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSitemap]
  }
  
  @scala.inline
  implicit class WmxSitemapOps[Self <: WmxSitemap] (val x: Self) extends AnyVal {
    
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
    def setContentsVarargs(value: WmxSitemapContent*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[WmxSitemapContent]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setErrors(value: String): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setIsPending(value: Boolean): Self = this.set("isPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPending: Self = this.set("isPending", js.undefined)
    
    @scala.inline
    def setIsSitemapsIndex(value: Boolean): Self = this.set("isSitemapsIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSitemapsIndex: Self = this.set("isSitemapsIndex", js.undefined)
    
    @scala.inline
    def setLastDownloaded(value: String): Self = this.set("lastDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDownloaded: Self = this.set("lastDownloaded", js.undefined)
    
    @scala.inline
    def setLastSubmitted(value: String): Self = this.set("lastSubmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSubmitted: Self = this.set("lastSubmitted", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWarnings(value: String): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
