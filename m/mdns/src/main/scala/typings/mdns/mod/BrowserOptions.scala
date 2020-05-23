package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Browser ---
trait BrowserOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var domain: js.UndefOr[js.Any] = js.undefined
  var flags: js.UndefOr[js.Any] = js.undefined
  var interfaceIndex: js.UndefOr[Double] = js.undefined
  var networkInterface: js.UndefOr[String] = js.undefined
  var resolverSequence: js.UndefOr[
    js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
  ] = js.undefined
}

object BrowserOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    domain: js.Any = null,
    flags: js.Any = null,
    interfaceIndex: js.UndefOr[Double] = js.undefined,
    networkInterface: String = null,
    resolverSequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]] = null
  ): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(interfaceIndex)) __obj.updateDynamic("interfaceIndex")(interfaceIndex.get.asInstanceOf[js.Any])
    if (networkInterface != null) __obj.updateDynamic("networkInterface")(networkInterface.asInstanceOf[js.Any])
    if (resolverSequence != null) __obj.updateDynamic("resolverSequence")(resolverSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserOptions]
  }
}

