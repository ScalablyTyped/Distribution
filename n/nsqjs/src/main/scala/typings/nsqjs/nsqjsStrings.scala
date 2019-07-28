package typings.nsqjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nsqjsStrings {
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
  
  @scala.inline
  def backoff: backoff = "backoff".asInstanceOf[backoff]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def nsqd_closed: nsqd_closed = "nsqd_closed".asInstanceOf[nsqd_closed]
  @scala.inline
  def nsqd_connected: nsqd_connected = "nsqd_connected".asInstanceOf[nsqd_connected]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def respond: respond = "respond".asInstanceOf[respond]
}

