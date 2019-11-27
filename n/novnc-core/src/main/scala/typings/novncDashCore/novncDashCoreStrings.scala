package typings.novncDashCore

import typings.novncDashCore.novncDashCoreMod.NvConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object novncDashCoreStrings {
  @js.native
  sealed trait connected extends NvConnectionState
  
  @js.native
  sealed trait connecting extends NvConnectionState
  
  @js.native
  sealed trait disconnected extends NvConnectionState
  
  @js.native
  sealed trait disconnecting extends NvConnectionState
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

