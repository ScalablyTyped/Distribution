package typings
package peerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object peerjsLibStrings {
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
  
  def call: call = "call".asInstanceOf[call]
  def close: close = "close".asInstanceOf[close]
  def connection: connection = "connection".asInstanceOf[connection]
  def data: data = "data".asInstanceOf[data]
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  def error: error = "error".asInstanceOf[error]
  def open: open = "open".asInstanceOf[open]
  def stream: stream = "stream".asInstanceOf[stream]
}

