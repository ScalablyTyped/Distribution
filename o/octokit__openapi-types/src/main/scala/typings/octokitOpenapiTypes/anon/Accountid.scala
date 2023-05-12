package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accountid extends StObject {
  
  var account_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['account-id'] */ js.Any
}
object Accountid {
  
  inline def apply(
    account_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['account-id'] */ js.Any
  ): Accountid = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accountid] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['account-id'] */ js.Any
    ): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
