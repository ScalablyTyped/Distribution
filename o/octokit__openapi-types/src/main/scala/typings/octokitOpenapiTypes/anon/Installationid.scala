package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Installationid extends StObject {
  
  var installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
}
object Installationid {
  
  inline def apply(
    installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
  ): Installationid = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Installationid] (val x: Self) extends AnyVal {
    
    inline def setInstallation_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
    ): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
  }
}
