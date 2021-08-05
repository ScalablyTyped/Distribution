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
  
  inline def apply(client: CommsConnection, topic: String): Topic = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  extension [Self <: Topic](x: Self) {
    
    inline def setClient(value: CommsConnection): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
