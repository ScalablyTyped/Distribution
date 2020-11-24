package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalizeContext extends js.Object {
  
  var forceDepersonalize: js.UndefOr[Boolean] = js.native
  
  var userAttributes: js.UndefOr[Record[String, String]] = js.native
  
  var userIdentity: UserIdentity = js.native
}
object PersonalizeContext {
  
  @scala.inline
  def apply(userIdentity: UserIdentity): PersonalizeContext = {
    val __obj = js.Dynamic.literal(userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonalizeContext]
  }
  
  @scala.inline
  implicit class PersonalizeContextOps[Self <: PersonalizeContext] (val x: Self) extends AnyVal {
    
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
    def setUserIdentity(value: UserIdentity): Self = this.set("userIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDepersonalize(value: Boolean): Self = this.set("forceDepersonalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDepersonalize: Self = this.set("forceDepersonalize", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: Record[String, String]): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAttributes: Self = this.set("userAttributes", js.undefined)
  }
}
