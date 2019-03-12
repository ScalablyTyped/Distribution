package typings
package pathjsLib.pathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPath extends js.Object {
  var core: IPathCore
  var history: IPathHistory
  var routes: IPathRoutes
  def dispatch(passed_route: java.lang.String): scala.Unit
  def listen(): scala.Unit
  def map(path: java.lang.String): IPathRoute
  def `match`(path: java.lang.String, parameterize: scala.Boolean): IPathRoute | scala.Null
  def rescue(fn: js.Function): scala.Unit
  def root(path: java.lang.String): scala.Unit
}

object IPath {
  @scala.inline
  def apply(
    core: IPathCore,
    dispatch: java.lang.String => scala.Unit,
    history: IPathHistory,
    listen: () => scala.Unit,
    map: java.lang.String => IPathRoute,
    `match`: (java.lang.String, scala.Boolean) => IPathRoute | scala.Null,
    rescue: js.Function => scala.Unit,
    root: java.lang.String => scala.Unit,
    routes: IPathRoutes
  ): IPath = {
    val __obj = js.Dynamic.literal(core = core, dispatch = js.Any.fromFunction1(dispatch), history = history, listen = js.Any.fromFunction0(listen), map = js.Any.fromFunction1(map), rescue = js.Any.fromFunction1(rescue), root = js.Any.fromFunction1(root), routes = routes)
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[IPath]
  }
}

