package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherReviewStatus extends StObject {
  
  /** The publisher reviewing the creative. */
  var publisherName: js.UndefOr[String] = js.undefined
  
  /** Status of the publisher review. */
  var status: js.UndefOr[String] = js.undefined
}
object PublisherReviewStatus {
  
  inline def apply(): PublisherReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherReviewStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublisherReviewStatus] (val x: Self) extends AnyVal {
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
