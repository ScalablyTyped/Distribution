package typings.novncCore

import typings.novncCore.mod.NvConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object novncCoreStrings {
  @js.native
  sealed trait connected extends NvConnectionState
  
  @js.native
  sealed trait connecting extends NvConnectionState
  
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait disconnected extends NvConnectionState
  
  @js.native
  sealed trait disconnecting extends NvConnectionState
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

