package typings
package nsqjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nsqjsLibStrings {
  @js.native
  sealed trait backoff extends js.Object
  
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait discard extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait nsqd_closed extends js.Object
  
  @js.native
  sealed trait nsqd_connected extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait respond extends js.Object
  
  def backoff: backoff = "backoff".asInstanceOf[backoff]
  def closed: closed = "closed".asInstanceOf[closed]
  def discard: discard = "discard".asInstanceOf[discard]
  def error: error = "error".asInstanceOf[error]
  def message: message = "message".asInstanceOf[message]
  def nsqd_closed: nsqd_closed = "nsqd_closed".asInstanceOf[nsqd_closed]
  def nsqd_connected: nsqd_connected = "nsqd_connected".asInstanceOf[nsqd_connected]
  def ready: ready = "ready".asInstanceOf[ready]
  def respond: respond = "respond".asInstanceOf[respond]
}

