package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any
  ]
}
object `233` {
  
  inline def apply(
    applicationSlashjson: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any
    ]
  ): `233` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`233`]
  }
  
  extension [Self <: `233`](x: Self) {
    
    inline def setApplicationSlashjson(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any
        ]
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any)*
    ): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
