package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Browser ---
trait BrowserOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var domain: js.UndefOr[js.Any] = js.undefined
  var flags: js.UndefOr[js.Any] = js.undefined
  var interfaceIndex: js.UndefOr[scala.Double] = js.undefined
  var networkInterface: js.UndefOr[java.lang.String] = js.undefined
  var resolverSequence: js.UndefOr[
    js.Array[
      js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean]
    ]
  ] = js.undefined
}

object BrowserOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    domain: js.Any = null,
    flags: js.Any = null,
    interfaceIndex: scala.Int | scala.Double = null,
    networkInterface: java.lang.String = null,
    resolverSequence: js.Array[
      js.Function2[/* service */ Service, /* next */ js.Function0[scala.Unit], scala.Boolean]
    ] = null
  ): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (interfaceIndex != null) __obj.updateDynamic("interfaceIndex")(interfaceIndex.asInstanceOf[js.Any])
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface)
    if (resolverSequence != null) __obj.updateDynamic("resolverSequence")(resolverSequence)
    __obj.asInstanceOf[BrowserOptions]
  }
}

