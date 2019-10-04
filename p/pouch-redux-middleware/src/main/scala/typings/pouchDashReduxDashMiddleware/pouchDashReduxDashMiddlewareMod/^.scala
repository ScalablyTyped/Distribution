package typings.pouchDashReduxDashMiddleware.pouchDashReduxDashMiddlewareMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pouch-redux-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T](): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def default[T](paths: js.Array[Path[T]]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def default[T](paths: Path[T]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

