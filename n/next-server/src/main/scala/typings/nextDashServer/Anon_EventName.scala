package typings.nextDashServer

import typings.nextDashServer.routerMod.ErrorEventHandler
import typings.nextDashServer.routerMod.EventHandler
import typings.nextDashServer.routerMod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EventName extends js.Object {
  def off(eventName: EventName, handler: js.Function1[/* url */ String, _]): Unit = js.native
  def on(eventName: EventName, handler: ErrorEventHandler): Unit = js.native
  def on(eventName: EventName, handler: EventHandler): Unit = js.native
}

