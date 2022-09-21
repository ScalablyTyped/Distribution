package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportStatus extends StObject {
  
  /** Output only. The time when this report either completed successfully or failed. */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /** The file type of the report. */
  var format: js.UndefOr[String] = js.undefined
  
  /** Output only. The state of the report. */
  var state: js.UndefOr[String] = js.undefined
}
object ReportStatus {
  
  inline def apply(): ReportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStatus]
  }
  
  extension [Self <: ReportStatus](x: Self) {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
