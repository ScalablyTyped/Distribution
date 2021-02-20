package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeScanningGetAlertDeprecatedAlertIdEndpoint extends StObject {
  
  /**
    * The code scanning alert number.
    *  @deprecated "alert_id" is deprecated. Use "alert_number" instead
    */
  var alert_id: js.UndefOr[Double] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object CodeScanningGetAlertDeprecatedAlertIdEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): CodeScanningGetAlertDeprecatedAlertIdEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningGetAlertDeprecatedAlertIdEndpoint]
  }
  
  @scala.inline
  implicit class CodeScanningGetAlertDeprecatedAlertIdEndpointMutableBuilder[Self <: CodeScanningGetAlertDeprecatedAlertIdEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlert_id(value: Double): Self = StObject.set(x, "alert_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlert_idUndefined: Self = StObject.set(x, "alert_id", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
