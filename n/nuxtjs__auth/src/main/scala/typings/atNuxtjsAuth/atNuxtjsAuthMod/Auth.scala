package typings.atNuxtjsAuth.atNuxtjsAuthMod

import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth[T] extends js.Object {
  @JSName("$state")
  var $state: js.Any = js.native
  @JSName("$storage")
  var $storage: Storage = js.native
  var ctx: js.Any = js.native
  var loggedIn: Boolean = js.native
  var user: Partial[T] = js.native
  def fetchUser(): js.Promise[scala.Nothing] = js.native
  def fetchUserOnce(): js.Promise[scala.Nothing] = js.native
  def hasScope(scopeName: String): Boolean = js.native
  def login(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Promise[scala.Nothing] = js.native
  def loginWith(
    strategyName: String,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Promise[scala.Nothing] = js.native
  def logout(): js.Promise[scala.Nothing] = js.native
  def onError(handler: js.Function3[/* error */ Error, /* name */ String, /* endpoint */ js.Any, Unit]): js.Any = js.native
  def redirect(name: String): js.Any = js.native
  def reset(): js.Promise[scala.Nothing] = js.native
  def setToken(strategyName: String): String = js.native
  def setToken(strategyName: String, token: String): String = js.native
  def setUser(): js.Any = js.native
  def setUser(user: Partial[T]): js.Any = js.native
  def syncToken(strategyName: String): String = js.native
}

