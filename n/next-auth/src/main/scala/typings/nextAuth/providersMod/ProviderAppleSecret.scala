package typings.nextAuth.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderAppleSecret extends js.Object {
  
  var appleId: String = js.native
  
  var keyId: String = js.native
  
  var privateKey: String = js.native
  
  var teamId: String = js.native
}
object ProviderAppleSecret {
  
  @scala.inline
  def apply(appleId: String, keyId: String, privateKey: String, teamId: String): ProviderAppleSecret = {
    val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderAppleSecret]
  }
  
  @scala.inline
  implicit class ProviderAppleSecretOps[Self <: ProviderAppleSecret] (val x: Self) extends AnyVal {
    
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
    def setAppleId(value: String): Self = this.set("appleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamId(value: String): Self = this.set("teamId", value.asInstanceOf[js.Any])
  }
}
