package typings.peerjs.mod

import typings.std.RTCDataChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peerjs", "DataConnection")
@js.native
open class DataConnection protected ()
  extends StObject
     with BaseConnection[DataConnectionEvents] {
  def this(peerId: String, provider: Peer, options: Any) = this()
  
  def bufferSize: Double = js.native
  
  def dataChannel: RTCDataChannel = js.native
  
  /** Called by the Negotiator when the DataChannel is ready. */
  def initialize(dc: RTCDataChannel): Unit = js.native
  
  val label: String = js.native
  
  def parse(data: String): Any = js.native
  
  val reliable: Boolean = js.native
  
  /** Allows user to send data. */
  def send(data: Any): Unit = js.native
  def send(data: Any, chunked: Boolean): Unit = js.native
  
  val serialization: SerializationType = js.native
  
  def stringify(data: Any): String = js.native
}
