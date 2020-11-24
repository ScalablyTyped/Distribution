package typings.mitm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = typings.mitm.mod.SocketConnectCallback | typings.mitm.mod.SocketConnectionCallback | typings.mitm.mod.HttpCallback
  
  type HttpCallback = js.Function2[
    /* request */ typings.node.httpMod.IncomingMessage, 
    /* response */ typings.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  
  type SocketConnectCallback = js.Function2[
    /* socket */ typings.mitm.mod.BypassableSocket, 
    /* opts */ typings.mitm.mod.SocketOptions, 
    scala.Unit
  ]
  
  type SocketConnectionCallback = js.Function2[
    /* socket */ typings.node.netMod.Socket, 
    /* opts */ typings.mitm.mod.SocketOptions, 
    scala.Unit
  ]
}
