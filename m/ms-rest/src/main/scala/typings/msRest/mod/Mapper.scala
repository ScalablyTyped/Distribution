package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mapper
  extends StObject
     with BaseMapperType {
  
  var isConstant: js.UndefOr[Boolean] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: Boolean
  
  var serializedName: String
  
  var `type`: BaseMapperType
}
object Mapper {
  
  inline def apply(name: MapperType, required: Boolean, serializedName: String, `type`: BaseMapperType): Mapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mapper] (val x: Self) extends AnyVal {
    
    inline def setIsConstant(value: Boolean): Self = StObject.set(x, "isConstant", value.asInstanceOf[js.Any])
    
    inline def setIsConstantUndefined: Self = StObject.set(x, "isConstant", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSerializedName(value: String): Self = StObject.set(x, "serializedName", value.asInstanceOf[js.Any])
    
    inline def setType(value: BaseMapperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
