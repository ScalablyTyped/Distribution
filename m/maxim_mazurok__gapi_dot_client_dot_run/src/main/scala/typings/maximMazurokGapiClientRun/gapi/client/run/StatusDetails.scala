package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusDetails extends js.Object {
  
  /** The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes. +optional */
  var causes: js.UndefOr[js.Array[StatusCause]] = js.native
  
  /** The group attribute of the resource associated with the status StatusReason. +optional */
  var group: js.UndefOr[String] = js.native
  
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds +optional
    */
  var kind: js.UndefOr[String] = js.native
  
  /** The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described). +optional */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may
    * indicate how long to wait before taking the alternate action. +optional
    */
  var retryAfterSeconds: js.UndefOr[Double] = js.native
  
  /** UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids +optional */
  var uid: js.UndefOr[String] = js.native
}
object StatusDetails {
  
  @scala.inline
  def apply(): StatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetails]
  }
  
  @scala.inline
  implicit class StatusDetailsOps[Self <: StatusDetails] (val x: Self) extends AnyVal {
    
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
    def setCausesVarargs(value: StatusCause*): Self = this.set("causes", js.Array(value :_*))
    
    @scala.inline
    def setCauses(value: js.Array[StatusCause]): Self = this.set("causes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCauses: Self = this.set("causes", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRetryAfterSeconds(value: Double): Self = this.set("retryAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryAfterSeconds: Self = this.set("retryAfterSeconds", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}
