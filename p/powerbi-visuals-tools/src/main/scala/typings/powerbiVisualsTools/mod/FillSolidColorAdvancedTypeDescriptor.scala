package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillSolidColorAdvancedTypeDescriptor extends StObject {
  
  /** Indicates whether the color value may be nullable, and a 'no fill' option is appropriate. */
  var nullable: Boolean
}
object FillSolidColorAdvancedTypeDescriptor {
  
  inline def apply(nullable: Boolean): FillSolidColorAdvancedTypeDescriptor = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillSolidColorAdvancedTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillSolidColorAdvancedTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
  }
}
