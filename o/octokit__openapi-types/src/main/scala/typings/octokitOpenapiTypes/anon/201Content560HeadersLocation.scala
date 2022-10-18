package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content560HeadersLocation` extends StObject {
  
  /** Response */
  var `201`: Content560HeadersLocation
  
  var `403`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['forbidden'] */ js.Any
  
  var `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
}
object `201Content560HeadersLocation` {
  
  inline def apply(
    `201`: Content560HeadersLocation,
    `403`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['forbidden'] */ js.Any,
    `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
  ): `201Content560HeadersLocation` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content560HeadersLocation`]
  }
  
  extension [Self <: `201Content560HeadersLocation`](x: Self) {
    
    inline def set201(value: Content560HeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['forbidden'] */ js.Any
    ): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
    ): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
