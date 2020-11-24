package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCrawledUrlsResponse extends js.Object {
  
  /** The list of CrawledUrls returned. */
  var crawledUrls: js.UndefOr[js.Array[CrawledUrl]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCrawledUrlsResponse {
  
  @scala.inline
  def apply(): ListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrawledUrlsResponse]
  }
  
  @scala.inline
  implicit class ListCrawledUrlsResponseOps[Self <: ListCrawledUrlsResponse] (val x: Self) extends AnyVal {
    
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
    def setCrawledUrlsVarargs(value: CrawledUrl*): Self = this.set("crawledUrls", js.Array(value :_*))
    
    @scala.inline
    def setCrawledUrls(value: js.Array[CrawledUrl]): Self = this.set("crawledUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawledUrls: Self = this.set("crawledUrls", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
