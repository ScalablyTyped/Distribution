package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `619` extends StObject {
  
  /** The name of the secret. */
  var secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
}
object `619` {
  
  inline def apply(
    secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
  ): `619` = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`619`]
  }
  
  extension [Self <: `619`](x: Self) {
    
    inline def setSecret_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
    ): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
