package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EventName extends js.Object {
  def off(
    eventName: nextDashServerLib.routerMod.EventName,
    handler: js.Function1[/* url */ java.lang.String, _]
  ): scala.Unit = js.native
  def on(
    eventName: nextDashServerLib.routerMod.EventName,
    handler: nextDashServerLib.routerMod.ErrorEventHandler
  ): scala.Unit = js.native
  def on(
    eventName: nextDashServerLib.routerMod.EventName,
    handler: nextDashServerLib.routerMod.EventHandler
  ): scala.Unit = js.native
}

