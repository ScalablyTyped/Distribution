package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationscimjson extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['basic-error'] */ js.Any
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['scim-error'] */ js.Any
}
object ApplicationjsonApplicationscimjson {
  
  inline def apply(
    applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['basic-error'] */ js.Any,
    applicationSlashscimPlussignjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['scim-error'] */ js.Any
  ): ApplicationjsonApplicationscimjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationscimjson]
  }
  
  extension [Self <: ApplicationjsonApplicationscimjson](x: Self) {
    
    inline def setApplicationSlashjson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['basic-error'] */ js.Any
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashscimPlussignjson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['scim-error'] */ js.Any
    ): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
