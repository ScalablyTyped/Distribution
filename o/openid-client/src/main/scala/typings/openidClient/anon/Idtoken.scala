package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.mod.ClaimsParameterMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Idtoken extends js.Object {
  
  var id_token: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.native
  
  var userinfo: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.native
}
object Idtoken {
  
  @scala.inline
  def apply(): Idtoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Idtoken]
  }
  
  @scala.inline
  implicit class IdtokenOps[Self <: Idtoken] (val x: Self) extends AnyVal {
    
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
    def setId_token(value: StringDictionary[Null | ClaimsParameterMember]): Self = this.set("id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    
    @scala.inline
    def setUserinfo(value: StringDictionary[Null | ClaimsParameterMember]): Self = this.set("userinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserinfo: Self = this.set("userinfo", js.undefined)
  }
}
