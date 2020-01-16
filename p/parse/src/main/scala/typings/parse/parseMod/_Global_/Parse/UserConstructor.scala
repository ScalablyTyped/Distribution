package typings.parse.parseMod._Global_.Parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserConstructor
  extends ObjectStatic
     with Instantiable0[User[Attributes]]
     with Instantiable1[/* attributes */ Attributes, User[Attributes]] {
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  def become[T /* <: User[Attributes] */](sessionToken: String): js.Promise[T] = js.native
  def become[T /* <: User[Attributes] */](sessionToken: String, options: UseMasterKeyOption): js.Promise[T] = js.native
  def current[T /* <: User[Attributes] */](): js.UndefOr[T] = js.native
  def currentAsync[T /* <: User[Attributes] */](): js.Promise[T | Null] = js.native
  def enableUnsafeCurrentUser(): Unit = js.native
  def extend(): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def hydrate[T /* <: User[Attributes] */](userJSON: js.Any): js.Promise[T] = js.native
  def logIn[T /* <: User[Attributes] */](username: String, password: String): js.Promise[T] = js.native
  def logIn[T /* <: User[Attributes] */](username: String, password: String, options: FullOptions): js.Promise[T] = js.native
  def logOut[T /* <: User[Attributes] */](): js.Promise[T] = js.native
  def requestPasswordReset[T /* <: User[Attributes] */](email: String): js.Promise[T] = js.native
  def requestPasswordReset[T /* <: User[Attributes] */](email: String, options: SuccessFailureOptions): js.Promise[T] = js.native
  def signUp[T /* <: User[Attributes] */](username: String, password: String, attrs: js.Any): js.Promise[T] = js.native
  def signUp[T /* <: User[Attributes] */](username: String, password: String, attrs: js.Any, options: SignUpOptions): js.Promise[T] = js.native
}

