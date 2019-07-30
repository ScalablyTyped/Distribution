package typings.mithril.mithrilMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /** This Component renders a link <a href> that will use the current routing strategy */
  var Link: Component[RouteLinkAttrs, js.Object] = js.native
  /** Defines a router prefix which is a fragment of the URL that dictates the underlying strategy used by the router. */
  var prefix: String = js.native
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def apply(element: Element, defaultRoute: String, routes: RouteDefs): Unit = js.native
  /** Returns the last fully resolved routing path, without the prefix. */
  def get(): String = js.native
  /** Gets all route parameters. */
  def param(): js.Any = js.native
  /** Returns the named parameter value from the current route. */
  def param(name: String): String = js.native
  /** Redirects to a matching route or to the default route if no matching routes can be found. */
  def set(route: String): Unit = js.native
  def set(route: String, data: js.Any): Unit = js.native
  def set(route: String, data: js.Any, options: RouteOptions): Unit = js.native
}

