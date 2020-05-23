package typings.openfin.mainMod

import typings.openfin.contextChannelsMod.ChannelChangedEvent
import typings.openfin.openfinStrings.`channel-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "removeEventListener")
@js.native
object removeEventListener_channelchanged extends js.Object {
  def apply(eventType: `channel-changed`, handler: js.Function1[/* event */ ChannelChangedEvent, Unit]): Unit = js.native
}

