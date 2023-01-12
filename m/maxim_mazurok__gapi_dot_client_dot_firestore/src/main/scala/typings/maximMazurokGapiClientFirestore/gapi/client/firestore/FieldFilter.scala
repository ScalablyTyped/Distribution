package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldFilter extends StObject {
  
  /** The field to filter by. */
  var field: js.UndefOr[FieldReference] = js.undefined
  
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.undefined
  
  /** The value to compare to. */
  var value: js.UndefOr[Value] = js.undefined
}
object FieldFilter {
  
  inline def apply(): FieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldFilter] (val x: Self) extends AnyVal {
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
