package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content530` extends StObject {
  
  /** Response */
  var `200`: Content530
  
  var `410`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
}
object `200Content530` {
  
  inline def apply(
    `200`: Content530,
    `410`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
  ): `200Content530` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content530`]
  }
  
  extension [Self <: `200Content530`](x: Self) {
    
    inline def set200(value: Content530): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
    ): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
