package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * <p>A Parse.User object is a local representation of a user persisted to the
  * Parse cloud. This class is a subclass of a Parse.Object, and retains the
  * same functionality of a Parse.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@js.native
trait User[T /* <: Attributes */]
  extends StObject
     with Object[T] {
  
  def _isLinked(provider: String): Boolean = js.native
  def _isLinked(provider: AuthProvider): Boolean = js.native
  
  def _unlinkFrom(provider: String): js.Promise[this.type] = js.native
  def _unlinkFrom(provider: String, options: FullOptions): js.Promise[this.type] = js.native
  def _unlinkFrom(provider: AuthProvider): js.Promise[this.type] = js.native
  def _unlinkFrom(provider: AuthProvider, options: FullOptions): js.Promise[this.type] = js.native
  
  def authenticated(): Boolean = js.native
  
  def getEmail(): js.UndefOr[String] = js.native
  
  def getSessionToken(): String = js.native
  
  def getUsername(): js.UndefOr[String] = js.native
  
  def isCurrent(): Boolean = js.native
  
  def linkWith(provider: String, options: typings.parse.anon.AuthData): js.Promise[this.type] = js.native
  def linkWith(provider: String, options: typings.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[this.type] = js.native
  def linkWith(provider: AuthProvider, options: typings.parse.anon.AuthData): js.Promise[this.type] = js.native
  def linkWith(provider: AuthProvider, options: typings.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[this.type] = js.native
  
  def logIn(): js.Promise[this.type] = js.native
  def logIn(options: FullOptions): js.Promise[this.type] = js.native
  
  def setEmail(email: String): Boolean = js.native
  def setEmail(email: String, options: SuccessFailureOptions): Boolean = js.native
  
  def setPassword(password: String): Boolean = js.native
  def setPassword(password: String, options: SuccessFailureOptions): Boolean = js.native
  
  def setUsername(username: String): Boolean = js.native
  def setUsername(username: String, options: SuccessFailureOptions): Boolean = js.native
  
  def signUp(): js.Promise[this.type] = js.native
  def signUp(attrs: Any): js.Promise[this.type] = js.native
  def signUp(attrs: Any, options: SignUpOptions): js.Promise[this.type] = js.native
  def signUp(attrs: Unit, options: SignUpOptions): js.Promise[this.type] = js.native
}
object User {
  
  inline def apply: UserConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("User").asInstanceOf[UserConstructor]
}
