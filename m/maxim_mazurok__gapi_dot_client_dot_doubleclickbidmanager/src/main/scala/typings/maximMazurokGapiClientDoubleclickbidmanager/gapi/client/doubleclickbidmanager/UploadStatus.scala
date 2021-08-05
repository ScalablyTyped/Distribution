package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadStatus extends StObject {
  
  /** Reasons why upload can't be completed. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Per-row upload status. */
  var rowStatus: js.UndefOr[js.Array[RowStatus]] = js.undefined
}
object UploadStatus {
  
  inline def apply(): UploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadStatus]
  }
  
  extension [Self <: UploadStatus](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setRowStatus(value: js.Array[RowStatus]): Self = StObject.set(x, "rowStatus", value.asInstanceOf[js.Any])
    
    inline def setRowStatusUndefined: Self = StObject.set(x, "rowStatus", js.undefined)
    
    inline def setRowStatusVarargs(value: RowStatus*): Self = StObject.set(x, "rowStatus", js.Array(value :_*))
  }
}
