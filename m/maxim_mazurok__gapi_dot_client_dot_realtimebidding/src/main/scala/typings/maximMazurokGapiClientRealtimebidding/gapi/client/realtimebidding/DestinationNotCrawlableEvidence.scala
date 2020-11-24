package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationNotCrawlableEvidence extends js.Object {
  
  /** Approximate time of the crawl. */
  var crawlTime: js.UndefOr[String] = js.native
  
  /** Destination URL that was attempted to be crawled. */
  var crawledUrl: js.UndefOr[String] = js.native
  
  /** Reason of destination not crawlable. */
  var reason: js.UndefOr[String] = js.native
}
object DestinationNotCrawlableEvidence {
  
  @scala.inline
  def apply(): DestinationNotCrawlableEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationNotCrawlableEvidence]
  }
  
  @scala.inline
  implicit class DestinationNotCrawlableEvidenceOps[Self <: DestinationNotCrawlableEvidence] (val x: Self) extends AnyVal {
    
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
    def setCrawlTime(value: String): Self = this.set("crawlTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlTime: Self = this.set("crawlTime", js.undefined)
    
    @scala.inline
    def setCrawledUrl(value: String): Self = this.set("crawledUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawledUrl: Self = this.set("crawledUrl", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
