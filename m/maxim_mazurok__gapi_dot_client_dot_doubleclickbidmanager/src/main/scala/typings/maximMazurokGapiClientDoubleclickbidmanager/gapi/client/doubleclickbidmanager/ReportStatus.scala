package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportStatus extends StObject {
  
  /** If the report failed, this records the cause. */
  var failure: js.UndefOr[ReportFailure] = js.undefined
  
  /** The time when this report either completed successfully or failed. */
  var finishTimeMs: js.UndefOr[String] = js.undefined
  
  /** The file type of the report. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The state of the report. */
  var state: js.UndefOr[String] = js.undefined
}
object ReportStatus {
  
  inline def apply(): ReportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStatus]
  }
  
  extension [Self <: ReportStatus](x: Self) {
    
    inline def setFailure(value: ReportFailure): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setFinishTimeMs(value: String): Self = StObject.set(x, "finishTimeMs", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeMsUndefined: Self = StObject.set(x, "finishTimeMs", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
