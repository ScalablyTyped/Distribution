package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1IndexField extends js.Object {
  
  /** Indicates that this field supports operations on `array_value`s. */
  var arrayConfig: js.UndefOr[String] = js.native
  
  /** Can be __name__. For single field indexes, this must match the name of the field or may be omitted. */
  var fieldPath: js.UndefOr[String] = js.native
  
  /** Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=. */
  var order: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1IndexField {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1IndexField]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1IndexFieldOps[Self <: GoogleFirestoreAdminV1IndexField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayConfig(value: String): Self = this.set("arrayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayConfig: Self = this.set("arrayConfig", js.undefined)
    
    @scala.inline
    def setFieldPath(value: String): Self = this.set("fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldPath: Self = this.set("fieldPath", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
