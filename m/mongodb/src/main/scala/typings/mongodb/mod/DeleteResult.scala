package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResult extends StObject {
  
  /** Indicates whether this write result was acknowledged. If not, then all other members of this result will be undefined. */
  var acknowledged: Boolean
  
  /** The number of documents that were deleted */
  var deletedCount: scala.Double
}
object DeleteResult {
  
  inline def apply(acknowledged: Boolean, deletedCount: scala.Double): DeleteResult = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], deletedCount = deletedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResult] (val x: Self) extends AnyVal {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
  }
}
