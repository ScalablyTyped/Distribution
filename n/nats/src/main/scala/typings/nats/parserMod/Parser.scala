package typings.nats.parserMod

import typings.nats.denobufferMod.DenoBuffer
import typings.nats.queuedIteratorMod.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/parser", "Parser")
@js.native
open class Parser protected () extends StObject {
  def this(dispatcher: Dispatcher[ParserEvent]) = this()
  
  var argBuf: js.UndefOr[DenoBuffer] = js.native
  
  var as: Double = js.native
  
  def cloneMsgArg(): Unit = js.native
  
  var dispatcher: Dispatcher[ParserEvent] = js.native
  
  var drop: Double = js.native
  
  def fail(data: js.typedarray.Uint8Array): js.Error = js.native
  def fail(data: js.typedarray.Uint8Array, label: String): js.Error = js.native
  
  var hdr: Double = js.native
  
  var ma: MsgArg = js.native
  
  var msgBuf: js.UndefOr[DenoBuffer] = js.native
  
  def parse(buf: js.typedarray.Uint8Array): Unit = js.native
  
  def processHeaderMsgArgs(arg: js.typedarray.Uint8Array): Unit = js.native
  
  def processMsgArgs(arg: js.typedarray.Uint8Array): Unit = js.native
  
  def protoParseInt(a: js.typedarray.Uint8Array): Double = js.native
  
  var state: State = js.native
}
