package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `492` extends StObject {
  
  var environments: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['environment'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * @description The number of environments in this repository
    * @example 5
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object `492` {
  
  inline def apply(): `492` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`492`]
  }
  
  extension [Self <: `492`](x: Self) {
    
    inline def setEnvironments(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['environment'] */ js.Any
        ]
    ): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['environment'] */ js.Any)*
    ): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
