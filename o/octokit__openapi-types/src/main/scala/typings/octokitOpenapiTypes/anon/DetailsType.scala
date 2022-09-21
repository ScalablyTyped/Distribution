package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsType extends StObject {
  
  var details: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-location-commit'] */ js.Any
  
  /**
    * @description The location type. Because secrets may be found in different types of resources (ie. code, comments, issues), this field identifies the type of resource where the secret was found.
    * @example commit
    * @enum {string}
    */
  var `type`: commit
}
object DetailsType {
  
  inline def apply(
    details: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-location-commit'] */ js.Any
  ): DetailsType = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("commit")
    __obj.asInstanceOf[DetailsType]
  }
  
  extension [Self <: DetailsType](x: Self) {
    
    inline def setDetails(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-location-commit'] */ js.Any
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setType(value: commit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
