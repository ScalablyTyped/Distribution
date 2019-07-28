package typings.pathjs.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPath extends js.Object {
  var core: IPathCore
  var history: IPathHistory
  var routes: IPathRoutes
  def dispatch(passed_route: String): Unit
  def listen(): Unit
  def map(path: String): IPathRoute
  def `match`(path: String, parameterize: Boolean): IPathRoute | Null
  def rescue(fn: js.Function): Unit
  def root(path: String): Unit
}

object IPath {
  @scala.inline
  def apply(
    core: IPathCore,
    dispatch: String => Unit,
    history: IPathHistory,
    listen: () => Unit,
    map: String => IPathRoute,
    `match`: (String, Boolean) => IPathRoute | Null,
    rescue: js.Function => Unit,
    root: String => Unit,
    routes: IPathRoutes
  ): IPath = {
    val __obj = js.Dynamic.literal(core = core, dispatch = js.Any.fromFunction1(dispatch), history = history, listen = js.Any.fromFunction0(listen), map = js.Any.fromFunction1(map), rescue = js.Any.fromFunction1(rescue), root = js.Any.fromFunction1(root), routes = routes)
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[IPath]
  }
}

