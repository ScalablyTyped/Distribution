package typings.next.checkCustomRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/lib/check-custom-routes.Rewrite & {  statusCode ? :number,   permanent ? :boolean} */
trait Redirect extends js.Object {
  var destination: String
  var permanent: js.UndefOr[Boolean] = js.undefined
  var source: String
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Redirect {
  @scala.inline
  def apply(
    destination: String,
    source: String,
    permanent: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.UndefOr[Double] = js.undefined
  ): Redirect = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

