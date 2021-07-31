package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTargetedSitesRequest extends StObject {
  
  /** A list of site URLs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted URLs in PretargetingConfig.webTargeting.values. */
  var sites: js.UndefOr[js.Array[String]] = js.undefined
}
object RemoveTargetedSitesRequest {
  
  @scala.inline
  def apply(): RemoveTargetedSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTargetedSitesRequest]
  }
  
  @scala.inline
  implicit class RemoveTargetedSitesRequestMutableBuilder[Self <: RemoveTargetedSitesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSites(value: js.Array[String]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: String*): Self = StObject.set(x, "sites", js.Array(value :_*))
  }
}
