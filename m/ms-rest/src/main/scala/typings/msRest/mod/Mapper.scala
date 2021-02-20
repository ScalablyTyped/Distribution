package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mapper extends BaseMapperType {
  
  var isConstant: js.UndefOr[Boolean] = js.native
  
  var nullable: js.UndefOr[Boolean] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: Boolean = js.native
  
  var serializedName: String = js.native
  
  var `type`: BaseMapperType = js.native
}
object Mapper {
  
  @scala.inline
  def apply(name: MapperType, required: Boolean, serializedName: String, `type`: BaseMapperType): Mapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapper]
  }
  
  @scala.inline
  implicit class MapperMutableBuilder[Self <: Mapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConstant(value: Boolean): Self = StObject.set(x, "isConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstantUndefined: Self = StObject.set(x, "isConstant", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializedName(value: String): Self = StObject.set(x, "serializedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BaseMapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
