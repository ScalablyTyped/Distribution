package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fieldnodeid extends StObject {
  
  var field_node_id: js.UndefOr[String] = js.undefined
  
  var field_type: js.UndefOr[String] = js.undefined
}
object Fieldnodeid {
  
  inline def apply(): Fieldnodeid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fieldnodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fieldnodeid] (val x: Self) extends AnyVal {
    
    inline def setField_node_id(value: String): Self = StObject.set(x, "field_node_id", value.asInstanceOf[js.Any])
    
    inline def setField_node_idUndefined: Self = StObject.set(x, "field_node_id", js.undefined)
    
    inline def setField_type(value: String): Self = StObject.set(x, "field_type", value.asInstanceOf[js.Any])
    
    inline def setField_typeUndefined: Self = StObject.set(x, "field_type", js.undefined)
  }
}
