package typings.nextServer.routerMod

import typings.nextServer.mittMod.MittEmitter
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/router/router.BaseRouter & std.Pick<next-server.next-server/dist/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events'> */
@js.native
trait NextRouter extends js.Object {
  var asPath: String = js.native
  var back: js.Function0[Unit] = js.native
  var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit] = js.native
  var events: MittEmitter = js.native
  var pathname: String = js.native
  var prefetch: js.Function1[/* url */ String, js.Promise[Unit]] = js.native
  var push: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Boolean]
  ] = js.native
  var query: ParsedUrlQuery = js.native
  var reload: js.Function0[Unit] = js.native
  var replace: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Boolean]
  ] = js.native
  var route: String = js.native
}

object NextRouter {
  @scala.inline
  def apply(
    asPath: String,
    back: () => Unit,
    beforePopState: /* cb */ BeforePopStateCallback => Unit,
    events: MittEmitter,
    pathname: String,
    prefetch: /* url */ String => js.Promise[Unit],
    push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean],
    query: ParsedUrlQuery,
    reload: () => Unit,
    replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean],
    route: String
  ): NextRouter = {
    val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction1(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextRouter]
  }
  @scala.inline
  implicit class NextRouterOps[Self <: NextRouter] (val x: Self) extends AnyVal {
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
    def setAsPath(value: String): Self = this.set("asPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBack(value: () => Unit): Self = this.set("back", js.Any.fromFunction0(value))
    @scala.inline
    def setBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = this.set("beforePopState", js.Any.fromFunction1(value))
    @scala.inline
    def setEvents(value: MittEmitter): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefetch(value: /* url */ String => js.Promise[Unit]): Self = this.set("prefetch", js.Any.fromFunction1(value))
    @scala.inline
    def setPush(
      value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
    ): Self = this.set("push", js.Any.fromFunction3(value))
    @scala.inline
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setReload(value: () => Unit): Self = this.set("reload", js.Any.fromFunction0(value))
    @scala.inline
    def setReplace(
      value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
    ): Self = this.set("replace", js.Any.fromFunction3(value))
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

