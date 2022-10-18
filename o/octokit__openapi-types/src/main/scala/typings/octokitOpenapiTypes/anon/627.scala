package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `627` extends StObject {
  
  /** The unique identifier of the GPG key. */
  var gpg_key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gpg-key-id'] */ js.Any
}
object `627` {
  
  inline def apply(
    gpg_key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gpg-key-id'] */ js.Any
  ): `627` = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`627`]
  }
  
  extension [Self <: `627`](x: Self) {
    
    inline def setGpg_key_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gpg-key-id'] */ js.Any
    ): Self = StObject.set(x, "gpg_key_id", value.asInstanceOf[js.Any])
  }
}
