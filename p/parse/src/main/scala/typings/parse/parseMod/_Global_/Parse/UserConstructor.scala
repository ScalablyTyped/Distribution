package typings.parse.parseMod._Global_.Parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserConstructor
  extends ObjectStatic
     with Instantiable1[/* attributes */ Attributes, User[Attributes]]
     with Instantiable0[User[Attributes]] {
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  def become(sessionToken: String): js.Promise[User[Attributes]] = js.native
  def become(sessionToken: String, options: UseMasterKeyOption): js.Promise[User[Attributes]] = js.native
  def current[T /* <: Attributes */](): js.UndefOr[User[T]] = js.native
  def currentAsync(): js.Promise[User[Attributes] | Null] = js.native
  def enableUnsafeCurrentUser(): Unit = js.native
  def extend(): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def hydrate(userJSON: js.Any): js.Promise[User[Attributes]] = js.native
  def logIn(username: String, password: String): js.Promise[User[Attributes]] = js.native
  def logIn(username: String, password: String, options: FullOptions): js.Promise[User[Attributes]] = js.native
  def logOut(): js.Promise[User[Attributes]] = js.native
  def requestPasswordReset(email: String): js.Promise[User[Attributes]] = js.native
  def requestPasswordReset(email: String, options: SuccessFailureOptions): js.Promise[User[Attributes]] = js.native
  def signUp(username: String, password: String, attrs: js.Any): js.Promise[User[Attributes]] = js.native
  def signUp(username: String, password: String, attrs: js.Any, options: SignUpOptions): js.Promise[User[Attributes]] = js.native
}

