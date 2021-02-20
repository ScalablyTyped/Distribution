package typings.msRest.mod

import typings.msRest.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeType extends Mapper {
  
  @JSName("type")
  var type_CompositeType: ClassName = js.native
}
object CompositeType {
  
  @scala.inline
  def apply(name: MapperType, required: Boolean, serializedName: String, `type`: ClassName): CompositeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeType]
  }
  
  @scala.inline
  implicit class CompositeTypeMutableBuilder[Self <: CompositeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
