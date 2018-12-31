package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
  def apply(element: stdLib.Element, defaultRoute: java.lang.String, routes: RouteDefs): scala.Unit = js.native
  /** Returns the last fully resolved routing path, without the prefix. */
  def get(): java.lang.String = js.native
  /** This method is meant to be used in conjunction with an <a> Vnode's oncreate hook. */
  def link(vnode: Vnode[_, _]): js.Function1[/* e */ js.UndefOr[stdLib.Event], _] = js.native
  /** Gets all route parameters. */
  def param(): js.Any = js.native
  /** Returns the named parameter value from the current route. */
  def param(name: java.lang.String): java.lang.String = js.native
  /** Defines a router prefix which is a fragment of the URL that dictates the underlying strategy used by the router. */
  def prefix(urlFragment: java.lang.String): scala.Unit = js.native
  /** Redirects to a matching route or to the default route if no matching routes can be found. */
  def set(route: java.lang.String): scala.Unit = js.native
  def set(route: java.lang.String, data: js.Any): scala.Unit = js.native
  def set(route: java.lang.String, data: js.Any, options: RouteOptions): scala.Unit = js.native
}

