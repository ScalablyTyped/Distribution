package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationscimjson extends StObject {
  
  @JSName("application/scim+json")
  var applicationSlashscimPlussignjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['scim-user-list'] */ js.Any
}
object Applicationscimjson {
  
  inline def apply(
    applicationSlashscimPlussignjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['scim-user-list'] */ js.Any
  ): Applicationscimjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/scim+json")(applicationSlashscimPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationscimjson]
  }
  
  extension [Self <: Applicationscimjson](x: Self) {
    
    inline def setApplicationSlashscimPlussignjson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['scim-user-list'] */ js.Any
    ): Self = StObject.set(x, "application/scim+json", value.asInstanceOf[js.Any])
  }
}
