package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepoRequest extends StObject {
  
  /** The new configuration for the repository. */
  var repo: js.UndefOr[Repo] = js.native
  
  /** A FieldMask specifying which fields of the repo to modify. Only the fields in the mask will be modified. If no mask is provided, this request is no-op. */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateRepoRequest {
  
  @scala.inline
  def apply(): UpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRepoRequest]
  }
  
  @scala.inline
  implicit class UpdateRepoRequestMutableBuilder[Self <: UpdateRepoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepo(value: Repo): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
