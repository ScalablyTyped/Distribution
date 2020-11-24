package typings.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsDirty extends js.Object {
  
  var credentials: js.Object = js.native
  
  var credentialsDirty: js.UndefOr[Boolean] = js.native
  
  var flows: js.Array[js.Object] = js.native
}
object CredentialsDirty {
  
  @scala.inline
  def apply(credentials: js.Object, flows: js.Array[js.Object]): CredentialsDirty = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsDirty]
  }
  
  @scala.inline
  implicit class CredentialsDirtyOps[Self <: CredentialsDirty] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: js.Object): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsVarargs(value: js.Object*): Self = this.set("flows", js.Array(value :_*))
    
    @scala.inline
    def setFlows(value: js.Array[js.Object]): Self = this.set("flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsDirty(value: Boolean): Self = this.set("credentialsDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialsDirty: Self = this.set("credentialsDirty", js.undefined)
  }
}
