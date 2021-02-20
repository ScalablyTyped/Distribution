package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructType extends StObject {
  
  /**
    * The list of fields that make up this struct. Order is significant, because values of this struct type are represented as lists, where the order of field values matches the order of
    * fields in the StructType. In turn, the order of fields matches the order of columns in a read request, or the order of fields in the `SELECT` clause of a query.
    */
  var fields: js.UndefOr[js.Array[Field]] = js.native
}
object StructType {
  
  @scala.inline
  def apply(): StructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructType]
  }
  
  @scala.inline
  implicit class StructTypeMutableBuilder[Self <: StructType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
