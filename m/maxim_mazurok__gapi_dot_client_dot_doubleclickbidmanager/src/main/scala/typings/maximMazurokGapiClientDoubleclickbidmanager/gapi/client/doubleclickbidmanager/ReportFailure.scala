package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportFailure extends StObject {
  
  /** Error code that shows why the report was not created. */
  var errorCode: js.UndefOr[String] = js.native
}
object ReportFailure {
  
  @scala.inline
  def apply(): ReportFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFailure]
  }
  
  @scala.inline
  implicit class ReportFailureMutableBuilder[Self <: ReportFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
