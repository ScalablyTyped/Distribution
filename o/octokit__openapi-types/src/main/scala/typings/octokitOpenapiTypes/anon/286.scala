package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `286` extends StObject {
  
  /** account_id parameter */
  var account_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['account-id'] */ js.Any
}
object `286` {
  
  inline def apply(
    account_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['account-id'] */ js.Any
  ): `286` = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`286`]
  }
  
  extension [Self <: `286`](x: Self) {
    
    inline def setAccount_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['account-id'] */ js.Any
    ): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
