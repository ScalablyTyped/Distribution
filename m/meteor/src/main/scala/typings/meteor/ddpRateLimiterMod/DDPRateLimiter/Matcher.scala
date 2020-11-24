package typings.meteor.ddpRateLimiterMod.DDPRateLimiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matcher extends js.Object {
  
  var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.native
  
  var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.native
  
  var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.native
  
  var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.native
  
  var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.native
}
object Matcher {
  
  @scala.inline
  def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
    
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
    def setClientAddressFunction1(value: /* clientAddress */ String => Boolean): Self = this.set("clientAddress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientAddress(value: String | (js.Function1[/* clientAddress */ String, Boolean])): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAddress: Self = this.set("clientAddress", js.undefined)
    
    @scala.inline
    def setConnectionIdFunction1(value: /* connectionId */ String => Boolean): Self = this.set("connectionId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnectionId(value: String | (js.Function1[/* connectionId */ String, Boolean])): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    
    @scala.inline
    def setNameFunction1(value: /* name */ String => Boolean): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String | (js.Function1[/* name */ String, Boolean])): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTypeFunction1(value: /* type */ String => Boolean): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String | (js.Function1[/* type */ String, Boolean])): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserIdFunction1(value: /* userId */ String => Boolean): Self = this.set("userId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUserId(value: String | (js.Function1[/* userId */ String, Boolean])): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
