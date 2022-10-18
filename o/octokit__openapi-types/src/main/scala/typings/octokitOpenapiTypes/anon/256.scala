package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `256` extends StObject {
  
  var runners: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner'] */ js.Any
    ]
  ] = js.undefined
  
  var total_count: js.UndefOr[Double] = js.undefined
}
object `256` {
  
  inline def apply(): `256` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`256`]
  }
  
  extension [Self <: `256`](x: Self) {
    
    inline def setRunners(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner'] */ js.Any
        ]
    ): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    inline def setRunnersVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner'] */ js.Any)*
    ): Self = StObject.set(x, "runners", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
