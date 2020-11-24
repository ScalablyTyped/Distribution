package typings.nextAuth.adaptersMod

import typings.nextAuth.mod.AppOptions
import typings.nextAuth.mod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter[TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */] extends js.Object {
  
  def getAdapter(appOptions: AppOptions): js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]] = js.native
}
object Adapter {
  
  @scala.inline
  def apply[TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */](
    getAdapter: AppOptions => js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]
  ): Adapter[TUser, TProfile, TSession, TVerificationRequest] = {
    val __obj = js.Dynamic.literal(getAdapter = js.Any.fromFunction1(getAdapter))
    __obj.asInstanceOf[Adapter[TUser, TProfile, TSession, TVerificationRequest]]
  }
  
  @scala.inline
  implicit class AdapterOps[Self <: Adapter[_, _, _, _], TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */] (val x: Self with (Adapter[TUser, TProfile, TSession, TVerificationRequest])) extends AnyVal {
    
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
    def setGetAdapter(value: AppOptions => js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]): Self = this.set("getAdapter", js.Any.fromFunction1(value))
  }
}
