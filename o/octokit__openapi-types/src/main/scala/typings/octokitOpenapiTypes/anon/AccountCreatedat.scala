package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCreatedat extends StObject {
  
  var account: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  
  /**
    * Format: date-time
    * @example 2022-07-08T16:18:44-04:00
    */
  var created_at: String
  
  /**
    * @description Unique identifier of the request installation.
    * @example 42
    */
  var id: Double
  
  /** @example MDExOkludGVncmF0aW9uMQ== */
  var node_id: js.UndefOr[String] = js.undefined
  
  var requester: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
}
object AccountCreatedat {
  
  inline def apply(
    account: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any,
    created_at: String,
    id: Double,
    requester: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  ): AccountCreatedat = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCreatedat] (val x: Self) extends AnyVal {
    
    inline def setAccount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setRequester(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
  }
}
