package typings.navigo.navigoMod

import org.scalablytyped.runtime.StringDictionary
import typings.navigo.Anon_Hooks
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigo extends js.Object {
  def destroy(): Unit = js.native
  def disableIfAPINotAvailable(): Unit = js.native
  def generate(path: String): String = js.native
  def generate(path: String, params: js.Any): String = js.native
  def getLinkPath(link: js.Any): js.Any = js.native
  def historyAPIUpdateMethod(): Unit = js.native
  def historyAPIUpdateMethod(method: String): Unit = js.native
  def hooks(hooks: GenericHooks): Unit = js.native
  def lastRouteResolved(): Anon_Hooks = js.native
  def link(path: String): String = js.native
  def navigate(path: String): Unit = js.native
  def navigate(path: String, absolute: Boolean): Unit = js.native
  def notFound(handler: js.Function1[/* query */ String, Unit]): Unit = js.native
  def notFound(handler: js.Function1[/* query */ String, Unit], hooks: NavigoHooks): Unit = js.native
  def off(location: String, handler: RouteHandler): Unit = js.native
  def on(location: String, handler: RouteHandler): Navigo = js.native
  def on(location: String, handler: RouteHandler, hooks: NavigoHooks): Navigo = js.native
  def on(location: RegExp, handler: js.Function1[/* repeated */ String, Unit]): Navigo = js.native
  def on(location: RegExp, handler: js.Function1[/* repeated */ String, Unit], hooks: NavigoHooks): Navigo = js.native
  def on(rootHandler: RouteHandler): Navigo = js.native
  def on(rootHandler: RouteHandler, hooks: NavigoHooks): Navigo = js.native
  def on(routes: StringDictionary[RouteHandler]): Navigo = js.native
  def pause(): Unit = js.native
  def pause(change: Boolean): Unit = js.native
  def resolve(): Boolean = js.native
  def resolve(currentURL: String): Boolean = js.native
  def resume(): Unit = js.native
  def updatePageLinks(): Unit = js.native
}

