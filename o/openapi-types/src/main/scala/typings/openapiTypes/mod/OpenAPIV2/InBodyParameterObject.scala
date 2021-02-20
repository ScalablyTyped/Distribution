package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InBodyParameterObject
  extends ParameterObject
     with Parameter {
  
  var schema: Schema = js.native
}
object InBodyParameterObject {
  
  @scala.inline
  def apply(in: String, name: String, schema: Schema): InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[InBodyParameterObject]
  }
  
  @scala.inline
  implicit class InBodyParameterObjectMutableBuilder[Self <: InBodyParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
