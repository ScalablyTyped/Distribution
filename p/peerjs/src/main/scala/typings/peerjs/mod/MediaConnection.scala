package typings.peerjs.mod

import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peerjs", "MediaConnection")
@js.native
open class MediaConnection protected () extends BaseConnection[MediaConnectionEvents] {
  def this(peerId: String, provider: Peer, options: Any) = this()
  
  def addStream(remoteStream: Any): Unit = js.native
  
  def answer(): Unit = js.native
  def answer(stream: Unit, options: AnswerOption): Unit = js.native
  def answer(stream: MediaStream): Unit = js.native
  def answer(stream: MediaStream, options: AnswerOption): Unit = js.native
  
  def localStream: MediaStream = js.native
  
  def remoteStream: MediaStream = js.native
}
