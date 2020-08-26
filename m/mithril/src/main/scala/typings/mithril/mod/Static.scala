package typings.mithril.mod

import typings.mithril.anon.Fn0
import typings.mithril.anon.FnCallElementComponent
import typings.mithril.anon.FnCallUrlOptions
import typings.mithril.anon.JsonpOptionsurlstring
import typings.mithril.anon.Url
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends Hyperscript {
  @JSName("jsonp")
  var jsonp_Original: Fn0 = js.native
  @JSName("mount")
  var mount_Original: FnCallElementComponent = js.native
  @JSName("redraw")
  var redraw_Original: Redraw = js.native
  @JSName("render")
  var render_Original: js.Function2[/* el */ Element, /* vnodes */ Children, Unit] = js.native
  @JSName("request")
  var request_Original: FnCallUrlOptions = js.native
  @JSName("route")
  var route_Original: Route = js.native
  /** Build path name */
  def buildPathname(template: String): String = js.native
  def buildPathname(template: String, params: Params): String = js.native
  /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
  def buildQueryString(values: Params): String = js.native
  def jsonp[T](options: JsonpOptionsurlstring): js.Promise[T] = js.native
  def jsonp[T](url: String): js.Promise[T] = js.native
  def jsonp[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
  def mount(element: Element, component: Null): Unit = js.native
  def mount(element: Element, component: ComponentTypes[_, _]): Unit = js.native
  /** Parse path name */
  def parsePathname(url: String): typings.mithril.anon.Params = js.native
  /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
  def parseQueryString(queryString: String): Params = js.native
  /** Manually triggers an asynchronous redraw of mounted components. */
  def redraw(): Unit = js.native
  def render(el: Element, vnodes: Children): Unit = js.native
  def request[T](options: RequestOptions[T] with Url): js.Promise[T] = js.native
  def request[T](url: String): js.Promise[T] = js.native
  def request[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def route(element: Element, defaultRoute: String, routes: RouteDefs): Unit = js.native
}

