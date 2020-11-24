package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import typings.nextAuth.adaptersMod.TypeORMSessionModel
import typings.nextAuth.adaptersMod.TypeORMUserModel
import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends js.Object {
  
  var Account: js.UndefOr[Schema[A]] = js.native
  
  var Session: js.UndefOr[ModelS_[S]] = js.native
  
  var User: js.UndefOr[ModelSchema[U]] = js.native
  
  var VerificationRequest: js.UndefOr[ModelVR[VR]] = js.native
}
object Session {
  
  @scala.inline
  def apply[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */](): Session[A, U, S, VR] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session[A, U, S, VR]]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session[_, _, _, _], A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] (val x: Self with (Session[A, U, S, VR])) extends AnyVal {
    
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
    def setAccount(value: Schema[A]): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    
    @scala.inline
    def setSession(value: ModelS_[S]): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
    
    @scala.inline
    def setUser(value: ModelSchema[U]): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
    
    @scala.inline
    def setVerificationRequest(value: ModelVR[VR]): Self = this.set("VerificationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationRequest: Self = this.set("VerificationRequest", js.undefined)
  }
}
