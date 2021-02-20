package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadStatus extends StObject {
  
  /** Reasons why upload can't be completed. */
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  /** Per-row upload status. */
  var rowStatus: js.UndefOr[js.Array[RowStatus]] = js.native
}
object UploadStatus {
  
  @scala.inline
  def apply(): UploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadStatus]
  }
  
  @scala.inline
  implicit class UploadStatusMutableBuilder[Self <: UploadStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setRowStatus(value: js.Array[RowStatus]): Self = StObject.set(x, "rowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStatusUndefined: Self = StObject.set(x, "rowStatus", js.undefined)
    
    @scala.inline
    def setRowStatusVarargs(value: RowStatus*): Self = StObject.set(x, "rowStatus", js.Array(value :_*))
  }
}
