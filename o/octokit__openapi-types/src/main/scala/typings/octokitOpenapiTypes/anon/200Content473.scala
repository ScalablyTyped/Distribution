package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content473` extends StObject {
  
  /** Response */
  var `200`: Content473
  
  var `301`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['moved_permanently'] */ js.Any
}
object `200Content473` {
  
  inline def apply(
    `200`: Content473,
    `301`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['moved_permanently'] */ js.Any
  ): `200Content473` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content473`]
  }
  
  extension [Self <: `200Content473`](x: Self) {
    
    inline def set200(value: Content473): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['moved_permanently'] */ js.Any
    ): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
  }
}
