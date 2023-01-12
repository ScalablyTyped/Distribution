package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueTypeDescriptor extends StObject {
  
  var defaultValue: Boolean
}
object DefaultValueTypeDescriptor {
  
  inline def apply(defaultValue: Boolean): DefaultValueTypeDescriptor = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValueTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
