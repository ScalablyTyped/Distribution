package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.mod.CommsConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  var client: CommsConnection
  
  var topic: String
}
object Topic {
  
  @scala.inline
  def apply(client: CommsConnection, topic: String): Topic = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  @scala.inline
  implicit class TopicMutableBuilder[Self <: Topic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: CommsConnection): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
