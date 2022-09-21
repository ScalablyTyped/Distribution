package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery223 extends StObject {
  
  /** Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits. */
  var get: ParametersQuery223
}
object GetParametersQuery223 {
  
  inline def apply(get: ParametersQuery223): GetParametersQuery223 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery223]
  }
  
  extension [Self <: GetParametersQuery223](x: Self) {
    
    inline def setGet(value: ParametersQuery223): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
