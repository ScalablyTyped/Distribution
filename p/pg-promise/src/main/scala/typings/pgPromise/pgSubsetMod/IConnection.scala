package typings.pgPromise.pgSubsetMod

import typings.node.NodeJS.Socket
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnection extends EventEmitter {
  /*
    While there are many other properties exist within the connection,
    the only one that may be remotely useful is the stream, to be able
    to listen to its events, from within a custom Client class.
    */
  var stream: Socket = js.native
}

