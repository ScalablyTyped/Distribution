package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlternativeSecurityId extends js.Object {
  
  // For internal use only
  var identityProvider: js.UndefOr[NullableOption[String]] = js.native
  
  // For internal use only
  var key: js.UndefOr[NullableOption[Double]] = js.native
  
  // For internal use only
  var `type`: js.UndefOr[NullableOption[Double]] = js.native
}
object AlternativeSecurityId {
  
  @scala.inline
  def apply(): AlternativeSecurityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternativeSecurityId]
  }
  
  @scala.inline
  implicit class AlternativeSecurityIdOps[Self <: AlternativeSecurityId] (val x: Self) extends AnyVal {
    
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
    def setIdentityProvider(value: NullableOption[String]): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityProvider: Self = this.set("identityProvider", js.undefined)
    
    @scala.inline
    def setIdentityProviderNull: Self = this.set("identityProvider", null)
    
    @scala.inline
    def setKey(value: NullableOption[Double]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setType(value: NullableOption[Double]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
