package typings
package pinterestDashSdkLib.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinterest-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getSession(): OauthSession = js.native
  def init(options: InitOptions): scala.Unit = js.native
  def login(options: LoginOptions, callback: js.Function): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def logout(callback: js.Function1[/* session */ OauthSession, _]): scala.Unit = js.native
  def me(callback: js.Function): scala.Unit = js.native
  def me(path: java.lang.String, callback: js.Function): scala.Unit = js.native
  def me(path: java.lang.String, params: js.Object, callback: js.Function): scala.Unit = js.native
  def pin(imageUrl: java.lang.String, note: java.lang.String, url: java.lang.String, callback: js.Function): scala.Unit = js.native
  def request(path: java.lang.String): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: java.lang.String): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: java.lang.String, data: PinData): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: java.lang.String, data: PinData, callback: js.Function): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: HttpMethod): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: HttpMethod, data: PinData): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: HttpMethod, data: PinData, callback: js.Function): scala.Unit = js.native
  def setSession(session: OauthSession): scala.Unit = js.native
  def setSession(session: OauthSession, callback: js.Function1[/* session */ OauthSession, _]): scala.Unit = js.native
}

