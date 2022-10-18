package typings.nano.mod

import typings.nano.nanoStrings.continuous
import typings.nano.nanoStrings.eventsource
import typings.nano.nanoStrings.longpoll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global changes feed paramters.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates} */
trait UpdatesParams extends StObject {
  
  var feed: longpoll | continuous | eventsource
  
  var heartbeat: Boolean
  
  var since: String
  
  var timeout: Double
}
object UpdatesParams {
  
  inline def apply(feed: longpoll | continuous | eventsource, heartbeat: Boolean, since: String, timeout: Double): UpdatesParams = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatesParams]
  }
  
  extension [Self <: UpdatesParams](x: Self) {
    
    inline def setFeed(value: longpoll | continuous | eventsource): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def setHeartbeat(value: Boolean): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
