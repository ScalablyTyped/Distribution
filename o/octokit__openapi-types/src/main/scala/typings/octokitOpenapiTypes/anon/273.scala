package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `273` extends StObject {
  
  /** The unique identifier of the gist. */
  var gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
}
object `273` {
  
  inline def apply(
    gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
  ): `273` = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`273`]
  }
  
  extension [Self <: `273`](x: Self) {
    
    inline def setGist_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
    ): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
