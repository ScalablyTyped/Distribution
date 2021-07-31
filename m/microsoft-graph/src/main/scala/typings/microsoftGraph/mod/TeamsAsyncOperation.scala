package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAsyncOperation
  extends StObject
     with Entity {
  
  // Number of times the operation was attempted before being marked successful or failed.
  var attemptsCount: js.UndefOr[Double] = js.undefined
  
  // Time when the operation was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Any error that causes the async operation to fail.
  var error: js.UndefOr[NullableOption[OperationError]] = js.undefined
  
  // Time when the async operation was last updated.
  var lastActionDateTime: js.UndefOr[String] = js.undefined
  
  // Denotes which type of operation is being described.
  var operationType: js.UndefOr[TeamsAsyncOperationType] = js.undefined
  
  // Operation status.
  var status: js.UndefOr[TeamsAsyncOperationStatus] = js.undefined
  
  // The ID of the object that's created or modified as result of this async operation, typically a team.
  var targetResourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The location of the object that's created or modified as result of this async operation. This URL should be treated as
    * an opaque value and not parsed into its component paths.
    */
  var targetResourceLocation: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsAsyncOperation {
  
  @scala.inline
  def apply(): TeamsAsyncOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAsyncOperation]
  }
  
  @scala.inline
  implicit class TeamsAsyncOperationMutableBuilder[Self <: TeamsAsyncOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptsCount(value: Double): Self = StObject.set(x, "attemptsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptsCountUndefined: Self = StObject.set(x, "attemptsCount", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setError(value: NullableOption[OperationError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setLastActionDateTime(value: String): Self = StObject.set(x, "lastActionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActionDateTimeUndefined: Self = StObject.set(x, "lastActionDateTime", js.undefined)
    
    @scala.inline
    def setOperationType(value: TeamsAsyncOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setStatus(value: TeamsAsyncOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetResourceId(value: NullableOption[String]): Self = StObject.set(x, "targetResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourceIdNull: Self = StObject.set(x, "targetResourceId", null)
    
    @scala.inline
    def setTargetResourceIdUndefined: Self = StObject.set(x, "targetResourceId", js.undefined)
    
    @scala.inline
    def setTargetResourceLocation(value: NullableOption[String]): Self = StObject.set(x, "targetResourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetResourceLocationNull: Self = StObject.set(x, "targetResourceLocation", null)
    
    @scala.inline
    def setTargetResourceLocationUndefined: Self = StObject.set(x, "targetResourceLocation", js.undefined)
  }
}
