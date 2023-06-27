package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses85 extends StObject {
  
  /**
    * Remove selected repository from an organization secret
    * @description Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: Responses85
  
  /**
    * Add selected repository to an organization secret
    * @description Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: Responses85
}
object DeleteResponses85 {
  
  inline def apply(delete: Responses85, put: Responses85): DeleteResponses85 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses85]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses85] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses85): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses85): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
