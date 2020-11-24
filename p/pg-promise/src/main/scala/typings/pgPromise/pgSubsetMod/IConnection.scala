package typings.pgPromise.pgSubsetMod

import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnection extends EventEmitter {
  
  /*
    While there are many other properties exist within the connection,
    the only one that may be remotely useful is the stream, to be able
    to listen to its events, from within a custom Client class.
    */
  var stream: Socket = js.native
}
