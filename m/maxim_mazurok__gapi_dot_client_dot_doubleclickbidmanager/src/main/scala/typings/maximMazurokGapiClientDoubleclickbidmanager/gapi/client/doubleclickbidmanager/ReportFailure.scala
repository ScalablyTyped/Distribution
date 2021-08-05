package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportFailure extends StObject {
  
  /** Error code that shows why the report was not created. */
  var errorCode: js.UndefOr[String] = js.undefined
}
object ReportFailure {
  
  inline def apply(): ReportFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFailure]
  }
  
  extension [Self <: ReportFailure](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
