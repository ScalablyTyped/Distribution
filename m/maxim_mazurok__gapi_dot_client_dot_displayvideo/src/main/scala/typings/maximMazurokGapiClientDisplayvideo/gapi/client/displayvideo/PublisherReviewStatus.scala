package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherReviewStatus extends StObject {
  
  /** The publisher reviewing the creative. */
  var publisherName: js.UndefOr[String] = js.native
  
  /** Status of the publisher review. */
  var status: js.UndefOr[String] = js.native
}
object PublisherReviewStatus {
  
  @scala.inline
  def apply(): PublisherReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherReviewStatus]
  }
  
  @scala.inline
  implicit class PublisherReviewStatusMutableBuilder[Self <: PublisherReviewStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
