package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422Content311` extends StObject {
  
  /** Response */
  var `200`: Content310
  
  var `409`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['conflict'] */ js.Any
  
  /** Validation failed */
  var `422`: Content311
}
object `422Content311` {
  
  inline def apply(
    `200`: Content310,
    `409`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['conflict'] */ js.Any,
    `422`: Content311
  ): `422Content311` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422Content311`]
  }
  
  extension [Self <: `422Content311`](x: Self) {
    
    inline def set200(value: Content310): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['conflict'] */ js.Any
    ): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content311): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
