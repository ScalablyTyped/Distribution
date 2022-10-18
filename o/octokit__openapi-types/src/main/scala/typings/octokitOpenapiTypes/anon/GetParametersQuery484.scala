package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery484 extends StObject {
  
  /** Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits. */
  var get: ParametersQuery484
}
object GetParametersQuery484 {
  
  inline def apply(get: ParametersQuery484): GetParametersQuery484 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery484]
  }
  
  extension [Self <: GetParametersQuery484](x: Self) {
    
    inline def setGet(value: ParametersQuery484): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
