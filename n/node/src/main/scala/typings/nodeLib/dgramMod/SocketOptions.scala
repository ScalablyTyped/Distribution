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

object SocketOptions {
  @scala.inline
  def apply(
    `type`: SocketType,
    ipv6Only: js.UndefOr[scala.Boolean] = js.undefined,
    lookup: (/* hostname */ java.lang.String, /* options */ nodeLib.dnsMod.LookupOneOptions, /* callback */ js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]) => scala.Unit = null,
    recvBufferSize: scala.Int | scala.Double = null,
    reuseAddr: js.UndefOr[scala.Boolean] = js.undefined,
    sendBufferSize: scala.Int | scala.Double = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(ipv6Only)) __obj.updateDynamic("ipv6Only")(ipv6Only)
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (recvBufferSize != null) __obj.updateDynamic("recvBufferSize")(recvBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr)
    if (sendBufferSize != null) __obj.updateDynamic("sendBufferSize")(sendBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

