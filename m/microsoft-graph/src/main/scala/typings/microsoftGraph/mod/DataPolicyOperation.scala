package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPolicyOperation extends Entity {
  
  /**
    * Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Null until the operation completes.
    */
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the progress of an operation.
  var progress: js.UndefOr[Double] = js.native
  
  // Possible values are: notStarted, running, complete, failed, unknownFutureValue.
  var status: js.UndefOr[NullableOption[DataPolicyOperationStatus]] = js.native
  
  // The URL location to where data is being exported for export requests.
  var storageLocation: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var submittedDateTime: js.UndefOr[String] = js.native
  
  // The id for the user on whom the operation is performed.
  var userId: js.UndefOr[String] = js.native
}
object DataPolicyOperation {
  
  @scala.inline
  def apply(): DataPolicyOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPolicyOperation]
  }
  
  @scala.inline
  implicit class DataPolicyOperationMutableBuilder[Self <: DataPolicyOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    @scala.inline
    def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[DataPolicyOperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStorageLocation(value: NullableOption[String]): Self = StObject.set(x, "storageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationNull: Self = StObject.set(x, "storageLocation", null)
    
    @scala.inline
    def setStorageLocationUndefined: Self = StObject.set(x, "storageLocation", js.undefined)
    
    @scala.inline
    def setSubmittedDateTime(value: String): Self = StObject.set(x, "submittedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedDateTimeUndefined: Self = StObject.set(x, "submittedDateTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
