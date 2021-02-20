package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends Entity {
  
  // The start time of the operation.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The time of the last action of the operation.
  var lastActionDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The current status of the operation: notStarted, running, completed, failed
  var status: js.UndefOr[NullableOption[OperationStatus]] = js.native
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setLastActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActionDateTimeNull: Self = StObject.set(x, "lastActionDateTime", null)
    
    @scala.inline
    def setLastActionDateTimeUndefined: Self = StObject.set(x, "lastActionDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[OperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
