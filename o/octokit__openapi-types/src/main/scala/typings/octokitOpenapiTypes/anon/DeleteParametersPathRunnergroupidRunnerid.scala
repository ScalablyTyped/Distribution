package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRunnergroupidRunnerid extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    *
    * Removes a self-hosted runner from a group configured in an organization. The runner is then returned to the default group.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathRunnergroupidRunnerid
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    *
    * Adds a self-hosted runner to a runner group configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org`
    * scope to use this endpoint.
    */
  var put: ParametersPathRunnergroupidRunnerid
}
object DeleteParametersPathRunnergroupidRunnerid {
  
  inline def apply(delete: ParametersPathRunnergroupidRunnerid, put: ParametersPathRunnergroupidRunnerid): DeleteParametersPathRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRunnergroupidRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathRunnergroupidRunnerid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRunnergroupidRunnerid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRunnergroupidRunnerid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
