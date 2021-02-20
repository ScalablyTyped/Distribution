package typings.passportOauth2Refresh

import typings.oauth.mod.oauth2tokenCallback
import typings.passportOauth2.mod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-oauth2-refresh", "has")
  @js.native
  def has(name: String): Boolean = js.native
  
  @JSImport("passport-oauth2-refresh", "requestNewAccessToken")
  @js.native
  def requestNewAccessToken(name: String, refreshToken: String, done: oauth2tokenCallback): js.Any = js.native
  @JSImport("passport-oauth2-refresh", "requestNewAccessToken")
  @js.native
  def requestNewAccessToken(name: String, refreshToken: String, params: js.Any, done: oauth2tokenCallback): js.Any = js.native
  
  @JSImport("passport-oauth2-refresh", "use")
  @js.native
  def use(name: String): Unit = js.native
  @JSImport("passport-oauth2-refresh", "use")
  @js.native
  def use(name: String, strategy: Strategy): Unit = js.native
  @JSImport("passport-oauth2-refresh", "use")
  @js.native
  def use(name: Strategy): Unit = js.native
  @JSImport("passport-oauth2-refresh", "use")
  @js.native
  def use(name: Strategy, strategy: Strategy): Unit = js.native
}
