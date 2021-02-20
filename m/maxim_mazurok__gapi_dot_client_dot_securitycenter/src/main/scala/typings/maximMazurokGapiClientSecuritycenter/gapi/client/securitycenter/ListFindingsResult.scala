package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsResult extends StObject {
  
  /** Finding matching the search request. */
  var finding: js.UndefOr[Finding] = js.native
  
  /** Output only. Resource that is associated with this finding. */
  var resource: js.UndefOr[Resource] = js.native
  
  /** State change of the finding between the points in time. */
  var stateChange: js.UndefOr[String] = js.native
}
object ListFindingsResult {
  
  @scala.inline
  def apply(): ListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResult]
  }
  
  @scala.inline
  implicit class ListFindingsResultMutableBuilder[Self <: ListFindingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
