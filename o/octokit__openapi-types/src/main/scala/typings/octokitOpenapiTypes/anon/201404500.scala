package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201404500` extends StObject {
  
  /** @description Response */
  var `201`: Content126
  
  var `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
  
  var `500`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['internal_error'] */ js.Any
}
object `201404500` {
  
  inline def apply(
    `201`: Content126,
    `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any,
    `500`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['internal_error'] */ js.Any
  ): `201404500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201404500`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201404500`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content126): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
    ): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['internal_error'] */ js.Any
    ): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
