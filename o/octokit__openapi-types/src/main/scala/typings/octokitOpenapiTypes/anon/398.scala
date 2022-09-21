package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `398` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any
    ]
  ]
}
object `398` {
  
  inline def apply(
    applicationSlashjson: Partial[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any
      ]
    ]
  ): `398` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`398`]
  }
  
  extension [Self <: `398`](x: Self) {
    
    inline def setApplicationSlashjson(
      value: Partial[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
