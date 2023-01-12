package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRepoRequest extends StObject {
  
  /** The new configuration for the repository. */
  var repo: js.UndefOr[Repo] = js.undefined
  
  /** A FieldMask specifying which fields of the repo to modify. Only the fields in the mask will be modified. If no mask is provided, this request is no-op. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateRepoRequest {
  
  inline def apply(): UpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRepoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRepoRequest] (val x: Self) extends AnyVal {
    
    inline def setRepo(value: Repo): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
