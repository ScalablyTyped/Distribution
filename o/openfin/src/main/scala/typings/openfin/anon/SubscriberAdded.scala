package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriberAdded extends StObject {
  
  var subscriberAdded: String
  
  var subscriberRemoved: String
}
object SubscriberAdded {
  
  inline def apply(subscriberAdded: String, subscriberRemoved: String): SubscriberAdded = {
    val __obj = js.Dynamic.literal(subscriberAdded = subscriberAdded.asInstanceOf[js.Any], subscriberRemoved = subscriberRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdded]
  }
  
  extension [Self <: SubscriberAdded](x: Self) {
    
    inline def setSubscriberAdded(value: String): Self = StObject.set(x, "subscriberAdded", value.asInstanceOf[js.Any])
    
    inline def setSubscriberRemoved(value: String): Self = StObject.set(x, "subscriberRemoved", value.asInstanceOf[js.Any])
  }
}
