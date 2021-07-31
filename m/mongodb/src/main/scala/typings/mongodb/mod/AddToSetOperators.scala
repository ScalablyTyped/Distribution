package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddToSetOperators[Type] extends StObject {
  
  @JSName("$each")
  var $each: Type
}
object AddToSetOperators {
  
  @scala.inline
  def apply[Type]($each: Type): AddToSetOperators[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToSetOperators[Type]]
  }
  
  @scala.inline
  implicit class AddToSetOperatorsMutableBuilder[Self <: AddToSetOperators[?], Type] (val x: Self & AddToSetOperators[Type]) extends AnyVal {
    
    @scala.inline
    def set$each(value: Type): Self = StObject.set(x, "$each", value.asInstanceOf[js.Any])
  }
}
