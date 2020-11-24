package typings.natUpnp.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ssdp_ extends EventEmitter {
  
  /**
    * Close all sockets
    */
  def close(): Unit = js.native
  
  /**
    * Search for a SSDP compatible server on the network
    * @param device Search Type (ST) header, specifying which device to search for
    * @param promise An existing EventEmitter to emit event on
    * @returns The event emitter provided in Promise, or a newly instantiated one.
    */
  def search(device: String): EventEmitter = js.native
  def search(device: String, promise: EventEmitter): EventEmitter = js.native
}
