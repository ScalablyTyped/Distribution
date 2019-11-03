package typings.parse.reactDashNativeMod

import typings.parse.Parse.FullOptions
import typings.parse.Parse.SignUpOptions
import typings.parse.Parse.SuccessFailureOptions
import typings.parse.Parse.UseMasterKeyOption
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
@JSImport("parse/react-native", "User")
@js.native
class User ()
  extends typings.parse.nodeMod.User

/* static members */
@JSImport("parse/react-native", "User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  def become(sessionToken: String): js.Promise[typings.parse.Parse.User] = js.native
  def become(sessionToken: String, options: UseMasterKeyOption): js.Promise[typings.parse.Parse.User] = js.native
  def current(): js.UndefOr[typings.parse.Parse.User] = js.native
  def currentAsync(): js.Promise[typings.parse.Parse.User | Null] = js.native
  def enableUnsafeCurrentUser(): Unit = js.native
  def extend(): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def hydrate(userJSON: js.Any): js.Promise[typings.parse.Parse.User] = js.native
  def logIn(username: String, password: String): js.Promise[typings.parse.Parse.User] = js.native
  def logIn(username: String, password: String, options: FullOptions): js.Promise[typings.parse.Parse.User] = js.native
  def logOut(): js.Promise[typings.parse.Parse.User] = js.native
  def requestPasswordReset(email: String): js.Promise[typings.parse.Parse.User] = js.native
  def requestPasswordReset(email: String, options: SuccessFailureOptions): js.Promise[typings.parse.Parse.User] = js.native
  def signUp(username: String, password: String, attrs: js.Any): js.Promise[typings.parse.Parse.User] = js.native
  def signUp(username: String, password: String, attrs: js.Any, options: SignUpOptions): js.Promise[typings.parse.Parse.User] = js.native
}

