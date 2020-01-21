package typings.novncCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.novncCore.novncCoreStrings.connecting
  - typings.novncCore.novncCoreStrings.connected
  - typings.novncCore.novncCoreStrings.disconnecting
  - typings.novncCore.novncCoreStrings.disconnected
*/
trait NvConnectionState extends js.Object

object NvConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.novncCore.novncCoreStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.novncCore.novncCoreStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typings.novncCore.novncCoreStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.novncCore.novncCoreStrings.disconnecting = this.cast("disconnecting")
}

