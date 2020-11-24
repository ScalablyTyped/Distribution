package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1IndexConfigDelta extends js.Object {
  
  /** Specifies how the index is changing. */
  var changeType: js.UndefOr[String] = js.native
  
  /** The index being changed. */
  var index: js.UndefOr[GoogleFirestoreAdminV1Index] = js.native
}
object GoogleFirestoreAdminV1IndexConfigDelta {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1IndexConfigDelta]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1IndexConfigDeltaOps[Self <: GoogleFirestoreAdminV1IndexConfigDelta] (val x: Self) extends AnyVal {
    
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
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setIndex(value: GoogleFirestoreAdminV1Index): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
