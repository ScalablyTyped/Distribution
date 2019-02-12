package typings
package nodeLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[scala.Boolean] = js.undefined
  var lookup: js.UndefOr[
    js.Function3[
      /* hostname */ java.lang.String, 
      /* options */ nodeLib.dnsMod.LookupOneOptions, 
      /* callback */ js.Function3[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* address */ java.lang.String, 
        /* family */ scala.Double, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var recvBufferSize: js.UndefOr[scala.Double] = js.undefined
  var reuseAddr: js.UndefOr[scala.Boolean] = js.undefined
  var sendBufferSize: js.UndefOr[scala.Double] = js.undefined
  var `type`: SocketType
}

