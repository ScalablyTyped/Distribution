package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import typings.nextAuth.adaptersMod.TypeORMSessionModel
import typings.nextAuth.adaptersMod.TypeORMUserModel
import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends StObject {
  
  var Account: js.UndefOr[Schema[A]] = js.undefined
  
  var Session: js.UndefOr[ModelS_[S]] = js.undefined
  
  var User: js.UndefOr[ModelSchema[U]] = js.undefined
  
  var VerificationRequest: js.UndefOr[ModelVR[VR]] = js.undefined
}
object Session {
  
  inline def apply[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */](): Session[A, U, S, VR] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session[A, U, S, VR]]
  }
  
  extension [Self <: Session[?, ?, ?, ?], A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */](x: Self & (Session[A, U, S, VR])) {
    
    inline def setAccount(value: Schema[A]): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setSession(value: ModelS_[S]): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setUser(value: ModelSchema[U]): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setVerificationRequest(value: ModelVR[VR]): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
    
    inline def setVerificationRequestUndefined: Self = StObject.set(x, "VerificationRequest", js.undefined)
  }
}
