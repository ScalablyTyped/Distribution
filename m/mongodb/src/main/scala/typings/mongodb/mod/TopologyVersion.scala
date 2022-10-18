package typings.mongodb.mod

import typings.bson.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologyVersion extends StObject {
  
  var counter: typings.bson.mod.Long
  
  var processId: ObjectId
}
object TopologyVersion {
  
  inline def apply(counter: typings.bson.mod.Long, processId: ObjectId): TopologyVersion = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologyVersion]
  }
  
  extension [Self <: TopologyVersion](x: Self) {
    
    inline def setCounter(value: typings.bson.mod.Long): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: ObjectId): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
  }
}
