package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPolicyOperation
  extends StObject
     with Entity {
  
  /**
    * Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For
    * example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
    */
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the progress of an operation.
  var progress: js.UndefOr[Double] = js.undefined
  
  // Possible values are: notStarted, running, complete, failed, unknownFutureValue.
  var status: js.UndefOr[NullableOption[DataPolicyOperationStatus]] = js.undefined
  
  // The URL location to where data is being exported for export requests.
  var storageLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var submittedDateTime: js.UndefOr[String] = js.undefined
  
  // The id for the user on whom the operation is performed.
  var userId: js.UndefOr[String] = js.undefined
}
object DataPolicyOperation {
  
  inline def apply(): DataPolicyOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPolicyOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPolicyOperation] (val x: Self) extends AnyVal {
    
    inline def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStatus(value: NullableOption[DataPolicyOperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorageLocation(value: NullableOption[String]): Self = StObject.set(x, "storageLocation", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationNull: Self = StObject.set(x, "storageLocation", null)
    
    inline def setStorageLocationUndefined: Self = StObject.set(x, "storageLocation", js.undefined)
    
    inline def setSubmittedDateTime(value: String): Self = StObject.set(x, "submittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDateTimeUndefined: Self = StObject.set(x, "submittedDateTime", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
