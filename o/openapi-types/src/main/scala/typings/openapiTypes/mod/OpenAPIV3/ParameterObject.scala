package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.mod.OpenAPI.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterObject
  extends ParameterBaseObject
     with Parameter {
  
  var in: String = js.native
  
  var name: String = js.native
}
object ParameterObject {
  
  @scala.inline
  def apply(in: String, name: String): ParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterObject]
  }
  
  @scala.inline
  implicit class ParameterObjectMutableBuilder[Self <: ParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
