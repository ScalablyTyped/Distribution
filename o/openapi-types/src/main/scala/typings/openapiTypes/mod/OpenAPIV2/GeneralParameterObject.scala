package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralParameterObject
  extends ParameterObject
     with ItemsObject
     with Parameter {
  
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
}
object GeneralParameterObject {
  
  @scala.inline
  def apply(in: String, name: String, `type`: String): GeneralParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralParameterObject]
  }
  
  @scala.inline
  implicit class GeneralParameterObjectMutableBuilder[Self <: GeneralParameterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmptyValue(value: Boolean): Self = StObject.set(x, "allowEmptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyValueUndefined: Self = StObject.set(x, "allowEmptyValue", js.undefined)
  }
}
