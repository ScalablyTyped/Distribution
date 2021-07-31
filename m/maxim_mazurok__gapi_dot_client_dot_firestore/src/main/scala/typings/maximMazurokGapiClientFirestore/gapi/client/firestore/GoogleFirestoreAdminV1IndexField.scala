package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleFirestoreAdminV1IndexField extends StObject {
  
  /** Indicates that this field supports operations on `array_value`s. */
  var arrayConfig: js.UndefOr[String] = js.undefined
  
  /** Can be __name__. For single field indexes, this must match the name of the field or may be omitted. */
  var fieldPath: js.UndefOr[String] = js.undefined
  
  /** Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=. */
  var order: js.UndefOr[String] = js.undefined
}
object GoogleFirestoreAdminV1IndexField {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1IndexField]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1IndexFieldMutableBuilder[Self <: GoogleFirestoreAdminV1IndexField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayConfig(value: String): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
