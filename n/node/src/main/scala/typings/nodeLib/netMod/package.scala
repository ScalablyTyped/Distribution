package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object netMod {
  type LookupFunction = js.Function3[
    /* hostname */ java.lang.String, 
    /* options */ nodeLib.dnsMod.LookupOneOptions, 
    /* callback */ js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type NetConnectOpts = TcpNetConnectOpts | IpcNetConnectOpts
  type SocketConnectOpts = TcpSocketConnectOpts | IpcSocketConnectOpts
}
