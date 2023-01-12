package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopologyVersion extends StObject {
  
  var counter: typings.bson.mod.Long
  
  var processId: typings.bson.mod.ObjectId
}
object TopologyVersion {
  
  inline def apply(counter: typings.bson.mod.Long, processId: typings.bson.mod.ObjectId): TopologyVersion = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologyVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopologyVersion] (val x: Self) extends AnyVal {
    
    inline def setCounter(value: typings.bson.mod.Long): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
  }
}
