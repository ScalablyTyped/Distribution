package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath470Query extends StObject {
  
  /**
    * List repositories for a user migration
    * @description Lists all the repositories for this user migration.
    */
  var get: ParametersPath470Query
}
object GetParametersPath470Query {
  
  inline def apply(get: ParametersPath470Query): GetParametersPath470Query = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath470Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath470Query] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath470Query): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
