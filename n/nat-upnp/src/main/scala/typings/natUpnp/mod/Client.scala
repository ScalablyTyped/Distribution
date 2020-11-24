package typings.natUpnp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  /**
    * Close the underlaying sockets and resources
    */
  def close(): Unit = js.native
  
  /**
    * Fetch the external IP from the gateway
    * @param callback Callback to be run when completed, or on error
    */
  def externalIp(callback: CB[String]): Unit = js.native
  
  /**
    * Get the gateway device for communication
    * @param callback
    */
  def findGateway(callback: CB[Device_]): Unit = js.native
  
  /**
    * Get a list of existing mappings
    * @param callback Callback to be run when completed, or on error
    */
  def getMappings(callback: CB[js.Array[Mapping]]): Unit = js.native
  /**
    * Get a list of existing mappings
    * @param options Filter mappings based on these options
    * @param callback Callback to be run when completed, or on error
    */
  def getMappings(options: GetMappingOpts, callback: CB[js.Array[Mapping]]): Unit = js.native
  
  /**
    * Create a new port mapping
    * @param options Options for the new port mapping
    * @param [callback] Callback to be run when completed, or on error
    */
  def portMapping(options: NewPortMappingOpts): Unit = js.native
  def portMapping(options: NewPortMappingOpts, callback: CB[RawResponse]): Unit = js.native
  
  /**
    * Remove a port mapping
    * @param options Specify which port mapping to remove
    * @param [callback] Callback to be run when completed, or on error
    */
  def portUnmapping(options: DeletePortMappingOpts): Unit = js.native
  def portUnmapping(options: DeletePortMappingOpts, callback: CB[RawResponse]): Unit = js.native
}
