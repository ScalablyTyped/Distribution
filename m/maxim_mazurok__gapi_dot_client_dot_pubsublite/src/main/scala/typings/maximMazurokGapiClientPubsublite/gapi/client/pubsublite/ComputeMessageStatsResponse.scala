package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeMessageStatsResponse extends StObject {
  
  /** The number of quota bytes accounted to these messages. */
  var messageBytes: js.UndefOr[String] = js.undefined
  
  /** The count of messages. */
  var messageCount: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum event timestamp across these messages. For the purposes of this computation, if a message does not have an event time, we use the publish time. The timestamp will be
    * unset if there are no messages.
    */
  var minimumEventTime: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum publish timestamp across these messages. Note that publish timestamps within a partition are not guaranteed to be non-decreasing. The timestamp will be unset if there
    * are no messages.
    */
  var minimumPublishTime: js.UndefOr[String] = js.undefined
}
object ComputeMessageStatsResponse {
  
  inline def apply(): ComputeMessageStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeMessageStatsResponse]
  }
  
  extension [Self <: ComputeMessageStatsResponse](x: Self) {
    
    inline def setMessageBytes(value: String): Self = StObject.set(x, "messageBytes", value.asInstanceOf[js.Any])
    
    inline def setMessageBytesUndefined: Self = StObject.set(x, "messageBytes", js.undefined)
    
    inline def setMessageCount(value: String): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    
    inline def setMessageCountUndefined: Self = StObject.set(x, "messageCount", js.undefined)
    
    inline def setMinimumEventTime(value: String): Self = StObject.set(x, "minimumEventTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumEventTimeUndefined: Self = StObject.set(x, "minimumEventTime", js.undefined)
    
    inline def setMinimumPublishTime(value: String): Self = StObject.set(x, "minimumPublishTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumPublishTimeUndefined: Self = StObject.set(x, "minimumPublishTime", js.undefined)
  }
}
