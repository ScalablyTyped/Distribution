package typings.peerjs.mod

import typings.eventemitter3.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstraction on top of WebSockets to provide fastest
  * possible connection for peers.
  */
@js.native
trait Socket
  extends StObject
     with EventEmitter[String | js.Symbol, Any] {
  
  def close(): Unit = js.native
  
  /** Exposed send for DC & Peer. */
  def send(data: Any): Unit = js.native
  
  def start(id: String, token: String): Unit = js.native
}
