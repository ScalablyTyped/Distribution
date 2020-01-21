package typings.natsHemera

import typings.natsHemera.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object natsHemeraStrings {
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait depth extends js.Object
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait fatal extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait insertion extends js.Object
  
  @js.native
  sealed trait onAct extends js.Object
  
  @js.native
  sealed trait onActFinished extends js.Object
  
  @js.native
  sealed trait onAdd extends js.Object
  
  @js.native
  sealed trait onClose extends js.Object
  
  @js.native
  sealed trait onError extends js.Object
  
  @js.native
  sealed trait onRequest extends js.Object
  
  @js.native
  sealed trait onResponse extends js.Object
  
  @js.native
  sealed trait onSend extends js.Object
  
  @js.native
  sealed trait preHandler extends js.Object
  
  @js.native
  sealed trait pubsub extends js.Object
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait silent extends LogLevel
  
  @js.native
  sealed trait trace extends LogLevel
  
  @js.native
  sealed trait warn extends LogLevel
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def depth: depth = "depth".asInstanceOf[depth]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def insertion: insertion = "insertion".asInstanceOf[insertion]
  @scala.inline
  def onAct: onAct = "onAct".asInstanceOf[onAct]
  @scala.inline
  def onActFinished: onActFinished = "onActFinished".asInstanceOf[onActFinished]
  @scala.inline
  def onAdd: onAdd = "onAdd".asInstanceOf[onAdd]
  @scala.inline
  def onClose: onClose = "onClose".asInstanceOf[onClose]
  @scala.inline
  def onError: onError = "onError".asInstanceOf[onError]
  @scala.inline
  def onRequest: onRequest = "onRequest".asInstanceOf[onRequest]
  @scala.inline
  def onResponse: onResponse = "onResponse".asInstanceOf[onResponse]
  @scala.inline
  def onSend: onSend = "onSend".asInstanceOf[onSend]
  @scala.inline
  def preHandler: preHandler = "preHandler".asInstanceOf[preHandler]
  @scala.inline
  def pubsub: pubsub = "pubsub".asInstanceOf[pubsub]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

