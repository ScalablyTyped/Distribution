package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TODO (if possible) use a drier, more robust way of doing this that
  * allows for:
  *      * the export to have be of type Hapi.PluginFunction whilst
  *      * also exposing the Client type
  *      * exporting the NesClient as the Client class without having to
  *          duplicate the constructor definition
  *      * and all the type exports from the NesClient namespace (Handler,
  *          ClientOptions, ClientConnectOptions, ClientRequestOptions,
  *          ClientSubscribeFlags)
  */
@js.native
trait Client
  extends nesLib.clientMod.namespaced

