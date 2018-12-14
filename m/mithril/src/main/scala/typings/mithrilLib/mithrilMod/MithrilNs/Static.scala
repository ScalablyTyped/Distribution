package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends Hyperscript {
  @JSName("jsonp")
  var jsonp_Original: js.Function2[/* url */ java.lang.String, /* options */ js.UndefOr[JsonpOptions], js.Promise[_]] = js.native
  @JSName("mount")
  var mount_Original: js.Function2[/* element */ stdLib.Element, /* component */ scala.Null, scala.Unit] = js.native
  @JSName("redraw")
  var redraw_Original: js.Function0[scala.Unit] = js.native
  @JSName("render")
  var render_Original: js.Function2[/* el */ stdLib.Element, /* vnodes */ Children, scala.Unit] = js.native
  @JSName("request")
  var request_Original: js.Function2[
    /* url */ java.lang.String, 
    /* options */ js.UndefOr[RequestOptions[_]], 
    js.Promise[_]
  ] = js.native
  @JSName("route")
  var route_Original: Route = js.native
  /** A string containing the semver value for the current Mithril release. */
  var version: java.lang.String = js.native
  @JSName("withAttr")
  var withAttr_Original: js.Function3[
    /* name */ java.lang.String, 
    /* callback */ js.ThisFunction1[/* this */ js.Any, /* value */ js.Any, _], 
    /* thisArg */ js.Any, 
    js.Function1[/* e */ mithrilLib.Anon_P, scala.Unit]
  ] = js.native
  /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
  def buildQueryString(values: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def jsonp[T](url: java.lang.String): js.Promise[T] = js.native
  def jsonp[T](url: java.lang.String, options: JsonpOptions): js.Promise[T] = js.native
  def mount(element: stdLib.Element): scala.Unit = js.native
  /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
  def parseQueryString(queryString: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def redraw(): scala.Unit = js.native
  def render(el: stdLib.Element, vnodes: Children): scala.Unit = js.native
  def request[T](url: java.lang.String): js.Promise[T] = js.native
  def request[T](url: java.lang.String, options: RequestOptions[T]): js.Promise[T] = js.native
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def route(element: stdLib.Element, defaultRoute: java.lang.String, routes: RouteDefs): scala.Unit = js.native
  def withAttr[T](
    name: java.lang.String,
    callback: js.ThisFunction1[/* this */ T, /* value */ js.Any, _],
    thisArg: T
  ): js.Function1[/* e */ mithrilLib.Anon_P, scala.Unit] = js.native
}

