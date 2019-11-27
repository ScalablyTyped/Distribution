package typings.nes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nesMod {
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
  type Client = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NesClient */ js.Any
  type ClientConnectOptions = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NesClient.ClientConnectOptions */ js.Any
  type ClientOptions = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NesClient.ClientOptions */ js.Any
  type ClientRequestOptions = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NesClient.ClientRequestOptions */ js.Any
  type ClientSubscribeFlags = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NesClient.ClientSubscribeFlags */ js.Any
  type Handler = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NesClient.Handler */ js.Any
  type ServerOnSubscribe = ServerOnSubscribeWithParams | ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ js.Any, js.Promise[js.Any]]
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, js.Promise[js.Any]]
  type ServerOnUnSubscribe = ServerOnUnSubscribeWithParams | ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ js.Any, Unit]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, Unit]
}
