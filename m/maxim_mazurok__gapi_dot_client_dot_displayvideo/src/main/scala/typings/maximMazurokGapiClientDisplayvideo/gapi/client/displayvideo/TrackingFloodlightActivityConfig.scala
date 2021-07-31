package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingFloodlightActivityConfig extends StObject {
  
  /** Required. The ID of the Floodlight activity. */
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  
  /** Required. The number of days after an ad has been clicked in which a conversion may be counted. Must be between 0 and 90 inclusive. */
  var postClickLookbackWindowDays: js.UndefOr[Double] = js.undefined
  
  /** Required. The number of days after an ad has been viewed in which a conversion may be counted. Must be between 0 and 90 inclusive. */
  var postViewLookbackWindowDays: js.UndefOr[Double] = js.undefined
}
object TrackingFloodlightActivityConfig {
  
  @scala.inline
  def apply(): TrackingFloodlightActivityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingFloodlightActivityConfig]
  }
  
  @scala.inline
  implicit class TrackingFloodlightActivityConfigMutableBuilder[Self <: TrackingFloodlightActivityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    @scala.inline
    def setPostClickLookbackWindowDays(value: Double): Self = StObject.set(x, "postClickLookbackWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostClickLookbackWindowDaysUndefined: Self = StObject.set(x, "postClickLookbackWindowDays", js.undefined)
    
    @scala.inline
    def setPostViewLookbackWindowDays(value: Double): Self = StObject.set(x, "postViewLookbackWindowDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostViewLookbackWindowDaysUndefined: Self = StObject.set(x, "postViewLookbackWindowDays", js.undefined)
  }
}
