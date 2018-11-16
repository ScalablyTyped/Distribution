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

