package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "Strategy")
@js.native
open class Strategy[TUser, TClient /* <: BaseClient */] protected () extends StObject {
  def this(
    options: StrategyOptions[TClient],
    verify: StrategyVerifyCallbackReq[TUser] | (StrategyVerifyCallbackUserInfo[TUser, UnknownObject, UnknownObject])
  ) = this()
  def this(options: StrategyOptions[TClient], verify: StrategyVerifyCallback[TUser]) = this()
  def this(
    options: StrategyOptions[TClient],
    verify: StrategyVerifyCallbackReqUserInfo[TUser, UnknownObject, UnknownObject]
  ) = this()
  
  def authenticate(req: Any): Unit = js.native
  def authenticate(req: Any, options: Any): Unit = js.native
  
  def error(err: js.Error): Unit = js.native
  
  def fail(challenge: Any, status: Double): Unit = js.native
  def fail(status: Double): Unit = js.native
  
  def pass(): Unit = js.native
  
  def redirect(url: String): Unit = js.native
  def redirect(url: String, status: Double): Unit = js.native
  
  def success(user: Any): Unit = js.native
  def success(user: Any, info: Any): Unit = js.native
}
