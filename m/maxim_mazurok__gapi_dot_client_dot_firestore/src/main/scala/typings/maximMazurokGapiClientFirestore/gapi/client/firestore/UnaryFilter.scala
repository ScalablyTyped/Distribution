package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnaryFilter extends StObject {
  
  /** The field to which to apply the operator. */
  var field: js.UndefOr[FieldReference] = js.native
  
  /** The unary operator to apply. */
  var op: js.UndefOr[String] = js.native
}
object UnaryFilter {
  
  @scala.inline
  def apply(): UnaryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnaryFilter]
  }
  
  @scala.inline
  implicit class UnaryFilterMutableBuilder[Self <: UnaryFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
