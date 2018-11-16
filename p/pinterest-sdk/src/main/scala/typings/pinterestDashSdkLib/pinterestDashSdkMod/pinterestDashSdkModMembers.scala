package typings
package pinterestDashSdkLib.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinterest-sdk", JSImport.Namespace)
@js.native
object pinterestDashSdkModMembers extends js.Object {
  def getSession(): pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OauthSession = js.native
  def init(options: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.InitOptions): scala.Unit = js.native
  def login(options: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.LoginOptions, callback: js.Function): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def logout(
    callback: js.Function1[/* session */ pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OauthSession, _]
  ): scala.Unit = js.native
  def me(callback: js.Function): scala.Unit = js.native
  def me(path: java.lang.String, callback: js.Function): scala.Unit = js.native
  def me(path: java.lang.String, params: js.Object, callback: js.Function): scala.Unit = js.native
  def pin(imageUrl: java.lang.String, note: java.lang.String, url: java.lang.String, callback: js.Function): scala.Unit = js.native
  def request(path: java.lang.String): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: java.lang.String): scala.Unit = js.native
  def request(
    path: java.lang.String,
    httpMethod: java.lang.String,
    data: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.PinData
  ): scala.Unit = js.native
  def request(
    path: java.lang.String,
    httpMethod: java.lang.String,
    data: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.PinData,
    callback: js.Function
  ): scala.Unit = js.native
  def request(path: java.lang.String, httpMethod: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.HttpMethod): scala.Unit = js.native
  def request(
    path: java.lang.String,
    httpMethod: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.HttpMethod,
    data: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.PinData
  ): scala.Unit = js.native
  def request(
    path: java.lang.String,
    httpMethod: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.HttpMethod,
    data: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.PinData,
    callback: js.Function
  ): scala.Unit = js.native
  def setSession(session: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OauthSession): scala.Unit = js.native
  def setSession(
    session: pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OauthSession,
    callback: js.Function1[/* session */ pinterestDashSdkLib.pinterestDashSdkMod.PDKNs.OauthSession, _]
  ): scala.Unit = js.native
}

