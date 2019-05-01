package typings
package navigoLib.navigoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigo extends js.Object {
  def destroy(): scala.Unit = js.native
  def disableIfAPINotAvailable(): scala.Unit = js.native
  def generate(path: java.lang.String): java.lang.String = js.native
  def generate(path: java.lang.String, params: js.Any): java.lang.String = js.native
  def getLinkPath(link: js.Any): js.Any = js.native
  def historyAPIUpdateMethod(): scala.Unit = js.native
  def historyAPIUpdateMethod(method: java.lang.String): scala.Unit = js.native
  def hooks(hooks: GenericHooks): scala.Unit = js.native
  def lastRouteResolved(): navigoLib.Anon_Hooks = js.native
  def link(path: java.lang.String): java.lang.String = js.native
  def navigate(path: java.lang.String): scala.Unit = js.native
  def navigate(path: java.lang.String, absolute: scala.Boolean): scala.Unit = js.native
  def notFound(handler: js.Function1[/* query */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def notFound(handler: js.Function1[/* query */ java.lang.String, scala.Unit], hooks: NavigoHooks): scala.Unit = js.native
  def off(location: java.lang.String, handler: RouteHandler): scala.Unit = js.native
  def on(location: java.lang.String, handler: RouteHandler): Navigo = js.native
  def on(location: java.lang.String, handler: RouteHandler, hooks: NavigoHooks): Navigo = js.native
  def on(location: stdLib.RegExp, handler: js.Function1[/* repeated */ java.lang.String, scala.Unit]): Navigo = js.native
  def on(
    location: stdLib.RegExp,
    handler: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    hooks: NavigoHooks
  ): Navigo = js.native
  def on(rootHandler: RouteHandler): Navigo = js.native
  def on(rootHandler: RouteHandler, hooks: NavigoHooks): Navigo = js.native
  def on(routes: org.scalablytyped.runtime.StringDictionary[RouteHandler]): Navigo = js.native
  def pause(): scala.Unit = js.native
  def pause(change: scala.Boolean): scala.Unit = js.native
  def resolve(): scala.Boolean = js.native
  def resolve(currentURL: java.lang.String): scala.Boolean = js.native
  def resume(): scala.Unit = js.native
  def updatePageLinks(): scala.Unit = js.native
}

