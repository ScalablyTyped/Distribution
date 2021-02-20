package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserConstructor
  extends ObjectStatic
     with Instantiable0[typings.parse.mod.global.Parse.User[Attributes]]
     with Instantiable1[/* attributes */ Attributes, typings.parse.mod.global.Parse.User[Attributes]] {
  
  def _registerAuthenticationProvider(provider: AuthProvider): Unit = js.native
  
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  
  def become[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](sessionToken: String): js.Promise[T] = js.native
  def become[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](sessionToken: String, options: UseMasterKeyOption): js.Promise[T] = js.native
  
  def current[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](): js.UndefOr[T] = js.native
  
  def currentAsync[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](): js.Promise[T | Null] = js.native
  
  def enableUnsafeCurrentUser(): Unit = js.native
  
  def extend(): js.Any = js.native
  def extend(protoProps: js.UndefOr[scala.Nothing], classProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  
  def hydrate[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](userJSON: js.Any): js.Promise[T] = js.native
  
  def logIn[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](username: String, password: String): js.Promise[T] = js.native
  def logIn[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](username: String, password: String, options: FullOptions): js.Promise[T] = js.native
  
  def logInWith[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](provider: String, options: typings.parse.anon.AuthData): js.Promise[T] = js.native
  def logInWith[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](provider: String, options: typings.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[T] = js.native
  def logInWith[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](provider: AuthProvider, options: typings.parse.anon.AuthData): js.Promise[T] = js.native
  def logInWith[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](provider: AuthProvider, options: typings.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[T] = js.native
  
  def logOut[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](): js.Promise[T] = js.native
  
  def requestPasswordReset[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](email: String): js.Promise[T] = js.native
  def requestPasswordReset[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](email: String, options: SuccessFailureOptions): js.Promise[T] = js.native
  
  def signUp[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](username: String, password: String, attrs: js.Any): js.Promise[T] = js.native
  def signUp[T /* <: typings.parse.mod.global.Parse.User[Attributes] */](username: String, password: String, attrs: js.Any, options: SignUpOptions): js.Promise[T] = js.native
}
