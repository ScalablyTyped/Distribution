package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.mod.OpenAPI._Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterObject
  extends StObject
     with ParameterBaseObject
     with _Parameter {
  
  var in: String
  
  var name: String
}
object ParameterObject {
  
  inline def apply(in: String, name: String): ParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterObject] (val x: Self) extends AnyVal {
    
    inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
