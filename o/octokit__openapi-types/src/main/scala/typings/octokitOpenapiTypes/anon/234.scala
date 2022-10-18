package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `234` extends StObject {
  
  /** The unique identifier of the installation. */
  var installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
}
object `234` {
  
  inline def apply(
    installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
  ): `234` = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`234`]
  }
  
  extension [Self <: `234`](x: Self) {
    
    inline def setInstallation_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
    ): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
  }
}
