package typings.pinterestDashSdk.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinterest-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getSession(): OauthSession = js.native
  def init(options: InitOptions): Unit = js.native
  def login(options: LoginOptions, callback: js.Function): Unit = js.native
  def logout(): Unit = js.native
  def logout(callback: js.Function1[/* session */ OauthSession, _]): Unit = js.native
  def me(callback: js.Function): Unit = js.native
  def me(path: String, callback: js.Function): Unit = js.native
  def me(path: String, params: js.Object, callback: js.Function): Unit = js.native
  def pin(imageUrl: String, note: String, url: String, callback: js.Function): Unit = js.native
  def request(path: String): Unit = js.native
  def request(path: String, httpMethod: String): Unit = js.native
  def request(path: String, httpMethod: String, data: PinData): Unit = js.native
  def request(path: String, httpMethod: String, data: PinData, callback: js.Function): Unit = js.native
  def request(path: String, httpMethod: HttpMethod): Unit = js.native
  def request(path: String, httpMethod: HttpMethod, data: PinData): Unit = js.native
  def request(path: String, httpMethod: HttpMethod, data: PinData, callback: js.Function): Unit = js.native
  def setSession(session: OauthSession): Unit = js.native
  def setSession(session: OauthSession, callback: js.Function1[/* session */ OauthSession, _]): Unit = js.native
}

