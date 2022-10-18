package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `615` extends StObject {
  
  /** The handle for the GitHub user account. */
  var username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
}
object `615` {
  
  inline def apply(
    username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
  ): `615` = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[`615`]
  }
  
  extension [Self <: `615`](x: Self) {
    
    inline def setUsername(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
    ): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
