package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBaseheadQuery extends StObject {
  
  /**
    * Get a diff of the dependencies between commits
    * @description Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.
    */
  var get: ParametersPathBaseheadQuery
}
object GetParametersPathBaseheadQuery {
  
  inline def apply(get: ParametersPathBaseheadQuery): GetParametersPathBaseheadQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBaseheadQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathBaseheadQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathBaseheadQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
