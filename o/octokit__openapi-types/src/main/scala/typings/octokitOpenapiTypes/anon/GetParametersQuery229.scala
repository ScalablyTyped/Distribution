package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery229 extends StObject {
  
  /**
    * Get a diff of the dependencies between commits
    * @description Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.
    */
  var get: ParametersQuery229
}
object GetParametersQuery229 {
  
  inline def apply(get: ParametersQuery229): GetParametersQuery229 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery229]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery229] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery229): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
