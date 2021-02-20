package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import typings.nextAuth.adaptersMod.TypeORMSessionModel
import typings.nextAuth.adaptersMod.TypeORMUserModel
import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends StObject {
  
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
  implicit class SessionMutableBuilder[Self <: Session[_, _, _, _], A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] (val x: Self with (Session[A, U, S, VR])) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Schema[A]): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    @scala.inline
    def setSession(value: ModelS_[S]): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    @scala.inline
    def setUser(value: ModelSchema[U]): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    @scala.inline
    def setVerificationRequest(value: ModelVR[VR]): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationRequestUndefined: Self = StObject.set(x, "VerificationRequest", js.undefined)
  }
}
