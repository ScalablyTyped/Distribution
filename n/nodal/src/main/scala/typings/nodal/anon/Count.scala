package typings.nodal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var error: js.Any
  var offset: Double
  var resource: js.Any
  var summary: js.UndefOr[String | Null] = js.undefined
  var total: Double
}

object Count {
  @scala.inline
  def apply(
    count: Double,
    error: js.Any,
    offset: Double,
    resource: js.Any,
    total: Double,
    summary: js.UndefOr[Null | String] = js.undefined
  ): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

