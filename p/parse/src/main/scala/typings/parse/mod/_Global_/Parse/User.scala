package typings.parse.mod._Global_.Parse

import org.scalablytyped.runtime.TopLevel
import typings.parse.AnonAuthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * <p>A Parse.User object is a local representation of a user persisted to the
  * Parse cloud. This class is a subclass of a Parse.Object, and retains the
  * same functionality of a Parse.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@js.native
trait User[T /* <: Attributes */] extends Object[T] {
  def _linkWith(provider: js.Any, options: AnonAuthData): js.Promise[User[Attributes]] = js.native
  def _linkWith(provider: js.Any, options: AnonAuthData, saveOpts: FullOptions): js.Promise[User[Attributes]] = js.native
  def authenticated(): Boolean = js.native
  def getEmail(): js.UndefOr[String] = js.native
  def getSessionToken(): String = js.native
  def getUsername(): js.UndefOr[String] = js.native
  def isCurrent(): Boolean = js.native
  def linkWith(user: User[Attributes], authData: AuthData, options: FullOptions): js.Promise[User[Attributes]] = js.native
  def logIn(): js.Promise[this.type] = js.native
  def logIn(options: FullOptions): js.Promise[this.type] = js.native
  def setEmail(email: String): Boolean = js.native
  def setEmail(email: String, options: SuccessFailureOptions): Boolean = js.native
  def setPassword(password: String): Boolean = js.native
  def setPassword(password: String, options: SuccessFailureOptions): Boolean = js.native
  def setUsername(username: String): Boolean = js.native
  def setUsername(username: String, options: SuccessFailureOptions): Boolean = js.native
  def signUp(): js.Promise[this.type] = js.native
  def signUp(attrs: js.Any): js.Promise[this.type] = js.native
  def signUp(attrs: js.Any, options: SignUpOptions): js.Promise[this.type] = js.native
}

@JSGlobal("Parse.User")
@js.native
object User extends TopLevel[UserConstructor]

