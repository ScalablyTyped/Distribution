package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#listReportsResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Next page's pagination token if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Retrieved reports. */
  var reports: js.UndefOr[js.Array[Report]] = js.undefined
}
object ListReportsResponse {
  
  inline def apply(): ListReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportsResponse]
  }
  
  extension [Self <: ListReportsResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReports(value: js.Array[Report]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: Report*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}
