package typings.passportOauth2Refresh

import typings.oauth.mod.oauth2tokenCallback
import typings.passportOauth2.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2-refresh", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def has(name: String): Boolean = js.native
  def requestNewAccessToken(name: String, refreshToken: String, done: oauth2tokenCallback): js.Any = js.native
  def requestNewAccessToken(name: String, refreshToken: String, params: js.Any, done: oauth2tokenCallback): js.Any = js.native
  def use(name: String): Unit = js.native
  def use(name: String, strategy: Strategy): Unit = js.native
  def use(name: Strategy): Unit = js.native
  def use(name: Strategy, strategy: Strategy): Unit = js.native
}

