package typings.pathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPath extends js.Object {
  var core: IPathCore = js.native
  var history: IPathHistory = js.native
  var routes: IPathRoutes = js.native
  def dispatch(passed_route: String): Unit = js.native
  def listen(): Unit = js.native
  def map(path: String): IPathRoute = js.native
  def `match`(path: String, parameterize: Boolean): IPathRoute | Null = js.native
  def rescue(fn: js.Function): Unit = js.native
  def root(path: String): Unit = js.native
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
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any], listen = js.Any.fromFunction0(listen), map = js.Any.fromFunction1(map), rescue = js.Any.fromFunction1(rescue), root = js.Any.fromFunction1(root), routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[IPath]
  }
  @scala.inline
  implicit class IPathOps[Self <: IPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCore(value: IPathCore): Self = this.set("core", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispatch(value: String => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setHistory(value: IPathHistory): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setListen(value: () => Unit): Self = this.set("listen", js.Any.fromFunction0(value))
    @scala.inline
    def setMap(value: String => IPathRoute): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setMatch(value: (String, Boolean) => IPathRoute | Null): Self = this.set("match", js.Any.fromFunction2(value))
    @scala.inline
    def setRescue(value: js.Function => Unit): Self = this.set("rescue", js.Any.fromFunction1(value))
    @scala.inline
    def setRoot(value: String => Unit): Self = this.set("root", js.Any.fromFunction1(value))
    @scala.inline
    def setRoutes(value: IPathRoutes): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
  
}

