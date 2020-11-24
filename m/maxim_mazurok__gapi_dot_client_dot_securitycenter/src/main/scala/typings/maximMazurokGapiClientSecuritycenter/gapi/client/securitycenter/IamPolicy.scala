package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicy extends js.Object {
  
  /** The JSON representation of the Policy associated with the asset. See https://cloud.google.com/iam/reference/rest/v1/Policy for format details. */
  var policyBlob: js.UndefOr[String] = js.native
}
object IamPolicy {
  
  @scala.inline
  def apply(): IamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicy]
  }
  
  @scala.inline
  implicit class IamPolicyOps[Self <: IamPolicy] (val x: Self) extends AnyVal {
    
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
    def setPolicyBlob(value: String): Self = this.set("policyBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBlob: Self = this.set("policyBlob", js.undefined)
  }
}
