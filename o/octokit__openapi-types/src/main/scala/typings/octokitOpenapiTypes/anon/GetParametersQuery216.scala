package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery216 extends StObject {
  
  /** Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits. */
  var get: ParametersQuery216
}
object GetParametersQuery216 {
  
  inline def apply(get: ParametersQuery216): GetParametersQuery216 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery216]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery216] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery216): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
