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
    dispatch: js.Function1[java.lang.String, scala.Unit],
    history: IPathHistory,
    listen: js.Function0[scala.Unit],
    map: js.Function1[java.lang.String, IPathRoute],
    `match`: js.Function2[java.lang.String, scala.Boolean, IPathRoute | scala.Null],
    rescue: js.Function1[js.Function, scala.Unit],
    root: js.Function1[java.lang.String, scala.Unit],
    routes: IPathRoutes
  ): IPath = {
    val __obj = js.Dynamic.literal(core = core, dispatch = dispatch, history = history, listen = listen, map = map, rescue = rescue, root = root, routes = routes)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[IPath]
  }
}

