package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `459` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-sarifs-status'] */ js.Any
}
object `459` {
  
  inline def apply(
    applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-sarifs-status'] */ js.Any
  ): `459` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`459`]
  }
  
  extension [Self <: `459`](x: Self) {
    
    inline def setApplicationSlashjson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-sarifs-status'] */ js.Any
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
