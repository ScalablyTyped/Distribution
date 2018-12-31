package typings
package offlineDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineOptions extends js.Object {
  // TODO Should these types be `boolean|Function`?
  // The project documentation is not clear here.
  var checkOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  var checks: js.UndefOr[OfflineChecks] = js.undefined
  var game: js.UndefOr[scala.Boolean] = js.undefined
  var interceptRequests: js.UndefOr[scala.Boolean] = js.undefined
  var reconnect: Anon_Delay
  var requests: js.UndefOr[scala.Boolean] = js.undefined
}

