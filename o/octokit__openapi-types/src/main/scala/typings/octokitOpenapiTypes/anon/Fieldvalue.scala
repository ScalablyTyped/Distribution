package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fieldvalue extends StObject {
  
  var field_value: Fieldnodeid
}
object Fieldvalue {
  
  inline def apply(field_value: Fieldnodeid): Fieldvalue = {
    val __obj = js.Dynamic.literal(field_value = field_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fieldvalue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fieldvalue] (val x: Self) extends AnyVal {
    
    inline def setField_value(value: Fieldnodeid): Self = StObject.set(x, "field_value", value.asInstanceOf[js.Any])
  }
}
