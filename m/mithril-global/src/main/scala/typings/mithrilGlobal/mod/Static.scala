package typings.mithrilGlobal.mod

import typings.mithril.anon.Fn0
import typings.mithril.anon.FnCallElementComponent
import typings.mithril.anon.FnCallUrlOptions
import typings.mithril.anon.JsonpOptionsurlstring
import typings.mithril.anon.Key
import typings.mithril.anon.Lifecycleanyanykeystringa
import typings.mithril.anon.Url
import typings.mithril.mod.Params
import typings.mithril.mod.Redraw
import typings.mithrilGlobal.anon.Call
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mithril.mithril.Static & {  stream  :{None <T>(value : T): mithril.mithril/stream.Stream<T>, None <T>(): mithril.mithril/stream.Stream<T>, readonly merge <S extends std.Array<any>>(streams : {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}): mithril.mithril/stream.Stream<{[ I in keyof S ]: S[I]}>, readonly lift <S extends std.Array<any>, T>(fn : (values : S): T, streams : {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}): mithril.mithril/stream.Stream<T>, readonly combine <T>(combiner : (streams : ...any): T, streams : std.Array<mithril.mithril/stream.Stream<any>>): mithril.mithril/stream.Stream<T>,  readonly SKIP  :symbol, readonly scan <T, U>(fn : (acc : U, value : T): U, acc : U, stream : mithril.mithril/stream.Stream<T>): mithril.mithril/stream.Stream<U>, readonly scanMerge <T, U>(pairs : std.Array<[mithril.mithril/stream.Stream<T>, (acc : U, value : T): U]>, acc : U): mithril.mithril/stream.Stream<U>, readonly scanMerge <U>(pairs : std.Array<[mithril.mithril/stream.Stream<any>, (acc : U, value : any): U]>, acc : U): mithril.mithril/stream.Stream<U>}} */
@js.native
trait Static extends js.Object {
  @JSName("jsonp")
  var jsonp_Original: Fn0 = js.native
  @JSName("mount")
  var mount_Original: FnCallElementComponent = js.native
  @JSName("redraw")
  var redraw_Original: Redraw = js.native
  @JSName("render")
  var render_Original: js.Function2[/* el */ Element, /* vnodes */ typings.mithril.mod.Children, Unit] = js.native
  @JSName("request")
  var request_Original: FnCallUrlOptions = js.native
  @JSName("route")
  var route_Original: typings.mithril.mod.Route = js.native
  @JSName("stream")
  var stream_Original: Call = js.native
  /** Creates a virtual element (Vnode). */
  def apply(
    selector: String,
    attributes: typings.mithril.mod.Attributes,
    children: typings.mithril.mod.Children*
  ): typings.mithril.mod.Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, children: typings.mithril.mod.Children*): typings.mithril.mod.Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](component: typings.mithril.mod.ComponentTypes[Attrs, State], args: typings.mithril.mod.Children*): typings.mithril.mod.Vnode[Attrs, State] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: typings.mithril.mod.ComponentTypes[Attrs, State],
    attributes: Attrs with (typings.mithril.mod.Lifecycle[Attrs, State]) with Key,
    args: typings.mithril.mod.Children*
  ): typings.mithril.mod.Vnode[Attrs, State] = js.native
  /** Build path name */
  def buildPathname(template: String): String = js.native
  def buildPathname(template: String, params: Params): String = js.native
  /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
  def buildQueryString(values: Params): String = js.native
  /** Creates a fragment virtual element (Vnode). */
  def fragment(attrs: Lifecycleanyanykeystringa, children: typings.mithril.mod.ChildArrayOrPrimitive): typings.mithril.mod.Vnode[_, _] = js.native
  def jsonp[T](options: JsonpOptionsurlstring): js.Promise[T] = js.native
  def jsonp[T](url: String): js.Promise[T] = js.native
  def jsonp[T](url: String, options: typings.mithril.mod.JsonpOptions): js.Promise[T] = js.native
  def mount(element: Element): Unit = js.native
  def mount(element: Element, component: typings.mithril.mod.ComponentTypes[_, _]): Unit = js.native
  /** Parse path name */
  def parsePathname(url: String): typings.mithril.anon.Params = js.native
  /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
  def parseQueryString(queryString: String): Params = js.native
  /** Manually triggers an asynchronous redraw of mounted components. */
  def redraw(): Unit = js.native
  def render(el: Element, vnodes: typings.mithril.mod.Children): Unit = js.native
  def request[T](options: typings.mithril.mod.RequestOptions[T] with Url): js.Promise[T] = js.native
  def request[T](url: String): js.Promise[T] = js.native
  def request[T](url: String, options: typings.mithril.mod.RequestOptions[T]): js.Promise[T] = js.native
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def route(element: Element, defaultRoute: String, routes: typings.mithril.mod.RouteDefs): Unit = js.native
  def stream[T](): typings.mithril.streamMod.Stream[T] = js.native
  def stream[T](value: T): typings.mithril.streamMod.Stream[T] = js.native
  /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
  def trust(html: String): typings.mithril.mod.Vnode[_, _] = js.native
}

