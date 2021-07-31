package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastSeenObjectIdEventDataType extends StObject {
  
  var lastSeenObjectId: Double
  
  var timestamp: Double
}
object LastSeenObjectIdEventDataType {
  
  @scala.inline
  def apply(lastSeenObjectId: Double, timestamp: Double): LastSeenObjectIdEventDataType = {
    val __obj = js.Dynamic.literal(lastSeenObjectId = lastSeenObjectId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSeenObjectIdEventDataType]
  }
  
  @scala.inline
  implicit class LastSeenObjectIdEventDataTypeMutableBuilder[Self <: LastSeenObjectIdEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSeenObjectId(value: Double): Self = StObject.set(x, "lastSeenObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
