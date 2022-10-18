package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var rate: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['rate-limit'] */ js.Any
  
  var resources: Codescanningupload
}
object Resources {
  
  inline def apply(
    rate: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['rate-limit'] */ js.Any,
    resources: Codescanningupload
  ): Resources = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setRate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['rate-limit'] */ js.Any
    ): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Codescanningupload): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
  }
}
