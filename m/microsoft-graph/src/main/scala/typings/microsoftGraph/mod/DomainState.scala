package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainState extends StObject {
  
  /**
    * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the asynchronous
    * task starts, and when the operation completes.
    */
  var lastActionDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Type of asynchronous operation. The values can be ForceDelete or Verification
  var operation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Current status of the operation. Scheduled - Operation has been scheduled but has not started. InProgress - Task has
    * started and is in progress. Failed - Operation has failed.
    */
  var status: js.UndefOr[NullableOption[String]] = js.native
}
object DomainState {
  
  @scala.inline
  def apply(): DomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainState]
  }
  
  @scala.inline
  implicit class DomainStateMutableBuilder[Self <: DomainState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastActionDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActionDateTimeNull: Self = StObject.set(x, "lastActionDateTime", null)
    
    @scala.inline
    def setLastActionDateTimeUndefined: Self = StObject.set(x, "lastActionDateTime", js.undefined)
    
    @scala.inline
    def setOperation(value: NullableOption[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationNull: Self = StObject.set(x, "operation", null)
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
