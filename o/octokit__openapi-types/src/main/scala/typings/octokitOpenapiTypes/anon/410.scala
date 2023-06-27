package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410` extends StObject {
  
  /** @description Response */
  var `201`: Content121
  
  var `401`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['requires_authentication'] */ js.Any
  
  var `403`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['forbidden'] */ js.Any
  
  var `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
  
  var `410`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
  
  var `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed_simple'] */ js.Any
}
object `410` {
  
  inline def apply(
    `201`: Content121,
    `401`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['requires_authentication'] */ js.Any,
    `403`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['forbidden'] */ js.Any,
    `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any,
    `410`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any,
    `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed_simple'] */ js.Any
  ): `410` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `410`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content121): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set401(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['requires_authentication'] */ js.Any
    ): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['forbidden'] */ js.Any
    ): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
    ): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
    ): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed_simple'] */ js.Any
    ): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
