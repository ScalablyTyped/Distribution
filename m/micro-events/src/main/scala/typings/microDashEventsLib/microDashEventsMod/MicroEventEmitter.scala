package typings
package microDashEventsLib.microDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicroEventEmitter extends js.Object {
  /** Max listeners count */
  var maxListeners: scala.Double = js.native
  /** Trigger event */
  def emit(`type`: java.lang.String, arguments: js.Any*): MicroEventEmitter = js.native
  /** Detach listener */
  def off(`type`: java.lang.String): MicroEventEmitter = js.native
  def off(
    `type`: java.lang.String,
    handler: microDashEventsLib.microDashEventsMod.MicroEventEmitterNs.EventHandler
  ): MicroEventEmitter = js.native
  /** Attach listener */
  def on(
    `type`: java.lang.String,
    handler: microDashEventsLib.microDashEventsMod.MicroEventEmitterNs.EventHandler
  ): MicroEventEmitter = js.native
}

