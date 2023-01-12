package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewHistoryInstance
  extends StObject
     with Entity {
  
  /**
    * Uri which can be used to retrieve review history data. This URI will be active for 24 hours after being generated.
    * Required.
    */
  var downloadUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp when this instance and associated data expires and the history is deleted. Required.
  var expirationDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp when all of the available data for this instance was collected. This will be set after this instance's status
    * is set to done. Required.
    */
  var fulfilledDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp, reviews ending on or before this date will be included in the fetched history data.
  var reviewHistoryPeriodEndDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp, reviews starting on or after this date will be included in the fetched history data.
  var reviewHistoryPeriodStartDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp when the instance's history data is scheduled to be generated.
  var runDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the status of the review history data collection. The possible values are: done, inProgress, error,
    * requested, unknownFutureValue. Once the status has been marked as done, a link can be generated to retrieve the
    * instance's data by calling generateDownloadUri method.
    */
  var status: js.UndefOr[NullableOption[AccessReviewHistoryStatus]] = js.undefined
}
object AccessReviewHistoryInstance {
  
  inline def apply(): AccessReviewHistoryInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewHistoryInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewHistoryInstance] (val x: Self) extends AnyVal {
    
    inline def setDownloadUri(value: NullableOption[String]): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriNull: Self = StObject.set(x, "downloadUri", null)
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
    
    inline def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setFulfilledDateTime(value: NullableOption[String]): Self = StObject.set(x, "fulfilledDateTime", value.asInstanceOf[js.Any])
    
    inline def setFulfilledDateTimeNull: Self = StObject.set(x, "fulfilledDateTime", null)
    
    inline def setFulfilledDateTimeUndefined: Self = StObject.set(x, "fulfilledDateTime", js.undefined)
    
    inline def setReviewHistoryPeriodEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "reviewHistoryPeriodEndDateTime", value.asInstanceOf[js.Any])
    
    inline def setReviewHistoryPeriodEndDateTimeNull: Self = StObject.set(x, "reviewHistoryPeriodEndDateTime", null)
    
    inline def setReviewHistoryPeriodEndDateTimeUndefined: Self = StObject.set(x, "reviewHistoryPeriodEndDateTime", js.undefined)
    
    inline def setReviewHistoryPeriodStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "reviewHistoryPeriodStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setReviewHistoryPeriodStartDateTimeNull: Self = StObject.set(x, "reviewHistoryPeriodStartDateTime", null)
    
    inline def setReviewHistoryPeriodStartDateTimeUndefined: Self = StObject.set(x, "reviewHistoryPeriodStartDateTime", js.undefined)
    
    inline def setRunDateTime(value: String): Self = StObject.set(x, "runDateTime", value.asInstanceOf[js.Any])
    
    inline def setRunDateTimeUndefined: Self = StObject.set(x, "runDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[AccessReviewHistoryStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
