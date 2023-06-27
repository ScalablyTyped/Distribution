package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath444Query extends StObject {
  
  /** List public events received by a user */
  var get: ParametersPath444Query
}
object GetParametersPath444Query {
  
  inline def apply(get: ParametersPath444Query): GetParametersPath444Query = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath444Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath444Query] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath444Query): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
