package typings.openidClient.anon

import typings.node.Buffer
import typings.openidClient.mod.DPoPInput
import typings.openidClient.openidClientStrings.DELETE
import typings.openidClient.openidClientStrings.GET
import typings.openidClient.openidClientStrings.HEAD
import typings.openidClient.openidClientStrings.OPTIONS
import typings.openidClient.openidClientStrings.POST
import typings.openidClient.openidClientStrings.PUT
import typings.openidClient.openidClientStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  var DPoP: js.UndefOr[DPoPInput] = js.native
  
  var body: js.UndefOr[String | Buffer] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var method: js.UndefOr[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE] = js.native
  
  var tokenType: js.UndefOr[String] = js.native
}
object Body {
  
  @scala.inline
  def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setDPoP(value: DPoPInput): Self = this.set("DPoP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDPoP: Self = this.set("DPoP", js.undefined)
    
    @scala.inline
    def setBody(value: String | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenType: Self = this.set("tokenType", js.undefined)
  }
}
