package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenRequest extends js.Object {
  
  /** A target to add to this stream. */
  var addTarget: js.UndefOr[Target] = js.native
  
  /** Labels associated with this target change. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.ListenRequest with TopLevel[js.Any]
  ] = js.native
  
  /** The ID of a target to remove from this stream. */
  var removeTarget: js.UndefOr[Double] = js.native
}
object ListenRequest {
  
  @scala.inline
  def apply(): ListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenRequest]
  }
  
  @scala.inline
  implicit class ListenRequestOps[Self <: ListenRequest] (val x: Self) extends AnyVal {
    
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
    def setAddTarget(value: Target): Self = this.set("addTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddTarget: Self = this.set("addTarget", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.ListenRequest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setRemoveTarget(value: Double): Self = this.set("removeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTarget: Self = this.set("removeTarget", js.undefined)
  }
}
