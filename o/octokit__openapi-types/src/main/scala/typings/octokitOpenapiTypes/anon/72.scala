package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  var `200`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['actions_runner_labels'] */ js.Any
  
  var `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
}
object `72` {
  
  inline def apply(
    `200`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['actions_runner_labels'] */ js.Any,
    `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
  ): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`72`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `72`] (val x: Self) extends AnyVal {
    
    inline def set200(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['actions_runner_labels'] */ js.Any
    ): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
    ): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
