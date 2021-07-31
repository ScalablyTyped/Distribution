package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationProgress extends StObject {
  
  /** If set, the time at which this operation failed or was completed successfully. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Percent completion of the operation. Values are between 0 and 100 inclusive. */
  var progressPercent: js.UndefOr[Double] = js.undefined
  
  /** Time the request was received. */
  var startTime: js.UndefOr[String] = js.undefined
}
object OperationProgress {
  
  @scala.inline
  def apply(): OperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationProgress]
  }
  
  @scala.inline
  implicit class OperationProgressMutableBuilder[Self <: OperationProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
