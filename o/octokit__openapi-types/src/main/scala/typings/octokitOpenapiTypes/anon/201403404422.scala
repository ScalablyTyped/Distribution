package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201403404422` extends StObject {
  
  /** @description Response */
  var `201`: Content63
  
  /** @description Forbidden if the check run is not rerequestable or doesn't belong to the authenticated GitHub App */
  var `403`: Content41
  
  var `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
  
  /** @description Validation error if the check run is not rerequestable */
  var `422`: Content41
}
object `201403404422` {
  
  inline def apply(
    `201`: Content63,
    `403`: Content41,
    `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any,
    `422`: Content41
  ): `201403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201403404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201403404422`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content63): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
    ): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content41): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
