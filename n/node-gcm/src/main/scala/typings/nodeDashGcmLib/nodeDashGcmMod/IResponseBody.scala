package typings
package nodeDashGcmLib.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponseBody extends js.Object {
  var canonical_ids: scala.Double
  var failure: scala.Double
  var multicast_id: js.UndefOr[scala.Double] = js.undefined
  var results: js.UndefOr[js.Array[nodeDashGcmLib.Anon_Error]] = js.undefined
  var success: scala.Double
}

object IResponseBody {
  @scala.inline
  def apply(
    canonical_ids: scala.Double,
    failure: scala.Double,
    success: scala.Double,
    multicast_id: scala.Int | scala.Double = null,
    results: js.Array[nodeDashGcmLib.Anon_Error] = null
  ): IResponseBody = {
    val __obj = js.Dynamic.literal(canonical_ids = canonical_ids, failure = failure, success = success)
    if (multicast_id != null) __obj.updateDynamic("multicast_id")(multicast_id.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[IResponseBody]
  }
}

