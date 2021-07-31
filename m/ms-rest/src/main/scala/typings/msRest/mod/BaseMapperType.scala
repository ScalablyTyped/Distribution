package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMapperType extends StObject {
  
  var name: MapperType
}
object BaseMapperType {
  
  @scala.inline
  def apply(name: MapperType): BaseMapperType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMapperType]
  }
  
  @scala.inline
  implicit class BaseMapperTypeMutableBuilder[Self <: BaseMapperType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
