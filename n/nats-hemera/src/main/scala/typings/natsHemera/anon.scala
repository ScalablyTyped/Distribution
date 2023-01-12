package typings.natsHemera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ExpectedMessages extends StObject {
    
    var expectedMessages: Double
    
    var maxMessages: Double
    
    var pubsub: Boolean
    
    var topic: String
  }
  object ExpectedMessages {
    
    inline def apply(expectedMessages: Double, maxMessages: Double, pubsub: Boolean, topic: String): ExpectedMessages = {
      val __obj = js.Dynamic.literal(expectedMessages = expectedMessages.asInstanceOf[js.Any], maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpectedMessages] (val x: Self) extends AnyVal {
      
      inline def setExpectedMessages(value: Double): Self = StObject.set(x, "expectedMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setPubsub(value: Boolean): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxMessages extends StObject {
    
    var maxMessages: Double
    
    var pubsub: Boolean
    
    var queue: String
    
    var topic: String
  }
  object MaxMessages {
    
    inline def apply(maxMessages: Double, pubsub: Boolean, queue: String, topic: String): MaxMessages = {
      val __obj = js.Dynamic.literal(maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxMessages] (val x: Self) extends AnyVal {
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setPubsub(value: Boolean): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}
