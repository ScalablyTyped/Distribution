package typings.mithril.mithrilMod

import org.scalablytyped.runtime.StringDictionary
import typings.mithril.Anon_CurrentTarget
import typings.mithril.Anon_Url
import typings.mithril.Fn_Callback
import typings.mithril.Fn_Component
import typings.mithril.Fn_Options
import typings.mithril.Fn_OptionsUrl
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends Hyperscript {
  @JSName("jsonp")
  var jsonp_Original: Fn_OptionsUrl = js.native
  @JSName("mount")
  var mount_Original: Fn_Component = js.native
  @JSName("redraw")
  var redraw_Original: js.Function0[Unit] = js.native
  @JSName("render")
  var render_Original: js.Function2[/* el */ Element, /* vnodes */ Children, Unit] = js.native
  @JSName("request")
  var request_Original: Fn_Options = js.native
  @JSName("route")
  var route_Original: Route = js.native
  /** A string containing the semver value for the current Mithril release. */
  var version: String = js.native
  @JSName("withAttr")
  var withAttr_Original: Fn_Callback = js.native
  /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
  def buildQueryString(values: StringDictionary[js.Any]): String = js.native
  def jsonp[T](options: JsonpOptions with Anon_Url): js.Promise[T] = js.native
  def jsonp[T](url: String): js.Promise[T] = js.native
  def jsonp[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
  def mount(element: Element): Unit = js.native
  def mount(element: Element, component: ComponentTypes[_, _]): Unit = js.native
  /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
  def parseQueryString(queryString: String): StringDictionary[js.Any] = js.native
  def redraw(): Unit = js.native
  def render(el: Element, vnodes: Children): Unit = js.native
  def request[T](options: RequestOptions[T] with Anon_Url): js.Promise[T] = js.native
  def request[T](url: String): js.Promise[T] = js.native
  def request[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def route(element: Element, defaultRoute: String, routes: RouteDefs): Unit = js.native
  def withAttr(name: String, callback: js.Function1[/* value */ js.Any, _]): js.Function1[/* e */ Anon_CurrentTarget, Unit] = js.native
  def withAttr[T](name: String, callback: js.ThisFunction1[/* this */ T, /* value */ js.Any, _], thisArg: T): js.Function1[/* e */ Anon_CurrentTarget, Unit] = js.native
}

