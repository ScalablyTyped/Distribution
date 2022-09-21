package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `553` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['labeled-issue-event'] */ js.Any
    ]
  ]
}
object `553` {
  
  inline def apply(
    applicationSlashjson: js.Array[
      Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['labeled-issue-event'] */ js.Any
      ]
    ]
  ): `553` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`553`]
  }
  
  extension [Self <: `553`](x: Self) {
    
    inline def setApplicationSlashjson(
      value: js.Array[
          Partial[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['labeled-issue-event'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(
      value: (Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['labeled-issue-event'] */ js.Any
        ])*
    ): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
