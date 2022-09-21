package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.anon.LoginTs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session
  extends StObject
     with BaseModel {
  
  var accountId: js.UndefOr[String] = js.native
  
  var acr: js.UndefOr[String] = js.native
  
  var amr: js.UndefOr[js.Array[String]] = js.native
  
  def authTime(): String | Unit = js.native
  
  def authorizationFor(clientId: String): ClientAuthorizationState | Unit = js.native
  
  var authorizations: js.UndefOr[StringDictionary[ClientAuthorizationState]] = js.native
  
  def ensureClientContainer(clientId: String): Unit = js.native
  
  @JSName("exp")
  var exp_Session: Double = js.native
  
  def grantIdFor(clientId: String): String = js.native
  def grantIdFor(clientId: String, value: String): Unit = js.native
  
  @JSName("iat")
  var iat_Session: Double = js.native
  
  @JSName("kind")
  val kind_Session: typings.oidcProvider.oidcProviderStrings.Session = js.native
  
  def loginAccount(details: LoginTs): Unit = js.native
  
  var loginTs: js.UndefOr[Double] = js.native
  
  def past(age: Double): Boolean = js.native
  
  def persist(): js.Promise[String] = js.native
  
  def resetIdentifier(): Unit = js.native
  
  def sidFor(clientId: String): String = js.native
  def sidFor(clientId: String, value: String): Unit = js.native
  
  var state: js.UndefOr[UnknownObject] = js.native
  
  var transient: js.UndefOr[Boolean] = js.native
  
  var uid: String = js.native
}
