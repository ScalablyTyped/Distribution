package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClonesCount extends StObject {
  
  var clones: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['traffic'] */ js.Any
  ]
  
  /** @example 173 */
  var count: Double
  
  /** @example 128 */
  var uniques: Double
}
object ClonesCount {
  
  inline def apply(
    clones: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['traffic'] */ js.Any
    ],
    count: Double,
    uniques: Double
  ): ClonesCount = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClonesCount]
  }
  
  extension [Self <: ClonesCount](x: Self) {
    
    inline def setClones(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['traffic'] */ js.Any
        ]
    ): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    inline def setClonesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['traffic'] */ js.Any)*
    ): Self = StObject.set(x, "clones", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}
