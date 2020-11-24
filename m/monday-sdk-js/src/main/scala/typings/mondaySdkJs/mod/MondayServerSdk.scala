package typings.mondaySdkJs.mod

import typings.mondaySdkJs.anon.Partialtokenstring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MondayServerSdk extends js.Object {
  
  def api(query: String): js.Promise[_] = js.native
  def api(query: String, options: Partialtokenstring): js.Promise[_] = js.native
  
  def oauthToken(code: String, clientId: String, clientSecret: String): js.Promise[_] = js.native
  
  def setToken(token: String): Unit = js.native
}
