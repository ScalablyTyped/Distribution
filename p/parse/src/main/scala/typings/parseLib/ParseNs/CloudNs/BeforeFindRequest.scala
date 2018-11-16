package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeFindRequest extends TriggerRequest {
  var count: scala.Boolean
  var isGet: scala.Boolean
  var query: parseLib.ParseNs.Query[js.Object]
  var readPreference: js.UndefOr[ReadPreferenceOption] = js.undefined
}

