package typings.nextServer.routerMod

import typings.nextServer.mittMod.MittEmitter
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/router/router.BaseRouter & std.Pick<next-server.next-server/dist/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events'> */
trait NextRouter extends js.Object {
  var asPath: String
  var back: js.Function0[Unit]
  var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit]
  var events: MittEmitter
  var pathname: String
  var prefetch: js.Function1[/* url */ String, js.Promise[Unit]]
  var push: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Boolean]
  ]
  var query: ParsedUrlQuery
  var reload: js.Function0[Unit]
  var replace: js.Function3[
    /* url */ Url, 
    /* as */ js.UndefOr[Url], 
    /* options */ js.UndefOr[js.Object], 
    js.Promise[Boolean]
  ]
  var route: String
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
}

