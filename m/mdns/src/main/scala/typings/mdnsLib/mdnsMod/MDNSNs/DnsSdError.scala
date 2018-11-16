package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Error ---

trait DnsSdError
  extends nodeLib.Error {
  var errorCode: js.UndefOr[scala.Double] = js.undefined
}

