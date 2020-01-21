package typings.nes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
  type Client = typings.nes.clientMod.^
  type ClientConnectOptions = typings.nes.clientMod.ClientConnectOptions
  type ClientOptions = typings.nes.clientMod.ClientOptions
  type ClientRequestOptions = typings.nes.clientMod.ClientRequestOptions
  type ClientSubscribeFlags = typings.nes.clientMod.ClientSubscribeFlags
  type Handler = typings.nes.clientMod.Handler
  type ServerOnSubscribe = typings.nes.mod.ServerOnSubscribeWithParams | typings.nes.mod.ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ typings.nes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ typings.nes.mod.Socket, /* path */ java.lang.String, js.Promise[js.Any]]
  type ServerOnUnSubscribe = typings.nes.mod.ServerOnUnSubscribeWithParams | typings.nes.mod.ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[
    /* socket */ typings.nes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    scala.Unit
  ]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ typings.nes.mod.Socket, /* path */ java.lang.String, scala.Unit]
}
