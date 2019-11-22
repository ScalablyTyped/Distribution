package typings.parse.Parse

import typings.parse.Anon_AuthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  *
  * <p>A Parse.User object is a local representation of a user persisted to the
  * Parse cloud. This class is a subclass of a Parse.Object, and retains the
  * same functionality of a Parse.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@JSGlobal("Parse.User")
@js.native
class User[T /* <: js.Any */] () extends Object[T] {
  def _linkWith(provider: js.Any, options: Anon_AuthData): js.Promise[User[_]] = js.native
  def _linkWith(provider: js.Any, options: Anon_AuthData, saveOpts: FullOptions): js.Promise[User[_]] = js.native
  def authenticated(): Boolean = js.native
  def getEmail(): js.UndefOr[String] = js.native
  def getSessionToken(): String = js.native
  def getUsername(): js.UndefOr[String] = js.native
  def isCurrent(): Boolean = js.native
  def linkWith(user: User[_], authData: AuthData, options: FullOptions): js.Promise[User[_]] = js.native
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

/* static members */
@JSGlobal("Parse.User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  def become(sessionToken: String): js.Promise[User[_]] = js.native
  def become(sessionToken: String, options: UseMasterKeyOption): js.Promise[User[_]] = js.native
  def current(): js.UndefOr[User[_]] = js.native
  def currentAsync(): js.Promise[User[_] | Null] = js.native
  def enableUnsafeCurrentUser(): Unit = js.native
  def extend(): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def hydrate(userJSON: js.Any): js.Promise[User[_]] = js.native
  def logIn(username: String, password: String): js.Promise[User[_]] = js.native
  def logIn(username: String, password: String, options: FullOptions): js.Promise[User[_]] = js.native
  def logOut(): js.Promise[User[_]] = js.native
  def requestPasswordReset(email: String): js.Promise[User[_]] = js.native
  def requestPasswordReset(email: String, options: SuccessFailureOptions): js.Promise[User[_]] = js.native
  def signUp(username: String, password: String, attrs: js.Any): js.Promise[User[_]] = js.native
  def signUp(username: String, password: String, attrs: js.Any, options: SignUpOptions): js.Promise[User[_]] = js.native
}

