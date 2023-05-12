package typings.msRest.mod

import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `IncomingMessage` object is created by {@link Server} or {@link ClientRequest} and passed as the first argument to the `'request'` and `'response'` event respectively. It may be used to
  * access response
  * status, headers, and data.
  *
  * Different from its `socket` value which is a subclass of `stream.Duplex`, the`IncomingMessage` itself extends `stream.Readable` and is created separately to
  * parse and emit the incoming HTTP headers and payload, as the underlying socket
  * may be reused multiple times in case of keep-alive.
  * @since v0.1.17
  */
@JSImport("ms-rest", "IncomingMessage")
@js.native
open class IncomingMessage protected ()
  extends typings.node.httpMod.IncomingMessage {
  def this(socket: Socket) = this()
}
