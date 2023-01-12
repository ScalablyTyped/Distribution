package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResult extends StObject {
  
  /** Finding matching the search request. */
  var finding: js.UndefOr[Finding] = js.undefined
  
  /** Output only. Resource that is associated with this finding. */
  var resource: js.UndefOr[Resource] = js.undefined
  
  /** State change of the finding between the points in time. */
  var stateChange: js.UndefOr[String] = js.undefined
}
object ListFindingsResult {
  
  inline def apply(): ListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFindingsResult] (val x: Self) extends AnyVal {
    
    inline def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
