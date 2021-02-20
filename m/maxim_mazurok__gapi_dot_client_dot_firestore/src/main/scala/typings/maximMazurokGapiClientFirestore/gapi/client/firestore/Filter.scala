package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  /** A composite filter. */
  var compositeFilter: js.UndefOr[CompositeFilter] = js.native
  
  /** A filter on a document field. */
  var fieldFilter: js.UndefOr[FieldFilter] = js.native
  
  /** A filter that takes exactly one argument. */
  var unaryFilter: js.UndefOr[UnaryFilter] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeFilter(value: CompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    @scala.inline
    def setFieldFilter(value: FieldFilter): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    @scala.inline
    def setUnaryFilter(value: UnaryFilter): Self = StObject.set(x, "unaryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnaryFilterUndefined: Self = StObject.set(x, "unaryFilter", js.undefined)
  }
}
