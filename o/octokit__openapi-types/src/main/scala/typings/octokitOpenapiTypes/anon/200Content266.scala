package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content266` extends StObject {
  
  /** Success */
  var `200`: Content266
  
  var `403`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['code_scanning_forbidden_read'] */ js.Any
}
object `200Content266` {
  
  inline def apply(
    `200`: Content266,
    `403`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['code_scanning_forbidden_read'] */ js.Any
  ): `200Content266` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content266`]
  }
  
  extension [Self <: `200Content266`](x: Self) {
    
    inline def set200(value: Content266): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['code_scanning_forbidden_read'] */ js.Any
    ): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
