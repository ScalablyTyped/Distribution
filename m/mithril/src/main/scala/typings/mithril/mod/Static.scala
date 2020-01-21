package typings.mithril.mod

import typings.mithril.AnonParams
import typings.mithril.AnonUrl
import typings.mithril.FnComponent
import typings.mithril.FnOptions
import typings.mithril.FnOptionsUrl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends Hyperscript {
  @JSName("jsonp")
  var jsonp_Original: FnOptionsUrl = js.native
  @JSName("mount")
  var mount_Original: FnComponent = js.native
  @JSName("redraw")
  var redraw_Original: Redraw = js.native
  @JSName("render")
  var render_Original: js.Function2[/* el */ Element, /* vnodes */ Children, Unit] = js.native
  @JSName("request")
  var request_Original: FnOptions = js.native
  @JSName("route")
  var route_Original: Route = js.native
  /** Build path name */
  def buildPathname(template: String): String = js.native
  def buildPathname(template: String, params: Params): String = js.native
  /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
  def buildQueryString(values: Params): String = js.native
  def jsonp[T](options: JsonpOptions with AnonUrl): js.Promise[T] = js.native
  def jsonp[T](url: String): js.Promise[T] = js.native
  def jsonp[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
  def mount(element: Element): Unit = js.native
  def mount(element: Element, component: ComponentTypes[_, _]): Unit = js.native
  /** Parse path name */
  def parsePathname(url: String): AnonParams = js.native
  /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
  def parseQueryString(queryString: String): Params = js.native
  /** Manually triggers an asynchronous redraw of mounted components. */
  def redraw(): Unit = js.native
  def render(el: Element, vnodes: Children): Unit = js.native
  def request[T](options: RequestOptions[T] with AnonUrl): js.Promise[T] = js.native
  def request[T](url: String): js.Promise[T] = js.native
  def request[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def route(element: Element, defaultRoute: String, routes: RouteDefs): Unit = js.native
}

