package typings.nodeDashGcm.nodeDashGcmMod

import typings.nodeDashGcm.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponseBody extends js.Object {
  var canonical_ids: Double
  var failure: Double
  var multicast_id: js.UndefOr[Double] = js.undefined
  var results: js.UndefOr[js.Array[Anon_Error]] = js.undefined
  var success: Double
}

object IResponseBody {
  @scala.inline
  def apply(
    canonical_ids: Double,
    failure: Double,
    success: Double,
    multicast_id: Int | Double = null,
    results: js.Array[Anon_Error] = null
  ): IResponseBody = {
    val __obj = js.Dynamic.literal(canonical_ids = canonical_ids.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (multicast_id != null) __obj.updateDynamic("multicast_id")(multicast_id.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseBody]
  }
}

