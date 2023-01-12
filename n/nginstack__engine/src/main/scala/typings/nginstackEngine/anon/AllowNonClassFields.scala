package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowNonClassFields extends StObject {
  
  var allowNonClassFields: Boolean
}
object AllowNonClassFields {
  
  inline def apply(allowNonClassFields: Boolean): AllowNonClassFields = {
    val __obj = js.Dynamic.literal(allowNonClassFields = allowNonClassFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowNonClassFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowNonClassFields] (val x: Self) extends AnyVal {
    
    inline def setAllowNonClassFields(value: Boolean): Self = StObject.set(x, "allowNonClassFields", value.asInstanceOf[js.Any])
  }
}
