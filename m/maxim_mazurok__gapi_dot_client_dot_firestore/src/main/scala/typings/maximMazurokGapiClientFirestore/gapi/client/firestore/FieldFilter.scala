package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldFilter extends StObject {
  
  /** The field to filter by. */
  var field: js.UndefOr[FieldReference] = js.native
  
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.native
  
  /** The value to compare to. */
  var value: js.UndefOr[Value] = js.native
}
object FieldFilter {
  
  @scala.inline
  def apply(): FieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldFilter]
  }
  
  @scala.inline
  implicit class FieldFilterMutableBuilder[Self <: FieldFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
