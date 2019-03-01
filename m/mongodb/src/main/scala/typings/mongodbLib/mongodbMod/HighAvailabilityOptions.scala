package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighAvailabilityOptions extends js.Object {
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true; Turn on high availability monitoring.
    */
  var ha: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
}

object HighAvailabilityOptions {
  @scala.inline
  def apply(
    domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ha: js.UndefOr[scala.Boolean] = js.undefined,
    haInterval: scala.Int | scala.Double = null
  ): HighAvailabilityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighAvailabilityOptions]
  }
}

