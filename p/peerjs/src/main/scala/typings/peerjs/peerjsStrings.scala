package typings.peerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object peerjsStrings {
  @js.native
  sealed trait call extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait stream extends js.Object
  
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
}

