package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeTarget extends StObject {
  
  /**
    * Request the cursor of the first message with event time greater than or equal to `event_time`. If messages are missing an event time, the publish time is used as a fallback. As
    * event times are user supplied, subsequent messages may have event times less than `event_time` and should be filtered by the client, if necessary.
    */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /** Request the cursor of the first message with publish time greater than or equal to `publish_time`. All messages thereafter are guaranteed to have publish times >= `publish_time`. */
  var publishTime: js.UndefOr[String] = js.undefined
}
object TimeTarget {
  
  inline def apply(): TimeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeTarget] (val x: Self) extends AnyVal {
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
