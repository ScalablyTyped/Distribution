package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPartitions extends StObject {
  
  /** The number of partitions in the topic. */
  var partitionCount: js.UndefOr[String] = js.undefined
}
object TopicPartitions {
  
  inline def apply(): TopicPartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicPartitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicPartitions] (val x: Self) extends AnyVal {
    
    inline def setPartitionCount(value: String): Self = StObject.set(x, "partitionCount", value.asInstanceOf[js.Any])
    
    inline def setPartitionCountUndefined: Self = StObject.set(x, "partitionCount", js.undefined)
  }
}
