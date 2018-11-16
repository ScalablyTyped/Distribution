package typings
package oibackoffLib.oibackoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BackoffOptions extends js.Object {
  var algorithm: js.UndefOr[
    oibackoffLib.oibackoffLibStrings.incremental | oibackoffLib.oibackoffLibStrings.exponential | oibackoffLib.oibackoffLibStrings.fibonacci
  ] = js.undefined
  var delayRatio: js.UndefOr[scala.Double] = js.undefined
  var maxDelay: js.UndefOr[scala.Double] = js.undefined
  var maxTries: js.UndefOr[scala.Double] = js.undefined
}

